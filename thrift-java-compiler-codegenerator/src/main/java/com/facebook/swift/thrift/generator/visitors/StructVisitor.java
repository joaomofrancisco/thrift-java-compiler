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
package com.facebook.swift.thrift.generator.visitors;

import java.io.IOException;

import com.facebook.swift.parser.model.Struct;
import com.facebook.swift.parser.visitor.Visitable;
import com.facebook.swift.thrift.generator.codegenerator.StructCodeGenerator;

public class StructVisitor extends AbstractTemplateVisitor
{

    @Override
    public boolean accept(final Visitable visitable)
    {
        return visitable.getClass() == Struct.class;
    }

    @Override
    public void visit(final Visitable visitable) throws IOException
    {
        final Struct struct = Struct.class.cast(visitable);

        StructCodeGenerator generator = new StructCodeGenerator();
        generator.setConfig(config);
        generator.setContext(context);
        generator.setCodeModel(codeModel);
		try {
			generator.generete(struct);
		} catch (Exception e) {
			throw new IOException(e);
		}
        
    }
}
