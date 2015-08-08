package com.facebook.swift.thrift.generator.codegenerator;

import java.util.ArrayList;
import java.util.List;

import com.facebook.swift.parser.model.ThriftException;
import com.facebook.swift.parser.model.ThriftField;
import com.facebook.swift.thrift.generator.JavaGeneratorUtil;
import com.sun.codemodel.ClassType;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;
import com.sun.codemodel.JVar;

public class ExceptionCodeGenerator extends
		AbstractCodeGenerator<ThriftException> {

	@Override
	public void generete(ThriftException definition) throws Exception {
		JDefinedClass jExceptionClass = this.getJavaPackage()._class(
				JMod.PUBLIC, definition.getName(), ClassType.CLASS);
		jExceptionClass._extends(org.apache.thrift.TException.class);

//		this.context.getTypeRegistry().add(jExceptionClass);

		jExceptionClass.field(JMod.PRIVATE | JMod.FINAL | JMod.STATIC,
				long.class, "serialVersionUID").init(JExpr.lit(1L));

		if (definition.getFields() != null) {
			List<JFieldVar> requiredFields = new ArrayList<JFieldVar>();
			List<JFieldVar> optionalFields = new ArrayList<JFieldVar>();

			int[] count = { 0 };
			for (ThriftField fieldDecl : definition.getFields()) {
				JType fieldType = this.resolvType(fieldDecl.getType());

				JFieldVar fieldVar = jExceptionClass.field(JMod.PRIVATE,
						fieldType, fieldDecl.getName());
				if (fieldDecl.getValue() != null && fieldDecl.getValue().isPresent()) {
					fieldVar.init(this.buildStaticExpression(
							jExceptionClass, fieldType, fieldDecl.getName(),
							fieldDecl.getValue().get(), count));
				}

				if (fieldDecl.getRequiredness() == ThriftField.Requiredness.OPTIONAL) {
					optionalFields.add(fieldVar);
				} else {
					requiredFields.add(fieldVar);
				}

				JMethod jmethod = jExceptionClass.method(
						JMod.PUBLIC | JMod.FINAL,
						fieldType,
						"get"
								+ JavaGeneratorUtil
										.getCapitalizeString(fieldDecl
												.getName()));
				{
					jmethod.body()._return(fieldVar);
				}
			}

			JMethod ctor = jExceptionClass.constructor(JMod.PUBLIC);
			{
				for (JFieldVar fieldVar : requiredFields) {
					JVar paramVar = ctor
							.param(fieldVar.type(), fieldVar.name());
					ctor.body()
							.assign(JExpr.refthis(fieldVar.name()), paramVar);
				}
			}

			if (optionalFields.size() > 0) {
				for (int i = 0, iSize = optionalFields.size(); i < iSize; i++) {
					ctor = jExceptionClass.constructor(JMod.PUBLIC);

					for (JFieldVar fieldVar : requiredFields) {
						JVar paramVar = ctor.param(fieldVar.type(),
								fieldVar.name());
						ctor.body().assign(JExpr.refthis(fieldVar.name()),
								paramVar);
					}

					for (int j = 0, jSize = i + 1; j < jSize; j++) {
						JFieldVar fieldVar = optionalFields.get(j);
						JVar paramVar = ctor.param(fieldVar.type(),
								fieldVar.name());
						ctor.body().assign(JExpr.refthis(fieldVar.name()),
								paramVar);
					}
				}
			}
		}
	}

}
