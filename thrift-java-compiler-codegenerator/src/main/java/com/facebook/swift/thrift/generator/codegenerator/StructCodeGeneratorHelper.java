package com.facebook.swift.thrift.generator.codegenerator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TType;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import com.facebook.swift.thrift.generator.JavaGeneratorUtil;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JCase;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JConditional;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JEnumConstant;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JExpression;
import com.sun.codemodel.JFieldRef;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JInvocation;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JSwitch;
import com.sun.codemodel.JType;
import com.sun.codemodel.JVar;

public class StructCodeGeneratorHelper {
	
	public static final String ARG = "arg";
	public static final String FIND_BY_VALUE = "findByValue";
	public static final String TUPLE_SCHEME = "TupleScheme";
	public static final String STANDARD_SCHEME = "StandardScheme";
	public static final String DOT_FIELD = "._Fields";
	public static final String COMPARE_TO = "compareTo";
	public static final String SCHEMES = "schemes";
	public static final String CLEAR_BIT = "clearBit";
	public static final String _ISSET_ID = "_ISSET_ID";
	public static final String IS_SET = "IsSet";
	public static final String ISSET_BITFIELD = "__isset_bitfield";
	public static final String _FIELD_DESC = "_FIELD_DESC";
	public static final String STRUCT_DESC = "STRUCT_DESC";
	private JCodeModel codeModel;

	public StructCodeGeneratorHelper whithCodeModel(JCodeModel cm) {
		this.codeModel = cm;
		return this;
	}

	public JDefinedClass build(String nameStruct, JDefinedClass parent, List<JVar> vars) throws JClassAlreadyExistsException {
		JDefinedClass _class = parent._class(JMod.PUBLIC | JMod.STATIC, nameStruct);

		Map<String, JType> fields = new HashMap<>();
		for (JVar jVar : vars) {
			fields.put(jVar.name(), jVar.type());
		}

		return buildStruct(fields, _class);
	}

	public JDefinedClass buildStruct(Map<String, JType> fields, JDefinedClass _class) throws JClassAlreadyExistsException {

		_class.field(JMod.PUBLIC | JMod.STATIC | JMod.FINAL, org.apache.thrift.protocol.TStruct.class, STRUCT_DESC).init(
				JExpr._new(codeModel._ref(org.apache.thrift.protocol.TStruct.class)).arg(_class.name()));

		List<JVar> vars = new ArrayList<>();

		JVar fieldBitField = _class.field(JMod.PRIVATE, byte.class, ISSET_BITFIELD).init(JExpr.lit(0));
		int i = 0;
		for (Map.Entry<String, JType> _field : fields.entrySet()) {

			_class.field(JMod.PUBLIC | JMod.STATIC | JMod.FINAL, org.apache.thrift.protocol.TField.class, _field.getKey().toUpperCase() + _FIELD_DESC).init(
					JExpr._new(codeModel._ref(org.apache.thrift.protocol.TField.class)).arg(JExpr.lit(_field.getKey()))
							.arg(JExpr.direct(JavaGeneratorUtil.getThriftType(this.codeModel, _field.getValue()))).arg(JExpr.cast(codeModel._ref(short.class), JExpr.lit(i))));

			_class.field(JMod.PRIVATE | JMod.STATIC | JMod.FINAL, int.class, "__" + _field.getKey().toUpperCase() + _ISSET_ID).init(JExpr.lit(i));
			JFieldVar field = _class.field(JMod.PUBLIC, _field.getValue(), _field.getKey());
			vars.add(field);
			createGettersSetters(_class, field);

			i++;
		}

		_class._implements(codeModel.ref(org.apache.thrift.TBase.class).narrow(_class).narrow(createServicesMethodSendClassArgsEnumFields(vars, _class)));
		_class._implements(Serializable.class);
		_class._implements(Cloneable.class);
		_class._implements(codeModel.ref(Comparable.class).narrow(_class));

		_class.method(JMod.PUBLIC, Void.TYPE, "validate");

		for (JMethod methodSet : new HashSet<>(_class.methods())) {
			if (methodSet.name().startsWith("set")) {
				String fieldName = methodSet.name().split("set")[1];
				methodSet.body().invoke(methodSet.name() + IS_SET).arg(JExpr.lit(true));
				methodSet.type(_class);
				methodSet.body()._return(JExpr._this());

				{
					JMethod _method = _class.method(JMod.PUBLIC, Void.TYPE, "unset" + JavaGeneratorUtil.getCapitalizeString(fieldName));
					JBlock body = _method.body();
					body.assign(JExpr._this().ref(fieldBitField),
							codeModel.directClass(EncodingUtils.class.getName()).staticInvoke(CLEAR_BIT).arg(fieldBitField).arg(JExpr.ref("__" + fieldName.toUpperCase() + _ISSET_ID)));
				}
				{
					JMethod _method = _class.method(JMod.PUBLIC, boolean.class, "isSet" + JavaGeneratorUtil.getCapitalizeString(fieldName));
					JBlock body = _method.body();
					body._return(codeModel.directClass(EncodingUtils.class.getName()).staticInvoke("testBit").arg(fieldBitField)
							.arg(JExpr.ref("__" + fieldName.toUpperCase() + _ISSET_ID)));
				}
				{
					JMethod _method = _class.method(JMod.PUBLIC, Void.TYPE, "set" + JavaGeneratorUtil.getCapitalizeString(fieldName) + IS_SET);
					JVar param = _method.param(boolean.class, "value");
					JBlock body = _method.body();
					body.assign(
							JExpr._this().ref(fieldBitField),
							codeModel.directClass(EncodingUtils.class.getName()).staticInvoke("setBit").arg(fieldBitField).arg(JExpr.ref("__" + fieldName.toUpperCase() + _ISSET_ID))
									.arg(param));
				}
			}
		}

		implementsConsstructors(_class, fields);
		implementsMethodsForInterfaces(_class, fields);

		JClass refMap = codeModel.ref(HashMap.class);
		refMap = refMap.narrow(codeModel.ref(Class.class).narrow(codeModel.ref(IScheme.class).wildcard())).narrow(SchemeFactory.class);
		JVar fildSchemes = _class.field(JMod.PRIVATE | JMod.STATIC | JMod.FINAL, refMap, SCHEMES).init(JExpr._new(refMap));

		JBlock blockStatic = _class.init();
		blockStatic.add(fildSchemes.invoke("put").arg(codeModel.ref(StandardScheme.class).dotclass())
				.arg(JExpr._new(createServicesMethodSendClassArgsStandardSchemeFactory(_class, vars))));
		blockStatic.add(fildSchemes.invoke("put").arg(codeModel.ref(TupleScheme.class).dotclass()).arg(JExpr._new(createServicesMethodSendClassArgsTupleSchemeFactory(_class, vars))));

		return _class;
	}

	private void implementsConsstructors(JDefinedClass _class, Map<String, JType> fields) {

		_class.constructor(JMod.PUBLIC);

		JMethod constructor = _class.constructor(JMod.PUBLIC);
		JVar argOther = constructor.param(_class, "other");

		JBlock body = constructor.body();

		body.assign(JExpr._this().ref(ISSET_BITFIELD), argOther.ref(ISSET_BITFIELD));

		for (Map.Entry<String, JType> entry : fields.entrySet()) {
			String capitalizeName = JavaGeneratorUtil.getCapitalizeString(entry.getKey());
			body._if(argOther.invoke("isSet" + capitalizeName))._then().add(JExpr._this().invoke("set" + capitalizeName).arg(argOther.invoke("get" + capitalizeName)));
		}

	}

	private void implementsMethodsForInterfaces(JDefinedClass _class, Map<String, JType> fields) {

		createMethodEquals(_class, fields);
		createMethodCompareTo(_class, fields);

		createReadeMethod(_class);
		createWriteMethod(_class);

		createMethodFieldForId(_class);
		createMethodFieldIsSet(_class, fields);
		createMethodFielGetFieldValue(_class, fields);

		createMethodFieldSetFieldValue(_class, fields);

		createDeepCopyMethod(_class);
		createMethodClear(_class, fields);

	}

	private void createMethodEquals(JDefinedClass _class, Map<String, JType> fields) {
		JMethod method = _class.method(JMod.PUBLIC, codeModel.BOOLEAN, "equals");
		JVar argOther = method.param(_class, "other");

		method.body()._return(JExpr._this().invoke(COMPARE_TO).arg(argOther).eq(JExpr.lit(0)));

	}

	private void createMethodClear(JDefinedClass _class, Map<String, JType> fields) {
		JMethod method = _class.method(JMod.PUBLIC, Void.TYPE, "clear");

		JBlock body = method.body();

		for (Map.Entry<String, JType> entry : fields.entrySet()) {
			String capitalizeName = JavaGeneratorUtil.getCapitalizeString(entry.getKey());

			body.add(JExpr._this().invoke("unset" + capitalizeName));
			body.add(JExpr._this().invoke("set" + capitalizeName).arg(JExpr._null()));

			// body._if(argOther.invoke("isSet"+capitalizeName))._then().add(JExpr._this().invoke("set"+capitalizeName).arg(argOther.invoke("get"+capitalizeName)));
		}

	}

	private void createMethodCompareTo(JDefinedClass _class, Map<String, JType> fields) {
		JMethod method = _class.method(JMod.PUBLIC, codeModel.INT, COMPARE_TO);
		JVar argOther = method.param(_class, "other");

		JBlock body = method.body();

		body._if(JExpr._this().invoke("getClass").ne(argOther.invoke("getClass")))._then()
				._return(JExpr._this().invoke("getClass").invoke("getName").invoke(COMPARE_TO).arg(argOther.invoke("getClass").invoke("getName")));

		JVar var = body.decl(codeModel.INT, "lastComparison");
		var.init(JExpr.lit(0));

		for (Map.Entry<String, JType> entry : fields.entrySet()) {
			JInvocation staticInvoke = codeModel.ref(Boolean.class).staticInvoke("valueOf");
			String capitalizeName = JavaGeneratorUtil.getCapitalizeString(entry.getKey());
			String isSetMethod = "isSet" + capitalizeName;
			String getMethod = "get" + capitalizeName;
			JInvocation invokeThidIsSetMethod = JExpr._this().invoke(isSetMethod);
			staticInvoke.arg(invokeThidIsSetMethod);
			body.assign(var, staticInvoke.invoke(COMPARE_TO).arg(argOther.invoke(isSetMethod)));

			body._if(var.ne(JExpr.lit(0)))._then()._return(var);

			JBlock bodyThen = body._if(invokeThidIsSetMethod)._then();
			bodyThen.assign(var, codeModel.ref(org.apache.thrift.TBaseHelper.class).staticInvoke(COMPARE_TO).arg(JExpr._this().invoke(getMethod)).arg(argOther.invoke(getMethod)));
			bodyThen._if(var.ne(JExpr.lit(0)))._then()._return(var);
		}

		body._return(var);
	}

	private void createMethodFieldIsSet(JDefinedClass _class, Map<String, JType> fields) {
		JMethod method = _class.method(JMod.PUBLIC, codeModel.BOOLEAN, "isSet");
		JClass refEnumFields = codeModel.ref(_class.fullName() + DOT_FIELD);
		JVar param = method.param(refEnumFields, "field");
		
		method.body()._if(param.eq(JExpr._null()))._then()._throw(JExpr._new(codeModel.ref(IllegalStateException.class)));

		JSwitch _switch = method.body()._switch(param);
		for (Map.Entry<String, JType> entry : fields.entrySet()) {
			JBlock bodyCase = _switch._case(JExpr.ref(entry.getKey().toUpperCase())).body();
			String capitalizeName = JavaGeneratorUtil.getCapitalizeString(entry.getKey());
			bodyCase._return(JExpr.invoke("isSet" + capitalizeName));
		}

		JInvocation _newException = JExpr._new(codeModel.ref(IllegalStateException.class));
		method.body()._throw(_newException);

	}

	private void createMethodFieldSetFieldValue(JDefinedClass _class, Map<String, JType> fields) {
		JMethod method = _class.method(JMod.PUBLIC, Void.TYPE, "setFieldValue");
		JClass refEnumFields = codeModel.ref(_class.fullName() + DOT_FIELD);
		JVar param = method.param(refEnumFields, "field");
		JVar param2 = method.param(codeModel.ref(Object.class), "value");
		JBlock body = method.body();

		JSwitch _switch = body._switch(param);
		for (Map.Entry<String, JType> entry : fields.entrySet()) {
			JBlock bodyCase = _switch._case(JExpr.ref(entry.getKey().toUpperCase())).body();
			JConditional _if = bodyCase._if(param2.eq(JExpr._null()));
			String capitalizeName = JavaGeneratorUtil.getCapitalizeString(entry.getKey());
			_if._then().invoke("unset" + capitalizeName);
			_if._else().invoke("set" + capitalizeName).arg(JExpr.cast(getTypeGetMethodByName(_class, capitalizeName), param2));
			bodyCase._break();
		}

//		JInvocation _newException = JExpr._new(codeModel.ref(IllegalStateException.class));
//		_switch._default().body()._throw(_newException);

	}

	private JType getTypeGetMethodByName(JDefinedClass _class, String capitalizeName) {
		for (JMethod jMethod : _class.methods())
			if (jMethod.name().equals("get" + capitalizeName))
				return jMethod.type();

		throw new IllegalStateException(capitalizeName);
	}

	private void createMethodFielGetFieldValue(JDefinedClass _class, Map<String, JType> fields) {
		JMethod method = _class.method(JMod.PUBLIC, codeModel.ref(Object.class), "getFieldValue");
		JClass refEnumFields = codeModel.ref(_class.fullName() + DOT_FIELD);
		JVar param = method.param(refEnumFields, "field");

		JBlock body = method.body();

		JSwitch _switch = body._switch(param);
		for (Map.Entry<String, JType> entry : fields.entrySet()) {
			_switch._case(JExpr.ref(entry.getKey().toUpperCase())).body()._return(JExpr.invoke("get" + JavaGeneratorUtil.getCapitalizeString(entry.getKey())));
		}

		JInvocation _newException = JExpr._new(codeModel.ref(IllegalStateException.class));
//		_switch._default().body()._throw(_newException);

		body._throw(_newException);
	}

	private void createMethodFieldForId(JDefinedClass _class) {
		JMethod method = _class.method(JMod.PUBLIC, codeModel.ref(_class.fullName() + DOT_FIELD), "fieldForId");
		JVar param = method.param(codeModel.INT, "fieldId");

		method.body()._return(codeModel.ref(_class.fullName() + DOT_FIELD).staticInvoke("findByThriftId").arg(param));

	}

	private void createDeepCopyMethod(JDefinedClass _class) {
		JMethod method = _class.method(JMod.PUBLIC, codeModel.ref(TBase.class).narrow(_class).narrow(codeModel.ref(_class.fullName() + DOT_FIELD)), "deepCopy");
		method.body()._return(JExpr._new(_class).arg(JExpr._this()));
	}

	private void createReadeMethod(JDefinedClass _class) {
		JMethod method = _class.method(JMod.PUBLIC, Void.TYPE, "read");
		JVar param = method.param(codeModel.ref(TProtocol.class), "iport");
		method._throws(codeModel.ref(TException.class));

		JInvocation invoke = JExpr.ref(SCHEMES).invoke("get");
		invoke.arg(param.invoke("getScheme"));
		method.body().add(invoke.invoke("getScheme").invoke("read").arg(param).arg(JExpr._this()));
	}

	private void createWriteMethod(JDefinedClass _class) {
		JMethod method = _class.method(JMod.PUBLIC, Void.TYPE, "write");
		JVar param = method.param(codeModel.ref(TProtocol.class), "oport");
		method._throws(codeModel.ref(TException.class));

		JInvocation invoke = JExpr.ref(SCHEMES).invoke("get");
		invoke.arg(param.invoke("getScheme"));
		method.body().add(invoke.invoke("getScheme").invoke("write").arg(param).arg(JExpr._this()));
	}

	private JDefinedClass createServicesMethodSendClassArgsStandardSchemeFactory(JDefinedClass _class, List<JVar> list) throws JClassAlreadyExistsException {
		JDefinedClass standardSchemeClass = createServicesMethodSendClassArgsStandardScheme(_class, list);
		JDefinedClass factoryClass = _class._class(JMod.PUBLIC|JMod.STATIC, _class.name() + STANDARD_SCHEME + "Factory")._implements(SchemeFactory.class);

		JMethod method = factoryClass.method(JMod.PUBLIC, standardSchemeClass, "getScheme");
		method.body()._return(JExpr._new(standardSchemeClass));

		return factoryClass;
	}

	private JDefinedClass createServicesMethodSendClassArgsStandardScheme(JDefinedClass _class, List<JVar> list) throws JClassAlreadyExistsException {
		JDefinedClass _class2 = _class._class(JMod.PUBLIC|JMod.STATIC,_class.name() + STANDARD_SCHEME)._extends(codeModel.ref(StandardScheme.class).narrow(_class));

		{
			JMethod methodRead = _class2.method(JMod.PUBLIC, Void.TYPE, "read")._throws(TException.class);
			JVar _protArg = methodRead.param(org.apache.thrift.protocol.TProtocol.class, "prot");
			JVar _structArg = methodRead.param(_class, "struct");

			JBlock body = methodRead.body();
			JVar _varSchemeField = body.decl(codeModel.ref(org.apache.thrift.protocol.TField.class), "schemeField");

			body.add(_protArg.invoke("readStructBegin"));

			JBlock bodyWhile = body._while(JExpr.lit(true)).body();

			bodyWhile.assign(_varSchemeField, _protArg.invoke("readFieldBegin"));
			JFieldRef _varType = _varSchemeField.ref("type");
			JFieldRef _varId = _varSchemeField.ref("id");
			bodyWhile._if(_varType.eq(codeModel.ref(org.apache.thrift.protocol.TType.class).staticRef("STOP")))._then()._break();;

			JInvocation _snippetSkip = codeModel.ref(TProtocolUtil.class).staticInvoke("skip").arg(_protArg).arg(_varType);

			JSwitch _switch = bodyWhile._switch(_varId);
			int i = 1;
			for (JVar jVar : list) {

				JBlock bodyCase = _switch._case(JExpr.lit(i++)).body();
				JConditional _if = bodyCase._if(_varType.eq(codeModel.ref(org.apache.thrift.protocol.TType.class).staticRef(JavaGeneratorUtil.getThriftSufixTypeMethod(codeModel, jVar.type()))));
				String varType = JavaGeneratorUtil.getThriftSufixTypeMethod(this.codeModel, jVar.type());
				JInvocation invoke = null;
				if (varType.equals("STRUCT")) {
					invoke = JExpr._new(jVar.type());
				} else if (varType.equals("ENUM")) {
					invoke = codeModel.ref(jVar.type().fullName()).staticInvoke(FIND_BY_VALUE).arg(_protArg.invoke("readI32"));
				} else {
					invoke = _protArg.invoke("read" + JavaGeneratorUtil.getCapitalizeString(varType.toLowerCase()));
				}
				_if._then().block().add(_structArg.invoke("set" + JavaGeneratorUtil.getCapitalizeString(jVar.name())).arg(invoke));
				if (varType.equals("STRUCT")) {
					_if._then().block().add(_structArg.invoke("get" + JavaGeneratorUtil.getCapitalizeString(jVar.name())).invoke("read").arg(_protArg));
				}
				_if._then().block().add(_structArg.invoke("set" + JavaGeneratorUtil.getCapitalizeString(jVar.name()) + IS_SET).arg(JExpr.lit(true)));
				
				
				_if._else().block().add(_snippetSkip);
				
				bodyCase._break();

			}
			_switch._default().body().add(_snippetSkip);

			body.add(_protArg.invoke("readFieldEnd"));
			body.add(_protArg.invoke("readStructEnd"));

			body.add(_structArg.invoke("validate"));
		}
		
		{
			JMethod methodWrite = _class2.method(JMod.PUBLIC, Void.TYPE, "write")._throws(TException.class);
			JVar _protArg = methodWrite.param(org.apache.thrift.protocol.TProtocol.class, "prot");
			JVar _structArg = methodWrite.param(_class, "struct");

			JBlock body = methodWrite.body();
			body.add(_structArg.invoke("validate"));
			body.add(_protArg.invoke("writeStructBegin").arg(_class.staticRef(STRUCT_DESC)));

			for (JVar jVar : list) {
				String thriftSufixTypeMethod = JavaGeneratorUtil.getThriftSufixTypeMethod(this.codeModel, jVar.type());
				JInvocation getInvokeField = _structArg.invoke("get" + JavaGeneratorUtil.getCapitalizeString(jVar.name()));
				JBlock _then = null;
				if (thriftSufixTypeMethod.equals("STRUCT")) {
					_then = body._if(getInvokeField.ne(JExpr._null()))._then();
				} else if (thriftSufixTypeMethod.equals("ENUM")) {
					//if ENUM
				} else if (thriftSufixTypeMethod.equals("STRING")) {
					_then = body._if(getInvokeField.ne(JExpr._null()))._then();
				} else if (thriftSufixTypeMethod.equals("BOOL")) {
					_then = body._if(getInvokeField.ne(JExpr._null()))._then();
				} else if (thriftSufixTypeMethod.equals("BYTE")) {
					_then = body._if(getInvokeField.ne(JExpr._null()))._then();
				} else if (thriftSufixTypeMethod.equals("DOUBLE")) {
					_then = body._if(getInvokeField.ne(JExpr._null()))._then();
				} else if (thriftSufixTypeMethod.equals("I16")) {
					_then = body._if(getInvokeField.ne(JExpr._null()))._then();
				} else if (thriftSufixTypeMethod.equals("I32")) {
					_then = body._if(getInvokeField.ne(JExpr._null()))._then();
				} else if (thriftSufixTypeMethod.equals("I64")) {
					_then = body._if(getInvokeField.ne(JExpr._null()))._then();
				} else {
					// IF ....
				}
				_then.add(_protArg.invoke("writeFieldBegin").arg(_class.staticRef(jVar.name().toUpperCase() + _FIELD_DESC)));
				
				if (thriftSufixTypeMethod.equals("STRUCT")) {
					_then.add(getInvokeField.invoke("write").arg(_protArg));
				} else if (thriftSufixTypeMethod.equals("ENUM")) {
					body.add(_protArg.invoke("writeI32").arg(getInvokeField.invoke("getValue")));
				} else {
					body.add(_protArg.invoke("write" + JavaGeneratorUtil.getCapitalizeString(thriftSufixTypeMethod.toLowerCase())).arg(getInvokeField));
				}
				_then.add(_protArg.invoke("writeFieldEnd"));
				
				body.add(_protArg.invoke("writeFieldStop"));
			}

			body.add(_protArg.invoke("writeStructEnd"));
		}

		return _class2;
	}

	private JDefinedClass createServicesMethodSendClassArgsEnumFields(List<JVar> vars, JDefinedClass _class) throws JClassAlreadyExistsException {

		JDefinedClass _enum = _class._enum("_Fields");

		_enum._implements(org.apache.thrift.TFieldIdEnum.class);
		
		JEnumConstant enumConstant = _enum.enumConstant("SUCESS");
		JExpression valurConst = JExpr.cast(this.codeModel._ref(short.class), JExpr.lit(0));
		enumConstant.arg(valurConst);
		enumConstant.arg(JExpr.lit("sucess"));

		_enum.field(JMod.PRIVATE | JMod.FINAL, short.class, "value");
		JFieldVar fieldName = _enum.field(JMod.PRIVATE | JMod.FINAL, String.class, "name");

		JMethod constructor = _enum.constructor(JMod.PRIVATE);

		JBlock body = constructor.body();
		body.assign(JExpr.refthis("value"), constructor.param(short.class, "value"));
		body.assign(JExpr.refthis("name"), constructor.param(String.class, "name"));

		_enum.method(JMod.PUBLIC, short.class, "getThriftFieldId").body()._return(JExpr.refthis("value"));
		_enum.method(JMod.PUBLIC, String.class, "getFieldName").body()._return(JExpr.refthis("name"));

		short i = 0;
		List<JEnumConstant> constants = new ArrayList<>();
		for (JVar jvar : vars) {
			JEnumConstant enumConstant_ = _enum.enumConstant(jvar.name().toUpperCase());
			enumConstant_.arg(JExpr.cast(codeModel._ref(short.class), JExpr.lit(i++)));
			enumConstant_.arg(JExpr.lit(jvar.name()));

			constants.add(enumConstant_);
		}

		JMethod jFindByThriftId = _enum.method(JMod.PUBLIC | JMod.STATIC, _enum, "findByThriftId");
		{
			JVar param = jFindByThriftId.param(int.class, "id");
			JBlock block = jFindByThriftId.body();
			JSwitch jswitch = block._switch(param);
			for (JEnumConstant value : constants) {
				JCase jcase = jswitch._case(JExpr.lit(constants.indexOf(value)));
				JBlock jblock = jcase.body();
				jblock._return(value);
			}
			JBlock _block = jswitch._default().body();
			_block._return(JExpr._null());
		}
		JMethod jFindByThriftIdOrThrow = _enum.method(JMod.PUBLIC | JMod.STATIC, _enum, "findByThriftIdOrThrow");
		{
			JVar param = jFindByThriftIdOrThrow.param(int.class, "id");
			JBlock block = jFindByThriftIdOrThrow.body();
			JVar varResult = block.decl(_enum, "result");
			varResult.init(JExpr.invoke(jFindByThriftId).arg(JExpr.ref("id")));
			block._if(JExpr.ref("result").eq(JExpr._null()))._then()
					._throw(JExpr._new(codeModel.ref(IllegalArgumentException.class)).arg(JExpr.lit("Field ").plus(param).plus(JExpr.lit("doesn't exist!"))));
			block._return(varResult);
		}
		JMethod jFindByName = _enum.method(JMod.PUBLIC | JMod.STATIC, _enum, "findByName");
		{
			JVar param = jFindByName.param(String.class, "id");
			JBlock block = jFindByName.body();
			JSwitch jswitch = block._switch(param);
			for (JVar jvar : vars) {
				String nameEnum = jvar.name().toUpperCase();
				JCase jcase = jswitch._case(JExpr.lit(nameEnum));
				JBlock jblock = jcase.body();
				jblock._return(_enum.enumConstant(nameEnum));
			}
			JBlock _block = jswitch._default().body();
			_block._return(JExpr._null());
		}

		return _enum;
	}

	private JDefinedClass createServicesMethodSendClassArgsTupleSchemeFactory(JDefinedClass _class, List<JVar> list) throws JClassAlreadyExistsException {
		JDefinedClass tupleSchemeClass = createServicesMethodSendClassArgsTupleScheme(_class, list);

		JDefinedClass factoryClass = _class._class(JMod.PUBLIC | JMod.STATIC, _class.name() + TUPLE_SCHEME + "Factory")._implements(SchemeFactory.class);

		JMethod method = factoryClass.method(JMod.PUBLIC, tupleSchemeClass, "getScheme");
		method.body()._return(JExpr._new(tupleSchemeClass));

		return factoryClass;
	}

	private JDefinedClass createServicesMethodSendClassArgsTupleScheme(JDefinedClass _class, List<JVar> list) throws JClassAlreadyExistsException {
		JDefinedClass _class2 = _class._class(JMod.PUBLIC|JMod.STATIC,_class.name() + TUPLE_SCHEME)._extends(codeModel.ref(TupleScheme.class).narrow(_class));

		{
			JMethod methodWrite = _class2.method(JMod.PUBLIC, Void.TYPE, "write")._throws(TException.class);
			methodWrite.param(org.apache.thrift.protocol.TProtocol.class, "prot");
			JVar param = methodWrite.param(_class, "struct");

			JBlock block = methodWrite.body();
			block.decl(codeModel.ref(TTupleProtocol.class), "result").init(JExpr.cast(codeModel.ref(TTupleProtocol.class), JExpr.ref("prot")));
			block.decl(codeModel.ref(BitSet.class), "optionals").init(JExpr._new(codeModel.ref(BitSet.class)));
			int i = 0;
			for (JVar jVar : list) {
				block._if(JExpr.ref("struct").invoke("isSet" + JavaGeneratorUtil.getCapitalizeString(jVar.name())))._then()
						.add(JExpr.ref("optionals").invoke("set").arg(JExpr.lit(i++)));
			}
			block.add(JExpr.ref("result").invoke("writeBitSet").arg(JExpr.ref("optionals")).arg(JExpr.lit(i++)));
			for (JVar jVar : list) {
				String varType = JavaGeneratorUtil.getThriftSufixTypeMethod(this.codeModel, jVar.type());
				String prefix = null;
				JInvocation invocation = null;
				if (varType.equals("STRUCT")) {
					prefix = "prefix";
					invocation = param.invoke("get" + JavaGeneratorUtil.getCapitalizeString(jVar.name()));
				} else if (varType.equals("ENUM")) {
					prefix = "I32";
					invocation = param.invoke("get" + JavaGeneratorUtil.getCapitalizeString(jVar.name())).invoke("getValue");
				} else {
					prefix = JavaGeneratorUtil.getCapitalizeString(varType.toLowerCase());
					invocation = param.invoke("get" + JavaGeneratorUtil.getCapitalizeString(jVar.name()));
				}

				block._if(JExpr.ref("struct").invoke("isSet" + JavaGeneratorUtil.getCapitalizeString(jVar.name())))._then()
						.add(JExpr.ref("result").invoke("write" + prefix).arg(invocation));
			}

		}
		{
			JMethod methodRead = _class2.method(JMod.PUBLIC, Void.TYPE, "read")._throws(TException.class);
			JVar param2 = methodRead.param(org.apache.thrift.protocol.TProtocol.class, "prot");
			JVar param = methodRead.param(_class, "struct");

			JBlock block = methodRead.body();
			JVar prot = block.decl(codeModel.ref(TTupleProtocol.class), "result").init(JExpr.cast(codeModel.ref(TTupleProtocol.class), JExpr.ref("prot")));
			int countArgs = 1;
			block.decl(codeModel.ref(BitSet.class), "incoming").init(prot.invoke("readBitSet").arg(JExpr.lit(countArgs)));
			int i = 0;
			for (JVar jVar : list) {
				JBlock blockThen = block._if(JExpr.ref("incoming").invoke("get").arg(JExpr.lit(i++)))._then();
				String thriftSufixTypeMethod = JavaGeneratorUtil.getThriftSufixTypeMethod(this.codeModel, jVar.type());
				JInvocation invoke = null;
				if ("Struct".equals(thriftSufixTypeMethod)) {

				} else if ("ENUM".equals(thriftSufixTypeMethod)) {
					invoke = codeModel.ref(jVar.type().fullName()).staticInvoke(FIND_BY_VALUE).arg(param2.invoke("readI32"));
				} else {
					invoke = param2.invoke("read" + JavaGeneratorUtil.getCapitalizeString(thriftSufixTypeMethod.toLowerCase()));
				}

				blockThen.add(param.invoke("set" + JavaGeneratorUtil.getCapitalizeString(jVar.name())).arg(invoke));
				blockThen.add(param.invoke("set" + JavaGeneratorUtil.getCapitalizeString(jVar.name()) + IS_SET).arg(JExpr.lit(true)));
			}
		}

		return _class2;
	}

	public void createGettersSetters(JDefinedClass jStructClass, JFieldVar field) {
		{
			JMethod method = jStructClass.method(JMod.PUBLIC, field.type(), "get" + JavaGeneratorUtil.getCapitalizeString(field.name()));
			JBlock body = method.body();
			body._return(field);
		}
		{
			JMethod method = jStructClass.method(JMod.PUBLIC, Void.TYPE, "set" + JavaGeneratorUtil.getCapitalizeString(field.name()));
			method.param(field.type(), ARG);
			JBlock body = method.body();
			body.assign(JExpr._this().ref(field), JExpr.ref(ARG));
		}
	}

}
