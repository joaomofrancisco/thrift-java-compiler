package com.facebook.swift.thrift.generator.codegenerator;

import java.util.ArrayList;
import java.util.List;

import com.facebook.swift.parser.model.IntegerEnum;
import com.facebook.swift.parser.model.IntegerEnumField;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JCase;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JEnumConstant;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JSwitch;
import com.sun.codemodel.JVar;

public class IntegerEnumCodeGenerator extends AbstractCodeGenerator<IntegerEnum> {


	@Override
	public void generete(IntegerEnum definition) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(definition.getName()+" ##################################");
		
		JDefinedClass jEnumClass = this.getJavaPackage()._enum(definition.getName());
//		this.context.getTypeRegistry().add(jEnumClass);

		jEnumClass._implements(org.apache.thrift.TEnum.class);

		if (definition.getFields() != null) {
			jEnumClass.field(JMod.PRIVATE | JMod.FINAL, int.class, "value");

			JMethod jctor = jEnumClass.constructor(JMod.PRIVATE);
			{
				JVar valueVar = jctor.param(int.class, "value");

				JBlock jblock = jctor.body();
				jblock.assign(JExpr.refthis("value"), valueVar);
			}

			JMethod jgetValue = jEnumClass.method(JMod.PUBLIC, int.class, "getValue");
			{
				JBlock jblock = jgetValue.body();
				jblock._return(JExpr.refthis("value"));
			}

			int count = 0;
			List<JEnumConstant> values = new ArrayList<JEnumConstant>();
			for (IntegerEnumField enumElementDecl : definition.getFields()) {
				int value = new Long(enumElementDecl.getValue()).intValue();
				JEnumConstant enumConstant = jEnumClass.enumConstant(enumElementDecl.getName());
				values.add(enumConstant);
				enumConstant.arg(JExpr.lit(value));
			}

			JMethod jfindByValue = jEnumClass.method(JMod.PUBLIC | JMod.STATIC, jEnumClass, FIND_BY_VALUE);
			{
				JVar param = jfindByValue.param(int.class, "value");
				JBlock block = jfindByValue.body();
				JSwitch jswitch = block._switch(param);
				for (JEnumConstant value : values) {
					JCase jcase = jswitch._case(JExpr.lit(values.indexOf(value)));
					JBlock jblock = jcase.body();
					jblock._return(value);
				}
				JBlock _block = jswitch._default().body();
				_block._return(JExpr._null());
			}

		}
	}

}
