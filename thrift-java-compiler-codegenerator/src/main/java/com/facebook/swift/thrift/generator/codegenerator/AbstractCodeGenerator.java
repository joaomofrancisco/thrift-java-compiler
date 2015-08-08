package com.facebook.swift.thrift.generator.codegenerator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import com.facebook.swift.parser.model.BaseType;
import com.facebook.swift.parser.model.ConstDouble;
import com.facebook.swift.parser.model.ConstIdentifier;
import com.facebook.swift.parser.model.ConstInteger;
import com.facebook.swift.parser.model.ConstList;
import com.facebook.swift.parser.model.ConstMap;
import com.facebook.swift.parser.model.ConstValue;
import com.facebook.swift.parser.model.IdentifierType;
import com.facebook.swift.parser.model.ThriftType;
import com.facebook.swift.parser.visitor.Nameable;
import com.facebook.swift.thrift.generator.JavaGeneratorUtil;
import com.facebook.swift.thrift.generator.SwiftDocumentContext;
import com.facebook.swift.thrift.generator.SwiftGeneratorConfig;
import com.facebook.swift.thrift.generator.SwiftJavaType;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JExpression;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JPackage;
import com.sun.codemodel.JType;
import com.sun.codemodel.JVar;

public abstract class AbstractCodeGenerator<T extends Nameable> {

	public static final String BUILD = "build";
	
	public static final String FIND_BY_VALUE = "findByValue";

	protected SwiftDocumentContext context;
	protected SwiftGeneratorConfig config;

	protected JCodeModel codeModel;

	public void setContext(SwiftDocumentContext context) {
		this.context = context;
	}
	
	public void setConfig(SwiftGeneratorConfig config) {
		this.config = config;
	}
	
	public void setCodeModel(JCodeModel codeModel) {
		this.codeModel = codeModel;
	}
	
	public abstract void generete(T definition) throws Exception;
	
	public JPackage getJavaPackage() {
		String javaPackage = this.context.getDocument().getHeader().getNamespace("java");
		return this.codeModel._package(javaPackage);
	}
	
	public JExpression buildStaticExpression(JDefinedClass jConstantsClass, JType fieldType, String constName, ConstValue constValue, int[] count) {
		if (constValue instanceof ConstIdentifier) {
			return JExpr.lit(((ConstIdentifier)constValue).value());
		}

		if (constValue instanceof ConstInteger) {
			if (fieldType == this.codeModel._ref(Long.class)) {
				return JExpr.lit((Long)constValue.value());
			} else if (fieldType == this.codeModel._ref(Integer.class)) {
				return JExpr.lit((Integer)constValue.value());
			} else if (fieldType == this.codeModel._ref(Short.class)) {
				return JExpr.lit((Short)constValue.value());
			} else if (fieldType == this.codeModel._ref(Byte.class)) {
				return JExpr.lit((Byte)constValue.value());
			} else {
				return JExpr.lit((Integer)constValue.value());
			}
		}

		if (constValue instanceof ConstDouble) {
			return JExpr.lit((Double)constValue.value());
		}

		if (constValue instanceof ConstIdentifier) {
			return JExpr.ref((String ) constValue.value());
		}

		if (constValue instanceof ConstList) {
			JClass listFieldType = (JClass) fieldType;
			JMethod method = jConstantsClass.method(JMod.PRIVATE | JMod.STATIC, listFieldType, BUILD + JavaGeneratorUtil.getCapitalizeString(constName + count[0]++));
			{
				JBlock body = method.body();

				JClass collectionsType = (JClass) this.codeModel._ref(Collections.class);
				List<JClass> typeParameters = listFieldType.getTypeParameters();

				JVar resultVar = body.decl(fieldType, "result", newArrayList(typeParameters.get(0)));

				for (ConstValue subConstValue : ((List<ConstValue>)constValue.value())) {
					JExpression arg0 = buildStaticExpression(jConstantsClass, typeParameters.get(0), constName + count[0]++, subConstValue, count);
					body.add(resultVar.invoke("add").arg(arg0));
				}

				body._return(collectionsType.staticInvoke("unmodifiableList").arg(resultVar));
			}
			return JExpr.invoke(method);
		}

		if (constValue instanceof ConstMap) {
			JClass mapFieldType = (JClass) fieldType;
			JMethod method = jConstantsClass.method(JMod.PRIVATE | JMod.STATIC, mapFieldType, BUILD + JavaGeneratorUtil.getCapitalizeString(constName + count[0]++));
			{
				JBlock body = method.body();

				JClass collectionsType = (JClass) this.codeModel._ref(Collections.class);

				List<JClass> typeParameters = mapFieldType.getTypeParameters();
				JVar resultVar = body.decl(fieldType, "result", newHashMap(typeParameters.get(0), typeParameters.get(1)));
				for (Map.Entry<ConstValue, ConstValue> entry : ((ConstMap)constValue).value().entrySet()) {
					JExpression arg0 = buildStaticExpression(jConstantsClass, typeParameters.get(0), constName + count[0]++, entry.getKey(), count);
					JExpression arg1 = buildStaticExpression(jConstantsClass, typeParameters.get(1), constName + count[0]++, entry.getValue(), count);
					body.add(resultVar.invoke("put").arg(arg0).arg(arg1));
				}

				body._return(collectionsType.staticInvoke("unmodifiableMap").arg(resultVar));
			}
			return JExpr.invoke(method);
		}

		return null;
	}
	
	public JExpression newHashMap(JClass keyType, JClass valueType) {
		JClass mapType = ((JClass) this.codeModel._ref(java.util.HashMap.class)).narrow(keyType, valueType);
		return JExpr._new(mapType);
	}
	
	public JExpression newArrayList(JClass valueType) {
		JClass mapType = ((JClass) this.codeModel._ref(java.util.ArrayList.class)).narrow(valueType);
		return JExpr._new(mapType);
	}
	
	public JType resolvType(ThriftType thriftType) {
		if (thriftType instanceof IdentifierType){
			IdentifierType identifierType = (IdentifierType) thriftType;
			SwiftJavaType type = this.context.getTypeRegistry().findType(identifierType.getName());
			return this.codeModel.directClass(type.getClassName());
		} else {
			return this.context.getTypeConverter().convert(thriftType, false);
//			return this.codeModel.directClass(className);
		}
//		JType type = this.context.getTypeConverter().convert(thriftType, false);
//		if (type != null){
//			return type;
//		} else {
//			return this.context.getTypeRegistry().findTypeWithoutPath(
//					thriftType.toString());
//		}1
//		throw new RuntimeException("method not implemeted");
	}
	
	public JType resolvName(String name){
		SwiftJavaType type = this.context.getTypeRegistry().findType(name);
		if (type == null){
			return this.searchCodeModel(name);
		} else {
			return this.codeModel.directClass(type.getClassName());
		}
	}

	private JType searchCodeModel(String name) {
		for(Iterator<JPackage> i = this.codeModel.packages(); i.hasNext();){
			JPackage jPackage = i.next();
			JDefinedClass findClasses = findClasses(jPackage.classes(), name);
			if (findClasses != null){
				return findClasses;
			}
		}
		
		return this.codeModel.directClass(name);
	}
	
	private JDefinedClass findClasses(Iterator<JDefinedClass> iterator, String name){
		for(Iterator<JDefinedClass> j = iterator; j.hasNext();){
			JDefinedClass jDefinedClass = j.next();
			if (jDefinedClass.fullName().equals(name)){
				return jDefinedClass;
			} else {
				JDefinedClass findClasses = findClasses(jDefinedClass.classes(), name);
				if (findClasses != null) {
					return findClasses;
				}
			}
		}
		return null;
	}
	
}
