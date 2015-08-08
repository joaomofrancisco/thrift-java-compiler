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

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

import static java.lang.String.format;

public class ConstMap
        extends ConstValue
{
    private final Map<ConstValue, ConstValue> values;

    public ConstMap(Map<ConstValue, ConstValue> values)
    {
        this.values = ImmutableMap.copyOf(checkNotNull(values, "value"));
    }

    @Override
    public Map<ConstValue, ConstValue> value()
    {
        return values;
    }

    @Override
    public String toString()
    {
        return Objects.toStringHelper(this)
                .add("values", values)
                .toString();
    }
}
