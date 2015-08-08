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

import java.util.EnumMap;
import java.util.List;
import java.util.Set;

import com.facebook.swift.parser.model.BaseType;
import com.facebook.swift.parser.model.IdentifierType;
import com.facebook.swift.parser.model.ListType;
import com.facebook.swift.parser.model.MapType;
import com.facebook.swift.parser.model.SetType;
import com.facebook.swift.parser.model.ThriftType;
import com.facebook.swift.parser.model.VoidType;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JType;

public class TypeToJavaConverter {
	private final String namespace;
	private final TypeRegistry typeRegistry;
	private final TypedefRegistry typedefRegistry;
	private final JCodeModel codeModel;

	private final List<Converter> converters;
	private final String javaPackage;

	public TypeToJavaConverter(
            final TypeRegistry typeRegistry,
            final TypedefRegistry typedefRegistry,
            final JCodeModel codeModel,
            final String namespace,
            final String javaPackage)
    {
        Preconditions.checkNotNull(typeRegistry);
        Preconditions.checkNotNull(typedefRegistry);
        Preconditions.checkNotNull(namespace);
        this.typeRegistry = typeRegistry;
        this.typedefRegistry = typedefRegistry;
        this.codeModel = codeModel;
        this.namespace = namespace;
        this.javaPackage = javaPackage;

        final ImmutableList.Builder<Converter> builder = ImmutableList.builder();
        builder.add(new VoidConverter());
        builder.add(new BaseConverter());
        builder.add(new IdentifierConverter());
        builder.add(new SetConverter());
        builder.add(new ListConverter());
        builder.add(new MapConverter());
        converters = builder.build();
    }

	public JType convertType(final ThriftType thriftType) {
		return convert(thriftType, true);
	}

	public JType convert(final ThriftType thriftType, boolean primitive) {
		for (Converter converter : converters) {
			if (converter.accept(thriftType)) {
				return converter.convert(thriftType, primitive);
			}
		}
		throw new IllegalArgumentException("Thrift type %s is unknown!");
	}

	private static interface Converter {
		/**
		 * Return true if the converter accepts the proposed type.
		 */
		boolean accept(ThriftType type);

		/**
		 * Convert the thrift type into a string suitable for a java type.
		 *
		 * @param primitive
		 *            If true, return a primitive java type, otherwise force an
		 *            object type.
		 */
		JType convert(ThriftType type, boolean primitive);
	}

	private class VoidConverter implements Converter {
		@Override
		public boolean accept(final ThriftType type) {
			return type.getClass() == VoidType.class;
		}

		@Override
		public JType convert(final ThriftType type, final boolean primitive) {
			if (primitive) {
				return ((JType) TypeToJavaConverter.this.codeModel.VOID);
			} else {
				return TypeToJavaConverter.this.codeModel._ref(Void.class);
			}
		}
	}

	private class BaseConverter implements Converter {
		private EnumMap<BaseType.Type, JType> JAVA_PRIMITIVES_MAP;
		private EnumMap<BaseType.Type, JType> JAVA_TYPE_MAP;

		public BaseConverter() {
			final EnumMap<BaseType.Type, JType> javaPrimitivesMap = Maps
					.newEnumMap(BaseType.Type.class);
			javaPrimitivesMap.put(BaseType.Type.BOOL, codeModel.BOOLEAN);
			javaPrimitivesMap.put(BaseType.Type.BYTE, codeModel.BYTE);
			javaPrimitivesMap.put(BaseType.Type.I16, codeModel.SHORT);
			javaPrimitivesMap.put(BaseType.Type.I32, codeModel.INT);
			javaPrimitivesMap.put(BaseType.Type.I64, codeModel.LONG);
			javaPrimitivesMap.put(BaseType.Type.DOUBLE, codeModel.DOUBLE);
			javaPrimitivesMap.put(BaseType.Type.STRING, codeModel.ref(String.class));
			javaPrimitivesMap.put(BaseType.Type.BINARY, codeModel.BYTE.array());
			JAVA_PRIMITIVES_MAP = javaPrimitivesMap;
			
			final EnumMap<BaseType.Type, JType> javaTypeMap = Maps
					.newEnumMap(BaseType.Type.class);
			javaTypeMap.put(BaseType.Type.BOOL, codeModel.ref(Boolean.class));
			javaTypeMap.put(BaseType.Type.BYTE, codeModel.ref(Byte.class));
			javaTypeMap.put(BaseType.Type.I16, codeModel.ref(Short.class));
			javaTypeMap.put(BaseType.Type.I32, codeModel.ref(Integer.class));
			javaTypeMap.put(BaseType.Type.I64, codeModel.ref(Long.class));
			javaTypeMap.put(BaseType.Type.DOUBLE, codeModel.ref(Double.class));
			javaTypeMap.put(BaseType.Type.STRING, codeModel.ref(String.class));
			javaTypeMap.put(BaseType.Type.BINARY, codeModel.ref(byte[].class));
			JAVA_TYPE_MAP = javaTypeMap;
		}

		@Override
		public boolean accept(final ThriftType type) {
			return type.getClass() == BaseType.class;
		}

		@Override
		public JType convert(final ThriftType type, final boolean primitive) {
			final BaseType.Type baseType = ((BaseType) type).getType();
			return primitive ? JAVA_PRIMITIVES_MAP.get(baseType)
					: JAVA_TYPE_MAP.get(baseType);
		}
	}

	private class IdentifierConverter implements Converter {
		@Override
		public boolean accept(final ThriftType type) {
			return type.getClass() == IdentifierType.class;
		}

		@Override
		public JType convert(final ThriftType type, final boolean primitive) {
			final String name = ((IdentifierType) type).getName();
			// the name is [<thrift-namespace>.]<thrift type>
			final List<String> names = Lists.newArrayList(Splitter.on('.')
					.split(name));

			Preconditions
					.checkState(names.size() > 0 && names.size() < 3,
							"only unqualified and thrift-namespace qualified names are allowed!");
			String thriftName = names.get(0);
			String thriftNamespace = namespace;

			if (names.size() == 2) {
				thriftName = names.get(1);
				thriftNamespace = names.get(0);
			}

			final String thriftTypeName = thriftNamespace + "." + thriftName;
			final ThriftType thriftType = typedefRegistry
					.findType(thriftTypeName);
			if (thriftType == null) {
				final SwiftJavaType javaType = typeRegistry
						.findType(thriftTypeName);
				return codeModel.directClass(javaType.getClassName());
//						(javaType == null) ? null : shortenClassName(javaType
//						.getClassName());
			} else {
				return TypeToJavaConverter.this.convert(thriftType, primitive);
			}
		}

		private String shortenClassName(String className) {
			// If the class is in the package we are currently generating code
			// for, generate
			// only the simple name, otherwise generate the fully qualified
			// class name.
			if (className.startsWith(javaPackage)
					&& className.lastIndexOf(".") == javaPackage.length()) {
				className = className.substring(javaPackage.length() + 1);
			}
			return className;
		}
	}

	private class SetConverter implements Converter {
		@Override
		public boolean accept(final ThriftType type) {
			return type.getClass() == SetType.class;
		}

		@Override
		public JType convert(final ThriftType type, final boolean ignored) {
			final SetType setType = SetType.class.cast(type);

			final JType actualType = TypeToJavaConverter.this.convert(
					setType.getElementType(), false);

			return TypeToJavaConverter.this.codeModel.ref(Set.class).narrow(actualType);
		}
	}

	private class ListConverter implements Converter {
		@Override
		public boolean accept(final ThriftType type) {
			return type.getClass() == ListType.class;
		}

		@Override
		public JType convert(final ThriftType type, final boolean ignored) {
			final ListType listType = ListType.class.cast(type);

			final JType actualType = TypeToJavaConverter.this.convert(
					listType.getElementType(), false);

			return TypeToJavaConverter.this.codeModel.ref(List.class).narrow(actualType);
		}
	}

	private class MapConverter implements Converter {
		@Override
		public boolean accept(final ThriftType type) {
			return type.getClass() == MapType.class;
		}

		@Override
		public JType convert(final ThriftType type, final boolean ignored) {
			final MapType mapType = MapType.class.cast(type);

			final JClass actualKeyType = (JClass) TypeToJavaConverter.this.convert(
					mapType.getKeyType(), false);
			final JClass actualValueType = (JClass) TypeToJavaConverter.this.convert(
					mapType.getValueType(), false);

			return TypeToJavaConverter.this.codeModel.ref(Set.class).narrow(actualKeyType, actualValueType);
		}
	}
}
