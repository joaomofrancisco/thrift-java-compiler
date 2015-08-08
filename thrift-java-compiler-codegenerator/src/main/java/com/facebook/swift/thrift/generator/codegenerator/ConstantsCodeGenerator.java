package com.facebook.swift.thrift.generator.codegenerator;

import com.facebook.swift.parser.model.Const;
import com.sun.codemodel.ClassType;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpression;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;

public class ConstantsCodeGenerator extends AbstractCodeGenerator<Const> {
	
	private JDefinedClass jConstantsClass;

	public ConstantsCodeGenerator() {
		try {
			jConstantsClass = this.getJavaPackage()._class(JMod.PUBLIC | JMod.FINAL, "Constant", ClassType.CLASS);
		} catch (JClassAlreadyExistsException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void generete(Const definition) throws Exception {
		JDefinedClass jExceptionClass = this.getJavaPackage()._class(JMod.PUBLIC, definition.getName(), ClassType.CLASS);
		jExceptionClass._extends(org.apache.thrift.TException.class);
		
//		this.context.getTypeRegistry().add(jExceptionClass);
		
		
		int[] count = { 0 };
//		for (Const constDef : subprogram.constants) {
		JType fieldType = this.resolvType(definition.getType());
		JExpression exp = this.buildStaticExpression(jConstantsClass, fieldType, definition.getName(), definition.getValue() , count);
		jConstantsClass.field(JMod.PUBLIC | JMod.FINAL | JMod.STATIC, fieldType, definition.getName(), exp);
		
//		}
		
	}

}
