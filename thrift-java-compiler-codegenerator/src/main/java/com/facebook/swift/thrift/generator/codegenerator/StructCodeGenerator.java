package com.facebook.swift.thrift.generator.codegenerator;

import java.util.HashMap;
import java.util.Map;

import com.facebook.swift.parser.model.AbstractStruct;
import com.facebook.swift.parser.model.ThriftField;
import com.sun.codemodel.ClassType;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;

public class StructCodeGenerator extends AbstractCodeGenerator<AbstractStruct>{

	@Override
	public void generete(AbstractStruct definition) throws Exception {
		JDefinedClass jStructClass = this.getJavaPackage()._class(JMod.PUBLIC, definition.getName(), ClassType.CLASS);
		Map<String, JType> fields = new HashMap<>();
		if (definition.getFields() != null)
			for (ThriftField field : definition.getFields()) {
				JType fieldType = this.resolvType(field.getType());
				if (fieldType == null){
					fieldType = this.codeModel.directClass(field.getType().toString());
				}
				fields.put(field.getName(), fieldType);

			}
		new StructCodeGeneratorHelper().whithCodeModel(this.codeModel).buildStruct(fields, jStructClass);
	}

}
