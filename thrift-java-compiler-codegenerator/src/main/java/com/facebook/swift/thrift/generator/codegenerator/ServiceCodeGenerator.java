package com.facebook.swift.thrift.generator.codegenerator;

import java.util.HashMap;
import java.util.Map;

import org.apache.thrift.AsyncProcessFunction;
import org.apache.thrift.ProcessFunction;
import org.apache.thrift.TApplicationException;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseAsyncProcessor;
import org.apache.thrift.TException;
import org.apache.thrift.TServiceClient;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.async.TAsyncClient;
import org.apache.thrift.async.TAsyncMethodCall;
import org.apache.thrift.protocol.TMessage;
import org.apache.thrift.protocol.TMessageType;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.AbstractNonblockingServer.AsyncFrameBuffer;
import org.apache.thrift.transport.TMemoryInputTransport;
import org.apache.thrift.transport.TNonblockingTransport;

import com.facebook.swift.parser.model.Service;
import com.facebook.swift.parser.model.ThriftField;
import com.facebook.swift.parser.model.ThriftMethod;
import com.facebook.swift.thrift.generator.JavaGeneratorUtil;
import com.sun.codemodel.ClassType;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldRef;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JInvocation;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JTryBlock;
import com.sun.codemodel.JType;
import com.sun.codemodel.JTypeVar;
import com.sun.codemodel.JVar;

public class ServiceCodeGenerator extends AbstractCodeGenerator<Service> {

	private static final String _CALL = "_call";
	private static final String SUFIX_ASYNC_PROCESSOR = "AsyncProcessor";
	private static final String SUFIX_PROCESSOR = "Processor";
	private static final String SUFIX_SERVICE_IFACE = "Iface";
	private static final String SUFIX_SERVICE_ASYNC_IFACE = "AsyncIface";
	private static final String SUFIX_SERVICE_CLIENT = "Client";
	private static final String SUFIX_SERVICE_ASNC_CLIENT = "AsyncClient";
	private static final String _RESULT = "_result";
	private static final String RECV = "recv_";
	private static final String _ARGS = "_args";

	@Override
	public void generete(Service definition) throws Exception {
		JDefinedClass jServiceClass = this.getJavaPackage()._class(JMod.PUBLIC,
				definition.getName(), ClassType.CLASS);

		JDefinedClass _interfaceIface = createServicesInterface(definition,
				jServiceClass);
		createServicesClient(definition, jServiceClass);
		createServicesProcessor(definition, jServiceClass, _interfaceIface);

		JDefinedClass _asyncInterfaceIface = createServicesAsyncInterface(
				definition, jServiceClass);
		createServicesAsyncClient(definition, jServiceClass);
		createServicesAsyncProcessor(definition, jServiceClass,
				_asyncInterfaceIface);
	}

	private JDefinedClass createServicesInterface(Service service,
			JDefinedClass jServiceClass) throws JClassAlreadyExistsException {
		// JDefinedClass _interface =
		// jServiceClass._interface(jServiceClass.name() + SUFIX_SERVICE_IFACE);
		JDefinedClass _interface = jServiceClass._interface(JMod.PUBLIC,
				SUFIX_SERVICE_IFACE);

		if (service.getParent() != null && service.getParent().isPresent()) {
			JClass jClassParent = (JClass) resolvName(service.getParent().get());
			_interface._extends((JClass) resolvName(jClassParent.fullName()
					+ "." + SUFIX_SERVICE_IFACE));
		}

		for (ThriftMethod function : service.getMethods()) {
			createServicesMethod(function, _interface);
		}

		return _interface;
	}

	private void createServicesClient(Service service,
			JDefinedClass jServiceClass) throws JClassAlreadyExistsException {
		JDefinedClass _classClient = jServiceClass._class(JMod.PUBLIC
				| JMod.STATIC, SUFIX_SERVICE_CLIENT);

		if (service.getParent() != null && service.getParent().isPresent()) {
			JClass jClassParent = (JClass) resolvName(service.getParent().get());
			_classClient._extends((JClass) resolvName(jClassParent.fullName()
					+ "." + SUFIX_SERVICE_CLIENT));
		} else {
			_classClient._extends(TServiceClient.class);
		}

		_classClient._implements((JClass) resolvName(jServiceClass.fullName()
				+ "." + SUFIX_SERVICE_IFACE));

		createServicesClientFactory(jServiceClass, _classClient);

		{
			JMethod constructor = _classClient.constructor(JMod.PUBLIC);
			constructor.param(org.apache.thrift.protocol.TProtocol.class,
					"prot");
			constructor.body()
					.add(JExpr.invoke("super").arg(JExpr.ref("prot")));
		}
		{
			JMethod constructor = _classClient.constructor(JMod.PUBLIC);
			constructor.param(org.apache.thrift.protocol.TProtocol.class,
					"iprot");
			constructor.param(org.apache.thrift.protocol.TProtocol.class,
					"oprot");
			constructor.body().add(
					JExpr.invoke("super").arg(JExpr.ref("iprot"))
							.arg(JExpr.ref("oprot")));
		}

		for (ThriftMethod function : service.getMethods()) {
			JMethod method = createServicesMethod(function, _classClient);
			boolean returnValue = !this.codeModel._ref(Void.TYPE).equals(
					method.type());

			JMethod methodSend = _classClient.method(JMod.PUBLIC, Void.TYPE,
					"send_" + method.name());
			{
				methodSend._throws(org.apache.thrift.TException.class);

				Map<String, JType> fields = new HashMap<>();
				for (JVar jVar : method.params()) {
					fields.put(jVar.name(), jVar.type());
				}

				JDefinedClass _class = jServiceClass._class(JMod.PUBLIC
						| JMod.STATIC,
						method.name()+ _ARGS);
				JDefinedClass createServicesMethodSendClassArgs = new StructCodeGeneratorHelper()
						.whithCodeModel(this.codeModel).buildStruct(fields,
								_class);

				JBlock body = methodSend.body();
				body.decl(createServicesMethodSendClassArgs, "args").init(
						JExpr._new(createServicesMethodSendClassArgs));
				for (JVar jvar : method.params()) {
					methodSend.param(jvar.type(), jvar.name());
					body.invoke(
							JExpr.ref("args"),
							"set"
									+ JavaGeneratorUtil
											.getCapitalizeString(jvar.name()))
							.arg(JExpr.ref(jvar.name()));
				}
				body.invoke("sendBase").arg(method.name())
						.arg(JExpr.ref("args"));

			}
			JMethod methodRecv = null;
			{
				// if (returnValue) {
				methodRecv = _classClient.method(JMod.PUBLIC, method.type(),
						RECV + method.name());
				methodRecv._throws(org.apache.thrift.TException.class);
				// } else {
				// methodRecv = _classClient.method(JMod.PUBLIC, Void.TYPE, RECV
				// + method.name());
				// methodRecv._throws(org.apache.thrift.TException.class);
				// }

				for (ThriftField field : function.getThrowsFields())
					methodRecv
							._throws((JClass) this.resolvType(field.getType()));

				Map<String, JType> fields = new HashMap<>();
				if (!function.isOneway())
					fields.put(
							"sucess",
							methodRecv.type().equals(this.codeModel.VOID) ? this.codeModel.INT
									: methodRecv.type());

				JDefinedClass _class = jServiceClass._class(JMod.PUBLIC
						| JMod.STATIC,
						method.name()+ _RESULT);

				JDefinedClass createServicesMethodResultClassArgs = new StructCodeGeneratorHelper()
						.whithCodeModel(this.codeModel).buildStruct(fields,
								_class);
				JBlock body = methodRecv.body();
				body.decl(createServicesMethodResultClassArgs, "args").init(
						JExpr._new(createServicesMethodResultClassArgs));
				body.invoke("receiveBase").arg(JExpr.ref("args"))
						.arg(method.name());
			}

			JBlock body = method.body();
			JInvocation invoke = JExpr.invoke(methodSend);
			for (JVar jvar : method.params())
				invoke.arg(JExpr.ref(jvar.name()));
			body.add(invoke);
			if (!function.isOneway()) {
				body._return(JExpr.invoke(methodRecv));
			} else {
				body.invoke(methodRecv);
			}
		}
	}

	private void createServicesProcessor(Service service,
			JDefinedClass jServiceClass, JDefinedClass _interfaceIface)
			throws JClassAlreadyExistsException {
		JDefinedClass _classClient = jServiceClass._class(JMod.PUBLIC,
				jServiceClass.name() + SUFIX_PROCESSOR);

		_classClient._implements(org.apache.thrift.TProcessor.class);

		JTypeVar generify = _classClient.generify("T", _interfaceIface);

		if (service.getParent().isPresent()) {
			JClass jClassParent = (JClass) resolvName(service.getParent().get());
			_classClient._extends(((JClass) resolvName(jClassParent.fullName()
					+ SUFIX_PROCESSOR)).narrow(generify));
		} else {
			_classClient._extends(this.codeModel.ref(
					org.apache.thrift.TBaseProcessor.class).narrow(generify));
		}

		JClass classProcessFunction = this.codeModel.ref(ProcessFunction.class);
		classProcessFunction = classProcessFunction.narrow(generify,
				this.codeModel.ref(TBase.class).wildcard());
		{
			JMethod constructor = _classClient.constructor(JMod.PUBLIC);
			JVar param = constructor.param(generify, "iFace");
			JBlock body = constructor.body();
			JInvocation invoke = body.invoke("super");
			invoke.arg(param);
			JInvocation argNewHashMap = JExpr._new(this.codeModel
					.ref(HashMap.class).narrow(String.class)
					.narrow(classProcessFunction));
			invoke.arg(JExpr.invoke("getProcessMap").arg(argNewHashMap));
		}
		{
			JMethod constructor = _classClient.constructor(JMod.PUBLIC);
			JBlock body = constructor.body();
			JInvocation invoke = body.invoke("super");

			JVar param = constructor.param(generify, "iFace");
			JVar param2 = constructor.param(this.codeModel.ref(Map.class)
					.narrow(String.class).narrow(classProcessFunction),
					"processMap");
			invoke.arg(param);
			invoke.arg(JExpr.invoke("getProcessMap").arg(param2));
		}

		{
			JMethod method = _classClient.method(JMod.PRIVATE | JMod.STATIC
					| JMod.FINAL, classProcessFunction, "getProcessMap");
			method.generify("T", _interfaceIface);
			JVar param = method.param(classProcessFunction, "processMap");
			JBlock body = method.body();
			for (JMethod method_ : _interfaceIface.methods()) {
				JDefinedClass createServicesProcessorBean = createServicesProcessorBean(
						service, jServiceClass, _classClient, method_,
						_interfaceIface);
				JInvocation invoke = param.invoke("put");
				invoke.arg(JExpr.lit(method_.name()));
				invoke.arg(JExpr._new(createServicesProcessorBean));
				body.add(invoke);
			}
			body._return(param);
		}

	}

	private JDefinedClass createServicesProcessorBean(Service service,
			JDefinedClass jServiceClass, JDefinedClass _classClient,
			JMethod method_, JDefinedClass _interfaceIface)
			throws JClassAlreadyExistsException {
		String name = method_.name();
		JDefinedClass _class = _classClient._class(JMod.PUBLIC | JMod.STATIC,
				name);
		JTypeVar generify = _class.generify("T", _interfaceIface);
		JType beanArgs = resolvName(name + _ARGS);
		_class._extends(this.codeModel
				.ref(org.apache.thrift.ProcessFunction.class).narrow(generify)
				.narrow(beanArgs));

		_class.constructor(JMod.PUBLIC).body().invoke("super")
				.arg(JExpr.lit(name));

		ThriftMethod function = getFunctionOfTheMethod(service, method_);

		_class.method(JMod.PUBLIC, beanArgs, "getEmptyArgsInstance").body()
				._return(JExpr._new(beanArgs));
		_class.method(JMod.PROTECTED, this.codeModel.BOOLEAN, "isOneway")
				.body()._return(JExpr.lit(function.isOneway()));

		{
			JType beanResult = !function.isOneway() ? resolvName(name
					+ _RESULT) : this.codeModel
					.ref(org.apache.thrift.TBase.class);
			JMethod method = _class
					.method(JMod.PUBLIC, beanResult, "getResult");
			JVar paramIface = method.param(generify, "iface");
			JVar paramArgs = method.param(beanArgs, "args");
			JBlock body = method.body();
			JInvocation invokeIFace = paramIface.invoke(method_.name());
			for (JVar jVar : method_.params()) {
				invokeIFace.arg(paramArgs.invoke("get"
						+ JavaGeneratorUtil.getCapitalizeString(jVar.name())));
			}
			if (!function.isOneway()) {
				JVar varResult = body.decl(beanResult, "result");
				varResult.init(JExpr._new(beanResult));
				body.add(varResult.invoke(
						"set"
								+ JavaGeneratorUtil
										.getCapitalizeString("success")).arg(
						invokeIFace));
				body.add(varResult.invoke("setSuccessIsSet").arg(
						JExpr.lit(true)));
				body._return(varResult);
			} else {
				body.add(invokeIFace);
				body._return(JExpr._null());
			}

		}

		return _class;
	}

	private JDefinedClass createServicesAsyncInterface(Service service,
			JDefinedClass jServiceClass) throws JClassAlreadyExistsException {
		// JDefinedClass _interface = jServiceClass._interface(JMod.PUBLIC,
		// jServiceClass.name() + SUFIX_SERVICE_ASYNC_IFACE);
		JDefinedClass _interface = jServiceClass._interface(JMod.PUBLIC,
				SUFIX_SERVICE_ASYNC_IFACE);

		if (service.getParent().isPresent()) {
			JClass jClassParent = (JClass) resolvName(service.getParent().get());
			_interface._extends((JClass) resolvName(jClassParent.fullName()
					+ "." + SUFIX_SERVICE_ASYNC_IFACE));
		}

		createServicesAsyncInterfaceMethod(service, _interface);

		return _interface;
	}

	private void createServicesAsyncInterfaceMethod(Service service,
			JDefinedClass _interface) {
		for (ThriftMethod function : service.getMethods()) {
			JMethod method = _interface.method(JMod.PUBLIC, Void.TYPE,
					function.getName());
			for (ThriftField field : function.getArguments()) {
				method.param(this.resolvType(field.getType()), field.getName());
			}
			JClass classCalback = this.codeModel
					.ref(org.apache.thrift.async.AsyncMethodCallback.class);
			if (function.getReturnType() != null)
				classCalback = classCalback.narrow(this.resolvType(function
						.getReturnType()));
			// else
			// classCalback.narrow(Void.class);
			method.param(classCalback, "resultHandler");
			if (function.getThrowsFields() != null) {
				for (ThriftField field : function.getThrowsFields()) {
					method._throws((JClass) this.resolvType(field.getType()));
				}
			}
		}
	}

	private void createServicesAsyncClient(Service service,
			JDefinedClass jServiceClass) throws JClassAlreadyExistsException {
		// JDefinedClass _classClient = jServiceClass._class(JMod.PUBLIC,
		// jServiceClass.name() + SUFIX_SERVICE_ASNC_CLIENT);
		JDefinedClass _classClient = jServiceClass._class(JMod.PUBLIC,
				SUFIX_SERVICE_ASNC_CLIENT);

		if (service.getParent().isPresent())
			_classClient._extends((JClass) resolvName(service.getParent().get()
					+ "." + SUFIX_SERVICE_ASNC_CLIENT));
		else
			_classClient._extends(org.apache.thrift.async.TAsyncClient.class);

		_classClient._implements((JClass) resolvName(jServiceClass.fullName()
				+ "." + SUFIX_SERVICE_ASYNC_IFACE));

		JMethod constructor = _classClient.constructor(JMod.PUBLIC);
		constructor.param(org.apache.thrift.protocol.TProtocolFactory.class,
				"protocolFactory");
		constructor.param(org.apache.thrift.async.TAsyncClientManager.class,
				"asyncClientManager");
		constructor.param(
				org.apache.thrift.transport.TNonblockingTransport.class,
				"nonblockingTransport");
		constructor.body().add(
				JExpr.invoke("super").arg(JExpr.ref("protocolFactory"))
						.arg(JExpr.ref("asyncClientManager"))
						.arg(JExpr.ref("nonblockingTransport")));

		for (ThriftMethod function : service.getMethods()) {
			JMethod method = _classClient.method(JMod.PUBLIC, Void.TYPE,
					function.getName());
			for (ThriftField field : function.getArguments()) {
				method.param(this.resolvType(field.getType()), field.getName());
			}
			JClass classCalback = this.codeModel
					.ref(org.apache.thrift.async.AsyncMethodCallback.class);
			if (function.getAnnotations() != null)
				classCalback = classCalback.narrow(this.resolvType(function
						.getReturnType()));
			// else
			// classCalback.narrow(Void.class);
			method.param(classCalback, "resultHandler");
			if (function.getThrowsFields() != null) {
				for (ThriftField field : function.getThrowsFields()) {
					method._throws((JClass) this.resolvType(field.getType()));
				}
			}

			JBlock body = method.body();
			body.add(JExpr.invoke("checkReady"));

			createServicesAsyncClientBeanCall(service, jServiceClass,
					_classClient, function);
		}

		createServicesAsyncClientFactory(jServiceClass, _classClient);

	}

	private void createServicesAsyncClientBeanCall(Service service,
			JDefinedClass jServiceClass, JDefinedClass _classClient,
			ThriftMethod function) throws JClassAlreadyExistsException {

		JDefinedClass _class = jServiceClass._class(JMod.STATIC,
				function.getName()+ _CALL);

		_class._extends(TAsyncMethodCall.class);

		{
			JMethod constructor = _class.constructor(JMod.PUBLIC);
			JVar param1 = constructor.param(
					this.codeModel.ref(AsyncMethodCallback.class),
					"resultHandler");
			JVar param2 = constructor.param(
					this.codeModel.ref(TAsyncClient.class), "client");
			JVar param3 = constructor.param(
					this.codeModel.ref(TProtocolFactory.class),
					"protocolFactory");
			JVar param4 = constructor.param(
					this.codeModel.ref(TNonblockingTransport.class),
					"transport");
			constructor._throws(TException.class);

			constructor.body().add(
					JExpr.invoke("super").arg(param2).arg(param3).arg(param4)
							.arg(param1).arg(JExpr.lit(false)));
		}

		JClass refTMessageType = this.codeModel.ref(TMessageType.class);
		{
			JMethod method = _class.method(JMod.PUBLIC, this.codeModel.VOID,
					"write_args");
			method._throws(TException.class);
			JVar param = method.param(TProtocol.class, "prot");
			JBlock body = method.body();
			body.add(param.invoke("writeMessageBegin").arg(
					JExpr._new(this.codeModel.ref(TMessage.class))
							.arg(JExpr.lit(function.getName()))
							.arg(refTMessageType.staticRef("CALL"))
							.arg(JExpr.lit(0))));

			JType complexType = resolvName(function.getName() + _ARGS);
			JVar decl = body.decl(complexType, "capi", JExpr._new(complexType));
			body.add(decl.invoke("write").arg(param));
			body.add(param.invoke("writeMessageEnd"));
		}
		{
			JMethod method = _class.method(JMod.PUBLIC, this.codeModel.VOID,
					"getResult");
			method._throws(TException.class);

			JBlock body = method.body();

			body._if(
					JExpr._this()
							.ref("getState()")
							.ne(this.codeModel
									.ref(TAsyncMethodCall.State.class)
									.staticRef("RESPONSE_READ")))
					._then()
					._throw(JExpr._new(
							this.codeModel.ref(IllegalStateException.class))
							.arg("Method call not finished!"));

			JClass ref = this.codeModel.ref(TMemoryInputTransport.class);
			JClass refTProtocol = this.codeModel.ref(TProtocol.class);
			JVar decl = body.decl(
					ref,
					"memoryTransport",
					JExpr._new(ref).arg(
							JExpr.invoke("getFrameBuffer").invoke("array")));
			JVar decl2 = body.decl(refTProtocol, "prot",
					JExpr._this().ref("client").invoke("getProtocolFactory")
							.invoke("getProtocol").arg(decl));
			JInvocation arg = JExpr._new(
					this.codeModel.ref(SUFIX_SERVICE_CLIENT))
					.arg(decl2);
			body.add(arg.invoke("recv_" + function.getName()));

		}
	}

	private void createServicesAsyncClientFactory(JDefinedClass jServiceClass,
			JDefinedClass _classClient) throws JClassAlreadyExistsException {
		JDefinedClass _classFactory = jServiceClass._class(JMod.STATIC,_classClient.name()+
				"Factory");
		JClass jClassExt = this.codeModel
				.ref(org.apache.thrift.async.TAsyncClientFactory.class);
		_classFactory._implements(jClassExt.narrow(_classClient));

		JFieldVar field1 = _classFactory.field(JMod.PRIVATE,
				org.apache.thrift.protocol.TProtocolFactory.class,
				"protocolFactory");
		JFieldVar field2 = _classFactory.field(JMod.PRIVATE,
				org.apache.thrift.async.TAsyncClientManager.class,
				"clientManager");

		{
			JMethod methodFactory1 = _classFactory.constructor(JMod.PUBLIC);
			methodFactory1.param(
					org.apache.thrift.protocol.TProtocolFactory.class,
					"protocolFactory");
			methodFactory1.param(
					org.apache.thrift.async.TAsyncClientManager.class,
					"clientManager");
			JBlock body = methodFactory1.body();
			body.assign(JExpr._this().ref(field1), JExpr.ref("protocolFactory"));
			body.assign(JExpr._this().ref(field2), JExpr.ref("clientManager"));
		}

		{
			JMethod methodFactory2 = _classFactory.method(JMod.PUBLIC,
					_classClient, "getAsyncClient");
			methodFactory2.param(
					org.apache.thrift.transport.TNonblockingTransport.class,
					"transport");
			JBlock body = methodFactory2.body();
			body._return(JExpr._new(_classClient).arg(field1).arg(field2)
					.arg(JExpr.ref("transport")));
		}
	}

	private void createServicesAsyncProcessor(Service service,
			JDefinedClass jServiceClass, JDefinedClass _interfaceIface)
			throws JClassAlreadyExistsException {
		JDefinedClass _classClient = jServiceClass._class(JMod.PUBLIC,
				jServiceClass.name() + SUFIX_ASYNC_PROCESSOR);

		_classClient._implements(org.apache.thrift.TProcessor.class);

		JTypeVar generify = _classClient.generify("T", _interfaceIface);

		if (service.getParent().isPresent()) {
			JClass jClassParent = (JClass) resolvName(service.getParent().get());
			_classClient._extends(((JClass) resolvName(jClassParent.fullName()
					+ SUFIX_ASYNC_PROCESSOR)).narrow(generify));
		} else {
			_classClient._extends(this.codeModel.ref(TBaseAsyncProcessor.class)
					.narrow(generify));
		}

		JClass classProcessFunction = this.codeModel.ref(ProcessFunction.class);
		classProcessFunction = classProcessFunction.narrow(generify,
				this.codeModel.ref(TBase.class).wildcard());
		{
			JMethod constructor = _classClient.constructor(JMod.PUBLIC);
			JVar param = constructor.param(generify, "iFace");
			JBlock body = constructor.body();
			JInvocation invoke = body.invoke("super");
			invoke.arg(param);
			JInvocation argNewHashMap = JExpr._new(this.codeModel
					.ref(HashMap.class).narrow(String.class)
					.narrow(classProcessFunction));
			invoke.arg(JExpr.invoke("getProcessMap").arg(argNewHashMap));
		}
		{
			JMethod constructor = _classClient.constructor(JMod.PUBLIC);
			JBlock body = constructor.body();
			JInvocation invoke = body.invoke("super");

			JVar param = constructor.param(generify, "iFace");
			JVar param2 = constructor.param(this.codeModel.ref(Map.class)
					.narrow(String.class).narrow(classProcessFunction),
					"processMap");
			invoke.arg(param);
			invoke.arg(JExpr.invoke("getProcessMap").arg(param2));
		}

		{
			JMethod method = _classClient.method(JMod.PRIVATE | JMod.STATIC
					| JMod.FINAL, classProcessFunction, "getProcessMap");
			method.generify("T", _interfaceIface);
			JVar param = method.param(classProcessFunction, "processMap");
			JBlock body = method.body();
			for (JMethod method_ : _interfaceIface.methods()) {
				JDefinedClass createServicesProcessorBean = createServicesAssyncProcessorBean(
						service, jServiceClass, _classClient, method_, _interfaceIface);
				JInvocation invoke = param.invoke("put");
				invoke.arg(JExpr.lit(method_.name()));
				invoke.arg(JExpr._new(createServicesProcessorBean));
				body.add(invoke);
			}
			body._return(param);
		}
	}

	private JMethod createServicesMethod(ThriftMethod function,
			JDefinedClass _interface) {

		JMethod method = null;
		if (function.getReturnType() == null) {
			method = _interface.method(JMod.PUBLIC, Void.TYPE,
					function.getName());
		} else {
			method = _interface.method(JMod.PUBLIC,
					this.resolvType(function.getReturnType()),
					function.getName());
		}
		for (ThriftField field : function.getArguments()) {
			method.param(this.resolvType(field.getType()), field.getName());
		}
		if (function.getThrowsFields() != null) {
			for (ThriftField field : function.getThrowsFields()) {
				method._throws((JClass) this.resolvType(field.getType()));
			}
		}
		method._throws(org.apache.thrift.TException.class);

		return method;
	}

	private void createServicesClientFactory(JDefinedClass jServiceClass,
			JDefinedClass _classClient) throws JClassAlreadyExistsException {
		JDefinedClass _classFactory = jServiceClass._class("Factory");
		JClass jClassExt = this.codeModel
				.ref(org.apache.thrift.TServiceClientFactory.class);
		_classFactory._implements(jClassExt.narrow(_classClient));

		{
			JMethod methodFactory1 = _classFactory.method(JMod.PUBLIC,
					_classClient, "getClient");
			methodFactory1.param(org.apache.thrift.protocol.TProtocol.class,
					"prot");
			JBlock body = methodFactory1.body();
			body._return(JExpr._new(_classClient).arg(JExpr.ref("prot")));
		}

		{
			JMethod methodFactory2 = _classFactory.method(JMod.PUBLIC,
					_classClient, "getClient");
			methodFactory2.param(org.apache.thrift.protocol.TProtocol.class,
					"iprot");
			methodFactory2.param(org.apache.thrift.protocol.TProtocol.class,
					"oprot");
			JBlock body = methodFactory2.body();
			body._return(JExpr._new(_classClient).arg(JExpr.ref("iprot"))
					.arg(JExpr.ref("oprot")));
		}
	}

	private ThriftMethod getFunctionOfTheMethod(Service service, JMethod method) {
		for (ThriftMethod function : service.getMethods()) {
			if (function.getName().equals(method.name()))
				return function;
		}
		return null;
	}

	private JDefinedClass createServicesAssyncProcessorBean(Service service,
			JDefinedClass jServiceClass,
			JDefinedClass _classClient, JMethod method_,
			JDefinedClass _interfaceIface) throws JClassAlreadyExistsException {
		String name = method_.name();
		JDefinedClass _class = _classClient._class(JMod.PUBLIC | JMod.STATIC,
				name);
		JTypeVar generify = _class.generify("T", _interfaceIface);
		JType beanArgs = resolvName(name + _ARGS);
		_class._extends(this.codeModel
				.ref(org.apache.thrift.ProcessFunction.class).narrow(generify)
				.narrow(beanArgs));

		_class.constructor(JMod.PUBLIC).body().invoke("super")
				.arg(JExpr.lit(name));

		ThriftMethod function = getFunctionOfTheMethod(service, method_);

		_class.method(JMod.PUBLIC, beanArgs, "getEmptyArgsInstance").body()
				._return(JExpr._new(beanArgs));
		_class.method(JMod.PROTECTED, this.codeModel.BOOLEAN, "isOneway")
				.body()._return(JExpr.lit(function.isOneway()));

		JType typeNarrow = null;
		if (function.isOneway()) {
			typeNarrow = this.codeModel.ref(Void.class);
		} else if (function.getReturnType() != null) {
			typeNarrow = this.resolvType(function.getReturnType());
		} else {
			typeNarrow = this.codeModel.INT;
		}
		JClass narrow = this.codeModel.ref(AsyncMethodCallback.class).narrow(
				typeNarrow);
		{
			JMethod method = _class.method(JMod.PUBLIC,
					this.codeModel.ref(Void.class), "start");
			JVar paramIface = method.param(generify, "iface");
			JVar paramArgs = method.param(beanArgs, "args");
			JVar paramAsync = method.param(narrow, "resultHandler");
			JInvocation invokeIFace = paramIface.invoke(method_.name());
			for (int i = 0; i < method_.params().size() - 1; i++) {
				JVar jVar = method_.params().get(i);
				invokeIFace.arg(paramArgs.invoke("get"
						+ JavaGeneratorUtil.getCapitalizeString(jVar.name())));
			}
			invokeIFace.arg(paramAsync);
			JBlock body = method.body();
			body.add(invokeIFace);
		}
		JClass classTMessageType = this.codeModel
				.ref(org.apache.thrift.protocol.TMessageType.class);
		JFieldRef refReply = classTMessageType.staticRef("REPLY");
		{
			JMethod method = _class.method(JMod.PUBLIC, narrow,
					"getResultHandler");
			JVar fbVar = method.param(JMod.FINAL,
					this.codeModel.ref(AsyncFrameBuffer.class), "fb");
			JVar seqidVar = method.param(JMod.FINAL, this.codeModel.INT,
					"seqid");
			JBlock body = method.body();
			JVar varFCall = body.decl(JMod.FINAL,
					this.codeModel.ref(AsyncProcessFunction.class), "fcall",
					JExpr._this());
			JDefinedClass anonymousClass = this.codeModel
					.anonymousClass(narrow);
			{
				JMethod method2 = anonymousClass.method(JMod.PUBLIC,
						this.codeModel.VOID, "onComplete");
				method2.param(typeNarrow, "arg");
				JBlock body2 = method2.body();
				JType argType = resolvName(name + "Result");
				JVar decl = body2.decl(argType, "result", JExpr._new(argType));

				JTryBlock _try = body2._try();
				JBlock tyrBody = _try.body();
				tyrBody.add(varFCall.invoke("sendResponse").arg(fbVar)
						.arg(decl).arg(refReply).arg(seqidVar));
				tyrBody._return();
				_try._catch(this.codeModel.ref(Exception.class)).param("ex");

				body2.add(fbVar.invoke("close"));

			}
			{
				JMethod method2 = anonymousClass.method(JMod.PUBLIC,
						this.codeModel.VOID, "onError");
				JVar paramEx = method2.param(Exception.class, "ex");

				JBlock body2 = method2.body();
				JVar jvarMsgType = body2.decl(this.codeModel.BYTE, "msgType",
						refReply);
				JClass refTBase = this.codeModel.ref(TBase.class);
				JVar jvarMsg = body2.decl(refTBase, "msg");
				JType argType = resolvName(name + "Result");
				JVar decl = body2.decl(argType, "result", JExpr._new(argType));
				JBlock block = body2.block();
				block.assign(jvarMsgType,
						classTMessageType.staticRef("EXCEPTION"));
				block.assign(
						jvarMsg,
						JExpr.cast(
								refTBase,
								JExpr._new(
										this.codeModel
												.ref(TApplicationException.class))
										.arg(this.codeModel.ref(
												TApplicationException.class)
												.staticRef("INTERNAL_ERROR"))
										.arg(paramEx.invoke("getMessage"))));

				JTryBlock _try = body2._try();
				JBlock tyrBody = _try.body();
				tyrBody.add(varFCall.invoke("sendResponse").arg(fbVar)
						.arg(jvarMsg).arg(jvarMsgType).arg(seqidVar));
				tyrBody._return();
				_try._catch(this.codeModel.ref(Exception.class)).param("ex");

				body2.add(fbVar.invoke("close"));
			}
			body._return(JExpr._new(anonymousClass));
		}

		return _class;

	}

}
