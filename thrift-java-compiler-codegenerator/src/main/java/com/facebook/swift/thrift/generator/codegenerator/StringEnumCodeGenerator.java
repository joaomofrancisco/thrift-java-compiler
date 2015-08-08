package com.facebook.swift.thrift.generator.codegenerator;

import com.facebook.swift.parser.model.StringEnum;

public class StringEnumCodeGenerator extends AbstractCodeGenerator<StringEnum>{

	@Override
	public void generete(StringEnum definition) throws Exception {
		System.out.println(definition.getName()+" ##################################");
	}

}
