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
package com.facebook.swift.parser.model;

import com.facebook.swift.parser.visitor.DocumentVisitor;
import com.facebook.swift.parser.visitor.Visitable;
import com.google.common.base.Objects;
import com.google.common.base.Optional;

import java.io.IOException;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class ThriftField implements Visitable
{
    public static enum Requiredness
    {
        REQUIRED, OPTIONAL, NONE
    }

    private final String name;
    private final ThriftType type;
    private final Optional<Long> identifier;
    private final Requiredness requiredness;
    private final Optional<ConstValue> value;
    private final List<TypeAnnotation> annotations;

    public ThriftField(
            String name,
            ThriftType type,
            Long identifier,
            Requiredness requiredness,
            ConstValue value,
            List<TypeAnnotation> annotations)
    {
        this.name = checkNotNull(name, "name");
        this.type = checkNotNull(type, "type");
        this.identifier = Optional.fromNullable(identifier);
        this.requiredness = checkNotNull(requiredness, "requiredness");
        this.value = Optional.fromNullable(value);
        this.annotations = checkNotNull(annotations, "annotations");
    }

    public String getName()
    {
        return name;
    }

    public ThriftType getType()
    {
        return type;
    }

    public Optional<Long> getIdentifier()
    {
        return identifier;
    }

    public Requiredness getRequiredness()
    {
        return requiredness;
    }

    public Optional<ConstValue> getValue()
    {
        return value;
    }

    public List<TypeAnnotation> getAnnotations()
    {
        return annotations;
    }

    @Override
    public String toString()
    {
        return Objects.toStringHelper(this)
                .add("name", name)
                .add("type", type)
                .add("identifier", identifier)
                .add("requiredness", requiredness)
                .add("value", value)
                .add("annotations", annotations)
                .toString();
    }

    @Override
    public void visit(final DocumentVisitor visitor)
        throws IOException
    {
        visitor.visit(this);
    }
}
