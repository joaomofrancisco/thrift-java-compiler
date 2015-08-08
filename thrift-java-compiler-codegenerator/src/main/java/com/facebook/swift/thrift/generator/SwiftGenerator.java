/*
 * Copyright (C) 2012 Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.swift.thrift.generator;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import javax.annotation.Nullable;

import com.facebook.swift.parser.model.Document;
import com.facebook.swift.parser.model.Header;
import com.facebook.swift.thrift.generator.util.SwiftInternalStringUtils;
import com.facebook.swift.thrift.generator.visitors.AbstractTemplateVisitor;
import com.facebook.swift.thrift.generator.visitors.ConstantsVisitor;
import com.facebook.swift.thrift.generator.visitors.ExceptionVisitor;
import com.facebook.swift.thrift.generator.visitors.IntegerEnumVisitor;
import com.facebook.swift.thrift.generator.visitors.ServiceVisitor;
import com.facebook.swift.thrift.generator.visitors.StringEnumVisitor;
import com.facebook.swift.thrift.generator.visitors.StructVisitor;
import com.facebook.swift.thrift.generator.visitors.TypeVisitor;
import com.facebook.swift.thrift.generator.visitors.UnionVisitor;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.sun.codemodel.JCodeModel;

/**
 * Parses a Thrift IDL file and writes out initial annotated java classes.
 */
public class SwiftGenerator
{
//    private static final Logger LOG = Logger.getGlobal();

    private final File outputFolder;
    private final SwiftGeneratorConfig swiftGeneratorConfig;
    private final Set<URI> parsedDocuments = new HashSet<>();
    private final Stack<URI> parentDocuments = new Stack<>();
    private final JCodeModel codeModel;

    public SwiftGenerator(final SwiftGeneratorConfig swiftGeneratorConfig)
    {
        this.swiftGeneratorConfig = swiftGeneratorConfig;

        this.outputFolder = swiftGeneratorConfig.getOutputFolder();
        if (outputFolder != null) {
            outputFolder.mkdirs();
        }
        this.codeModel = new JCodeModel();

//        LOG.log(Level.INFO,"Writing source files into %s using %s ...", outputFolder, swiftGeneratorConfig.getCodeFlavor());

    }

    public void parse(Iterable<URI> inputs) throws Exception
    {
        Preconditions.checkArgument(
                inputs != null && inputs.iterator().hasNext(),
                "No input files!");

//        LOG.info("Parsing Thrift IDL from %s...", inputs);

        TypeRegistry typeRegistry = new TypeRegistry();
        TypedefRegistry typedefRegistry = new TypedefRegistry();
        
        final Map<String, SwiftDocumentContext> contexts = Maps.newHashMap();
        for (final URI inputUri : inputs) {
            parsedDocuments.clear();
			parseDocument(
                    inputUri.isAbsolute() ? inputUri : swiftGeneratorConfig.getInputBase().resolve(inputUri),
                    contexts,
                    typeRegistry,
                    typedefRegistry);
        }

//        LOG.info("IDL parsing complete, writing java code...");

        for (final SwiftDocumentContext context : contexts.values()) {
            generateFiles(context);
        }

        URL resource = this.getClass().getClassLoader().getResource("");
        
        File destDir = new File(resource.getPath()+"../generated-test-sources/java/");
        if (!destDir.exists()){
        	destDir.mkdirs();
        }
		this.codeModel.build(destDir);
        
//        LOG.info("Java code generation complete.");
    }

    private void parseDocument(final URI thriftUri,
                               @Nullable final Map<String, SwiftDocumentContext> contexts,
                               final TypeRegistry typeRegistry,
                               final TypedefRegistry typedefRegistry) throws Exception
    {
        Preconditions.checkState(thriftUri != null && thriftUri.isAbsolute() && !thriftUri.isOpaque(), "Only absolute, non opaque URIs can be parsed!");
        Preconditions.checkArgument(
                !parentDocuments.contains(thriftUri),
                "Input %s recursively includes itself (%s)", thriftUri, Joiner.on(" -> ").join(parentDocuments) + " -> " + thriftUri);

        if (parsedDocuments.contains(thriftUri)) {
//            LOG.debug("Skipping already parsed file %s...", thriftUri);
            return;
        }

//        LOG.debug("Parsing %s...", thriftUri);

        final String thriftNamespace = extractThriftNamespace(thriftUri);

        Preconditions.checkState(!SwiftInternalStringUtils.isBlank(thriftNamespace), "Thrift URI %s can not be translated to a namespace", thriftUri);
        final SwiftDocumentContext context = new SwiftDocumentContext();
        context.setThriftUri(thriftUri);
        context.setNamespace(thriftNamespace);
        context.setGeneratorConfig(swiftGeneratorConfig);
        context.setTypedefRegistry(typedefRegistry);
        context.setTypeRegistry(typeRegistry);
        context.setCodeModel(codeModel);
        context.build();

        final Document document = context.getDocument();
        final Header header = document.getHeader();

        String javaPackage = context.getJavaPackage();

        // Add a Constants type so that the Constants visitor can render is.
        typeRegistry.add(new SwiftJavaType(thriftNamespace, "Constants", "Constants", javaPackage));

        // Make a note that this document is a parent of all the documents included, directly or recursively
        parentDocuments.push(thriftUri);

        try {
            for (final String include : header.getIncludes()) {
                final URI includeUri = swiftGeneratorConfig.getInputBase().resolve(include);
//                LOG.debug("Found %s included from %s.", includeUri, thriftUri);
                parseDocument(includeUri,
                              // If the includes should also generate code, pass the list of
                              // contexts down to the include parser, otherwise pass a null in
                              swiftGeneratorConfig.isGenerateIncludedCode() ? contexts : null,
                              typeRegistry,
                              typedefRegistry);
            }
        }
        finally {
            // Done parsing this document's includes, remove it from the parent chain
            parentDocuments.pop();
        }

        // Make a note that we've already parsed this document
        parsedDocuments.add(thriftUri);

        document.visit(new TypeVisitor(javaPackage, context));

        if (contexts != null && contexts.put(context.getNamespace(), context) != null) {
//            LOG.info("Thrift Namespace %s included multiple times!", context.getNamespace());
        }
    }

    private String extractThriftNamespace(final URI thriftUri)
    {
        final String path = thriftUri.getPath();
        final String filename = Iterables.getLast(Splitter.on('/').split(path), null);
        Preconditions.checkState(filename != null, "No thrift namespace found in %s", thriftUri);

        final String name = Iterables.getFirst(Splitter.on('.').split(filename), null);
        Preconditions.checkState(name != null, "No thrift namespace found in %s", thriftUri);
        return name;
    }

    private void generateFiles(final SwiftDocumentContext context) throws Exception
    {
//        LOG.debug("Generating code for %s...", context.getNamespace());

        final List<AbstractTemplateVisitor> visitors = Lists.newArrayList();
        visitors.add(new ServiceVisitor());
        visitors.add(new StructVisitor());
        visitors.add(new UnionVisitor());
        visitors.add(new ExceptionVisitor());
        visitors.add(new IntegerEnumVisitor());
        visitors.add(new StringEnumVisitor());
        visitors.add(new ConstantsVisitor());

        for (AbstractTemplateVisitor visitor : visitors) {
        	visitor.setConfig(this.swiftGeneratorConfig);
        	visitor.setContext(context);
        	visitor.setCodeModel(this.codeModel);
        	
            context.getDocument().visit(visitor);
            visitor.finish();
        }
    }
}
