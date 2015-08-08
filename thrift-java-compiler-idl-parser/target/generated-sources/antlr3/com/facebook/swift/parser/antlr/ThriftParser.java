// $ANTLR 3.5 com/facebook/swift/parser/antlr/Thrift.g 2015-08-08 15:57:00

    package com.facebook.swift.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ThriftParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARGS", "COMMA", "COMMENT", "CONST", 
		"CPP_INCLUDE", "CPP_TYPE", "DEFAULT_NAMESPACE", "DIGIT", "DOCUMENT", "DOUBLE", 
		"ENTRY", "ENUM", "EXCEPTION", "EXTENDS", "FIELD", "HEX_DIGIT", "HEX_INTEGER", 
		"IDENTIFIER", "INCLUDE", "INTEGER", "LETTER", "LIST", "LITERAL", "MAP", 
		"METHOD", "NAMESPACE", "ONEWAY", "OPTIONAL", "REQUIRED", "REQUIREDNESS", 
		"SENUM", "SERVICE", "SET", "STRUCT", "THROWS", "TYPE", "TYPEDEF", "TYPES", 
		"TYPE_BINARY", "TYPE_BOOL", "TYPE_BYTE", "TYPE_DOUBLE", "TYPE_I16", "TYPE_I32", 
		"TYPE_I64", "TYPE_STRING", "UNION", "VOID", "WS", "'('", "')'", "'*'", 
		"':'", "';'", "'<'", "'='", "'>'", "'['", "']'", "'async'", "'const'", 
		"'cpp_include'", "'cpp_namespace'", "'cpp_type'", "'enum'", "'exception'", 
		"'extends'", "'include'", "'list'", "'map'", "'namespace'", "'oneway'", 
		"'optional'", "'php_namespace'", "'required'", "'senum'", "'service'", 
		"'set'", "'struct'", "'throws'", "'typedef'", "'union'", "'void'", "'{'", 
		"'}'"
	};
	public static final int EOF=-1;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int ARGS=4;
	public static final int COMMA=5;
	public static final int COMMENT=6;
	public static final int CONST=7;
	public static final int CPP_INCLUDE=8;
	public static final int CPP_TYPE=9;
	public static final int DEFAULT_NAMESPACE=10;
	public static final int DIGIT=11;
	public static final int DOCUMENT=12;
	public static final int DOUBLE=13;
	public static final int ENTRY=14;
	public static final int ENUM=15;
	public static final int EXCEPTION=16;
	public static final int EXTENDS=17;
	public static final int FIELD=18;
	public static final int HEX_DIGIT=19;
	public static final int HEX_INTEGER=20;
	public static final int IDENTIFIER=21;
	public static final int INCLUDE=22;
	public static final int INTEGER=23;
	public static final int LETTER=24;
	public static final int LIST=25;
	public static final int LITERAL=26;
	public static final int MAP=27;
	public static final int METHOD=28;
	public static final int NAMESPACE=29;
	public static final int ONEWAY=30;
	public static final int OPTIONAL=31;
	public static final int REQUIRED=32;
	public static final int REQUIREDNESS=33;
	public static final int SENUM=34;
	public static final int SERVICE=35;
	public static final int SET=36;
	public static final int STRUCT=37;
	public static final int THROWS=38;
	public static final int TYPE=39;
	public static final int TYPEDEF=40;
	public static final int TYPES=41;
	public static final int TYPE_BINARY=42;
	public static final int TYPE_BOOL=43;
	public static final int TYPE_BYTE=44;
	public static final int TYPE_DOUBLE=45;
	public static final int TYPE_I16=46;
	public static final int TYPE_I32=47;
	public static final int TYPE_I64=48;
	public static final int TYPE_STRING=49;
	public static final int UNION=50;
	public static final int VOID=51;
	public static final int WS=52;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ThriftParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ThriftParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ThriftParser.tokenNames; }
	@Override public String getGrammarFileName() { return "com/facebook/swift/parser/antlr/Thrift.g"; }


	public static class document_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "document"
	// com/facebook/swift/parser/antlr/Thrift.g:66:1: document : ( header )* ( definition )* EOF -> ^( DOCUMENT ( header )* ( definition )* ) ;
	public final ThriftParser.document_return document() throws RecognitionException {
		ThriftParser.document_return retval = new ThriftParser.document_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope header1 =null;
		ParserRuleReturnScope definition2 =null;

		Object EOF3_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_header=new RewriteRuleSubtreeStream(adaptor,"rule header");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:67:5: ( ( header )* ( definition )* EOF -> ^( DOCUMENT ( header )* ( definition )* ) )
			// com/facebook/swift/parser/antlr/Thrift.g:67:7: ( header )* ( definition )* EOF
			{
			// com/facebook/swift/parser/antlr/Thrift.g:67:7: ( header )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 65 && LA1_0 <= 66)||LA1_0==71||LA1_0==74||LA1_0==77) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:67:7: header
					{
					pushFollow(FOLLOW_header_in_document264);
					header1=header();
					state._fsp--;

					stream_header.add(header1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// com/facebook/swift/parser/antlr/Thrift.g:67:15: ( definition )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==64||(LA2_0 >= 68 && LA2_0 <= 69)||(LA2_0 >= 79 && LA2_0 <= 80)||LA2_0==82||(LA2_0 >= 84 && LA2_0 <= 85)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:67:15: definition
					{
					pushFollow(FOLLOW_definition_in_document267);
					definition2=definition();
					state._fsp--;

					stream_definition.add(definition2.getTree());
					}
					break;

				default :
					break loop2;
				}
			}

			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_document270);  
			stream_EOF.add(EOF3);

			// AST REWRITE
			// elements: definition, header
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 67:31: -> ^( DOCUMENT ( header )* ( definition )* )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:67:34: ^( DOCUMENT ( header )* ( definition )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DOCUMENT, "DOCUMENT"), root_1);
				// com/facebook/swift/parser/antlr/Thrift.g:67:45: ( header )*
				while ( stream_header.hasNext() ) {
					adaptor.addChild(root_1, stream_header.nextTree());
				}
				stream_header.reset();

				// com/facebook/swift/parser/antlr/Thrift.g:67:53: ( definition )*
				while ( stream_definition.hasNext() ) {
					adaptor.addChild(root_1, stream_definition.nextTree());
				}
				stream_definition.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "document"


	public static class header_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "header"
	// com/facebook/swift/parser/antlr/Thrift.g:71:1: header : ( include | namespace | cpp_include );
	public final ThriftParser.header_return header() throws RecognitionException {
		ThriftParser.header_return retval = new ThriftParser.header_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope include4 =null;
		ParserRuleReturnScope namespace5 =null;
		ParserRuleReturnScope cpp_include6 =null;


		try {
			// com/facebook/swift/parser/antlr/Thrift.g:72:5: ( include | namespace | cpp_include )
			int alt3=3;
			switch ( input.LA(1) ) {
			case 71:
				{
				alt3=1;
				}
				break;
			case 66:
			case 74:
			case 77:
				{
				alt3=2;
				}
				break;
			case 65:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:72:7: include
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_include_in_header300);
					include4=include();
					state._fsp--;

					adaptor.addChild(root_0, include4.getTree());

					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/Thrift.g:72:17: namespace
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_namespace_in_header304);
					namespace5=namespace();
					state._fsp--;

					adaptor.addChild(root_0, namespace5.getTree());

					}
					break;
				case 3 :
					// com/facebook/swift/parser/antlr/Thrift.g:72:29: cpp_include
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_cpp_include_in_header308);
					cpp_include6=cpp_include();
					state._fsp--;

					adaptor.addChild(root_0, cpp_include6.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "header"


	public static class include_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "include"
	// com/facebook/swift/parser/antlr/Thrift.g:75:1: include : 'include' LITERAL -> ^( INCLUDE LITERAL ) ;
	public final ThriftParser.include_return include() throws RecognitionException {
		ThriftParser.include_return retval = new ThriftParser.include_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal7=null;
		Token LITERAL8=null;

		Object string_literal7_tree=null;
		Object LITERAL8_tree=null;
		RewriteRuleTokenStream stream_LITERAL=new RewriteRuleTokenStream(adaptor,"token LITERAL");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:76:5: ( 'include' LITERAL -> ^( INCLUDE LITERAL ) )
			// com/facebook/swift/parser/antlr/Thrift.g:76:7: 'include' LITERAL
			{
			string_literal7=(Token)match(input,71,FOLLOW_71_in_include325);  
			stream_71.add(string_literal7);

			LITERAL8=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_include327);  
			stream_LITERAL.add(LITERAL8);

			// AST REWRITE
			// elements: LITERAL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 76:25: -> ^( INCLUDE LITERAL )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:76:28: ^( INCLUDE LITERAL )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INCLUDE, "INCLUDE"), root_1);
				adaptor.addChild(root_1, stream_LITERAL.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "include"


	public static class namespace_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "namespace"
	// com/facebook/swift/parser/antlr/Thrift.g:79:1: namespace : ( 'namespace' '*' (v= IDENTIFIER |v= LITERAL ) -> ^( DEFAULT_NAMESPACE $v) | 'namespace' k= IDENTIFIER (v= IDENTIFIER |v= LITERAL ) -> ^( NAMESPACE $k $v) | 'cpp_namespace' IDENTIFIER -> ^( NAMESPACE IDENTIFIER[\"cpp\"] IDENTIFIER ) | 'php_namespace' IDENTIFIER -> ^( NAMESPACE IDENTIFIER[\"php\"] IDENTIFIER ) );
	public final ThriftParser.namespace_return namespace() throws RecognitionException {
		ThriftParser.namespace_return retval = new ThriftParser.namespace_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token k=null;
		Token string_literal9=null;
		Token char_literal10=null;
		Token string_literal11=null;
		Token string_literal12=null;
		Token IDENTIFIER13=null;
		Token string_literal14=null;
		Token IDENTIFIER15=null;

		Object v_tree=null;
		Object k_tree=null;
		Object string_literal9_tree=null;
		Object char_literal10_tree=null;
		Object string_literal11_tree=null;
		Object string_literal12_tree=null;
		Object IDENTIFIER13_tree=null;
		Object string_literal14_tree=null;
		Object IDENTIFIER15_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_LITERAL=new RewriteRuleTokenStream(adaptor,"token LITERAL");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:80:5: ( 'namespace' '*' (v= IDENTIFIER |v= LITERAL ) -> ^( DEFAULT_NAMESPACE $v) | 'namespace' k= IDENTIFIER (v= IDENTIFIER |v= LITERAL ) -> ^( NAMESPACE $k $v) | 'cpp_namespace' IDENTIFIER -> ^( NAMESPACE IDENTIFIER[\"cpp\"] IDENTIFIER ) | 'php_namespace' IDENTIFIER -> ^( NAMESPACE IDENTIFIER[\"php\"] IDENTIFIER ) )
			int alt6=4;
			switch ( input.LA(1) ) {
			case 74:
				{
				int LA6_1 = input.LA(2);
				if ( (LA6_1==55) ) {
					alt6=1;
				}
				else if ( (LA6_1==IDENTIFIER) ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 66:
				{
				alt6=3;
				}
				break;
			case 77:
				{
				alt6=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:80:7: 'namespace' '*' (v= IDENTIFIER |v= LITERAL )
					{
					string_literal9=(Token)match(input,74,FOLLOW_74_in_namespace352);  
					stream_74.add(string_literal9);

					char_literal10=(Token)match(input,55,FOLLOW_55_in_namespace354);  
					stream_55.add(char_literal10);

					// com/facebook/swift/parser/antlr/Thrift.g:80:23: (v= IDENTIFIER |v= LITERAL )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==IDENTIFIER) ) {
						alt4=1;
					}
					else if ( (LA4_0==LITERAL) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// com/facebook/swift/parser/antlr/Thrift.g:80:24: v= IDENTIFIER
							{
							v=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace359);  
							stream_IDENTIFIER.add(v);

							}
							break;
						case 2 :
							// com/facebook/swift/parser/antlr/Thrift.g:80:39: v= LITERAL
							{
							v=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_namespace365);  
							stream_LITERAL.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: v
					// token labels: v
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 80:50: -> ^( DEFAULT_NAMESPACE $v)
					{
						// com/facebook/swift/parser/antlr/Thrift.g:80:53: ^( DEFAULT_NAMESPACE $v)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFAULT_NAMESPACE, "DEFAULT_NAMESPACE"), root_1);
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/Thrift.g:81:7: 'namespace' k= IDENTIFIER (v= IDENTIFIER |v= LITERAL )
					{
					string_literal11=(Token)match(input,74,FOLLOW_74_in_namespace383);  
					stream_74.add(string_literal11);

					k=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace387);  
					stream_IDENTIFIER.add(k);

					// com/facebook/swift/parser/antlr/Thrift.g:81:32: (v= IDENTIFIER |v= LITERAL )
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==IDENTIFIER) ) {
						alt5=1;
					}
					else if ( (LA5_0==LITERAL) ) {
						alt5=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}

					switch (alt5) {
						case 1 :
							// com/facebook/swift/parser/antlr/Thrift.g:81:33: v= IDENTIFIER
							{
							v=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace392);  
							stream_IDENTIFIER.add(v);

							}
							break;
						case 2 :
							// com/facebook/swift/parser/antlr/Thrift.g:81:48: v= LITERAL
							{
							v=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_namespace398);  
							stream_LITERAL.add(v);

							}
							break;

					}

					// AST REWRITE
					// elements: k, v
					// token labels: v, k
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
					RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 81:59: -> ^( NAMESPACE $k $v)
					{
						// com/facebook/swift/parser/antlr/Thrift.g:81:62: ^( NAMESPACE $k $v)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NAMESPACE, "NAMESPACE"), root_1);
						adaptor.addChild(root_1, stream_k.nextNode());
						adaptor.addChild(root_1, stream_v.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// com/facebook/swift/parser/antlr/Thrift.g:82:7: 'cpp_namespace' IDENTIFIER
					{
					string_literal12=(Token)match(input,66,FOLLOW_66_in_namespace419);  
					stream_66.add(string_literal12);

					IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace421);  
					stream_IDENTIFIER.add(IDENTIFIER13);

					// AST REWRITE
					// elements: IDENTIFIER, IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 82:34: -> ^( NAMESPACE IDENTIFIER[\"cpp\"] IDENTIFIER )
					{
						// com/facebook/swift/parser/antlr/Thrift.g:82:37: ^( NAMESPACE IDENTIFIER[\"cpp\"] IDENTIFIER )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NAMESPACE, "NAMESPACE"), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(IDENTIFIER, "cpp"));
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// com/facebook/swift/parser/antlr/Thrift.g:83:7: 'php_namespace' IDENTIFIER
					{
					string_literal14=(Token)match(input,77,FOLLOW_77_in_namespace440);  
					stream_77.add(string_literal14);

					IDENTIFIER15=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace442);  
					stream_IDENTIFIER.add(IDENTIFIER15);

					// AST REWRITE
					// elements: IDENTIFIER, IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 83:34: -> ^( NAMESPACE IDENTIFIER[\"php\"] IDENTIFIER )
					{
						// com/facebook/swift/parser/antlr/Thrift.g:83:37: ^( NAMESPACE IDENTIFIER[\"php\"] IDENTIFIER )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NAMESPACE, "NAMESPACE"), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(IDENTIFIER, "php"));
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namespace"


	public static class cpp_include_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cpp_include"
	// com/facebook/swift/parser/antlr/Thrift.g:86:1: cpp_include : 'cpp_include' LITERAL -> ^( CPP_INCLUDE LITERAL ) ;
	public final ThriftParser.cpp_include_return cpp_include() throws RecognitionException {
		ThriftParser.cpp_include_return retval = new ThriftParser.cpp_include_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal16=null;
		Token LITERAL17=null;

		Object string_literal16_tree=null;
		Object LITERAL17_tree=null;
		RewriteRuleTokenStream stream_LITERAL=new RewriteRuleTokenStream(adaptor,"token LITERAL");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:87:5: ( 'cpp_include' LITERAL -> ^( CPP_INCLUDE LITERAL ) )
			// com/facebook/swift/parser/antlr/Thrift.g:87:7: 'cpp_include' LITERAL
			{
			string_literal16=(Token)match(input,65,FOLLOW_65_in_cpp_include470);  
			stream_65.add(string_literal16);

			LITERAL17=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_cpp_include472);  
			stream_LITERAL.add(LITERAL17);

			// AST REWRITE
			// elements: LITERAL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 87:29: -> ^( CPP_INCLUDE LITERAL )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:87:32: ^( CPP_INCLUDE LITERAL )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CPP_INCLUDE, "CPP_INCLUDE"), root_1);
				adaptor.addChild(root_1, stream_LITERAL.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cpp_include"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// com/facebook/swift/parser/antlr/Thrift.g:91:1: definition : ( const_rule | typedef | enum_rule | senum | struct | union | exception | service );
	public final ThriftParser.definition_return definition() throws RecognitionException {
		ThriftParser.definition_return retval = new ThriftParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope const_rule18 =null;
		ParserRuleReturnScope typedef19 =null;
		ParserRuleReturnScope enum_rule20 =null;
		ParserRuleReturnScope senum21 =null;
		ParserRuleReturnScope struct22 =null;
		ParserRuleReturnScope union23 =null;
		ParserRuleReturnScope exception24 =null;
		ParserRuleReturnScope service25 =null;


		try {
			// com/facebook/swift/parser/antlr/Thrift.g:92:5: ( const_rule | typedef | enum_rule | senum | struct | union | exception | service )
			int alt7=8;
			switch ( input.LA(1) ) {
			case 64:
				{
				alt7=1;
				}
				break;
			case 84:
				{
				alt7=2;
				}
				break;
			case 68:
				{
				alt7=3;
				}
				break;
			case 79:
				{
				alt7=4;
				}
				break;
			case 82:
				{
				alt7=5;
				}
				break;
			case 85:
				{
				alt7=6;
				}
				break;
			case 69:
				{
				alt7=7;
				}
				break;
			case 80:
				{
				alt7=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:92:7: const_rule
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_const_rule_in_definition498);
					const_rule18=const_rule();
					state._fsp--;

					adaptor.addChild(root_0, const_rule18.getTree());

					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/Thrift.g:92:20: typedef
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_typedef_in_definition502);
					typedef19=typedef();
					state._fsp--;

					adaptor.addChild(root_0, typedef19.getTree());

					}
					break;
				case 3 :
					// com/facebook/swift/parser/antlr/Thrift.g:92:30: enum_rule
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_enum_rule_in_definition506);
					enum_rule20=enum_rule();
					state._fsp--;

					adaptor.addChild(root_0, enum_rule20.getTree());

					}
					break;
				case 4 :
					// com/facebook/swift/parser/antlr/Thrift.g:92:42: senum
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_senum_in_definition510);
					senum21=senum();
					state._fsp--;

					adaptor.addChild(root_0, senum21.getTree());

					}
					break;
				case 5 :
					// com/facebook/swift/parser/antlr/Thrift.g:92:50: struct
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_struct_in_definition514);
					struct22=struct();
					state._fsp--;

					adaptor.addChild(root_0, struct22.getTree());

					}
					break;
				case 6 :
					// com/facebook/swift/parser/antlr/Thrift.g:92:59: union
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_union_in_definition518);
					union23=union();
					state._fsp--;

					adaptor.addChild(root_0, union23.getTree());

					}
					break;
				case 7 :
					// com/facebook/swift/parser/antlr/Thrift.g:92:67: exception
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exception_in_definition522);
					exception24=exception();
					state._fsp--;

					adaptor.addChild(root_0, exception24.getTree());

					}
					break;
				case 8 :
					// com/facebook/swift/parser/antlr/Thrift.g:92:79: service
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_service_in_definition526);
					service25=service();
					state._fsp--;

					adaptor.addChild(root_0, service25.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class const_rule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "const_rule"
	// com/facebook/swift/parser/antlr/Thrift.g:95:1: const_rule : 'const' field_type IDENTIFIER '=' const_value ( list_separator )? -> ^( CONST IDENTIFIER field_type const_value ) ;
	public final ThriftParser.const_rule_return const_rule() throws RecognitionException {
		ThriftParser.const_rule_return retval = new ThriftParser.const_rule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal26=null;
		Token IDENTIFIER28=null;
		Token char_literal29=null;
		ParserRuleReturnScope field_type27 =null;
		ParserRuleReturnScope const_value30 =null;
		ParserRuleReturnScope list_separator31 =null;

		Object string_literal26_tree=null;
		Object IDENTIFIER28_tree=null;
		Object char_literal29_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_const_value=new RewriteRuleSubtreeStream(adaptor,"rule const_value");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:96:5: ( 'const' field_type IDENTIFIER '=' const_value ( list_separator )? -> ^( CONST IDENTIFIER field_type const_value ) )
			// com/facebook/swift/parser/antlr/Thrift.g:96:7: 'const' field_type IDENTIFIER '=' const_value ( list_separator )?
			{
			string_literal26=(Token)match(input,64,FOLLOW_64_in_const_rule543);  
			stream_64.add(string_literal26);

			pushFollow(FOLLOW_field_type_in_const_rule545);
			field_type27=field_type();
			state._fsp--;

			stream_field_type.add(field_type27.getTree());
			IDENTIFIER28=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_const_rule547);  
			stream_IDENTIFIER.add(IDENTIFIER28);

			char_literal29=(Token)match(input,59,FOLLOW_59_in_const_rule549);  
			stream_59.add(char_literal29);

			pushFollow(FOLLOW_const_value_in_const_rule551);
			const_value30=const_value();
			state._fsp--;

			stream_const_value.add(const_value30.getTree());
			// com/facebook/swift/parser/antlr/Thrift.g:96:53: ( list_separator )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==COMMA||LA8_0==57) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:96:53: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_const_rule553);
					list_separator31=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator31.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: const_value, field_type, IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 97:9: -> ^( CONST IDENTIFIER field_type const_value )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:97:12: ^( CONST IDENTIFIER field_type const_value )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, stream_field_type.nextTree());
				adaptor.addChild(root_1, stream_const_value.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "const_rule"


	public static class typedef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typedef"
	// com/facebook/swift/parser/antlr/Thrift.g:100:1: typedef : 'typedef' field_type IDENTIFIER -> ^( TYPEDEF IDENTIFIER field_type ) ;
	public final ThriftParser.typedef_return typedef() throws RecognitionException {
		ThriftParser.typedef_return retval = new ThriftParser.typedef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal32=null;
		Token IDENTIFIER34=null;
		ParserRuleReturnScope field_type33 =null;

		Object string_literal32_tree=null;
		Object IDENTIFIER34_tree=null;
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:101:5: ( 'typedef' field_type IDENTIFIER -> ^( TYPEDEF IDENTIFIER field_type ) )
			// com/facebook/swift/parser/antlr/Thrift.g:101:7: 'typedef' field_type IDENTIFIER
			{
			string_literal32=(Token)match(input,84,FOLLOW_84_in_typedef591);  
			stream_84.add(string_literal32);

			pushFollow(FOLLOW_field_type_in_typedef593);
			field_type33=field_type();
			state._fsp--;

			stream_field_type.add(field_type33.getTree());
			IDENTIFIER34=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedef595);  
			stream_IDENTIFIER.add(IDENTIFIER34);

			// AST REWRITE
			// elements: IDENTIFIER, field_type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 101:39: -> ^( TYPEDEF IDENTIFIER field_type )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:101:42: ^( TYPEDEF IDENTIFIER field_type )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPEDEF, "TYPEDEF"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, stream_field_type.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typedef"


	public static class enum_rule_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "enum_rule"
	// com/facebook/swift/parser/antlr/Thrift.g:104:1: enum_rule : 'enum' IDENTIFIER '{' ( enum_field )* '}' -> ^( ENUM IDENTIFIER ( enum_field )* ) ;
	public final ThriftParser.enum_rule_return enum_rule() throws RecognitionException {
		ThriftParser.enum_rule_return retval = new ThriftParser.enum_rule_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal35=null;
		Token IDENTIFIER36=null;
		Token char_literal37=null;
		Token char_literal39=null;
		ParserRuleReturnScope enum_field38 =null;

		Object string_literal35_tree=null;
		Object IDENTIFIER36_tree=null;
		Object char_literal37_tree=null;
		Object char_literal39_tree=null;
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_enum_field=new RewriteRuleSubtreeStream(adaptor,"rule enum_field");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:105:5: ( 'enum' IDENTIFIER '{' ( enum_field )* '}' -> ^( ENUM IDENTIFIER ( enum_field )* ) )
			// com/facebook/swift/parser/antlr/Thrift.g:105:7: 'enum' IDENTIFIER '{' ( enum_field )* '}'
			{
			string_literal35=(Token)match(input,68,FOLLOW_68_in_enum_rule622);  
			stream_68.add(string_literal35);

			IDENTIFIER36=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_rule624);  
			stream_IDENTIFIER.add(IDENTIFIER36);

			char_literal37=(Token)match(input,87,FOLLOW_87_in_enum_rule626);  
			stream_87.add(char_literal37);

			// com/facebook/swift/parser/antlr/Thrift.g:105:29: ( enum_field )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==IDENTIFIER) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:105:29: enum_field
					{
					pushFollow(FOLLOW_enum_field_in_enum_rule628);
					enum_field38=enum_field();
					state._fsp--;

					stream_enum_field.add(enum_field38.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			char_literal39=(Token)match(input,88,FOLLOW_88_in_enum_rule631);  
			stream_88.add(char_literal39);

			// AST REWRITE
			// elements: enum_field, IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 105:45: -> ^( ENUM IDENTIFIER ( enum_field )* )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:105:48: ^( ENUM IDENTIFIER ( enum_field )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ENUM, "ENUM"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// com/facebook/swift/parser/antlr/Thrift.g:105:66: ( enum_field )*
				while ( stream_enum_field.hasNext() ) {
					adaptor.addChild(root_1, stream_enum_field.nextTree());
				}
				stream_enum_field.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enum_rule"


	public static class enum_field_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "enum_field"
	// com/facebook/swift/parser/antlr/Thrift.g:108:1: enum_field : IDENTIFIER ( '=' integer )? ( list_separator )? -> ^( IDENTIFIER ( integer )? ) ;
	public final ThriftParser.enum_field_return enum_field() throws RecognitionException {
		ThriftParser.enum_field_return retval = new ThriftParser.enum_field_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER40=null;
		Token char_literal41=null;
		ParserRuleReturnScope integer42 =null;
		ParserRuleReturnScope list_separator43 =null;

		Object IDENTIFIER40_tree=null;
		Object char_literal41_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:109:5: ( IDENTIFIER ( '=' integer )? ( list_separator )? -> ^( IDENTIFIER ( integer )? ) )
			// com/facebook/swift/parser/antlr/Thrift.g:109:7: IDENTIFIER ( '=' integer )? ( list_separator )?
			{
			IDENTIFIER40=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_field659);  
			stream_IDENTIFIER.add(IDENTIFIER40);

			// com/facebook/swift/parser/antlr/Thrift.g:109:18: ( '=' integer )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==59) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:109:19: '=' integer
					{
					char_literal41=(Token)match(input,59,FOLLOW_59_in_enum_field662);  
					stream_59.add(char_literal41);

					pushFollow(FOLLOW_integer_in_enum_field664);
					integer42=integer();
					state._fsp--;

					stream_integer.add(integer42.getTree());
					}
					break;

			}

			// com/facebook/swift/parser/antlr/Thrift.g:109:33: ( list_separator )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==COMMA||LA11_0==57) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:109:33: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_enum_field668);
					list_separator43=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator43.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: IDENTIFIER, integer
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 109:49: -> ^( IDENTIFIER ( integer )? )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:109:52: ^( IDENTIFIER ( integer )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_IDENTIFIER.nextNode(), root_1);
				// com/facebook/swift/parser/antlr/Thrift.g:109:65: ( integer )?
				if ( stream_integer.hasNext() ) {
					adaptor.addChild(root_1, stream_integer.nextTree());
				}
				stream_integer.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enum_field"


	public static class senum_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "senum"
	// com/facebook/swift/parser/antlr/Thrift.g:112:1: senum : 'senum' IDENTIFIER '{' ( LITERAL ( list_separator )? )* '}' -> ^( SENUM IDENTIFIER ( LITERAL )* ) ;
	public final ThriftParser.senum_return senum() throws RecognitionException {
		ThriftParser.senum_return retval = new ThriftParser.senum_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal44=null;
		Token IDENTIFIER45=null;
		Token char_literal46=null;
		Token LITERAL47=null;
		Token char_literal49=null;
		ParserRuleReturnScope list_separator48 =null;

		Object string_literal44_tree=null;
		Object IDENTIFIER45_tree=null;
		Object char_literal46_tree=null;
		Object LITERAL47_tree=null;
		Object char_literal49_tree=null;
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_LITERAL=new RewriteRuleTokenStream(adaptor,"token LITERAL");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:113:5: ( 'senum' IDENTIFIER '{' ( LITERAL ( list_separator )? )* '}' -> ^( SENUM IDENTIFIER ( LITERAL )* ) )
			// com/facebook/swift/parser/antlr/Thrift.g:113:7: 'senum' IDENTIFIER '{' ( LITERAL ( list_separator )? )* '}'
			{
			string_literal44=(Token)match(input,79,FOLLOW_79_in_senum695);  
			stream_79.add(string_literal44);

			IDENTIFIER45=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_senum697);  
			stream_IDENTIFIER.add(IDENTIFIER45);

			char_literal46=(Token)match(input,87,FOLLOW_87_in_senum699);  
			stream_87.add(char_literal46);

			// com/facebook/swift/parser/antlr/Thrift.g:113:30: ( LITERAL ( list_separator )? )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==LITERAL) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:113:31: LITERAL ( list_separator )?
					{
					LITERAL47=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_senum702);  
					stream_LITERAL.add(LITERAL47);

					// com/facebook/swift/parser/antlr/Thrift.g:113:39: ( list_separator )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==COMMA||LA12_0==57) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// com/facebook/swift/parser/antlr/Thrift.g:113:39: list_separator
							{
							pushFollow(FOLLOW_list_separator_in_senum704);
							list_separator48=list_separator();
							state._fsp--;

							stream_list_separator.add(list_separator48.getTree());
							}
							break;

					}

					}
					break;

				default :
					break loop13;
				}
			}

			char_literal49=(Token)match(input,88,FOLLOW_88_in_senum709);  
			stream_88.add(char_literal49);

			// AST REWRITE
			// elements: LITERAL, IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 113:61: -> ^( SENUM IDENTIFIER ( LITERAL )* )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:113:64: ^( SENUM IDENTIFIER ( LITERAL )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SENUM, "SENUM"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// com/facebook/swift/parser/antlr/Thrift.g:113:83: ( LITERAL )*
				while ( stream_LITERAL.hasNext() ) {
					adaptor.addChild(root_1, stream_LITERAL.nextNode());
				}
				stream_LITERAL.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "senum"


	public static class struct_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "struct"
	// com/facebook/swift/parser/antlr/Thrift.g:116:1: struct : 'struct' IDENTIFIER '{' ( field )* '}' ( type_annotations )? -> ^( STRUCT IDENTIFIER ( field )* ( type_annotations )? ) ;
	public final ThriftParser.struct_return struct() throws RecognitionException {
		ThriftParser.struct_return retval = new ThriftParser.struct_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal50=null;
		Token IDENTIFIER51=null;
		Token char_literal52=null;
		Token char_literal54=null;
		ParserRuleReturnScope field53 =null;
		ParserRuleReturnScope type_annotations55 =null;

		Object string_literal50_tree=null;
		Object IDENTIFIER51_tree=null;
		Object char_literal52_tree=null;
		Object char_literal54_tree=null;
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
		RewriteRuleSubtreeStream stream_type_annotations=new RewriteRuleSubtreeStream(adaptor,"rule type_annotations");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:117:5: ( 'struct' IDENTIFIER '{' ( field )* '}' ( type_annotations )? -> ^( STRUCT IDENTIFIER ( field )* ( type_annotations )? ) )
			// com/facebook/swift/parser/antlr/Thrift.g:117:7: 'struct' IDENTIFIER '{' ( field )* '}' ( type_annotations )?
			{
			string_literal50=(Token)match(input,82,FOLLOW_82_in_struct737);  
			stream_82.add(string_literal50);

			IDENTIFIER51=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_struct739);  
			stream_IDENTIFIER.add(IDENTIFIER51);

			char_literal52=(Token)match(input,87,FOLLOW_87_in_struct741);  
			stream_87.add(char_literal52);

			// com/facebook/swift/parser/antlr/Thrift.g:117:31: ( field )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= HEX_INTEGER && LA14_0 <= IDENTIFIER)||LA14_0==INTEGER||(LA14_0 >= TYPE_BINARY && LA14_0 <= TYPE_STRING)||(LA14_0 >= 72 && LA14_0 <= 73)||LA14_0==76||LA14_0==78||LA14_0==81) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:117:31: field
					{
					pushFollow(FOLLOW_field_in_struct743);
					field53=field();
					state._fsp--;

					stream_field.add(field53.getTree());
					}
					break;

				default :
					break loop14;
				}
			}

			char_literal54=(Token)match(input,88,FOLLOW_88_in_struct746);  
			stream_88.add(char_literal54);

			// com/facebook/swift/parser/antlr/Thrift.g:117:42: ( type_annotations )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==53) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:117:42: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_struct748);
					type_annotations55=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations55.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: type_annotations, IDENTIFIER, field
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 117:60: -> ^( STRUCT IDENTIFIER ( field )* ( type_annotations )? )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:117:63: ^( STRUCT IDENTIFIER ( field )* ( type_annotations )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRUCT, "STRUCT"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// com/facebook/swift/parser/antlr/Thrift.g:117:83: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_1, stream_field.nextTree());
				}
				stream_field.reset();

				// com/facebook/swift/parser/antlr/Thrift.g:117:90: ( type_annotations )?
				if ( stream_type_annotations.hasNext() ) {
					adaptor.addChild(root_1, stream_type_annotations.nextTree());
				}
				stream_type_annotations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "struct"


	public static class union_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "union"
	// com/facebook/swift/parser/antlr/Thrift.g:120:1: union : 'union' IDENTIFIER '{' ( field )* '}' ( type_annotations )? -> ^( UNION IDENTIFIER ( field )* ( type_annotations )? ) ;
	public final ThriftParser.union_return union() throws RecognitionException {
		ThriftParser.union_return retval = new ThriftParser.union_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal56=null;
		Token IDENTIFIER57=null;
		Token char_literal58=null;
		Token char_literal60=null;
		ParserRuleReturnScope field59 =null;
		ParserRuleReturnScope type_annotations61 =null;

		Object string_literal56_tree=null;
		Object IDENTIFIER57_tree=null;
		Object char_literal58_tree=null;
		Object char_literal60_tree=null;
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
		RewriteRuleSubtreeStream stream_type_annotations=new RewriteRuleSubtreeStream(adaptor,"rule type_annotations");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:121:5: ( 'union' IDENTIFIER '{' ( field )* '}' ( type_annotations )? -> ^( UNION IDENTIFIER ( field )* ( type_annotations )? ) )
			// com/facebook/swift/parser/antlr/Thrift.g:121:7: 'union' IDENTIFIER '{' ( field )* '}' ( type_annotations )?
			{
			string_literal56=(Token)match(input,85,FOLLOW_85_in_union780);  
			stream_85.add(string_literal56);

			IDENTIFIER57=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_union782);  
			stream_IDENTIFIER.add(IDENTIFIER57);

			char_literal58=(Token)match(input,87,FOLLOW_87_in_union784);  
			stream_87.add(char_literal58);

			// com/facebook/swift/parser/antlr/Thrift.g:121:30: ( field )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= HEX_INTEGER && LA16_0 <= IDENTIFIER)||LA16_0==INTEGER||(LA16_0 >= TYPE_BINARY && LA16_0 <= TYPE_STRING)||(LA16_0 >= 72 && LA16_0 <= 73)||LA16_0==76||LA16_0==78||LA16_0==81) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:121:30: field
					{
					pushFollow(FOLLOW_field_in_union786);
					field59=field();
					state._fsp--;

					stream_field.add(field59.getTree());
					}
					break;

				default :
					break loop16;
				}
			}

			char_literal60=(Token)match(input,88,FOLLOW_88_in_union789);  
			stream_88.add(char_literal60);

			// com/facebook/swift/parser/antlr/Thrift.g:121:41: ( type_annotations )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==53) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:121:41: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_union791);
					type_annotations61=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations61.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: IDENTIFIER, type_annotations, field
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 121:59: -> ^( UNION IDENTIFIER ( field )* ( type_annotations )? )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:121:62: ^( UNION IDENTIFIER ( field )* ( type_annotations )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNION, "UNION"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// com/facebook/swift/parser/antlr/Thrift.g:121:81: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_1, stream_field.nextTree());
				}
				stream_field.reset();

				// com/facebook/swift/parser/antlr/Thrift.g:121:88: ( type_annotations )?
				if ( stream_type_annotations.hasNext() ) {
					adaptor.addChild(root_1, stream_type_annotations.nextTree());
				}
				stream_type_annotations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "union"


	public static class exception_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exception"
	// com/facebook/swift/parser/antlr/Thrift.g:124:1: exception : 'exception' IDENTIFIER '{' ( field )* '}' ( type_annotations )? -> ^( EXCEPTION IDENTIFIER ( field )* ( type_annotations )? ) ;
	public final ThriftParser.exception_return exception() throws RecognitionException {
		ThriftParser.exception_return retval = new ThriftParser.exception_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal62=null;
		Token IDENTIFIER63=null;
		Token char_literal64=null;
		Token char_literal66=null;
		ParserRuleReturnScope field65 =null;
		ParserRuleReturnScope type_annotations67 =null;

		Object string_literal62_tree=null;
		Object IDENTIFIER63_tree=null;
		Object char_literal64_tree=null;
		Object char_literal66_tree=null;
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
		RewriteRuleSubtreeStream stream_type_annotations=new RewriteRuleSubtreeStream(adaptor,"rule type_annotations");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:125:5: ( 'exception' IDENTIFIER '{' ( field )* '}' ( type_annotations )? -> ^( EXCEPTION IDENTIFIER ( field )* ( type_annotations )? ) )
			// com/facebook/swift/parser/antlr/Thrift.g:125:7: 'exception' IDENTIFIER '{' ( field )* '}' ( type_annotations )?
			{
			string_literal62=(Token)match(input,69,FOLLOW_69_in_exception823);  
			stream_69.add(string_literal62);

			IDENTIFIER63=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exception825);  
			stream_IDENTIFIER.add(IDENTIFIER63);

			char_literal64=(Token)match(input,87,FOLLOW_87_in_exception827);  
			stream_87.add(char_literal64);

			// com/facebook/swift/parser/antlr/Thrift.g:125:34: ( field )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= HEX_INTEGER && LA18_0 <= IDENTIFIER)||LA18_0==INTEGER||(LA18_0 >= TYPE_BINARY && LA18_0 <= TYPE_STRING)||(LA18_0 >= 72 && LA18_0 <= 73)||LA18_0==76||LA18_0==78||LA18_0==81) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:125:34: field
					{
					pushFollow(FOLLOW_field_in_exception829);
					field65=field();
					state._fsp--;

					stream_field.add(field65.getTree());
					}
					break;

				default :
					break loop18;
				}
			}

			char_literal66=(Token)match(input,88,FOLLOW_88_in_exception832);  
			stream_88.add(char_literal66);

			// com/facebook/swift/parser/antlr/Thrift.g:125:45: ( type_annotations )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==53) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:125:45: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_exception834);
					type_annotations67=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations67.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: IDENTIFIER, type_annotations, field
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 125:63: -> ^( EXCEPTION IDENTIFIER ( field )* ( type_annotations )? )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:125:66: ^( EXCEPTION IDENTIFIER ( field )* ( type_annotations )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXCEPTION, "EXCEPTION"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// com/facebook/swift/parser/antlr/Thrift.g:125:89: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_1, stream_field.nextTree());
				}
				stream_field.reset();

				// com/facebook/swift/parser/antlr/Thrift.g:125:96: ( type_annotations )?
				if ( stream_type_annotations.hasNext() ) {
					adaptor.addChild(root_1, stream_type_annotations.nextTree());
				}
				stream_type_annotations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exception"


	public static class service_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "service"
	// com/facebook/swift/parser/antlr/Thrift.g:128:1: service : 'service' s= IDENTIFIER ( 'extends' e= IDENTIFIER )? '{' (f= function )* '}' ( type_annotations )? -> ^( SERVICE $s ^( EXTENDS ( $e)? ) ( function )* ( type_annotations )? ) ;
	public final ThriftParser.service_return service() throws RecognitionException {
		ThriftParser.service_return retval = new ThriftParser.service_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token s=null;
		Token e=null;
		Token string_literal68=null;
		Token string_literal69=null;
		Token char_literal70=null;
		Token char_literal71=null;
		ParserRuleReturnScope f =null;
		ParserRuleReturnScope type_annotations72 =null;

		Object s_tree=null;
		Object e_tree=null;
		Object string_literal68_tree=null;
		Object string_literal69_tree=null;
		Object char_literal70_tree=null;
		Object char_literal71_tree=null;
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
		RewriteRuleSubtreeStream stream_type_annotations=new RewriteRuleSubtreeStream(adaptor,"rule type_annotations");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:129:5: ( 'service' s= IDENTIFIER ( 'extends' e= IDENTIFIER )? '{' (f= function )* '}' ( type_annotations )? -> ^( SERVICE $s ^( EXTENDS ( $e)? ) ( function )* ( type_annotations )? ) )
			// com/facebook/swift/parser/antlr/Thrift.g:129:7: 'service' s= IDENTIFIER ( 'extends' e= IDENTIFIER )? '{' (f= function )* '}' ( type_annotations )?
			{
			string_literal68=(Token)match(input,80,FOLLOW_80_in_service866);  
			stream_80.add(string_literal68);

			s=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_service870);  
			stream_IDENTIFIER.add(s);

			// com/facebook/swift/parser/antlr/Thrift.g:129:30: ( 'extends' e= IDENTIFIER )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==70) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:129:31: 'extends' e= IDENTIFIER
					{
					string_literal69=(Token)match(input,70,FOLLOW_70_in_service873);  
					stream_70.add(string_literal69);

					e=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_service877);  
					stream_IDENTIFIER.add(e);

					}
					break;

			}

			char_literal70=(Token)match(input,87,FOLLOW_87_in_service881);  
			stream_87.add(char_literal70);

			// com/facebook/swift/parser/antlr/Thrift.g:129:61: (f= function )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==IDENTIFIER||(LA21_0 >= TYPE_BINARY && LA21_0 <= TYPE_STRING)||LA21_0==63||(LA21_0 >= 72 && LA21_0 <= 73)||LA21_0==75||LA21_0==81||LA21_0==86) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:129:61: f= function
					{
					pushFollow(FOLLOW_function_in_service885);
					f=function();
					state._fsp--;

					stream_function.add(f.getTree());
					}
					break;

				default :
					break loop21;
				}
			}

			char_literal71=(Token)match(input,88,FOLLOW_88_in_service888);  
			stream_88.add(char_literal71);

			// com/facebook/swift/parser/antlr/Thrift.g:129:76: ( type_annotations )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==53) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:129:76: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_service890);
					type_annotations72=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations72.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: function, s, e, type_annotations
			// token labels: s, e
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleTokenStream stream_e=new RewriteRuleTokenStream(adaptor,"token e",e);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 129:94: -> ^( SERVICE $s ^( EXTENDS ( $e)? ) ( function )* ( type_annotations )? )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:129:97: ^( SERVICE $s ^( EXTENDS ( $e)? ) ( function )* ( type_annotations )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SERVICE, "SERVICE"), root_1);
				adaptor.addChild(root_1, stream_s.nextNode());
				// com/facebook/swift/parser/antlr/Thrift.g:129:110: ^( EXTENDS ( $e)? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXTENDS, "EXTENDS"), root_2);
				// com/facebook/swift/parser/antlr/Thrift.g:129:121: ( $e)?
				if ( stream_e.hasNext() ) {
					adaptor.addChild(root_2, stream_e.nextNode());
				}
				stream_e.reset();

				adaptor.addChild(root_1, root_2);
				}

				// com/facebook/swift/parser/antlr/Thrift.g:129:125: ( function )*
				while ( stream_function.hasNext() ) {
					adaptor.addChild(root_1, stream_function.nextTree());
				}
				stream_function.reset();

				// com/facebook/swift/parser/antlr/Thrift.g:129:135: ( type_annotations )?
				if ( stream_type_annotations.hasNext() ) {
					adaptor.addChild(root_1, stream_type_annotations.nextTree());
				}
				stream_type_annotations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "service"


	public static class field_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "field"
	// com/facebook/swift/parser/antlr/Thrift.g:133:1: field : ( field_id )? ( field_req )? field_type IDENTIFIER ( '=' const_value )? ( type_annotations )? ( list_separator )? -> ^( FIELD IDENTIFIER field_type ( field_id )? ^( REQUIREDNESS ( field_req )? ) ( const_value )? ( type_annotations )? ) ;
	public final ThriftParser.field_return field() throws RecognitionException {
		ThriftParser.field_return retval = new ThriftParser.field_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER76=null;
		Token char_literal77=null;
		ParserRuleReturnScope field_id73 =null;
		ParserRuleReturnScope field_req74 =null;
		ParserRuleReturnScope field_type75 =null;
		ParserRuleReturnScope const_value78 =null;
		ParserRuleReturnScope type_annotations79 =null;
		ParserRuleReturnScope list_separator80 =null;

		Object IDENTIFIER76_tree=null;
		Object char_literal77_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_field_id=new RewriteRuleSubtreeStream(adaptor,"rule field_id");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_const_value=new RewriteRuleSubtreeStream(adaptor,"rule const_value");
		RewriteRuleSubtreeStream stream_field_req=new RewriteRuleSubtreeStream(adaptor,"rule field_req");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");
		RewriteRuleSubtreeStream stream_type_annotations=new RewriteRuleSubtreeStream(adaptor,"rule type_annotations");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:134:5: ( ( field_id )? ( field_req )? field_type IDENTIFIER ( '=' const_value )? ( type_annotations )? ( list_separator )? -> ^( FIELD IDENTIFIER field_type ( field_id )? ^( REQUIREDNESS ( field_req )? ) ( const_value )? ( type_annotations )? ) )
			// com/facebook/swift/parser/antlr/Thrift.g:134:7: ( field_id )? ( field_req )? field_type IDENTIFIER ( '=' const_value )? ( type_annotations )? ( list_separator )?
			{
			// com/facebook/swift/parser/antlr/Thrift.g:134:7: ( field_id )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==HEX_INTEGER||LA23_0==INTEGER) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:134:7: field_id
					{
					pushFollow(FOLLOW_field_id_in_field932);
					field_id73=field_id();
					state._fsp--;

					stream_field_id.add(field_id73.getTree());
					}
					break;

			}

			// com/facebook/swift/parser/antlr/Thrift.g:134:17: ( field_req )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==76||LA24_0==78) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:134:17: field_req
					{
					pushFollow(FOLLOW_field_req_in_field935);
					field_req74=field_req();
					state._fsp--;

					stream_field_req.add(field_req74.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_field_type_in_field938);
			field_type75=field_type();
			state._fsp--;

			stream_field_type.add(field_type75.getTree());
			IDENTIFIER76=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field940);  
			stream_IDENTIFIER.add(IDENTIFIER76);

			// com/facebook/swift/parser/antlr/Thrift.g:134:50: ( '=' const_value )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==59) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:134:51: '=' const_value
					{
					char_literal77=(Token)match(input,59,FOLLOW_59_in_field943);  
					stream_59.add(char_literal77);

					pushFollow(FOLLOW_const_value_in_field945);
					const_value78=const_value();
					state._fsp--;

					stream_const_value.add(const_value78.getTree());
					}
					break;

			}

			// com/facebook/swift/parser/antlr/Thrift.g:134:69: ( type_annotations )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==53) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:134:69: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_field949);
					type_annotations79=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations79.getTree());
					}
					break;

			}

			// com/facebook/swift/parser/antlr/Thrift.g:134:87: ( list_separator )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==COMMA||LA27_0==57) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:134:87: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_field952);
					list_separator80=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator80.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: type_annotations, IDENTIFIER, field_req, const_value, field_type, field_id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 135:9: -> ^( FIELD IDENTIFIER field_type ( field_id )? ^( REQUIREDNESS ( field_req )? ) ( const_value )? ( type_annotations )? )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:135:12: ^( FIELD IDENTIFIER field_type ( field_id )? ^( REQUIREDNESS ( field_req )? ) ( const_value )? ( type_annotations )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELD, "FIELD"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, stream_field_type.nextTree());
				// com/facebook/swift/parser/antlr/Thrift.g:135:42: ( field_id )?
				if ( stream_field_id.hasNext() ) {
					adaptor.addChild(root_1, stream_field_id.nextTree());
				}
				stream_field_id.reset();

				// com/facebook/swift/parser/antlr/Thrift.g:135:52: ^( REQUIREDNESS ( field_req )? )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(REQUIREDNESS, "REQUIREDNESS"), root_2);
				// com/facebook/swift/parser/antlr/Thrift.g:135:67: ( field_req )?
				if ( stream_field_req.hasNext() ) {
					adaptor.addChild(root_2, stream_field_req.nextTree());
				}
				stream_field_req.reset();

				adaptor.addChild(root_1, root_2);
				}

				// com/facebook/swift/parser/antlr/Thrift.g:135:79: ( const_value )?
				if ( stream_const_value.hasNext() ) {
					adaptor.addChild(root_1, stream_const_value.nextTree());
				}
				stream_const_value.reset();

				// com/facebook/swift/parser/antlr/Thrift.g:135:92: ( type_annotations )?
				if ( stream_type_annotations.hasNext() ) {
					adaptor.addChild(root_1, stream_type_annotations.nextTree());
				}
				stream_type_annotations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field"


	public static class field_id_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "field_id"
	// com/facebook/swift/parser/antlr/Thrift.g:138:1: field_id : integer ':' -> integer ;
	public final ThriftParser.field_id_return field_id() throws RecognitionException {
		ThriftParser.field_id_return retval = new ThriftParser.field_id_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal82=null;
		ParserRuleReturnScope integer81 =null;

		Object char_literal82_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleSubtreeStream stream_integer=new RewriteRuleSubtreeStream(adaptor,"rule integer");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:139:5: ( integer ':' -> integer )
			// com/facebook/swift/parser/antlr/Thrift.g:139:7: integer ':'
			{
			pushFollow(FOLLOW_integer_in_field_id1004);
			integer81=integer();
			state._fsp--;

			stream_integer.add(integer81.getTree());
			char_literal82=(Token)match(input,56,FOLLOW_56_in_field_id1006);  
			stream_56.add(char_literal82);

			// AST REWRITE
			// elements: integer
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 139:19: -> integer
			{
				adaptor.addChild(root_0, stream_integer.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field_id"


	public static class field_req_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "field_req"
	// com/facebook/swift/parser/antlr/Thrift.g:142:1: field_req : ( 'required' -> REQUIRED | 'optional' -> OPTIONAL );
	public final ThriftParser.field_req_return field_req() throws RecognitionException {
		ThriftParser.field_req_return retval = new ThriftParser.field_req_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal83=null;
		Token string_literal84=null;

		Object string_literal83_tree=null;
		Object string_literal84_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:143:5: ( 'required' -> REQUIRED | 'optional' -> OPTIONAL )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==78) ) {
				alt28=1;
			}
			else if ( (LA28_0==76) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:143:7: 'required'
					{
					string_literal83=(Token)match(input,78,FOLLOW_78_in_field_req1027);  
					stream_78.add(string_literal83);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 143:18: -> REQUIRED
					{
						adaptor.addChild(root_0, (Object)adaptor.create(REQUIRED, "REQUIRED"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/Thrift.g:144:7: 'optional'
					{
					string_literal84=(Token)match(input,76,FOLLOW_76_in_field_req1039);  
					stream_76.add(string_literal84);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 144:18: -> OPTIONAL
					{
						adaptor.addChild(root_0, (Object)adaptor.create(OPTIONAL, "OPTIONAL"));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field_req"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// com/facebook/swift/parser/antlr/Thrift.g:148:1: function : ( oneway )? function_type IDENTIFIER '(' ( field )* ')' ( throws_list )? ( type_annotations )? ( list_separator )? -> ^( METHOD IDENTIFIER function_type ^( ARGS ( field )* ) ( oneway )? ( throws_list )? ( type_annotations )? ) ;
	public final ThriftParser.function_return function() throws RecognitionException {
		ThriftParser.function_return retval = new ThriftParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER87=null;
		Token char_literal88=null;
		Token char_literal90=null;
		ParserRuleReturnScope oneway85 =null;
		ParserRuleReturnScope function_type86 =null;
		ParserRuleReturnScope field89 =null;
		ParserRuleReturnScope throws_list91 =null;
		ParserRuleReturnScope type_annotations92 =null;
		ParserRuleReturnScope list_separator93 =null;

		Object IDENTIFIER87_tree=null;
		Object char_literal88_tree=null;
		Object char_literal90_tree=null;
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_throws_list=new RewriteRuleSubtreeStream(adaptor,"rule throws_list");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
		RewriteRuleSubtreeStream stream_function_type=new RewriteRuleSubtreeStream(adaptor,"rule function_type");
		RewriteRuleSubtreeStream stream_oneway=new RewriteRuleSubtreeStream(adaptor,"rule oneway");
		RewriteRuleSubtreeStream stream_type_annotations=new RewriteRuleSubtreeStream(adaptor,"rule type_annotations");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:149:5: ( ( oneway )? function_type IDENTIFIER '(' ( field )* ')' ( throws_list )? ( type_annotations )? ( list_separator )? -> ^( METHOD IDENTIFIER function_type ^( ARGS ( field )* ) ( oneway )? ( throws_list )? ( type_annotations )? ) )
			// com/facebook/swift/parser/antlr/Thrift.g:149:7: ( oneway )? function_type IDENTIFIER '(' ( field )* ')' ( throws_list )? ( type_annotations )? ( list_separator )?
			{
			// com/facebook/swift/parser/antlr/Thrift.g:149:7: ( oneway )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==63||LA29_0==75) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:149:7: oneway
					{
					pushFollow(FOLLOW_oneway_in_function1061);
					oneway85=oneway();
					state._fsp--;

					stream_oneway.add(oneway85.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_function_type_in_function1064);
			function_type86=function_type();
			state._fsp--;

			stream_function_type.add(function_type86.getTree());
			IDENTIFIER87=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function1066);  
			stream_IDENTIFIER.add(IDENTIFIER87);

			char_literal88=(Token)match(input,53,FOLLOW_53_in_function1068);  
			stream_53.add(char_literal88);

			// com/facebook/swift/parser/antlr/Thrift.g:149:44: ( field )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( ((LA30_0 >= HEX_INTEGER && LA30_0 <= IDENTIFIER)||LA30_0==INTEGER||(LA30_0 >= TYPE_BINARY && LA30_0 <= TYPE_STRING)||(LA30_0 >= 72 && LA30_0 <= 73)||LA30_0==76||LA30_0==78||LA30_0==81) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:149:44: field
					{
					pushFollow(FOLLOW_field_in_function1070);
					field89=field();
					state._fsp--;

					stream_field.add(field89.getTree());
					}
					break;

				default :
					break loop30;
				}
			}

			char_literal90=(Token)match(input,54,FOLLOW_54_in_function1073);  
			stream_54.add(char_literal90);

			// com/facebook/swift/parser/antlr/Thrift.g:149:55: ( throws_list )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==83) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:149:55: throws_list
					{
					pushFollow(FOLLOW_throws_list_in_function1075);
					throws_list91=throws_list();
					state._fsp--;

					stream_throws_list.add(throws_list91.getTree());
					}
					break;

			}

			// com/facebook/swift/parser/antlr/Thrift.g:149:68: ( type_annotations )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==53) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:149:68: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_function1078);
					type_annotations92=type_annotations();
					state._fsp--;

					stream_type_annotations.add(type_annotations92.getTree());
					}
					break;

			}

			// com/facebook/swift/parser/antlr/Thrift.g:149:86: ( list_separator )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==COMMA||LA33_0==57) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:149:86: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_function1081);
					list_separator93=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator93.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: field, function_type, oneway, throws_list, IDENTIFIER, type_annotations
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 150:9: -> ^( METHOD IDENTIFIER function_type ^( ARGS ( field )* ) ( oneway )? ( throws_list )? ( type_annotations )? )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:150:12: ^( METHOD IDENTIFIER function_type ^( ARGS ( field )* ) ( oneway )? ( throws_list )? ( type_annotations )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(METHOD, "METHOD"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, stream_function_type.nextTree());
				// com/facebook/swift/parser/antlr/Thrift.g:150:46: ^( ARGS ( field )* )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGS, "ARGS"), root_2);
				// com/facebook/swift/parser/antlr/Thrift.g:150:53: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_2, stream_field.nextTree());
				}
				stream_field.reset();

				adaptor.addChild(root_1, root_2);
				}

				// com/facebook/swift/parser/antlr/Thrift.g:150:61: ( oneway )?
				if ( stream_oneway.hasNext() ) {
					adaptor.addChild(root_1, stream_oneway.nextTree());
				}
				stream_oneway.reset();

				// com/facebook/swift/parser/antlr/Thrift.g:150:69: ( throws_list )?
				if ( stream_throws_list.hasNext() ) {
					adaptor.addChild(root_1, stream_throws_list.nextTree());
				}
				stream_throws_list.reset();

				// com/facebook/swift/parser/antlr/Thrift.g:150:82: ( type_annotations )?
				if ( stream_type_annotations.hasNext() ) {
					adaptor.addChild(root_1, stream_type_annotations.nextTree());
				}
				stream_type_annotations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class oneway_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "oneway"
	// com/facebook/swift/parser/antlr/Thrift.g:153:1: oneway : ( 'oneway' | 'async' ) -> ONEWAY ;
	public final ThriftParser.oneway_return oneway() throws RecognitionException {
		ThriftParser.oneway_return retval = new ThriftParser.oneway_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal94=null;
		Token string_literal95=null;

		Object string_literal94_tree=null;
		Object string_literal95_tree=null;
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:154:5: ( ( 'oneway' | 'async' ) -> ONEWAY )
			// com/facebook/swift/parser/antlr/Thrift.g:154:7: ( 'oneway' | 'async' )
			{
			// com/facebook/swift/parser/antlr/Thrift.g:154:7: ( 'oneway' | 'async' )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==75) ) {
				alt34=1;
			}
			else if ( (LA34_0==63) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:154:8: 'oneway'
					{
					string_literal94=(Token)match(input,75,FOLLOW_75_in_oneway1134);  
					stream_75.add(string_literal94);

					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/Thrift.g:154:19: 'async'
					{
					string_literal95=(Token)match(input,63,FOLLOW_63_in_oneway1138);  
					stream_63.add(string_literal95);

					}
					break;

			}

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 154:28: -> ONEWAY
			{
				adaptor.addChild(root_0, (Object)adaptor.create(ONEWAY, "ONEWAY"));
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneway"


	public static class function_type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function_type"
	// com/facebook/swift/parser/antlr/Thrift.g:157:1: function_type : ( field_type | 'void' -> VOID );
	public final ThriftParser.function_type_return function_type() throws RecognitionException {
		ThriftParser.function_type_return retval = new ThriftParser.function_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal97=null;
		ParserRuleReturnScope field_type96 =null;

		Object string_literal97_tree=null;
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:158:5: ( field_type | 'void' -> VOID )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==IDENTIFIER||(LA35_0 >= TYPE_BINARY && LA35_0 <= TYPE_STRING)||(LA35_0 >= 72 && LA35_0 <= 73)||LA35_0==81) ) {
				alt35=1;
			}
			else if ( (LA35_0==86) ) {
				alt35=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:158:7: field_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_field_type_in_function_type1160);
					field_type96=field_type();
					state._fsp--;

					adaptor.addChild(root_0, field_type96.getTree());

					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/Thrift.g:159:7: 'void'
					{
					string_literal97=(Token)match(input,86,FOLLOW_86_in_function_type1168);  
					stream_86.add(string_literal97);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 159:14: -> VOID
					{
						adaptor.addChild(root_0, (Object)adaptor.create(VOID, "VOID"));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_type"


	public static class throws_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "throws_list"
	// com/facebook/swift/parser/antlr/Thrift.g:162:1: throws_list : 'throws' '(' ( field )* ')' -> ^( THROWS ( field )* ) ;
	public final ThriftParser.throws_list_return throws_list() throws RecognitionException {
		ThriftParser.throws_list_return retval = new ThriftParser.throws_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal98=null;
		Token char_literal99=null;
		Token char_literal101=null;
		ParserRuleReturnScope field100 =null;

		Object string_literal98_tree=null;
		Object char_literal99_tree=null;
		Object char_literal101_tree=null;
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:163:5: ( 'throws' '(' ( field )* ')' -> ^( THROWS ( field )* ) )
			// com/facebook/swift/parser/antlr/Thrift.g:163:7: 'throws' '(' ( field )* ')'
			{
			string_literal98=(Token)match(input,83,FOLLOW_83_in_throws_list1189);  
			stream_83.add(string_literal98);

			char_literal99=(Token)match(input,53,FOLLOW_53_in_throws_list1191);  
			stream_53.add(char_literal99);

			// com/facebook/swift/parser/antlr/Thrift.g:163:20: ( field )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( ((LA36_0 >= HEX_INTEGER && LA36_0 <= IDENTIFIER)||LA36_0==INTEGER||(LA36_0 >= TYPE_BINARY && LA36_0 <= TYPE_STRING)||(LA36_0 >= 72 && LA36_0 <= 73)||LA36_0==76||LA36_0==78||LA36_0==81) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:163:20: field
					{
					pushFollow(FOLLOW_field_in_throws_list1193);
					field100=field();
					state._fsp--;

					stream_field.add(field100.getTree());
					}
					break;

				default :
					break loop36;
				}
			}

			char_literal101=(Token)match(input,54,FOLLOW_54_in_throws_list1196);  
			stream_54.add(char_literal101);

			// AST REWRITE
			// elements: field
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 163:31: -> ^( THROWS ( field )* )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:163:34: ^( THROWS ( field )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(THROWS, "THROWS"), root_1);
				// com/facebook/swift/parser/antlr/Thrift.g:163:43: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_1, stream_field.nextTree());
				}
				stream_field.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "throws_list"


	public static class type_annotations_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_annotations"
	// com/facebook/swift/parser/antlr/Thrift.g:167:1: type_annotations : '(' ( type_annotation )* ')' -> ^( TYPES ( type_annotation )* ) ;
	public final ThriftParser.type_annotations_return type_annotations() throws RecognitionException {
		ThriftParser.type_annotations_return retval = new ThriftParser.type_annotations_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal102=null;
		Token char_literal104=null;
		ParserRuleReturnScope type_annotation103 =null;

		Object char_literal102_tree=null;
		Object char_literal104_tree=null;
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_type_annotation=new RewriteRuleSubtreeStream(adaptor,"rule type_annotation");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:168:5: ( '(' ( type_annotation )* ')' -> ^( TYPES ( type_annotation )* ) )
			// com/facebook/swift/parser/antlr/Thrift.g:168:7: '(' ( type_annotation )* ')'
			{
			char_literal102=(Token)match(input,53,FOLLOW_53_in_type_annotations1223);  
			stream_53.add(char_literal102);

			// com/facebook/swift/parser/antlr/Thrift.g:168:11: ( type_annotation )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==IDENTIFIER) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:168:11: type_annotation
					{
					pushFollow(FOLLOW_type_annotation_in_type_annotations1225);
					type_annotation103=type_annotation();
					state._fsp--;

					stream_type_annotation.add(type_annotation103.getTree());
					}
					break;

				default :
					break loop37;
				}
			}

			char_literal104=(Token)match(input,54,FOLLOW_54_in_type_annotations1228);  
			stream_54.add(char_literal104);

			// AST REWRITE
			// elements: type_annotation
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 168:32: -> ^( TYPES ( type_annotation )* )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:168:35: ^( TYPES ( type_annotation )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPES, "TYPES"), root_1);
				// com/facebook/swift/parser/antlr/Thrift.g:168:43: ( type_annotation )*
				while ( stream_type_annotation.hasNext() ) {
					adaptor.addChild(root_1, stream_type_annotation.nextTree());
				}
				stream_type_annotation.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_annotations"


	public static class type_annotation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type_annotation"
	// com/facebook/swift/parser/antlr/Thrift.g:171:1: type_annotation : IDENTIFIER ( '=' annotation_value )? ( list_separator )? -> ^( TYPE IDENTIFIER ( annotation_value )? ) ;
	public final ThriftParser.type_annotation_return type_annotation() throws RecognitionException {
		ThriftParser.type_annotation_return retval = new ThriftParser.type_annotation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER105=null;
		Token char_literal106=null;
		ParserRuleReturnScope annotation_value107 =null;
		ParserRuleReturnScope list_separator108 =null;

		Object IDENTIFIER105_tree=null;
		Object char_literal106_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_annotation_value=new RewriteRuleSubtreeStream(adaptor,"rule annotation_value");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:172:5: ( IDENTIFIER ( '=' annotation_value )? ( list_separator )? -> ^( TYPE IDENTIFIER ( annotation_value )? ) )
			// com/facebook/swift/parser/antlr/Thrift.g:172:7: IDENTIFIER ( '=' annotation_value )? ( list_separator )?
			{
			IDENTIFIER105=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_annotation1254);  
			stream_IDENTIFIER.add(IDENTIFIER105);

			// com/facebook/swift/parser/antlr/Thrift.g:172:18: ( '=' annotation_value )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==59) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:172:19: '=' annotation_value
					{
					char_literal106=(Token)match(input,59,FOLLOW_59_in_type_annotation1257);  
					stream_59.add(char_literal106);

					pushFollow(FOLLOW_annotation_value_in_type_annotation1259);
					annotation_value107=annotation_value();
					state._fsp--;

					stream_annotation_value.add(annotation_value107.getTree());
					}
					break;

			}

			// com/facebook/swift/parser/antlr/Thrift.g:172:42: ( list_separator )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==COMMA||LA39_0==57) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:172:42: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_type_annotation1263);
					list_separator108=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator108.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: annotation_value, IDENTIFIER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 172:58: -> ^( TYPE IDENTIFIER ( annotation_value )? )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:172:61: ^( TYPE IDENTIFIER ( annotation_value )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPE, "TYPE"), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// com/facebook/swift/parser/antlr/Thrift.g:172:79: ( annotation_value )?
				if ( stream_annotation_value.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation_value.nextTree());
				}
				stream_annotation_value.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_annotation"


	public static class annotation_value_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "annotation_value"
	// com/facebook/swift/parser/antlr/Thrift.g:175:1: annotation_value : ( integer | LITERAL );
	public final ThriftParser.annotation_value_return annotation_value() throws RecognitionException {
		ThriftParser.annotation_value_return retval = new ThriftParser.annotation_value_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LITERAL110=null;
		ParserRuleReturnScope integer109 =null;

		Object LITERAL110_tree=null;

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:176:5: ( integer | LITERAL )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==HEX_INTEGER||LA40_0==INTEGER) ) {
				alt40=1;
			}
			else if ( (LA40_0==LITERAL) ) {
				alt40=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:176:7: integer
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_integer_in_annotation_value1292);
					integer109=integer();
					state._fsp--;

					adaptor.addChild(root_0, integer109.getTree());

					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/Thrift.g:176:17: LITERAL
					{
					root_0 = (Object)adaptor.nil();


					LITERAL110=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_annotation_value1296); 
					LITERAL110_tree = (Object)adaptor.create(LITERAL110);
					adaptor.addChild(root_0, LITERAL110_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "annotation_value"


	public static class field_type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "field_type"
	// com/facebook/swift/parser/antlr/Thrift.g:180:1: field_type : ( base_type | IDENTIFIER | container_type );
	public final ThriftParser.field_type_return field_type() throws RecognitionException {
		ThriftParser.field_type_return retval = new ThriftParser.field_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER112=null;
		ParserRuleReturnScope base_type111 =null;
		ParserRuleReturnScope container_type113 =null;

		Object IDENTIFIER112_tree=null;

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:181:5: ( base_type | IDENTIFIER | container_type )
			int alt41=3;
			switch ( input.LA(1) ) {
			case TYPE_BINARY:
			case TYPE_BOOL:
			case TYPE_BYTE:
			case TYPE_DOUBLE:
			case TYPE_I16:
			case TYPE_I32:
			case TYPE_I64:
			case TYPE_STRING:
				{
				alt41=1;
				}
				break;
			case IDENTIFIER:
				{
				alt41=2;
				}
				break;
			case 72:
			case 73:
			case 81:
				{
				alt41=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:181:7: base_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_base_type_in_field_type1314);
					base_type111=base_type();
					state._fsp--;

					adaptor.addChild(root_0, base_type111.getTree());

					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/Thrift.g:181:19: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER112=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_type1318); 
					IDENTIFIER112_tree = (Object)adaptor.create(IDENTIFIER112);
					adaptor.addChild(root_0, IDENTIFIER112_tree);

					}
					break;
				case 3 :
					// com/facebook/swift/parser/antlr/Thrift.g:181:32: container_type
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_container_type_in_field_type1322);
					container_type113=container_type();
					state._fsp--;

					adaptor.addChild(root_0, container_type113.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field_type"


	public static class base_type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "base_type"
	// com/facebook/swift/parser/antlr/Thrift.g:184:1: base_type : real_base_type ( type_annotations )? ;
	public final ThriftParser.base_type_return base_type() throws RecognitionException {
		ThriftParser.base_type_return retval = new ThriftParser.base_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope real_base_type114 =null;
		ParserRuleReturnScope type_annotations115 =null;


		try {
			// com/facebook/swift/parser/antlr/Thrift.g:185:5: ( real_base_type ( type_annotations )? )
			// com/facebook/swift/parser/antlr/Thrift.g:185:7: real_base_type ( type_annotations )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_real_base_type_in_base_type1339);
			real_base_type114=real_base_type();
			state._fsp--;

			adaptor.addChild(root_0, real_base_type114.getTree());

			// com/facebook/swift/parser/antlr/Thrift.g:185:22: ( type_annotations )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==53) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:185:22: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_base_type1341);
					type_annotations115=type_annotations();
					state._fsp--;

					adaptor.addChild(root_0, type_annotations115.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "base_type"


	public static class container_type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "container_type"
	// com/facebook/swift/parser/antlr/Thrift.g:188:1: container_type : ( map_type | set_type | list_type ) ( type_annotations )? ;
	public final ThriftParser.container_type_return container_type() throws RecognitionException {
		ThriftParser.container_type_return retval = new ThriftParser.container_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope map_type116 =null;
		ParserRuleReturnScope set_type117 =null;
		ParserRuleReturnScope list_type118 =null;
		ParserRuleReturnScope type_annotations119 =null;


		try {
			// com/facebook/swift/parser/antlr/Thrift.g:189:5: ( ( map_type | set_type | list_type ) ( type_annotations )? )
			// com/facebook/swift/parser/antlr/Thrift.g:189:7: ( map_type | set_type | list_type ) ( type_annotations )?
			{
			root_0 = (Object)adaptor.nil();


			// com/facebook/swift/parser/antlr/Thrift.g:189:7: ( map_type | set_type | list_type )
			int alt43=3;
			switch ( input.LA(1) ) {
			case 73:
				{
				alt43=1;
				}
				break;
			case 81:
				{
				alt43=2;
				}
				break;
			case 72:
				{
				alt43=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:189:8: map_type
					{
					pushFollow(FOLLOW_map_type_in_container_type1360);
					map_type116=map_type();
					state._fsp--;

					adaptor.addChild(root_0, map_type116.getTree());

					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/Thrift.g:189:19: set_type
					{
					pushFollow(FOLLOW_set_type_in_container_type1364);
					set_type117=set_type();
					state._fsp--;

					adaptor.addChild(root_0, set_type117.getTree());

					}
					break;
				case 3 :
					// com/facebook/swift/parser/antlr/Thrift.g:189:30: list_type
					{
					pushFollow(FOLLOW_list_type_in_container_type1368);
					list_type118=list_type();
					state._fsp--;

					adaptor.addChild(root_0, list_type118.getTree());

					}
					break;

			}

			// com/facebook/swift/parser/antlr/Thrift.g:189:41: ( type_annotations )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==53) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:189:41: type_annotations
					{
					pushFollow(FOLLOW_type_annotations_in_container_type1371);
					type_annotations119=type_annotations();
					state._fsp--;

					adaptor.addChild(root_0, type_annotations119.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "container_type"


	public static class map_type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "map_type"
	// com/facebook/swift/parser/antlr/Thrift.g:192:1: map_type : 'map' ( cpp_type )? '<' field_type COMMA field_type '>' -> ^( MAP field_type field_type ( cpp_type )? ) ;
	public final ThriftParser.map_type_return map_type() throws RecognitionException {
		ThriftParser.map_type_return retval = new ThriftParser.map_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal120=null;
		Token char_literal122=null;
		Token COMMA124=null;
		Token char_literal126=null;
		ParserRuleReturnScope cpp_type121 =null;
		ParserRuleReturnScope field_type123 =null;
		ParserRuleReturnScope field_type125 =null;

		Object string_literal120_tree=null;
		Object char_literal122_tree=null;
		Object COMMA124_tree=null;
		Object char_literal126_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_cpp_type=new RewriteRuleSubtreeStream(adaptor,"rule cpp_type");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:193:5: ( 'map' ( cpp_type )? '<' field_type COMMA field_type '>' -> ^( MAP field_type field_type ( cpp_type )? ) )
			// com/facebook/swift/parser/antlr/Thrift.g:193:7: 'map' ( cpp_type )? '<' field_type COMMA field_type '>'
			{
			string_literal120=(Token)match(input,73,FOLLOW_73_in_map_type1389);  
			stream_73.add(string_literal120);

			// com/facebook/swift/parser/antlr/Thrift.g:193:13: ( cpp_type )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==67) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:193:13: cpp_type
					{
					pushFollow(FOLLOW_cpp_type_in_map_type1391);
					cpp_type121=cpp_type();
					state._fsp--;

					stream_cpp_type.add(cpp_type121.getTree());
					}
					break;

			}

			char_literal122=(Token)match(input,58,FOLLOW_58_in_map_type1394);  
			stream_58.add(char_literal122);

			pushFollow(FOLLOW_field_type_in_map_type1396);
			field_type123=field_type();
			state._fsp--;

			stream_field_type.add(field_type123.getTree());
			COMMA124=(Token)match(input,COMMA,FOLLOW_COMMA_in_map_type1398);  
			stream_COMMA.add(COMMA124);

			pushFollow(FOLLOW_field_type_in_map_type1400);
			field_type125=field_type();
			state._fsp--;

			stream_field_type.add(field_type125.getTree());
			char_literal126=(Token)match(input,60,FOLLOW_60_in_map_type1402);  
			stream_60.add(char_literal126);

			// AST REWRITE
			// elements: field_type, cpp_type, field_type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 193:59: -> ^( MAP field_type field_type ( cpp_type )? )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:193:62: ^( MAP field_type field_type ( cpp_type )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MAP, "MAP"), root_1);
				adaptor.addChild(root_1, stream_field_type.nextTree());
				adaptor.addChild(root_1, stream_field_type.nextTree());
				// com/facebook/swift/parser/antlr/Thrift.g:193:90: ( cpp_type )?
				if ( stream_cpp_type.hasNext() ) {
					adaptor.addChild(root_1, stream_cpp_type.nextTree());
				}
				stream_cpp_type.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "map_type"


	public static class set_type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "set_type"
	// com/facebook/swift/parser/antlr/Thrift.g:196:1: set_type : 'set' ( cpp_type )? '<' field_type '>' -> ^( SET field_type ( cpp_type )? ) ;
	public final ThriftParser.set_type_return set_type() throws RecognitionException {
		ThriftParser.set_type_return retval = new ThriftParser.set_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal127=null;
		Token char_literal129=null;
		Token char_literal131=null;
		ParserRuleReturnScope cpp_type128 =null;
		ParserRuleReturnScope field_type130 =null;

		Object string_literal127_tree=null;
		Object char_literal129_tree=null;
		Object char_literal131_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_cpp_type=new RewriteRuleSubtreeStream(adaptor,"rule cpp_type");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:197:5: ( 'set' ( cpp_type )? '<' field_type '>' -> ^( SET field_type ( cpp_type )? ) )
			// com/facebook/swift/parser/antlr/Thrift.g:197:7: 'set' ( cpp_type )? '<' field_type '>'
			{
			string_literal127=(Token)match(input,81,FOLLOW_81_in_set_type1432);  
			stream_81.add(string_literal127);

			// com/facebook/swift/parser/antlr/Thrift.g:197:13: ( cpp_type )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==67) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:197:13: cpp_type
					{
					pushFollow(FOLLOW_cpp_type_in_set_type1434);
					cpp_type128=cpp_type();
					state._fsp--;

					stream_cpp_type.add(cpp_type128.getTree());
					}
					break;

			}

			char_literal129=(Token)match(input,58,FOLLOW_58_in_set_type1437);  
			stream_58.add(char_literal129);

			pushFollow(FOLLOW_field_type_in_set_type1439);
			field_type130=field_type();
			state._fsp--;

			stream_field_type.add(field_type130.getTree());
			char_literal131=(Token)match(input,60,FOLLOW_60_in_set_type1441);  
			stream_60.add(char_literal131);

			// AST REWRITE
			// elements: field_type, cpp_type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 197:42: -> ^( SET field_type ( cpp_type )? )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:197:45: ^( SET field_type ( cpp_type )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SET, "SET"), root_1);
				adaptor.addChild(root_1, stream_field_type.nextTree());
				// com/facebook/swift/parser/antlr/Thrift.g:197:62: ( cpp_type )?
				if ( stream_cpp_type.hasNext() ) {
					adaptor.addChild(root_1, stream_cpp_type.nextTree());
				}
				stream_cpp_type.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "set_type"


	public static class list_type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "list_type"
	// com/facebook/swift/parser/antlr/Thrift.g:200:1: list_type : 'list' '<' field_type '>' ( cpp_type )? -> ^( LIST field_type ( cpp_type )? ) ;
	public final ThriftParser.list_type_return list_type() throws RecognitionException {
		ThriftParser.list_type_return retval = new ThriftParser.list_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal132=null;
		Token char_literal133=null;
		Token char_literal135=null;
		ParserRuleReturnScope field_type134 =null;
		ParserRuleReturnScope cpp_type136 =null;

		Object string_literal132_tree=null;
		Object char_literal133_tree=null;
		Object char_literal135_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_cpp_type=new RewriteRuleSubtreeStream(adaptor,"rule cpp_type");
		RewriteRuleSubtreeStream stream_field_type=new RewriteRuleSubtreeStream(adaptor,"rule field_type");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:201:5: ( 'list' '<' field_type '>' ( cpp_type )? -> ^( LIST field_type ( cpp_type )? ) )
			// com/facebook/swift/parser/antlr/Thrift.g:201:7: 'list' '<' field_type '>' ( cpp_type )?
			{
			string_literal132=(Token)match(input,72,FOLLOW_72_in_list_type1469);  
			stream_72.add(string_literal132);

			char_literal133=(Token)match(input,58,FOLLOW_58_in_list_type1471);  
			stream_58.add(char_literal133);

			pushFollow(FOLLOW_field_type_in_list_type1473);
			field_type134=field_type();
			state._fsp--;

			stream_field_type.add(field_type134.getTree());
			char_literal135=(Token)match(input,60,FOLLOW_60_in_list_type1475);  
			stream_60.add(char_literal135);

			// com/facebook/swift/parser/antlr/Thrift.g:201:33: ( cpp_type )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==67) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:201:33: cpp_type
					{
					pushFollow(FOLLOW_cpp_type_in_list_type1477);
					cpp_type136=cpp_type();
					state._fsp--;

					stream_cpp_type.add(cpp_type136.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: cpp_type, field_type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 201:43: -> ^( LIST field_type ( cpp_type )? )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:201:46: ^( LIST field_type ( cpp_type )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				adaptor.addChild(root_1, stream_field_type.nextTree());
				// com/facebook/swift/parser/antlr/Thrift.g:201:64: ( cpp_type )?
				if ( stream_cpp_type.hasNext() ) {
					adaptor.addChild(root_1, stream_cpp_type.nextTree());
				}
				stream_cpp_type.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list_type"


	public static class cpp_type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cpp_type"
	// com/facebook/swift/parser/antlr/Thrift.g:204:1: cpp_type : 'cpp_type' LITERAL -> ^( CPP_TYPE LITERAL ) ;
	public final ThriftParser.cpp_type_return cpp_type() throws RecognitionException {
		ThriftParser.cpp_type_return retval = new ThriftParser.cpp_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal137=null;
		Token LITERAL138=null;

		Object string_literal137_tree=null;
		Object LITERAL138_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_LITERAL=new RewriteRuleTokenStream(adaptor,"token LITERAL");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:205:5: ( 'cpp_type' LITERAL -> ^( CPP_TYPE LITERAL ) )
			// com/facebook/swift/parser/antlr/Thrift.g:205:7: 'cpp_type' LITERAL
			{
			string_literal137=(Token)match(input,67,FOLLOW_67_in_cpp_type1506);  
			stream_67.add(string_literal137);

			LITERAL138=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_cpp_type1508);  
			stream_LITERAL.add(LITERAL138);

			// AST REWRITE
			// elements: LITERAL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 205:26: -> ^( CPP_TYPE LITERAL )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:205:29: ^( CPP_TYPE LITERAL )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CPP_TYPE, "CPP_TYPE"), root_1);
				adaptor.addChild(root_1, stream_LITERAL.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cpp_type"


	public static class const_value_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "const_value"
	// com/facebook/swift/parser/antlr/Thrift.g:209:1: const_value : ( integer | DOUBLE | LITERAL | IDENTIFIER | const_list | const_map );
	public final ThriftParser.const_value_return const_value() throws RecognitionException {
		ThriftParser.const_value_return retval = new ThriftParser.const_value_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DOUBLE140=null;
		Token LITERAL141=null;
		Token IDENTIFIER142=null;
		ParserRuleReturnScope integer139 =null;
		ParserRuleReturnScope const_list143 =null;
		ParserRuleReturnScope const_map144 =null;

		Object DOUBLE140_tree=null;
		Object LITERAL141_tree=null;
		Object IDENTIFIER142_tree=null;

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:210:5: ( integer | DOUBLE | LITERAL | IDENTIFIER | const_list | const_map )
			int alt48=6;
			switch ( input.LA(1) ) {
			case HEX_INTEGER:
			case INTEGER:
				{
				alt48=1;
				}
				break;
			case DOUBLE:
				{
				alt48=2;
				}
				break;
			case LITERAL:
				{
				alt48=3;
				}
				break;
			case IDENTIFIER:
				{
				alt48=4;
				}
				break;
			case 61:
				{
				alt48=5;
				}
				break;
			case 87:
				{
				alt48=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:210:7: integer
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_integer_in_const_value1534);
					integer139=integer();
					state._fsp--;

					adaptor.addChild(root_0, integer139.getTree());

					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/Thrift.g:210:17: DOUBLE
					{
					root_0 = (Object)adaptor.nil();


					DOUBLE140=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_const_value1538); 
					DOUBLE140_tree = (Object)adaptor.create(DOUBLE140);
					adaptor.addChild(root_0, DOUBLE140_tree);

					}
					break;
				case 3 :
					// com/facebook/swift/parser/antlr/Thrift.g:210:26: LITERAL
					{
					root_0 = (Object)adaptor.nil();


					LITERAL141=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_const_value1542); 
					LITERAL141_tree = (Object)adaptor.create(LITERAL141);
					adaptor.addChild(root_0, LITERAL141_tree);

					}
					break;
				case 4 :
					// com/facebook/swift/parser/antlr/Thrift.g:210:36: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER142=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_const_value1546); 
					IDENTIFIER142_tree = (Object)adaptor.create(IDENTIFIER142);
					adaptor.addChild(root_0, IDENTIFIER142_tree);

					}
					break;
				case 5 :
					// com/facebook/swift/parser/antlr/Thrift.g:210:49: const_list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_const_list_in_const_value1550);
					const_list143=const_list();
					state._fsp--;

					adaptor.addChild(root_0, const_list143.getTree());

					}
					break;
				case 6 :
					// com/facebook/swift/parser/antlr/Thrift.g:210:62: const_map
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_const_map_in_const_value1554);
					const_map144=const_map();
					state._fsp--;

					adaptor.addChild(root_0, const_map144.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "const_value"


	public static class integer_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "integer"
	// com/facebook/swift/parser/antlr/Thrift.g:213:1: integer : ( INTEGER | HEX_INTEGER );
	public final ThriftParser.integer_return integer() throws RecognitionException {
		ThriftParser.integer_return retval = new ThriftParser.integer_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set145=null;

		Object set145_tree=null;

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:214:5: ( INTEGER | HEX_INTEGER )
			// com/facebook/swift/parser/antlr/Thrift.g:
			{
			root_0 = (Object)adaptor.nil();


			set145=input.LT(1);
			if ( input.LA(1)==HEX_INTEGER||input.LA(1)==INTEGER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set145));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "integer"


	public static class const_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "const_list"
	// com/facebook/swift/parser/antlr/Thrift.g:229:1: const_list : '[' ( const_value ( list_separator )? )* ']' -> ^( LIST ( const_value )* ) ;
	public final ThriftParser.const_list_return const_list() throws RecognitionException {
		ThriftParser.const_list_return retval = new ThriftParser.const_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal146=null;
		Token char_literal149=null;
		ParserRuleReturnScope const_value147 =null;
		ParserRuleReturnScope list_separator148 =null;

		Object char_literal146_tree=null;
		Object char_literal149_tree=null;
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_const_value=new RewriteRuleSubtreeStream(adaptor,"rule const_value");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:230:5: ( '[' ( const_value ( list_separator )? )* ']' -> ^( LIST ( const_value )* ) )
			// com/facebook/swift/parser/antlr/Thrift.g:230:7: '[' ( const_value ( list_separator )? )* ']'
			{
			char_literal146=(Token)match(input,61,FOLLOW_61_in_const_list1687);  
			stream_61.add(char_literal146);

			// com/facebook/swift/parser/antlr/Thrift.g:230:11: ( const_value ( list_separator )? )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==DOUBLE||(LA50_0 >= HEX_INTEGER && LA50_0 <= IDENTIFIER)||LA50_0==INTEGER||LA50_0==LITERAL||LA50_0==61||LA50_0==87) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:230:12: const_value ( list_separator )?
					{
					pushFollow(FOLLOW_const_value_in_const_list1690);
					const_value147=const_value();
					state._fsp--;

					stream_const_value.add(const_value147.getTree());
					// com/facebook/swift/parser/antlr/Thrift.g:230:24: ( list_separator )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==COMMA||LA49_0==57) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// com/facebook/swift/parser/antlr/Thrift.g:230:24: list_separator
							{
							pushFollow(FOLLOW_list_separator_in_const_list1692);
							list_separator148=list_separator();
							state._fsp--;

							stream_list_separator.add(list_separator148.getTree());
							}
							break;

					}

					}
					break;

				default :
					break loop50;
				}
			}

			char_literal149=(Token)match(input,62,FOLLOW_62_in_const_list1697);  
			stream_62.add(char_literal149);

			// AST REWRITE
			// elements: const_value
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 230:46: -> ^( LIST ( const_value )* )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:230:49: ^( LIST ( const_value )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				// com/facebook/swift/parser/antlr/Thrift.g:230:56: ( const_value )*
				while ( stream_const_value.hasNext() ) {
					adaptor.addChild(root_1, stream_const_value.nextTree());
				}
				stream_const_value.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "const_list"


	public static class const_map_entry_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "const_map_entry"
	// com/facebook/swift/parser/antlr/Thrift.g:233:1: const_map_entry : k= const_value ':' v= const_value ( list_separator )? -> ^( ENTRY $k $v) ;
	public final ThriftParser.const_map_entry_return const_map_entry() throws RecognitionException {
		ThriftParser.const_map_entry_return retval = new ThriftParser.const_map_entry_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal150=null;
		ParserRuleReturnScope k =null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope list_separator151 =null;

		Object char_literal150_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleSubtreeStream stream_list_separator=new RewriteRuleSubtreeStream(adaptor,"rule list_separator");
		RewriteRuleSubtreeStream stream_const_value=new RewriteRuleSubtreeStream(adaptor,"rule const_value");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:234:5: (k= const_value ':' v= const_value ( list_separator )? -> ^( ENTRY $k $v) )
			// com/facebook/swift/parser/antlr/Thrift.g:234:7: k= const_value ':' v= const_value ( list_separator )?
			{
			pushFollow(FOLLOW_const_value_in_const_map_entry1725);
			k=const_value();
			state._fsp--;

			stream_const_value.add(k.getTree());
			char_literal150=(Token)match(input,56,FOLLOW_56_in_const_map_entry1727);  
			stream_56.add(char_literal150);

			pushFollow(FOLLOW_const_value_in_const_map_entry1731);
			v=const_value();
			state._fsp--;

			stream_const_value.add(v.getTree());
			// com/facebook/swift/parser/antlr/Thrift.g:234:39: ( list_separator )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==COMMA||LA51_0==57) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:234:39: list_separator
					{
					pushFollow(FOLLOW_list_separator_in_const_map_entry1733);
					list_separator151=list_separator();
					state._fsp--;

					stream_list_separator.add(list_separator151.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: v, k
			// token labels: 
			// rule labels: v, k, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
			RewriteRuleSubtreeStream stream_k=new RewriteRuleSubtreeStream(adaptor,"rule k",k!=null?k.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 234:55: -> ^( ENTRY $k $v)
			{
				// com/facebook/swift/parser/antlr/Thrift.g:234:58: ^( ENTRY $k $v)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ENTRY, "ENTRY"), root_1);
				adaptor.addChild(root_1, stream_k.nextTree());
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "const_map_entry"


	public static class const_map_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "const_map"
	// com/facebook/swift/parser/antlr/Thrift.g:237:1: const_map : '{' ( const_map_entry )* '}' -> ^( MAP ( const_map_entry )* ) ;
	public final ThriftParser.const_map_return const_map() throws RecognitionException {
		ThriftParser.const_map_return retval = new ThriftParser.const_map_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal152=null;
		Token char_literal154=null;
		ParserRuleReturnScope const_map_entry153 =null;

		Object char_literal152_tree=null;
		Object char_literal154_tree=null;
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_const_map_entry=new RewriteRuleSubtreeStream(adaptor,"rule const_map_entry");

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:238:5: ( '{' ( const_map_entry )* '}' -> ^( MAP ( const_map_entry )* ) )
			// com/facebook/swift/parser/antlr/Thrift.g:238:7: '{' ( const_map_entry )* '}'
			{
			char_literal152=(Token)match(input,87,FOLLOW_87_in_const_map1763);  
			stream_87.add(char_literal152);

			// com/facebook/swift/parser/antlr/Thrift.g:238:11: ( const_map_entry )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==DOUBLE||(LA52_0 >= HEX_INTEGER && LA52_0 <= IDENTIFIER)||LA52_0==INTEGER||LA52_0==LITERAL||LA52_0==61||LA52_0==87) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:238:11: const_map_entry
					{
					pushFollow(FOLLOW_const_map_entry_in_const_map1765);
					const_map_entry153=const_map_entry();
					state._fsp--;

					stream_const_map_entry.add(const_map_entry153.getTree());
					}
					break;

				default :
					break loop52;
				}
			}

			char_literal154=(Token)match(input,88,FOLLOW_88_in_const_map1768);  
			stream_88.add(char_literal154);

			// AST REWRITE
			// elements: const_map_entry
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 238:32: -> ^( MAP ( const_map_entry )* )
			{
				// com/facebook/swift/parser/antlr/Thrift.g:238:35: ^( MAP ( const_map_entry )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MAP, "MAP"), root_1);
				// com/facebook/swift/parser/antlr/Thrift.g:238:41: ( const_map_entry )*
				while ( stream_const_map_entry.hasNext() ) {
					adaptor.addChild(root_1, stream_const_map_entry.nextTree());
				}
				stream_const_map_entry.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "const_map"


	public static class list_separator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "list_separator"
	// com/facebook/swift/parser/antlr/Thrift.g:241:1: list_separator : ( COMMA | ';' );
	public final ThriftParser.list_separator_return list_separator() throws RecognitionException {
		ThriftParser.list_separator_return retval = new ThriftParser.list_separator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set155=null;

		Object set155_tree=null;

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:242:5: ( COMMA | ';' )
			// com/facebook/swift/parser/antlr/Thrift.g:
			{
			root_0 = (Object)adaptor.nil();


			set155=input.LT(1);
			if ( input.LA(1)==COMMA||input.LA(1)==57 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set155));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list_separator"


	public static class real_base_type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "real_base_type"
	// com/facebook/swift/parser/antlr/Thrift.g:245:1: real_base_type : ( TYPE_BOOL | TYPE_BYTE | TYPE_I16 | TYPE_I32 | TYPE_I64 | TYPE_DOUBLE | TYPE_STRING | TYPE_BINARY );
	public final ThriftParser.real_base_type_return real_base_type() throws RecognitionException {
		ThriftParser.real_base_type_return retval = new ThriftParser.real_base_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set156=null;

		Object set156_tree=null;

		try {
			// com/facebook/swift/parser/antlr/Thrift.g:246:5: ( TYPE_BOOL | TYPE_BYTE | TYPE_I16 | TYPE_I32 | TYPE_I64 | TYPE_DOUBLE | TYPE_STRING | TYPE_BINARY )
			// com/facebook/swift/parser/antlr/Thrift.g:
			{
			root_0 = (Object)adaptor.nil();


			set156=input.LT(1);
			if ( (input.LA(1) >= TYPE_BINARY && input.LA(1) <= TYPE_STRING) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set156));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "real_base_type"

	// Delegated rules



	public static final BitSet FOLLOW_header_in_document264 = new BitSet(new long[]{0x0000000000000000L,0x000000000035A4B7L});
	public static final BitSet FOLLOW_definition_in_document267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000358031L});
	public static final BitSet FOLLOW_EOF_in_document270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_include_in_header300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namespace_in_header304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cpp_include_in_header308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_include325 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_in_include327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_namespace352 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_namespace354 = new BitSet(new long[]{0x0000000004200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_namespace365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_namespace383 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace387 = new BitSet(new long[]{0x0000000004200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_namespace398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_namespace419 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_namespace440 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_cpp_include470 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_in_cpp_include472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_const_rule_in_definition498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typedef_in_definition502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_rule_in_definition506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_senum_in_definition510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_in_definition514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_union_in_definition518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exception_in_definition522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_service_in_definition526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_const_rule543 = new BitSet(new long[]{0x0003FC0000200000L,0x0000000000020300L});
	public static final BitSet FOLLOW_field_type_in_const_rule545 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_const_rule547 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_const_rule549 = new BitSet(new long[]{0x2000000004B02000L,0x0000000000800000L});
	public static final BitSet FOLLOW_const_value_in_const_rule551 = new BitSet(new long[]{0x0200000000000022L});
	public static final BitSet FOLLOW_list_separator_in_const_rule553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_typedef591 = new BitSet(new long[]{0x0003FC0000200000L,0x0000000000020300L});
	public static final BitSet FOLLOW_field_type_in_typedef593 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_typedef595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_enum_rule622 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enum_rule624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_enum_rule626 = new BitSet(new long[]{0x0000000000200000L,0x0000000001000000L});
	public static final BitSet FOLLOW_enum_field_in_enum_rule628 = new BitSet(new long[]{0x0000000000200000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_enum_rule631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enum_field659 = new BitSet(new long[]{0x0A00000000000022L});
	public static final BitSet FOLLOW_59_in_enum_field662 = new BitSet(new long[]{0x0000000000900000L});
	public static final BitSet FOLLOW_integer_in_enum_field664 = new BitSet(new long[]{0x0200000000000022L});
	public static final BitSet FOLLOW_list_separator_in_enum_field668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_senum695 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_senum697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_senum699 = new BitSet(new long[]{0x0000000004000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_LITERAL_in_senum702 = new BitSet(new long[]{0x0200000004000020L,0x0000000001000000L});
	public static final BitSet FOLLOW_list_separator_in_senum704 = new BitSet(new long[]{0x0000000004000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_senum709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_struct737 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_struct739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_struct741 = new BitSet(new long[]{0x0003FC0000B00000L,0x0000000001025300L});
	public static final BitSet FOLLOW_field_in_struct743 = new BitSet(new long[]{0x0003FC0000B00000L,0x0000000001025300L});
	public static final BitSet FOLLOW_88_in_struct746 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_struct748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_union780 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_union782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_union784 = new BitSet(new long[]{0x0003FC0000B00000L,0x0000000001025300L});
	public static final BitSet FOLLOW_field_in_union786 = new BitSet(new long[]{0x0003FC0000B00000L,0x0000000001025300L});
	public static final BitSet FOLLOW_88_in_union789 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_union791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_exception823 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_exception825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_exception827 = new BitSet(new long[]{0x0003FC0000B00000L,0x0000000001025300L});
	public static final BitSet FOLLOW_field_in_exception829 = new BitSet(new long[]{0x0003FC0000B00000L,0x0000000001025300L});
	public static final BitSet FOLLOW_88_in_exception832 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_exception834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_service866 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_service870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800040L});
	public static final BitSet FOLLOW_70_in_service873 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_service877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_service881 = new BitSet(new long[]{0x8003FC0000200000L,0x0000000001420B00L});
	public static final BitSet FOLLOW_function_in_service885 = new BitSet(new long[]{0x8003FC0000200000L,0x0000000001420B00L});
	public static final BitSet FOLLOW_88_in_service888 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_service890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_id_in_field932 = new BitSet(new long[]{0x0003FC0000200000L,0x0000000000025300L});
	public static final BitSet FOLLOW_field_req_in_field935 = new BitSet(new long[]{0x0003FC0000200000L,0x0000000000020300L});
	public static final BitSet FOLLOW_field_type_in_field938 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_field940 = new BitSet(new long[]{0x0A20000000000022L});
	public static final BitSet FOLLOW_59_in_field943 = new BitSet(new long[]{0x2000000004B02000L,0x0000000000800000L});
	public static final BitSet FOLLOW_const_value_in_field945 = new BitSet(new long[]{0x0220000000000022L});
	public static final BitSet FOLLOW_type_annotations_in_field949 = new BitSet(new long[]{0x0200000000000022L});
	public static final BitSet FOLLOW_list_separator_in_field952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_field_id1004 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_field_id1006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_field_req1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_field_req1039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneway_in_function1061 = new BitSet(new long[]{0x0003FC0000200000L,0x0000000000420300L});
	public static final BitSet FOLLOW_function_type_in_function1064 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function1066 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_function1068 = new BitSet(new long[]{0x0043FC0000B00000L,0x0000000000025300L});
	public static final BitSet FOLLOW_field_in_function1070 = new BitSet(new long[]{0x0043FC0000B00000L,0x0000000000025300L});
	public static final BitSet FOLLOW_54_in_function1073 = new BitSet(new long[]{0x0220000000000022L,0x0000000000080000L});
	public static final BitSet FOLLOW_throws_list_in_function1075 = new BitSet(new long[]{0x0220000000000022L});
	public static final BitSet FOLLOW_type_annotations_in_function1078 = new BitSet(new long[]{0x0200000000000022L});
	public static final BitSet FOLLOW_list_separator_in_function1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_oneway1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_oneway1138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_type_in_function_type1160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_function_type1168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_throws_list1189 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_throws_list1191 = new BitSet(new long[]{0x0043FC0000B00000L,0x0000000000025300L});
	public static final BitSet FOLLOW_field_in_throws_list1193 = new BitSet(new long[]{0x0043FC0000B00000L,0x0000000000025300L});
	public static final BitSet FOLLOW_54_in_throws_list1196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_type_annotations1223 = new BitSet(new long[]{0x0040000000200000L});
	public static final BitSet FOLLOW_type_annotation_in_type_annotations1225 = new BitSet(new long[]{0x0040000000200000L});
	public static final BitSet FOLLOW_54_in_type_annotations1228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type_annotation1254 = new BitSet(new long[]{0x0A00000000000022L});
	public static final BitSet FOLLOW_59_in_type_annotation1257 = new BitSet(new long[]{0x0000000004900000L});
	public static final BitSet FOLLOW_annotation_value_in_type_annotation1259 = new BitSet(new long[]{0x0200000000000022L});
	public static final BitSet FOLLOW_list_separator_in_type_annotation1263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_annotation_value1292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_annotation_value1296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_field_type1314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_field_type1318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_container_type_in_field_type1322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_real_base_type_in_base_type1339 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_base_type1341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_map_type_in_container_type1360 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_set_type_in_container_type1364 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_list_type_in_container_type1368 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_type_annotations_in_container_type1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_map_type1389 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_cpp_type_in_map_type1391 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_map_type1394 = new BitSet(new long[]{0x0003FC0000200000L,0x0000000000020300L});
	public static final BitSet FOLLOW_field_type_in_map_type1396 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_map_type1398 = new BitSet(new long[]{0x0003FC0000200000L,0x0000000000020300L});
	public static final BitSet FOLLOW_field_type_in_map_type1400 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_map_type1402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_set_type1432 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_cpp_type_in_set_type1434 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_set_type1437 = new BitSet(new long[]{0x0003FC0000200000L,0x0000000000020300L});
	public static final BitSet FOLLOW_field_type_in_set_type1439 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_set_type1441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_list_type1469 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_list_type1471 = new BitSet(new long[]{0x0003FC0000200000L,0x0000000000020300L});
	public static final BitSet FOLLOW_field_type_in_list_type1473 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_list_type1475 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_cpp_type_in_list_type1477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_cpp_type1506 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_in_cpp_type1508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_in_const_value1534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_const_value1538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_const_value1542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_const_value1546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_const_list_in_const_value1550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_const_map_in_const_value1554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_const_list1687 = new BitSet(new long[]{0x6000000004B02000L,0x0000000000800000L});
	public static final BitSet FOLLOW_const_value_in_const_list1690 = new BitSet(new long[]{0x6200000004B02020L,0x0000000000800000L});
	public static final BitSet FOLLOW_list_separator_in_const_list1692 = new BitSet(new long[]{0x6000000004B02000L,0x0000000000800000L});
	public static final BitSet FOLLOW_62_in_const_list1697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_const_value_in_const_map_entry1725 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_const_map_entry1727 = new BitSet(new long[]{0x2000000004B02000L,0x0000000000800000L});
	public static final BitSet FOLLOW_const_value_in_const_map_entry1731 = new BitSet(new long[]{0x0200000000000022L});
	public static final BitSet FOLLOW_list_separator_in_const_map_entry1733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_87_in_const_map1763 = new BitSet(new long[]{0x2000000004B02000L,0x0000000001800000L});
	public static final BitSet FOLLOW_const_map_entry_in_const_map1765 = new BitSet(new long[]{0x2000000004B02000L,0x0000000001800000L});
	public static final BitSet FOLLOW_88_in_const_map1768 = new BitSet(new long[]{0x0000000000000002L});
}
