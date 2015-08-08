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

import java.io.IOException;
import java.net.URI;

import com.facebook.swift.parser.ThriftIdlParser;
import com.facebook.swift.parser.model.Document;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.io.Resources;
import com.sun.codemodel.JCodeModel;

public class SwiftDocumentContext {
	private Document document;
	private String namespace;
	private SwiftGeneratorConfig generatorConfig;
	private TypeRegistry typeRegistry;
	private TypedefRegistry typedefRegistry;
	private TypeToJavaConverter typeConverter;
	private ConstantRenderer constantRenderer;
	private URI thriftUri;
	private JCodeModel codeModel;

	public void setThriftUri(URI thriftUri) {
		this.thriftUri = thriftUri;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public void setGeneratorConfig(SwiftGeneratorConfig generatorConfig) {
		this.generatorConfig = generatorConfig;
	}

	public void setTypeRegistry(TypeRegistry typeRegistry) {
		this.typeRegistry = typeRegistry;
	}

	public void setTypedefRegistry(TypedefRegistry typedefRegistry) {
		this.typedefRegistry = typedefRegistry;
	}

	public void setCodeModel(JCodeModel codeModel) {
		this.codeModel = codeModel;
	}

	public void build() throws IOException {
		this.document = ThriftIdlParser.parseThriftIdl(Resources.asCharSource(
				thriftUri.toURL(), Charsets.UTF_8));
		this.typeConverter = new TypeToJavaConverter(typeRegistry,
				typedefRegistry, codeModel, namespace, getJavaPackage());
		this.constantRenderer = new ConstantRenderer(typeConverter, namespace,
				typeRegistry, typedefRegistry);
	}

	public String getNamespace() {
		return namespace;
	}

	public Document getDocument() {
		return document;
	}

	public TypeRegistry getTypeRegistry() {
		return typeRegistry;
	}

	public TypedefRegistry getTypedefRegistry() {
		return typedefRegistry;
	}

	public TypeToJavaConverter getTypeConverter() {
		return typeConverter;
	}

	public ConstantRenderer getConstantRenderer() {
		return constantRenderer;
	}

	public String getJavaPackage() {
		String effectiveJavaNamespace = "java.swift";
		if (generatorConfig
				.containsTweak(SwiftGeneratorTweak.USE_PLAIN_JAVA_NAMESPACE)) {
			effectiveJavaNamespace = "java";
		}

		// Override takes precedence
		String javaPackage = generatorConfig.getOverridePackage();
		// Otherwise fallback on package specified in .thrift file
		if (javaPackage == null) {
			javaPackage = getDocument().getHeader().getNamespace(
					effectiveJavaNamespace);
		}
		// Or the default if we don't have an override package or a package in
		// the .thrift file
		if (javaPackage == null) {
			javaPackage = generatorConfig.getDefaultPackage();
		}

		// If none of the above options get us a package to use, fail
		Preconditions.checkState(javaPackage != null,
				"thrift uri %s does not declare a '%s' namespace!", thriftUri,
				effectiveJavaNamespace);

		return javaPackage;
	}
}
