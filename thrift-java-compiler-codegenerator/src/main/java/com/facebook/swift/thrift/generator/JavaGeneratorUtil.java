package com.facebook.swift.thrift.generator;

import org.apache.commons.lang.StringUtils;

import com.sun.codemodel.ClassType;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JType;

public class JavaGeneratorUtil {

	public static String getThriftSufixTypeMethod(JCodeModel cm, JType jType) {
		return JavaGeneratorUtil.getThriftType(cm, jType).replaceFirst("org.apache.thrift.protocol.TType.", "");
	}

	public static String getThriftType(JCodeModel cm, JType jType) {
	
		if (cm.BOOLEAN.equals(jType) || cm.ref(Boolean.class).equals(jType)) {
			return "org.apache.thrift.protocol.TType.BOOL";
		} else if (cm.BYTE.equals(jType) || cm.ref(Byte.class).equals(jType)) {
			return "org.apache.thrift.protocol.TType.BYTE";
		} else if (cm.CHAR.equals(jType) || cm.ref(Character.class).equals(jType)) {
			return "org.apache.thrift.protocol.TType.STRING";
		} else if (cm.DOUBLE.equals(jType) || cm.ref(Double.class).equals(jType)) {
			return "org.apache.thrift.protocol.TType.DOUBLE";
		} else if (cm.FLOAT.equals(jType) || cm.ref(Float.class).equals(jType)) {
			return "org.apache.thrift.protocol.TType.DOUBLE";
		} else if (cm.INT.equals(jType) || cm.ref(Integer.class).equals(jType)) {
			return "org.apache.thrift.protocol.TType.I32";
		} else if (cm.LONG.equals(jType) || cm.ref(Long.class).equals(jType)) {
			return "org.apache.thrift.protocol.TType.I64";
		} else if (cm.ref(String.class).equals(jType)) {
			return "org.apache.thrift.protocol.TType.STRING";
		} else if (cm.SHORT.equals(jType) || cm.ref(Short.class).equals(jType)) {
			return "org.apache.thrift.protocol.TType.I16";
		} else if (jType instanceof JDefinedClass && ClassType.ENUM.equals(((JDefinedClass) jType).getClassType())) {
			return "org.apache.thrift.protocol.TType.ENUM";
		} else {
			return "org.apache.thrift.protocol.TType.STRUCT";
		}
	}

	public static String getCapitalizeString(String fieldName) {
		return StringUtils.capitalize(fieldName);
	}

}