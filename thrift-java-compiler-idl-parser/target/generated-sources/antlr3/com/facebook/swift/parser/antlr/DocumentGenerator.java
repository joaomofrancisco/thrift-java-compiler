// $ANTLR 3.5 com/facebook/swift/parser/antlr/DocumentGenerator.g 2015-08-08 15:57:01

    package com.facebook.swift.parser.antlr;

    import com.facebook.swift.parser.model.*;
    import com.facebook.swift.parser.util.*;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.AbstractMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class DocumentGenerator extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public DocumentGenerator(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public DocumentGenerator(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return DocumentGenerator.tokenNames; }
	@Override public String getGrammarFileName() { return "com/facebook/swift/parser/antlr/DocumentGenerator.g"; }


	public static class document_return extends TreeRuleReturnScope {
		public Document value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "document"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:39:1: document returns [Document value] : ( DOCUMENT | ^( DOCUMENT header definitions ) );
	public final DocumentGenerator.document_return document() throws RecognitionException {
		DocumentGenerator.document_return retval = new DocumentGenerator.document_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree DOCUMENT1=null;
		CommonTree DOCUMENT2=null;
		TreeRuleReturnScope header3 =null;
		TreeRuleReturnScope definitions4 =null;

		CommonTree DOCUMENT1_tree=null;
		CommonTree DOCUMENT2_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:40:5: ( DOCUMENT | ^( DOCUMENT header definitions ) )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==DOCUMENT) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==DOWN) ) {
					alt1=2;
				}
				else if ( (LA1_1==EOF) ) {
					alt1=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:40:7: DOCUMENT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					DOCUMENT1=(CommonTree)match(input,DOCUMENT,FOLLOW_DOCUMENT_in_document68); 
					DOCUMENT1_tree = (CommonTree)adaptor.dupNode(DOCUMENT1);


					adaptor.addChild(root_0, DOCUMENT1_tree);

					 retval.value = Document.emptyDocument(); 
					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:41:7: ^( DOCUMENT header definitions )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DOCUMENT2=(CommonTree)match(input,DOCUMENT,FOLLOW_DOCUMENT_in_document101); 
					DOCUMENT2_tree = (CommonTree)adaptor.dupNode(DOCUMENT2);


					root_1 = (CommonTree)adaptor.becomeRoot(DOCUMENT2_tree, root_1);

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_header_in_document103);
						header3=header();
						state._fsp--;

						adaptor.addChild(root_1, header3.getTree());

						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_definitions_in_document105);
						definitions4=definitions();
						state._fsp--;

						adaptor.addChild(root_1, definitions4.getTree());

						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 retval.value = new Document((header3!=null?((DocumentGenerator.header_return)header3).value:null), (definitions4!=null?((DocumentGenerator.definitions_return)definitions4).value:null)); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "document"


	public static class header_return extends TreeRuleReturnScope {
		public Header value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "header"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:45:1: header returns [Header value] : ( include | cpp_include | default_namespace | namespace )* ;
	public final DocumentGenerator.header_return header() throws RecognitionException {
		DocumentGenerator.header_return retval = new DocumentGenerator.header_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope include5 =null;
		TreeRuleReturnScope cpp_include6 =null;
		TreeRuleReturnScope default_namespace7 =null;
		TreeRuleReturnScope namespace8 =null;



		    List<String> includes = new ArrayList<>();
		    List<String> cppIncludes = new ArrayList<>();
		    String defaultNamespace = null;
		    Map<String, String> namespaces = new HashMap<>();

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:55:5: ( ( include | cpp_include | default_namespace | namespace )* )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:55:7: ( include | cpp_include | default_namespace | namespace )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// com/facebook/swift/parser/antlr/DocumentGenerator.g:55:7: ( include | cpp_include | default_namespace | namespace )*
			loop2:
			while (true) {
				int alt2=5;
				switch ( input.LA(1) ) {
				case INCLUDE:
					{
					alt2=1;
					}
					break;
				case CPP_INCLUDE:
					{
					alt2=2;
					}
					break;
				case DEFAULT_NAMESPACE:
					{
					alt2=3;
					}
					break;
				case NAMESPACE:
					{
					alt2=4;
					}
					break;
				}
				switch (alt2) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:55:9: include
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_include_in_header142);
					include5=include();
					state._fsp--;

					adaptor.addChild(root_0, include5.getTree());

					 includes.add((include5!=null?((DocumentGenerator.include_return)include5).value:null)); 
					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:56:9: cpp_include
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_cpp_include_in_header164);
					cpp_include6=cpp_include();
					state._fsp--;

					adaptor.addChild(root_0, cpp_include6.getTree());

					 cppIncludes.add((cpp_include6!=null?((DocumentGenerator.cpp_include_return)cpp_include6).value:null)); 
					}
					break;
				case 3 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:57:9: default_namespace
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_default_namespace_in_header182);
					default_namespace7=default_namespace();
					state._fsp--;

					adaptor.addChild(root_0, default_namespace7.getTree());

					 defaultNamespace = (default_namespace7!=null?((DocumentGenerator.default_namespace_return)default_namespace7).value:null); 
					}
					break;
				case 4 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:58:9: namespace
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_namespace_in_header194);
					namespace8=namespace();
					state._fsp--;

					adaptor.addChild(root_0, namespace8.getTree());

					 namespaces.put((namespace8!=null?((DocumentGenerator.namespace_return)namespace8).language:null), (namespace8!=null?((DocumentGenerator.namespace_return)namespace8).value:null)); 
					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);


			    retval.value = new Header(includes, cppIncludes, defaultNamespace, namespaces);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "header"


	public static class include_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "include"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:62:1: include returns [String value] : ^( INCLUDE LITERAL ) ;
	public final DocumentGenerator.include_return include() throws RecognitionException {
		DocumentGenerator.include_return retval = new DocumentGenerator.include_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree INCLUDE9=null;
		CommonTree LITERAL10=null;

		CommonTree INCLUDE9_tree=null;
		CommonTree LITERAL10_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:63:5: ( ^( INCLUDE LITERAL ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:63:7: ^( INCLUDE LITERAL )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			INCLUDE9=(CommonTree)match(input,INCLUDE,FOLLOW_INCLUDE_in_include235); 
			INCLUDE9_tree = (CommonTree)adaptor.dupNode(INCLUDE9);


			root_1 = (CommonTree)adaptor.becomeRoot(INCLUDE9_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			LITERAL10=(CommonTree)match(input,LITERAL,FOLLOW_LITERAL_in_include237); 
			LITERAL10_tree = (CommonTree)adaptor.dupNode(LITERAL10);


			adaptor.addChild(root_1, LITERAL10_tree);

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.value = (LITERAL10!=null?LITERAL10.getText():null); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "include"


	public static class default_namespace_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "default_namespace"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:66:1: default_namespace returns [String value] : ^( DEFAULT_NAMESPACE (v= IDENTIFIER |v= LITERAL ) ) ;
	public final DocumentGenerator.default_namespace_return default_namespace() throws RecognitionException {
		DocumentGenerator.default_namespace_return retval = new DocumentGenerator.default_namespace_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree v=null;
		CommonTree DEFAULT_NAMESPACE11=null;

		CommonTree v_tree=null;
		CommonTree DEFAULT_NAMESPACE11_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:67:5: ( ^( DEFAULT_NAMESPACE (v= IDENTIFIER |v= LITERAL ) ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:67:7: ^( DEFAULT_NAMESPACE (v= IDENTIFIER |v= LITERAL ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			DEFAULT_NAMESPACE11=(CommonTree)match(input,DEFAULT_NAMESPACE,FOLLOW_DEFAULT_NAMESPACE_in_default_namespace262); 
			DEFAULT_NAMESPACE11_tree = (CommonTree)adaptor.dupNode(DEFAULT_NAMESPACE11);


			root_1 = (CommonTree)adaptor.becomeRoot(DEFAULT_NAMESPACE11_tree, root_1);

			match(input, Token.DOWN, null); 
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:67:27: (v= IDENTIFIER |v= LITERAL )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==IDENTIFIER) ) {
				alt3=1;
			}
			else if ( (LA3_0==LITERAL) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:67:28: v= IDENTIFIER
					{
					_last = (CommonTree)input.LT(1);
					v=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_default_namespace267); 
					v_tree = (CommonTree)adaptor.dupNode(v);


					adaptor.addChild(root_1, v_tree);

					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:67:43: v= LITERAL
					{
					_last = (CommonTree)input.LT(1);
					v=(CommonTree)match(input,LITERAL,FOLLOW_LITERAL_in_default_namespace273); 
					v_tree = (CommonTree)adaptor.dupNode(v);


					adaptor.addChild(root_1, v_tree);

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.value = (v!=null?v.getText():null); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "default_namespace"


	public static class namespace_return extends TreeRuleReturnScope {
		public String language;
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "namespace"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:70:1: namespace returns [String language, String value] : ^( NAMESPACE k= IDENTIFIER (v= IDENTIFIER |v= LITERAL ) ) ;
	public final DocumentGenerator.namespace_return namespace() throws RecognitionException {
		DocumentGenerator.namespace_return retval = new DocumentGenerator.namespace_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree k=null;
		CommonTree v=null;
		CommonTree NAMESPACE12=null;

		CommonTree k_tree=null;
		CommonTree v_tree=null;
		CommonTree NAMESPACE12_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:71:5: ( ^( NAMESPACE k= IDENTIFIER (v= IDENTIFIER |v= LITERAL ) ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:71:7: ^( NAMESPACE k= IDENTIFIER (v= IDENTIFIER |v= LITERAL ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			NAMESPACE12=(CommonTree)match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespace299); 
			NAMESPACE12_tree = (CommonTree)adaptor.dupNode(NAMESPACE12);


			root_1 = (CommonTree)adaptor.becomeRoot(NAMESPACE12_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			k=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace303); 
			k_tree = (CommonTree)adaptor.dupNode(k);


			adaptor.addChild(root_1, k_tree);

			// com/facebook/swift/parser/antlr/DocumentGenerator.g:71:32: (v= IDENTIFIER |v= LITERAL )
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
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:71:33: v= IDENTIFIER
					{
					_last = (CommonTree)input.LT(1);
					v=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_namespace308); 
					v_tree = (CommonTree)adaptor.dupNode(v);


					adaptor.addChild(root_1, v_tree);

					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:71:48: v= LITERAL
					{
					_last = (CommonTree)input.LT(1);
					v=(CommonTree)match(input,LITERAL,FOLLOW_LITERAL_in_namespace314); 
					v_tree = (CommonTree)adaptor.dupNode(v);


					adaptor.addChild(root_1, v_tree);

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.language = (k!=null?k.getText():null) ; retval.value = (v!=null?v.getText():null); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namespace"


	public static class cpp_include_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cpp_include"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:74:1: cpp_include returns [String value] : ^( CPP_INCLUDE LITERAL ) ;
	public final DocumentGenerator.cpp_include_return cpp_include() throws RecognitionException {
		DocumentGenerator.cpp_include_return retval = new DocumentGenerator.cpp_include_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree CPP_INCLUDE13=null;
		CommonTree LITERAL14=null;

		CommonTree CPP_INCLUDE13_tree=null;
		CommonTree LITERAL14_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:75:5: ( ^( CPP_INCLUDE LITERAL ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:75:7: ^( CPP_INCLUDE LITERAL )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			CPP_INCLUDE13=(CommonTree)match(input,CPP_INCLUDE,FOLLOW_CPP_INCLUDE_in_cpp_include340); 
			CPP_INCLUDE13_tree = (CommonTree)adaptor.dupNode(CPP_INCLUDE13);


			root_1 = (CommonTree)adaptor.becomeRoot(CPP_INCLUDE13_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			LITERAL14=(CommonTree)match(input,LITERAL,FOLLOW_LITERAL_in_cpp_include342); 
			LITERAL14_tree = (CommonTree)adaptor.dupNode(LITERAL14);


			adaptor.addChild(root_1, LITERAL14_tree);

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.value = (LITERAL14!=null?LITERAL14.getText():null); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cpp_include"


	public static class definitions_return extends TreeRuleReturnScope {
		public List<Definition> value = new ArrayList<>();
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "definitions"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:79:1: definitions returns [List<Definition> value = new ArrayList<>()] : ( definition )* ;
	public final DocumentGenerator.definitions_return definitions() throws RecognitionException {
		DocumentGenerator.definitions_return retval = new DocumentGenerator.definitions_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope definition15 =null;


		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:80:5: ( ( definition )* )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:80:7: ( definition )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// com/facebook/swift/parser/antlr/DocumentGenerator.g:80:7: ( definition )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CONST||(LA5_0 >= ENUM && LA5_0 <= EXCEPTION)||(LA5_0 >= SENUM && LA5_0 <= SERVICE)||LA5_0==STRUCT||LA5_0==TYPEDEF||LA5_0==UNION) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:80:9: definition
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_definition_in_definitions369);
					definition15=definition();
					state._fsp--;

					adaptor.addChild(root_0, definition15.getTree());

					 retval.value.add((definition15!=null?((DocumentGenerator.definition_return)definition15).value:null)); 
					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definitions"


	public static class definition_return extends TreeRuleReturnScope {
		public Definition value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:83:1: definition returns [Definition value] : ( const_rule | typedef | enum_rule | senum | struct | union | exception | service );
	public final DocumentGenerator.definition_return definition() throws RecognitionException {
		DocumentGenerator.definition_return retval = new DocumentGenerator.definition_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope const_rule16 =null;
		TreeRuleReturnScope typedef17 =null;
		TreeRuleReturnScope enum_rule18 =null;
		TreeRuleReturnScope senum19 =null;
		TreeRuleReturnScope struct20 =null;
		TreeRuleReturnScope union21 =null;
		TreeRuleReturnScope exception22 =null;
		TreeRuleReturnScope service23 =null;


		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:84:5: ( const_rule | typedef | enum_rule | senum | struct | union | exception | service )
			int alt6=8;
			switch ( input.LA(1) ) {
			case CONST:
				{
				alt6=1;
				}
				break;
			case TYPEDEF:
				{
				alt6=2;
				}
				break;
			case ENUM:
				{
				alt6=3;
				}
				break;
			case SENUM:
				{
				alt6=4;
				}
				break;
			case STRUCT:
				{
				alt6=5;
				}
				break;
			case UNION:
				{
				alt6=6;
				}
				break;
			case EXCEPTION:
				{
				alt6=7;
				}
				break;
			case SERVICE:
				{
				alt6=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:84:7: const_rule
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_const_rule_in_definition395);
					const_rule16=const_rule();
					state._fsp--;

					adaptor.addChild(root_0, const_rule16.getTree());

					 retval.value = (const_rule16!=null?((DocumentGenerator.const_rule_return)const_rule16).value:null); 
					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:85:7: typedef
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_typedef_in_definition405);
					typedef17=typedef();
					state._fsp--;

					adaptor.addChild(root_0, typedef17.getTree());

					 retval.value = (typedef17!=null?((DocumentGenerator.typedef_return)typedef17).value:null); 
					}
					break;
				case 3 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:86:7: enum_rule
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_enum_rule_in_definition418);
					enum_rule18=enum_rule();
					state._fsp--;

					adaptor.addChild(root_0, enum_rule18.getTree());

					 retval.value = (enum_rule18!=null?((DocumentGenerator.enum_rule_return)enum_rule18).value:null); 
					}
					break;
				case 4 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:87:7: senum
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_senum_in_definition429);
					senum19=senum();
					state._fsp--;

					adaptor.addChild(root_0, senum19.getTree());

					 retval.value = (senum19!=null?((DocumentGenerator.senum_return)senum19).value:null); 
					}
					break;
				case 5 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:88:7: struct
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_struct_in_definition444);
					struct20=struct();
					state._fsp--;

					adaptor.addChild(root_0, struct20.getTree());

					 retval.value = (struct20!=null?((DocumentGenerator.struct_return)struct20).value:null); 
					}
					break;
				case 6 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:89:7: union
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_union_in_definition458);
					union21=union();
					state._fsp--;

					adaptor.addChild(root_0, union21.getTree());

					 retval.value = (union21!=null?((DocumentGenerator.union_return)union21).value:null); 
					}
					break;
				case 7 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:90:7: exception
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_exception_in_definition473);
					exception22=exception();
					state._fsp--;

					adaptor.addChild(root_0, exception22.getTree());

					 retval.value = (exception22!=null?((DocumentGenerator.exception_return)exception22).value:null); 
					}
					break;
				case 8 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:91:7: service
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_service_in_definition484);
					service23=service();
					state._fsp--;

					adaptor.addChild(root_0, service23.getTree());

					 retval.value = (service23!=null?((DocumentGenerator.service_return)service23).value:null); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class const_rule_return extends TreeRuleReturnScope {
		public Const value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "const_rule"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:94:1: const_rule returns [Const value] : ^( CONST k= IDENTIFIER t= field_type v= const_value ) ;
	public final DocumentGenerator.const_rule_return const_rule() throws RecognitionException {
		DocumentGenerator.const_rule_return retval = new DocumentGenerator.const_rule_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree k=null;
		CommonTree CONST24=null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope v =null;

		CommonTree k_tree=null;
		CommonTree CONST24_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:95:5: ( ^( CONST k= IDENTIFIER t= field_type v= const_value ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:95:7: ^( CONST k= IDENTIFIER t= field_type v= const_value )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			CONST24=(CommonTree)match(input,CONST,FOLLOW_CONST_in_const_rule511); 
			CONST24_tree = (CommonTree)adaptor.dupNode(CONST24);


			root_1 = (CommonTree)adaptor.becomeRoot(CONST24_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			k=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_const_rule515); 
			k_tree = (CommonTree)adaptor.dupNode(k);


			adaptor.addChild(root_1, k_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_field_type_in_const_rule519);
			t=field_type();
			state._fsp--;

			adaptor.addChild(root_1, t.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_const_value_in_const_rule523);
			v=const_value();
			state._fsp--;

			adaptor.addChild(root_1, v.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.value = new Const((k!=null?k.getText():null), (t!=null?((DocumentGenerator.field_type_return)t).value:null), (v!=null?((DocumentGenerator.const_value_return)v).value:null)); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "const_rule"


	public static class typedef_return extends TreeRuleReturnScope {
		public Typedef value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "typedef"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:98:1: typedef returns [Typedef value] : ^( TYPEDEF k= IDENTIFIER t= field_type ) ;
	public final DocumentGenerator.typedef_return typedef() throws RecognitionException {
		DocumentGenerator.typedef_return retval = new DocumentGenerator.typedef_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree k=null;
		CommonTree TYPEDEF25=null;
		TreeRuleReturnScope t =null;

		CommonTree k_tree=null;
		CommonTree TYPEDEF25_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:99:5: ( ^( TYPEDEF k= IDENTIFIER t= field_type ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:99:7: ^( TYPEDEF k= IDENTIFIER t= field_type )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			TYPEDEF25=(CommonTree)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedef548); 
			TYPEDEF25_tree = (CommonTree)adaptor.dupNode(TYPEDEF25);


			root_1 = (CommonTree)adaptor.becomeRoot(TYPEDEF25_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			k=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedef552); 
			k_tree = (CommonTree)adaptor.dupNode(k);


			adaptor.addChild(root_1, k_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_field_type_in_typedef556);
			t=field_type();
			state._fsp--;

			adaptor.addChild(root_1, t.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.value = new Typedef((k!=null?k.getText():null), (t!=null?((DocumentGenerator.field_type_return)t).value:null)); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typedef"


	public static class enum_rule_return extends TreeRuleReturnScope {
		public IntegerEnum value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enum_rule"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:102:1: enum_rule returns [IntegerEnum value] : ^( ENUM k= IDENTIFIER v= enum_fields ) ;
	public final DocumentGenerator.enum_rule_return enum_rule() throws RecognitionException {
		DocumentGenerator.enum_rule_return retval = new DocumentGenerator.enum_rule_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree k=null;
		CommonTree ENUM26=null;
		TreeRuleReturnScope v =null;

		CommonTree k_tree=null;
		CommonTree ENUM26_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:103:5: ( ^( ENUM k= IDENTIFIER v= enum_fields ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:103:7: ^( ENUM k= IDENTIFIER v= enum_fields )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			ENUM26=(CommonTree)match(input,ENUM,FOLLOW_ENUM_in_enum_rule581); 
			ENUM26_tree = (CommonTree)adaptor.dupNode(ENUM26);


			root_1 = (CommonTree)adaptor.becomeRoot(ENUM26_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			k=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_rule585); 
			k_tree = (CommonTree)adaptor.dupNode(k);


			adaptor.addChild(root_1, k_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_enum_fields_in_enum_rule589);
			v=enum_fields();
			state._fsp--;

			adaptor.addChild(root_1, v.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.value = new IntegerEnum((k!=null?k.getText():null), (v!=null?((DocumentGenerator.enum_fields_return)v).value:null)); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enum_rule"


	public static class senum_return extends TreeRuleReturnScope {
		public StringEnum value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "senum"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:106:1: senum returns [StringEnum value] : ^( SENUM k= IDENTIFIER v= senum_values ) ;
	public final DocumentGenerator.senum_return senum() throws RecognitionException {
		DocumentGenerator.senum_return retval = new DocumentGenerator.senum_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree k=null;
		CommonTree SENUM27=null;
		TreeRuleReturnScope v =null;

		CommonTree k_tree=null;
		CommonTree SENUM27_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:107:5: ( ^( SENUM k= IDENTIFIER v= senum_values ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:107:7: ^( SENUM k= IDENTIFIER v= senum_values )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			SENUM27=(CommonTree)match(input,SENUM,FOLLOW_SENUM_in_senum614); 
			SENUM27_tree = (CommonTree)adaptor.dupNode(SENUM27);


			root_1 = (CommonTree)adaptor.becomeRoot(SENUM27_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			k=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_senum618); 
			k_tree = (CommonTree)adaptor.dupNode(k);


			adaptor.addChild(root_1, k_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_senum_values_in_senum622);
			v=senum_values();
			state._fsp--;

			adaptor.addChild(root_1, v.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.value = new StringEnum((k!=null?k.getText():null), (v!=null?((DocumentGenerator.senum_values_return)v).value:null)); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "senum"


	public static class struct_return extends TreeRuleReturnScope {
		public Struct value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "struct"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:110:1: struct returns [Struct value] : ^( STRUCT k= IDENTIFIER f= fields t= type_annotations ) ;
	public final DocumentGenerator.struct_return struct() throws RecognitionException {
		DocumentGenerator.struct_return retval = new DocumentGenerator.struct_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree k=null;
		CommonTree STRUCT28=null;
		TreeRuleReturnScope f =null;
		TreeRuleReturnScope t =null;

		CommonTree k_tree=null;
		CommonTree STRUCT28_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:111:5: ( ^( STRUCT k= IDENTIFIER f= fields t= type_annotations ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:111:7: ^( STRUCT k= IDENTIFIER f= fields t= type_annotations )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			STRUCT28=(CommonTree)match(input,STRUCT,FOLLOW_STRUCT_in_struct647); 
			STRUCT28_tree = (CommonTree)adaptor.dupNode(STRUCT28);


			root_1 = (CommonTree)adaptor.becomeRoot(STRUCT28_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			k=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_struct651); 
			k_tree = (CommonTree)adaptor.dupNode(k);


			adaptor.addChild(root_1, k_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_fields_in_struct655);
			f=fields();
			state._fsp--;

			adaptor.addChild(root_1, f.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_type_annotations_in_struct659);
			t=type_annotations();
			state._fsp--;

			adaptor.addChild(root_1, t.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.value = new Struct((k!=null?k.getText():null), (f!=null?((DocumentGenerator.fields_return)f).value:null), (t!=null?((DocumentGenerator.type_annotations_return)t).value:null)); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "struct"


	public static class union_return extends TreeRuleReturnScope {
		public Union value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "union"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:114:1: union returns [Union value] : ^( UNION k= IDENTIFIER f= fields t= type_annotations ) ;
	public final DocumentGenerator.union_return union() throws RecognitionException {
		DocumentGenerator.union_return retval = new DocumentGenerator.union_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree k=null;
		CommonTree UNION29=null;
		TreeRuleReturnScope f =null;
		TreeRuleReturnScope t =null;

		CommonTree k_tree=null;
		CommonTree UNION29_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:115:5: ( ^( UNION k= IDENTIFIER f= fields t= type_annotations ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:115:7: ^( UNION k= IDENTIFIER f= fields t= type_annotations )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			UNION29=(CommonTree)match(input,UNION,FOLLOW_UNION_in_union684); 
			UNION29_tree = (CommonTree)adaptor.dupNode(UNION29);


			root_1 = (CommonTree)adaptor.becomeRoot(UNION29_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			k=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_union688); 
			k_tree = (CommonTree)adaptor.dupNode(k);


			adaptor.addChild(root_1, k_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_fields_in_union692);
			f=fields();
			state._fsp--;

			adaptor.addChild(root_1, f.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_type_annotations_in_union696);
			t=type_annotations();
			state._fsp--;

			adaptor.addChild(root_1, t.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.value = new Union((k!=null?k.getText():null), (f!=null?((DocumentGenerator.fields_return)f).value:null), (t!=null?((DocumentGenerator.type_annotations_return)t).value:null)); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "union"


	public static class exception_return extends TreeRuleReturnScope {
		public ThriftException value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exception"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:118:1: exception returns [ThriftException value] : ^( EXCEPTION k= IDENTIFIER f= fields t= type_annotations ) ;
	public final DocumentGenerator.exception_return exception() throws RecognitionException {
		DocumentGenerator.exception_return retval = new DocumentGenerator.exception_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree k=null;
		CommonTree EXCEPTION30=null;
		TreeRuleReturnScope f =null;
		TreeRuleReturnScope t =null;

		CommonTree k_tree=null;
		CommonTree EXCEPTION30_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:119:5: ( ^( EXCEPTION k= IDENTIFIER f= fields t= type_annotations ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:119:7: ^( EXCEPTION k= IDENTIFIER f= fields t= type_annotations )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			EXCEPTION30=(CommonTree)match(input,EXCEPTION,FOLLOW_EXCEPTION_in_exception721); 
			EXCEPTION30_tree = (CommonTree)adaptor.dupNode(EXCEPTION30);


			root_1 = (CommonTree)adaptor.becomeRoot(EXCEPTION30_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			k=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_exception725); 
			k_tree = (CommonTree)adaptor.dupNode(k);


			adaptor.addChild(root_1, k_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_fields_in_exception729);
			f=fields();
			state._fsp--;

			adaptor.addChild(root_1, f.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_type_annotations_in_exception733);
			t=type_annotations();
			state._fsp--;

			adaptor.addChild(root_1, t.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.value = new ThriftException((k!=null?k.getText():null), (f!=null?((DocumentGenerator.fields_return)f).value:null), (t!=null?((DocumentGenerator.type_annotations_return)t).value:null)); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exception"


	public static class service_return extends TreeRuleReturnScope {
		public Service value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "service"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:122:1: service returns [Service value] : ^( SERVICE k= IDENTIFIER ^( EXTENDS (e= IDENTIFIER )? ) f= functions t= type_annotations ) ;
	public final DocumentGenerator.service_return service() throws RecognitionException {
		DocumentGenerator.service_return retval = new DocumentGenerator.service_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree k=null;
		CommonTree e=null;
		CommonTree SERVICE31=null;
		CommonTree EXTENDS32=null;
		TreeRuleReturnScope f =null;
		TreeRuleReturnScope t =null;

		CommonTree k_tree=null;
		CommonTree e_tree=null;
		CommonTree SERVICE31_tree=null;
		CommonTree EXTENDS32_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:123:5: ( ^( SERVICE k= IDENTIFIER ^( EXTENDS (e= IDENTIFIER )? ) f= functions t= type_annotations ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:123:7: ^( SERVICE k= IDENTIFIER ^( EXTENDS (e= IDENTIFIER )? ) f= functions t= type_annotations )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			SERVICE31=(CommonTree)match(input,SERVICE,FOLLOW_SERVICE_in_service758); 
			SERVICE31_tree = (CommonTree)adaptor.dupNode(SERVICE31);


			root_1 = (CommonTree)adaptor.becomeRoot(SERVICE31_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			k=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_service762); 
			k_tree = (CommonTree)adaptor.dupNode(k);


			adaptor.addChild(root_1, k_tree);

			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_2 = _last;
			CommonTree _first_2 = null;
			CommonTree root_2 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			EXTENDS32=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_service765); 
			EXTENDS32_tree = (CommonTree)adaptor.dupNode(EXTENDS32);


			root_2 = (CommonTree)adaptor.becomeRoot(EXTENDS32_tree, root_2);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// com/facebook/swift/parser/antlr/DocumentGenerator.g:123:41: (e= IDENTIFIER )?
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==IDENTIFIER) ) {
					alt7=1;
				}
				switch (alt7) {
					case 1 :
						// com/facebook/swift/parser/antlr/DocumentGenerator.g:123:41: e= IDENTIFIER
						{
						_last = (CommonTree)input.LT(1);
						e=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_service769); 
						e_tree = (CommonTree)adaptor.dupNode(e);


						adaptor.addChild(root_2, e_tree);

						}
						break;

				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_1, root_2);
			_last = _save_last_2;
			}


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_functions_in_service775);
			f=functions();
			state._fsp--;

			adaptor.addChild(root_1, f.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_type_annotations_in_service779);
			t=type_annotations();
			state._fsp--;

			adaptor.addChild(root_1, t.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.value = new Service((k!=null?k.getText():null), (e!=null?e.getText():null), (f!=null?((DocumentGenerator.functions_return)f).value:null), (t!=null?((DocumentGenerator.type_annotations_return)t).value:null)); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "service"


	public static class const_value_return extends TreeRuleReturnScope {
		public ConstValue value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "const_value"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:127:1: const_value returns [ConstValue value] : (i= integer |d= DOUBLE |s= LITERAL |s= IDENTIFIER |l= const_list |m= const_map );
	public final DocumentGenerator.const_value_return const_value() throws RecognitionException {
		DocumentGenerator.const_value_return retval = new DocumentGenerator.const_value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree d=null;
		CommonTree s=null;
		TreeRuleReturnScope i =null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope m =null;

		CommonTree d_tree=null;
		CommonTree s_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:128:5: (i= integer |d= DOUBLE |s= LITERAL |s= IDENTIFIER |l= const_list |m= const_map )
			int alt8=6;
			switch ( input.LA(1) ) {
			case HEX_INTEGER:
			case INTEGER:
				{
				alt8=1;
				}
				break;
			case DOUBLE:
				{
				alt8=2;
				}
				break;
			case LITERAL:
				{
				alt8=3;
				}
				break;
			case IDENTIFIER:
				{
				alt8=4;
				}
				break;
			case LIST:
				{
				alt8=5;
				}
				break;
			case MAP:
				{
				alt8=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:128:7: i= integer
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_integer_in_const_value806);
					i=integer();
					state._fsp--;

					adaptor.addChild(root_0, i.getTree());

					 retval.value = new ConstInteger((i!=null?((DocumentGenerator.integer_return)i).value:null)); 
					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:129:7: d= DOUBLE
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					d=(CommonTree)match(input,DOUBLE,FOLLOW_DOUBLE_in_const_value822); 
					d_tree = (CommonTree)adaptor.dupNode(d);


					adaptor.addChild(root_0, d_tree);

					 retval.value = new ConstDouble(Double.parseDouble((d!=null?d.getText():null))); 
					}
					break;
				case 3 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:130:7: s= LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					s=(CommonTree)match(input,LITERAL,FOLLOW_LITERAL_in_const_value839); 
					s_tree = (CommonTree)adaptor.dupNode(s);


					adaptor.addChild(root_0, s_tree);

					 retval.value = new ConstString((s!=null?s.getText():null)); 
					}
					break;
				case 4 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:131:7: s= IDENTIFIER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					s=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_const_value855); 
					s_tree = (CommonTree)adaptor.dupNode(s);


					adaptor.addChild(root_0, s_tree);

					 retval.value = new ConstIdentifier((s!=null?s.getText():null)); 
					}
					break;
				case 5 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:132:7: l= const_list
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_const_list_in_const_value868);
					l=const_list();
					state._fsp--;

					adaptor.addChild(root_0, l.getTree());

					 retval.value = new ConstList((l!=null?((DocumentGenerator.const_list_return)l).value:null)); 
					}
					break;
				case 6 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:133:7: m= const_map
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_const_map_in_const_value881);
					m=const_map();
					state._fsp--;

					adaptor.addChild(root_0, m.getTree());

					 retval.value = new ConstMap((m!=null?((DocumentGenerator.const_map_return)m).value:null)); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "const_value"


	public static class const_list_return extends TreeRuleReturnScope {
		public List<ConstValue> value = new ArrayList<>();
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "const_list"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:136:1: const_list returns [List<ConstValue> value = new ArrayList<>()] : ^( LIST (v= const_value )* ) ;
	public final DocumentGenerator.const_list_return const_list() throws RecognitionException {
		DocumentGenerator.const_list_return retval = new DocumentGenerator.const_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree LIST33=null;
		TreeRuleReturnScope v =null;

		CommonTree LIST33_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:137:5: ( ^( LIST (v= const_value )* ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:137:7: ^( LIST (v= const_value )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			LIST33=(CommonTree)match(input,LIST,FOLLOW_LIST_in_const_list907); 
			LIST33_tree = (CommonTree)adaptor.dupNode(LIST33);


			root_1 = (CommonTree)adaptor.becomeRoot(LIST33_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// com/facebook/swift/parser/antlr/DocumentGenerator.g:137:14: (v= const_value )*
				loop9:
				while (true) {
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==DOUBLE||(LA9_0 >= HEX_INTEGER && LA9_0 <= IDENTIFIER)||LA9_0==INTEGER||(LA9_0 >= LIST && LA9_0 <= MAP)) ) {
						alt9=1;
					}

					switch (alt9) {
					case 1 :
						// com/facebook/swift/parser/antlr/DocumentGenerator.g:137:16: v= const_value
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_const_value_in_const_list913);
						v=const_value();
						state._fsp--;

						adaptor.addChild(root_1, v.getTree());

						 retval.value.add((v!=null?((DocumentGenerator.const_value_return)v).value:null)); 
						}
						break;

					default :
						break loop9;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "const_list"


	public static class const_map_return extends TreeRuleReturnScope {
		public Map<ConstValue, ConstValue> value = new HashMap<>();
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "const_map"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:140:1: const_map returns [Map<ConstValue, ConstValue> value = new HashMap<>()] : ^( MAP (e= const_map_entry )* ) ;
	public final DocumentGenerator.const_map_return const_map() throws RecognitionException {
		DocumentGenerator.const_map_return retval = new DocumentGenerator.const_map_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree MAP34=null;
		TreeRuleReturnScope e =null;

		CommonTree MAP34_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:141:5: ( ^( MAP (e= const_map_entry )* ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:141:7: ^( MAP (e= const_map_entry )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			MAP34=(CommonTree)match(input,MAP,FOLLOW_MAP_in_const_map941); 
			MAP34_tree = (CommonTree)adaptor.dupNode(MAP34);


			root_1 = (CommonTree)adaptor.becomeRoot(MAP34_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// com/facebook/swift/parser/antlr/DocumentGenerator.g:141:13: (e= const_map_entry )*
				loop10:
				while (true) {
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==ENTRY) ) {
						alt10=1;
					}

					switch (alt10) {
					case 1 :
						// com/facebook/swift/parser/antlr/DocumentGenerator.g:141:15: e= const_map_entry
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_const_map_entry_in_const_map947);
						e=const_map_entry();
						state._fsp--;

						adaptor.addChild(root_1, e.getTree());

						 retval.value.put((e!=null?((DocumentGenerator.const_map_entry_return)e).value:null).getKey(), (e!=null?((DocumentGenerator.const_map_entry_return)e).value:null).getValue()); 
						}
						break;

					default :
						break loop10;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "const_map"


	public static class const_map_entry_return extends TreeRuleReturnScope {
		public Map.Entry<ConstValue, ConstValue> value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "const_map_entry"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:144:1: const_map_entry returns [Map.Entry<ConstValue, ConstValue> value] : ^( ENTRY k= const_value v= const_value ) ;
	public final DocumentGenerator.const_map_entry_return const_map_entry() throws RecognitionException {
		DocumentGenerator.const_map_entry_return retval = new DocumentGenerator.const_map_entry_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ENTRY35=null;
		TreeRuleReturnScope k =null;
		TreeRuleReturnScope v =null;

		CommonTree ENTRY35_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:145:5: ( ^( ENTRY k= const_value v= const_value ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:145:7: ^( ENTRY k= const_value v= const_value )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			ENTRY35=(CommonTree)match(input,ENTRY,FOLLOW_ENTRY_in_const_map_entry976); 
			ENTRY35_tree = (CommonTree)adaptor.dupNode(ENTRY35);


			root_1 = (CommonTree)adaptor.becomeRoot(ENTRY35_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_const_value_in_const_map_entry980);
			k=const_value();
			state._fsp--;

			adaptor.addChild(root_1, k.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_const_value_in_const_map_entry984);
			v=const_value();
			state._fsp--;

			adaptor.addChild(root_1, v.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			        retval.value = new AbstractMap.SimpleImmutableEntry<ConstValue, ConstValue>((k!=null?((DocumentGenerator.const_value_return)k).value:null), (v!=null?((DocumentGenerator.const_value_return)v).value:null));
			    
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "const_map_entry"


	public static class enum_fields_return extends TreeRuleReturnScope {
		public IntegerEnumFieldList value = new IntegerEnumFieldList();
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enum_fields"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:150:1: enum_fields returns [IntegerEnumFieldList value = new IntegerEnumFieldList()] : ( enum_field[$value] )* ;
	public final DocumentGenerator.enum_fields_return enum_fields() throws RecognitionException {
		DocumentGenerator.enum_fields_return retval = new DocumentGenerator.enum_fields_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope enum_field36 =null;


		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:151:5: ( ( enum_field[$value] )* )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:151:7: ( enum_field[$value] )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// com/facebook/swift/parser/antlr/DocumentGenerator.g:151:7: ( enum_field[$value] )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==IDENTIFIER) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:151:9: enum_field[$value]
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_enum_field_in_enum_fields1010);
					enum_field36=enum_field(retval.value);
					state._fsp--;

					adaptor.addChild(root_0, enum_field36.getTree());

					 retval.value.add((enum_field36!=null?((DocumentGenerator.enum_field_return)enum_field36).value:null)); 
					}
					break;

				default :
					break loop11;
				}
			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enum_fields"


	public static class enum_field_return extends TreeRuleReturnScope {
		public IntegerEnumField value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enum_field"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:154:1: enum_field[IntegerEnumFieldList fieldList] returns [IntegerEnumField value] : ^(k= IDENTIFIER (v= integer )? ) ;
	public final DocumentGenerator.enum_field_return enum_field(IntegerEnumFieldList fieldList) throws RecognitionException {
		DocumentGenerator.enum_field_return retval = new DocumentGenerator.enum_field_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree k=null;
		TreeRuleReturnScope v =null;

		CommonTree k_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:155:5: ( ^(k= IDENTIFIER (v= integer )? ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:155:7: ^(k= IDENTIFIER (v= integer )? )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			k=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_field1041); 
			k_tree = (CommonTree)adaptor.dupNode(k);


			root_1 = (CommonTree)adaptor.becomeRoot(k_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// com/facebook/swift/parser/antlr/DocumentGenerator.g:155:23: (v= integer )?
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==HEX_INTEGER||LA12_0==INTEGER) ) {
					alt12=1;
				}
				switch (alt12) {
					case 1 :
						// com/facebook/swift/parser/antlr/DocumentGenerator.g:155:23: v= integer
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_integer_in_enum_field1045);
						v=integer();
						state._fsp--;

						adaptor.addChild(root_1, v.getTree());

						}
						break;

				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			         retval.value = new IntegerEnumField((k!=null?k.getText():null), (v!=null?((DocumentGenerator.integer_return)v).value:null), fieldList.getNextImplicitEnumerationValue());
			    
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enum_field"


	public static class senum_values_return extends TreeRuleReturnScope {
		public List<String> value = new ArrayList<>();
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "senum_values"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:160:1: senum_values returns [List<String> value = new ArrayList<>()] : (v= LITERAL )* ;
	public final DocumentGenerator.senum_values_return senum_values() throws RecognitionException {
		DocumentGenerator.senum_values_return retval = new DocumentGenerator.senum_values_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree v=null;

		CommonTree v_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:161:5: ( (v= LITERAL )* )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:161:7: (v= LITERAL )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// com/facebook/swift/parser/antlr/DocumentGenerator.g:161:7: (v= LITERAL )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==LITERAL) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:161:9: v= LITERAL
					{
					_last = (CommonTree)input.LT(1);
					v=(CommonTree)match(input,LITERAL,FOLLOW_LITERAL_in_senum_values1074); 
					v_tree = (CommonTree)adaptor.dupNode(v);


					adaptor.addChild(root_0, v_tree);

					 retval.value.add((v!=null?v.getText():null)); 
					}
					break;

				default :
					break loop13;
				}
			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "senum_values"


	public static class fields_return extends TreeRuleReturnScope {
		public List<ThriftField> value = new ArrayList<>();
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fields"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:164:1: fields returns [List<ThriftField> value = new ArrayList<>()] : ( field )* ;
	public final DocumentGenerator.fields_return fields() throws RecognitionException {
		DocumentGenerator.fields_return retval = new DocumentGenerator.fields_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope field37 =null;


		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:165:5: ( ( field )* )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:165:7: ( field )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// com/facebook/swift/parser/antlr/DocumentGenerator.g:165:7: ( field )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==FIELD) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:165:9: field
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_field_in_fields1102);
					field37=field();
					state._fsp--;

					adaptor.addChild(root_0, field37.getTree());

					 retval.value.add((field37!=null?((DocumentGenerator.field_return)field37).value:null)); 
					}
					break;

				default :
					break loop14;
				}
			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fields"


	public static class functions_return extends TreeRuleReturnScope {
		public List<ThriftMethod> value = new ArrayList<>();
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "functions"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:168:1: functions returns [List<ThriftMethod> value = new ArrayList<>()] : ( function )* ;
	public final DocumentGenerator.functions_return functions() throws RecognitionException {
		DocumentGenerator.functions_return retval = new DocumentGenerator.functions_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope function38 =null;


		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:169:5: ( ( function )* )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:169:7: ( function )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// com/facebook/swift/parser/antlr/DocumentGenerator.g:169:7: ( function )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==METHOD) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:169:8: function
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_function_in_functions1129);
					function38=function();
					state._fsp--;

					adaptor.addChild(root_0, function38.getTree());

					 retval.value.add((function38!=null?((DocumentGenerator.function_return)function38).value:null)); 
					}
					break;

				default :
					break loop15;
				}
			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functions"


	public static class field_return extends TreeRuleReturnScope {
		public ThriftField value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "field"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:173:1: field returns [ThriftField value] : ^( FIELD k= IDENTIFIER t= field_type (i= integer )? r= field_req (c= const_value )? a= type_annotations ) ;
	public final DocumentGenerator.field_return field() throws RecognitionException {
		DocumentGenerator.field_return retval = new DocumentGenerator.field_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree k=null;
		CommonTree FIELD39=null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope i =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope c =null;
		TreeRuleReturnScope a =null;

		CommonTree k_tree=null;
		CommonTree FIELD39_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:174:5: ( ^( FIELD k= IDENTIFIER t= field_type (i= integer )? r= field_req (c= const_value )? a= type_annotations ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:174:7: ^( FIELD k= IDENTIFIER t= field_type (i= integer )? r= field_req (c= const_value )? a= type_annotations )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			FIELD39=(CommonTree)match(input,FIELD,FOLLOW_FIELD_in_field1157); 
			FIELD39_tree = (CommonTree)adaptor.dupNode(FIELD39);


			root_1 = (CommonTree)adaptor.becomeRoot(FIELD39_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			k=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field1161); 
			k_tree = (CommonTree)adaptor.dupNode(k);


			adaptor.addChild(root_1, k_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_field_type_in_field1165);
			t=field_type();
			state._fsp--;

			adaptor.addChild(root_1, t.getTree());

			// com/facebook/swift/parser/antlr/DocumentGenerator.g:174:42: (i= integer )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==HEX_INTEGER||LA16_0==INTEGER) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:174:42: i= integer
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_integer_in_field1169);
					i=integer();
					state._fsp--;

					adaptor.addChild(root_1, i.getTree());

					}
					break;

			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_field_req_in_field1174);
			r=field_req();
			state._fsp--;

			adaptor.addChild(root_1, r.getTree());

			// com/facebook/swift/parser/antlr/DocumentGenerator.g:174:65: (c= const_value )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==DOUBLE||(LA17_0 >= HEX_INTEGER && LA17_0 <= IDENTIFIER)||LA17_0==INTEGER||(LA17_0 >= LIST && LA17_0 <= MAP)) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:174:65: c= const_value
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_const_value_in_field1178);
					c=const_value();
					state._fsp--;

					adaptor.addChild(root_1, c.getTree());

					}
					break;

			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_type_annotations_in_field1183);
			a=type_annotations();
			state._fsp--;

			adaptor.addChild(root_1, a.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.value = new ThriftField((k!=null?k.getText():null), (t!=null?((DocumentGenerator.field_type_return)t).value:null), (i!=null?((DocumentGenerator.integer_return)i).value:null), (r!=null?((DocumentGenerator.field_req_return)r).value:null), (c!=null?((DocumentGenerator.const_value_return)c).value:null), (a!=null?((DocumentGenerator.type_annotations_return)a).value:null)); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field"


	public static class field_req_return extends TreeRuleReturnScope {
		public ThriftField.Requiredness value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "field_req"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:178:1: field_req returns [ThriftField.Requiredness value] : ( REQUIREDNESS | ^( REQUIREDNESS REQUIRED ) | ^( REQUIREDNESS OPTIONAL ) );
	public final DocumentGenerator.field_req_return field_req() throws RecognitionException {
		DocumentGenerator.field_req_return retval = new DocumentGenerator.field_req_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree REQUIREDNESS40=null;
		CommonTree REQUIREDNESS41=null;
		CommonTree REQUIRED42=null;
		CommonTree REQUIREDNESS43=null;
		CommonTree OPTIONAL44=null;

		CommonTree REQUIREDNESS40_tree=null;
		CommonTree REQUIREDNESS41_tree=null;
		CommonTree REQUIRED42_tree=null;
		CommonTree REQUIREDNESS43_tree=null;
		CommonTree OPTIONAL44_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:179:5: ( REQUIREDNESS | ^( REQUIREDNESS REQUIRED ) | ^( REQUIREDNESS OPTIONAL ) )
			int alt18=3;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==REQUIREDNESS) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==DOWN) ) {
					int LA18_2 = input.LA(3);
					if ( (LA18_2==REQUIRED) ) {
						alt18=2;
					}
					else if ( (LA18_2==OPTIONAL) ) {
						alt18=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 18, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA18_1==UP||LA18_1==DOUBLE||(LA18_1 >= HEX_INTEGER && LA18_1 <= IDENTIFIER)||LA18_1==INTEGER||(LA18_1 >= LIST && LA18_1 <= MAP)||LA18_1==TYPES) ) {
					alt18=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:179:7: REQUIREDNESS
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					REQUIREDNESS40=(CommonTree)match(input,REQUIREDNESS,FOLLOW_REQUIREDNESS_in_field_req1215); 
					REQUIREDNESS40_tree = (CommonTree)adaptor.dupNode(REQUIREDNESS40);


					adaptor.addChild(root_0, REQUIREDNESS40_tree);

					 retval.value = ThriftField.Requiredness.NONE; 
					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:180:7: ^( REQUIREDNESS REQUIRED )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					REQUIREDNESS41=(CommonTree)match(input,REQUIREDNESS,FOLLOW_REQUIREDNESS_in_field_req1238); 
					REQUIREDNESS41_tree = (CommonTree)adaptor.dupNode(REQUIREDNESS41);


					root_1 = (CommonTree)adaptor.becomeRoot(REQUIREDNESS41_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					REQUIRED42=(CommonTree)match(input,REQUIRED,FOLLOW_REQUIRED_in_field_req1240); 
					REQUIRED42_tree = (CommonTree)adaptor.dupNode(REQUIRED42);


					adaptor.addChild(root_1, REQUIRED42_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 retval.value = ThriftField.Requiredness.REQUIRED; 
					}
					break;
				case 3 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:181:7: ^( REQUIREDNESS OPTIONAL )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					REQUIREDNESS43=(CommonTree)match(input,REQUIREDNESS,FOLLOW_REQUIREDNESS_in_field_req1252); 
					REQUIREDNESS43_tree = (CommonTree)adaptor.dupNode(REQUIREDNESS43);


					root_1 = (CommonTree)adaptor.becomeRoot(REQUIREDNESS43_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					OPTIONAL44=(CommonTree)match(input,OPTIONAL,FOLLOW_OPTIONAL_in_field_req1254); 
					OPTIONAL44_tree = (CommonTree)adaptor.dupNode(OPTIONAL44);


					adaptor.addChild(root_1, OPTIONAL44_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 retval.value = ThriftField.Requiredness.OPTIONAL; 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field_req"


	public static class function_return extends TreeRuleReturnScope {
		public ThriftMethod value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:185:1: function returns [ThriftMethod value] : ^( METHOD k= IDENTIFIER t= function_type f= args o= oneway r= throws_list a= type_annotations ) ;
	public final DocumentGenerator.function_return function() throws RecognitionException {
		DocumentGenerator.function_return retval = new DocumentGenerator.function_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree k=null;
		CommonTree METHOD45=null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope f =null;
		TreeRuleReturnScope o =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope a =null;

		CommonTree k_tree=null;
		CommonTree METHOD45_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:186:5: ( ^( METHOD k= IDENTIFIER t= function_type f= args o= oneway r= throws_list a= type_annotations ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:186:7: ^( METHOD k= IDENTIFIER t= function_type f= args o= oneway r= throws_list a= type_annotations )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			METHOD45=(CommonTree)match(input,METHOD,FOLLOW_METHOD_in_function1280); 
			METHOD45_tree = (CommonTree)adaptor.dupNode(METHOD45);


			root_1 = (CommonTree)adaptor.becomeRoot(METHOD45_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			k=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function1284); 
			k_tree = (CommonTree)adaptor.dupNode(k);


			adaptor.addChild(root_1, k_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_function_type_in_function1288);
			t=function_type();
			state._fsp--;

			adaptor.addChild(root_1, t.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_args_in_function1292);
			f=args();
			state._fsp--;

			adaptor.addChild(root_1, f.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_oneway_in_function1296);
			o=oneway();
			state._fsp--;

			adaptor.addChild(root_1, o.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_throws_list_in_function1300);
			r=throws_list();
			state._fsp--;

			adaptor.addChild(root_1, r.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_type_annotations_in_function1304);
			a=type_annotations();
			state._fsp--;

			adaptor.addChild(root_1, a.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.value = new ThriftMethod((k!=null?k.getText():null), (t!=null?((DocumentGenerator.function_type_return)t).value:null), (f!=null?((DocumentGenerator.args_return)f).value:null), (o!=null?((DocumentGenerator.oneway_return)o).value:false), (r!=null?((DocumentGenerator.throws_list_return)r).value:null), (a!=null?((DocumentGenerator.type_annotations_return)a).value:null)); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class args_return extends TreeRuleReturnScope {
		public List<ThriftField> value = new ArrayList<>();
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "args"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:190:1: args returns [List<ThriftField> value = new ArrayList<>()] : ( ARGS | ^( ARGS f= fields ) );
	public final DocumentGenerator.args_return args() throws RecognitionException {
		DocumentGenerator.args_return retval = new DocumentGenerator.args_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ARGS46=null;
		CommonTree ARGS47=null;
		TreeRuleReturnScope f =null;

		CommonTree ARGS46_tree=null;
		CommonTree ARGS47_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:191:5: ( ARGS | ^( ARGS f= fields ) )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==ARGS) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==DOWN) ) {
					alt19=2;
				}
				else if ( (LA19_1==UP||LA19_1==ONEWAY||LA19_1==THROWS||LA19_1==TYPES) ) {
					alt19=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:191:7: ARGS
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					ARGS46=(CommonTree)match(input,ARGS,FOLLOW_ARGS_in_args1336); 
					ARGS46_tree = (CommonTree)adaptor.dupNode(ARGS46);


					adaptor.addChild(root_0, ARGS46_tree);

					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:192:7: ^( ARGS f= fields )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ARGS47=(CommonTree)match(input,ARGS,FOLLOW_ARGS_in_args1345); 
					ARGS47_tree = (CommonTree)adaptor.dupNode(ARGS47);


					root_1 = (CommonTree)adaptor.becomeRoot(ARGS47_tree, root_1);

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_fields_in_args1349);
						f=fields();
						state._fsp--;

						adaptor.addChild(root_1, f.getTree());

						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 retval.value = (f!=null?((DocumentGenerator.fields_return)f).value:null); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "args"


	public static class oneway_return extends TreeRuleReturnScope {
		public boolean value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "oneway"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:195:1: oneway returns [boolean value] : ( ONEWAY |);
	public final DocumentGenerator.oneway_return oneway() throws RecognitionException {
		DocumentGenerator.oneway_return retval = new DocumentGenerator.oneway_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ONEWAY48=null;

		CommonTree ONEWAY48_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:196:5: ( ONEWAY |)
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==ONEWAY) ) {
				alt20=1;
			}
			else if ( ((LA20_0 >= UP && LA20_0 <= ARGS)||LA20_0==CPP_TYPE||LA20_0==DOUBLE||(LA20_0 >= HEX_INTEGER && LA20_0 <= IDENTIFIER)||LA20_0==INTEGER||(LA20_0 >= LIST && LA20_0 <= MAP)||LA20_0==REQUIREDNESS||LA20_0==SET||LA20_0==THROWS||(LA20_0 >= TYPES && LA20_0 <= TYPE_STRING)) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:196:7: ONEWAY
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					ONEWAY48=(CommonTree)match(input,ONEWAY,FOLLOW_ONEWAY_in_oneway1373); 
					ONEWAY48_tree = (CommonTree)adaptor.dupNode(ONEWAY48);


					adaptor.addChild(root_0, ONEWAY48_tree);

					 retval.value = true; 
					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:197:14: 
					{
					root_0 = (CommonTree)adaptor.nil();


					 retval.value = false; 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneway"


	public static class function_type_return extends TreeRuleReturnScope {
		public ThriftType value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function_type"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:200:1: function_type returns [ThriftType value] : ( field_type | VOID );
	public final DocumentGenerator.function_type_return function_type() throws RecognitionException {
		DocumentGenerator.function_type_return retval = new DocumentGenerator.function_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree VOID50=null;
		TreeRuleReturnScope field_type49 =null;

		CommonTree VOID50_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:201:5: ( field_type | VOID )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==IDENTIFIER||LA21_0==LIST||LA21_0==MAP||LA21_0==SET||(LA21_0 >= TYPE_BINARY && LA21_0 <= TYPE_STRING)) ) {
				alt21=1;
			}
			else if ( (LA21_0==VOID) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:201:7: field_type
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_field_type_in_function_type1411);
					field_type49=field_type();
					state._fsp--;

					adaptor.addChild(root_0, field_type49.getTree());

					 retval.value = (field_type49!=null?((DocumentGenerator.field_type_return)field_type49).value:null); 
					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:202:7: VOID
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					VOID50=(CommonTree)match(input,VOID,FOLLOW_VOID_in_function_type1421); 
					VOID50_tree = (CommonTree)adaptor.dupNode(VOID50);


					adaptor.addChild(root_0, VOID50_tree);

					 retval.value = new VoidType(); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_type"


	public static class throws_list_return extends TreeRuleReturnScope {
		public List<ThriftField> value = new ArrayList<>();
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "throws_list"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:205:1: throws_list returns [List<ThriftField> value = new ArrayList<>()] : ( ^( THROWS fields ) )? ;
	public final DocumentGenerator.throws_list_return throws_list() throws RecognitionException {
		DocumentGenerator.throws_list_return retval = new DocumentGenerator.throws_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree THROWS51=null;
		TreeRuleReturnScope fields52 =null;

		CommonTree THROWS51_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:206:5: ( ( ^( THROWS fields ) )? )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:206:7: ( ^( THROWS fields ) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// com/facebook/swift/parser/antlr/DocumentGenerator.g:206:7: ( ^( THROWS fields ) )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==THROWS) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:206:9: ^( THROWS fields )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					THROWS51=(CommonTree)match(input,THROWS,FOLLOW_THROWS_in_throws_list1453); 
					THROWS51_tree = (CommonTree)adaptor.dupNode(THROWS51);


					root_1 = (CommonTree)adaptor.becomeRoot(THROWS51_tree, root_1);

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_fields_in_throws_list1455);
						fields52=fields();
						state._fsp--;

						adaptor.addChild(root_1, fields52.getTree());

						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					 retval.value = (fields52!=null?((DocumentGenerator.fields_return)fields52).value:null); 
					}
					break;

			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "throws_list"


	public static class type_annotations_return extends TreeRuleReturnScope {
		public List<TypeAnnotation> value = new ArrayList<>();
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_annotations"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:210:1: type_annotations returns [List<TypeAnnotation> value = new ArrayList<>()] : ( ^( TYPES (t= type_annotation )* ) )? ;
	public final DocumentGenerator.type_annotations_return type_annotations() throws RecognitionException {
		DocumentGenerator.type_annotations_return retval = new DocumentGenerator.type_annotations_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree TYPES53=null;
		TreeRuleReturnScope t =null;

		CommonTree TYPES53_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:211:5: ( ( ^( TYPES (t= type_annotation )* ) )? )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:211:7: ( ^( TYPES (t= type_annotation )* ) )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// com/facebook/swift/parser/antlr/DocumentGenerator.g:211:7: ( ^( TYPES (t= type_annotation )* ) )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==TYPES) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:211:9: ^( TYPES (t= type_annotation )* )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					TYPES53=(CommonTree)match(input,TYPES,FOLLOW_TYPES_in_type_annotations1486); 
					TYPES53_tree = (CommonTree)adaptor.dupNode(TYPES53);


					root_1 = (CommonTree)adaptor.becomeRoot(TYPES53_tree, root_1);

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// com/facebook/swift/parser/antlr/DocumentGenerator.g:211:17: (t= type_annotation )*
						loop23:
						while (true) {
							int alt23=2;
							int LA23_0 = input.LA(1);
							if ( (LA23_0==TYPE) ) {
								alt23=1;
							}

							switch (alt23) {
							case 1 :
								// com/facebook/swift/parser/antlr/DocumentGenerator.g:211:19: t= type_annotation
								{
								_last = (CommonTree)input.LT(1);
								pushFollow(FOLLOW_type_annotation_in_type_annotations1492);
								t=type_annotation();
								state._fsp--;

								adaptor.addChild(root_1, t.getTree());

								 retval.value.add((t!=null?((DocumentGenerator.type_annotation_return)t).value:null)); 
								}
								break;

							default :
								break loop23;
							}
						}

						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_annotations"


	public static class type_annotation_return extends TreeRuleReturnScope {
		public TypeAnnotation value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_annotation"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:214:1: type_annotation returns [TypeAnnotation value] : ^( TYPE k= IDENTIFIER v= annotation_value ) ;
	public final DocumentGenerator.type_annotation_return type_annotation() throws RecognitionException {
		DocumentGenerator.type_annotation_return retval = new DocumentGenerator.type_annotation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree k=null;
		CommonTree TYPE54=null;
		TreeRuleReturnScope v =null;

		CommonTree k_tree=null;
		CommonTree TYPE54_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:215:5: ( ^( TYPE k= IDENTIFIER v= annotation_value ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:215:7: ^( TYPE k= IDENTIFIER v= annotation_value )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			TYPE54=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_type_annotation1524); 
			TYPE54_tree = (CommonTree)adaptor.dupNode(TYPE54);


			root_1 = (CommonTree)adaptor.becomeRoot(TYPE54_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			k=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_annotation1528); 
			k_tree = (CommonTree)adaptor.dupNode(k);


			adaptor.addChild(root_1, k_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_annotation_value_in_type_annotation1532);
			v=annotation_value();
			state._fsp--;

			adaptor.addChild(root_1, v.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.value = new TypeAnnotation((k!=null?k.getText():null), (v!=null?((DocumentGenerator.annotation_value_return)v).value:null)); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_annotation"


	public static class annotation_value_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotation_value"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:218:1: annotation_value returns [String value] : (i= integer |s= LITERAL );
	public final DocumentGenerator.annotation_value_return annotation_value() throws RecognitionException {
		DocumentGenerator.annotation_value_return retval = new DocumentGenerator.annotation_value_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree s=null;
		TreeRuleReturnScope i =null;

		CommonTree s_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:219:5: (i= integer |s= LITERAL )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==HEX_INTEGER||LA25_0==INTEGER) ) {
				alt25=1;
			}
			else if ( (LA25_0==LITERAL) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:219:7: i= integer
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_integer_in_annotation_value1558);
					i=integer();
					state._fsp--;

					adaptor.addChild(root_0, i.getTree());

					 retval.value = String.valueOf((i!=null?((DocumentGenerator.integer_return)i).value:null)); 
					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:220:7: s= LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					s=(CommonTree)match(input,LITERAL,FOLLOW_LITERAL_in_annotation_value1570); 
					s_tree = (CommonTree)adaptor.dupNode(s);


					adaptor.addChild(root_0, s_tree);

					 retval.value = (s!=null?s.getText():null); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "annotation_value"


	public static class field_type_return extends TreeRuleReturnScope {
		public ThriftType value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "field_type"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:224:1: field_type returns [ThriftType value] : (b= base_type |s= IDENTIFIER |c= container_type );
	public final DocumentGenerator.field_type_return field_type() throws RecognitionException {
		DocumentGenerator.field_type_return retval = new DocumentGenerator.field_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree s=null;
		TreeRuleReturnScope b =null;
		TreeRuleReturnScope c =null;

		CommonTree s_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:225:5: (b= base_type |s= IDENTIFIER |c= container_type )
			int alt26=3;
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
				alt26=1;
				}
				break;
			case IDENTIFIER:
				{
				alt26=2;
				}
				break;
			case LIST:
			case MAP:
			case SET:
				{
				alt26=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:225:7: b= base_type
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_base_type_in_field_type1596);
					b=base_type();
					state._fsp--;

					adaptor.addChild(root_0, b.getTree());

					 retval.value = (b!=null?((DocumentGenerator.base_type_return)b).value:null); 
					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:226:7: s= IDENTIFIER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					s=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_field_type1613); 
					s_tree = (CommonTree)adaptor.dupNode(s);


					adaptor.addChild(root_0, s_tree);

					 retval.value = new IdentifierType((s!=null?s.getText():null)); 
					}
					break;
				case 3 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:227:7: c= container_type
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_container_type_in_field_type1629);
					c=container_type();
					state._fsp--;

					adaptor.addChild(root_0, c.getTree());

					 retval.value = (c!=null?((DocumentGenerator.container_type_return)c).value:null); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field_type"


	public static class base_type_return extends TreeRuleReturnScope {
		public BaseType value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "base_type"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:230:1: base_type returns [BaseType value] : b= real_base_type t= type_annotations ;
	public final DocumentGenerator.base_type_return base_type() throws RecognitionException {
		DocumentGenerator.base_type_return retval = new DocumentGenerator.base_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope b =null;
		TreeRuleReturnScope t =null;


		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:231:5: (b= real_base_type t= type_annotations )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:231:7: b= real_base_type t= type_annotations
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_real_base_type_in_base_type1654);
			b=real_base_type();
			state._fsp--;

			adaptor.addChild(root_0, b.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_type_annotations_in_base_type1658);
			t=type_annotations();
			state._fsp--;

			adaptor.addChild(root_0, t.getTree());

			 retval.value = new BaseType((b!=null?((DocumentGenerator.real_base_type_return)b).value:null), (t!=null?((DocumentGenerator.type_annotations_return)t).value:null)); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "base_type"


	public static class real_base_type_return extends TreeRuleReturnScope {
		public BaseType.Type value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "real_base_type"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:234:1: real_base_type returns [BaseType.Type value] : ( TYPE_BOOL | TYPE_BYTE | TYPE_I16 | TYPE_I32 | TYPE_I64 | TYPE_DOUBLE | TYPE_STRING | TYPE_BINARY );
	public final DocumentGenerator.real_base_type_return real_base_type() throws RecognitionException {
		DocumentGenerator.real_base_type_return retval = new DocumentGenerator.real_base_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree TYPE_BOOL55=null;
		CommonTree TYPE_BYTE56=null;
		CommonTree TYPE_I1657=null;
		CommonTree TYPE_I3258=null;
		CommonTree TYPE_I6459=null;
		CommonTree TYPE_DOUBLE60=null;
		CommonTree TYPE_STRING61=null;
		CommonTree TYPE_BINARY62=null;

		CommonTree TYPE_BOOL55_tree=null;
		CommonTree TYPE_BYTE56_tree=null;
		CommonTree TYPE_I1657_tree=null;
		CommonTree TYPE_I3258_tree=null;
		CommonTree TYPE_I6459_tree=null;
		CommonTree TYPE_DOUBLE60_tree=null;
		CommonTree TYPE_STRING61_tree=null;
		CommonTree TYPE_BINARY62_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:235:5: ( TYPE_BOOL | TYPE_BYTE | TYPE_I16 | TYPE_I32 | TYPE_I64 | TYPE_DOUBLE | TYPE_STRING | TYPE_BINARY )
			int alt27=8;
			switch ( input.LA(1) ) {
			case TYPE_BOOL:
				{
				alt27=1;
				}
				break;
			case TYPE_BYTE:
				{
				alt27=2;
				}
				break;
			case TYPE_I16:
				{
				alt27=3;
				}
				break;
			case TYPE_I32:
				{
				alt27=4;
				}
				break;
			case TYPE_I64:
				{
				alt27=5;
				}
				break;
			case TYPE_DOUBLE:
				{
				alt27=6;
				}
				break;
			case TYPE_STRING:
				{
				alt27=7;
				}
				break;
			case TYPE_BINARY:
				{
				alt27=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:235:7: TYPE_BOOL
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					TYPE_BOOL55=(CommonTree)match(input,TYPE_BOOL,FOLLOW_TYPE_BOOL_in_real_base_type1681); 
					TYPE_BOOL55_tree = (CommonTree)adaptor.dupNode(TYPE_BOOL55);


					adaptor.addChild(root_0, TYPE_BOOL55_tree);

					 retval.value = BaseType.Type.BOOL; 
					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:236:7: TYPE_BYTE
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					TYPE_BYTE56=(CommonTree)match(input,TYPE_BYTE,FOLLOW_TYPE_BYTE_in_real_base_type1693); 
					TYPE_BYTE56_tree = (CommonTree)adaptor.dupNode(TYPE_BYTE56);


					adaptor.addChild(root_0, TYPE_BYTE56_tree);

					 retval.value = BaseType.Type.BYTE; 
					}
					break;
				case 3 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:237:7: TYPE_I16
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					TYPE_I1657=(CommonTree)match(input,TYPE_I16,FOLLOW_TYPE_I16_in_real_base_type1705); 
					TYPE_I1657_tree = (CommonTree)adaptor.dupNode(TYPE_I1657);


					adaptor.addChild(root_0, TYPE_I1657_tree);

					 retval.value = BaseType.Type.I16; 
					}
					break;
				case 4 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:238:7: TYPE_I32
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					TYPE_I3258=(CommonTree)match(input,TYPE_I32,FOLLOW_TYPE_I32_in_real_base_type1718); 
					TYPE_I3258_tree = (CommonTree)adaptor.dupNode(TYPE_I3258);


					adaptor.addChild(root_0, TYPE_I3258_tree);

					 retval.value = BaseType.Type.I32; 
					}
					break;
				case 5 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:239:7: TYPE_I64
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					TYPE_I6459=(CommonTree)match(input,TYPE_I64,FOLLOW_TYPE_I64_in_real_base_type1731); 
					TYPE_I6459_tree = (CommonTree)adaptor.dupNode(TYPE_I6459);


					adaptor.addChild(root_0, TYPE_I6459_tree);

					 retval.value = BaseType.Type.I64; 
					}
					break;
				case 6 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:240:7: TYPE_DOUBLE
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					TYPE_DOUBLE60=(CommonTree)match(input,TYPE_DOUBLE,FOLLOW_TYPE_DOUBLE_in_real_base_type1744); 
					TYPE_DOUBLE60_tree = (CommonTree)adaptor.dupNode(TYPE_DOUBLE60);


					adaptor.addChild(root_0, TYPE_DOUBLE60_tree);

					 retval.value = BaseType.Type.DOUBLE; 
					}
					break;
				case 7 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:241:7: TYPE_STRING
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					TYPE_STRING61=(CommonTree)match(input,TYPE_STRING,FOLLOW_TYPE_STRING_in_real_base_type1754); 
					TYPE_STRING61_tree = (CommonTree)adaptor.dupNode(TYPE_STRING61);


					adaptor.addChild(root_0, TYPE_STRING61_tree);

					 retval.value = BaseType.Type.STRING; 
					}
					break;
				case 8 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:242:7: TYPE_BINARY
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					TYPE_BINARY62=(CommonTree)match(input,TYPE_BINARY,FOLLOW_TYPE_BINARY_in_real_base_type1764); 
					TYPE_BINARY62_tree = (CommonTree)adaptor.dupNode(TYPE_BINARY62);


					adaptor.addChild(root_0, TYPE_BINARY62_tree);

					 retval.value = BaseType.Type.BINARY; 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "real_base_type"


	public static class container_type_return extends TreeRuleReturnScope {
		public ContainerType value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "container_type"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:245:1: container_type returns [ContainerType value] : ( ^( MAP k= field_type v= field_type (c= cpp_type )? ) a= type_annotations | ^( SET t= field_type (c= cpp_type )? ) a= type_annotations | ^( LIST t= field_type (c= cpp_type )? ) a= type_annotations );
	public final DocumentGenerator.container_type_return container_type() throws RecognitionException {
		DocumentGenerator.container_type_return retval = new DocumentGenerator.container_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree MAP63=null;
		CommonTree SET64=null;
		CommonTree LIST65=null;
		TreeRuleReturnScope k =null;
		TreeRuleReturnScope v =null;
		TreeRuleReturnScope c =null;
		TreeRuleReturnScope a =null;
		TreeRuleReturnScope t =null;

		CommonTree MAP63_tree=null;
		CommonTree SET64_tree=null;
		CommonTree LIST65_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:246:5: ( ^( MAP k= field_type v= field_type (c= cpp_type )? ) a= type_annotations | ^( SET t= field_type (c= cpp_type )? ) a= type_annotations | ^( LIST t= field_type (c= cpp_type )? ) a= type_annotations )
			int alt31=3;
			switch ( input.LA(1) ) {
			case MAP:
				{
				alt31=1;
				}
				break;
			case SET:
				{
				alt31=2;
				}
				break;
			case LIST:
				{
				alt31=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:246:7: ^( MAP k= field_type v= field_type (c= cpp_type )? ) a= type_annotations
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					MAP63=(CommonTree)match(input,MAP,FOLLOW_MAP_in_container_type1788); 
					MAP63_tree = (CommonTree)adaptor.dupNode(MAP63);


					root_1 = (CommonTree)adaptor.becomeRoot(MAP63_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_field_type_in_container_type1792);
					k=field_type();
					state._fsp--;

					adaptor.addChild(root_1, k.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_field_type_in_container_type1796);
					v=field_type();
					state._fsp--;

					adaptor.addChild(root_1, v.getTree());

					// com/facebook/swift/parser/antlr/DocumentGenerator.g:246:40: (c= cpp_type )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==CPP_TYPE) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// com/facebook/swift/parser/antlr/DocumentGenerator.g:246:40: c= cpp_type
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_cpp_type_in_container_type1800);
							c=cpp_type();
							state._fsp--;

							adaptor.addChild(root_1, c.getTree());

							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_type_annotations_in_container_type1806);
					a=type_annotations();
					state._fsp--;

					adaptor.addChild(root_0, a.getTree());

					 retval.value = new MapType((k!=null?((DocumentGenerator.field_type_return)k).value:null), (v!=null?((DocumentGenerator.field_type_return)v).value:null), (c!=null?((DocumentGenerator.cpp_type_return)c).value:null), (a!=null?((DocumentGenerator.type_annotations_return)a).value:null)); 
					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:248:7: ^( SET t= field_type (c= cpp_type )? ) a= type_annotations
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					SET64=(CommonTree)match(input,SET,FOLLOW_SET_in_container_type1825); 
					SET64_tree = (CommonTree)adaptor.dupNode(SET64);


					root_1 = (CommonTree)adaptor.becomeRoot(SET64_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_field_type_in_container_type1829);
					t=field_type();
					state._fsp--;

					adaptor.addChild(root_1, t.getTree());

					// com/facebook/swift/parser/antlr/DocumentGenerator.g:248:27: (c= cpp_type )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==CPP_TYPE) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// com/facebook/swift/parser/antlr/DocumentGenerator.g:248:27: c= cpp_type
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_cpp_type_in_container_type1833);
							c=cpp_type();
							state._fsp--;

							adaptor.addChild(root_1, c.getTree());

							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_type_annotations_in_container_type1839);
					a=type_annotations();
					state._fsp--;

					adaptor.addChild(root_0, a.getTree());

					 retval.value = new SetType((t!=null?((DocumentGenerator.field_type_return)t).value:null), (c!=null?((DocumentGenerator.cpp_type_return)c).value:null), (a!=null?((DocumentGenerator.type_annotations_return)a).value:null)); 
					}
					break;
				case 3 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:250:7: ^( LIST t= field_type (c= cpp_type )? ) a= type_annotations
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LIST65=(CommonTree)match(input,LIST,FOLLOW_LIST_in_container_type1858); 
					LIST65_tree = (CommonTree)adaptor.dupNode(LIST65);


					root_1 = (CommonTree)adaptor.becomeRoot(LIST65_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_field_type_in_container_type1862);
					t=field_type();
					state._fsp--;

					adaptor.addChild(root_1, t.getTree());

					// com/facebook/swift/parser/antlr/DocumentGenerator.g:250:28: (c= cpp_type )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==CPP_TYPE) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// com/facebook/swift/parser/antlr/DocumentGenerator.g:250:28: c= cpp_type
							{
							_last = (CommonTree)input.LT(1);
							pushFollow(FOLLOW_cpp_type_in_container_type1866);
							c=cpp_type();
							state._fsp--;

							adaptor.addChild(root_1, c.getTree());

							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_type_annotations_in_container_type1872);
					a=type_annotations();
					state._fsp--;

					adaptor.addChild(root_0, a.getTree());

					 retval.value = new ListType((t!=null?((DocumentGenerator.field_type_return)t).value:null), (c!=null?((DocumentGenerator.cpp_type_return)c).value:null), (a!=null?((DocumentGenerator.type_annotations_return)a).value:null)); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "container_type"


	public static class cpp_type_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cpp_type"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:254:1: cpp_type returns [String value] : ^( CPP_TYPE s= LITERAL ) ;
	public final DocumentGenerator.cpp_type_return cpp_type() throws RecognitionException {
		DocumentGenerator.cpp_type_return retval = new DocumentGenerator.cpp_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree s=null;
		CommonTree CPP_TYPE66=null;

		CommonTree s_tree=null;
		CommonTree CPP_TYPE66_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:255:5: ( ^( CPP_TYPE s= LITERAL ) )
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:255:7: ^( CPP_TYPE s= LITERAL )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			CPP_TYPE66=(CommonTree)match(input,CPP_TYPE,FOLLOW_CPP_TYPE_in_cpp_type1904); 
			CPP_TYPE66_tree = (CommonTree)adaptor.dupNode(CPP_TYPE66);


			root_1 = (CommonTree)adaptor.becomeRoot(CPP_TYPE66_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			s=(CommonTree)match(input,LITERAL,FOLLOW_LITERAL_in_cpp_type1908); 
			s_tree = (CommonTree)adaptor.dupNode(s);


			adaptor.addChild(root_1, s_tree);

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			 retval.value = (s!=null?s.getText():null); 
			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cpp_type"


	public static class integer_return extends TreeRuleReturnScope {
		public Long value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "integer"
	// com/facebook/swift/parser/antlr/DocumentGenerator.g:259:1: integer returns [Long value] : (i= INTEGER |h= HEX_INTEGER );
	public final DocumentGenerator.integer_return integer() throws RecognitionException {
		DocumentGenerator.integer_return retval = new DocumentGenerator.integer_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree i=null;
		CommonTree h=null;

		CommonTree i_tree=null;
		CommonTree h_tree=null;

		try {
			// com/facebook/swift/parser/antlr/DocumentGenerator.g:260:5: (i= INTEGER |h= HEX_INTEGER )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==INTEGER) ) {
				alt32=1;
			}
			else if ( (LA32_0==HEX_INTEGER) ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:260:7: i= INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					i=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_integer1935); 
					i_tree = (CommonTree)adaptor.dupNode(i);


					adaptor.addChild(root_0, i_tree);

					 retval.value = Long.parseLong((i!=null?i.getText():null)); 
					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/DocumentGenerator.g:261:7: h= HEX_INTEGER
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					h=(CommonTree)match(input,HEX_INTEGER,FOLLOW_HEX_INTEGER_in_integer1951); 
					h_tree = (CommonTree)adaptor.dupNode(h);


					adaptor.addChild(root_0, h_tree);

					 retval.value = Long.decode((h!=null?h.getText():null)); 
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "integer"

	// Delegated rules



	public static final BitSet FOLLOW_DOCUMENT_in_document68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOCUMENT_in_document101 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_header_in_document103 = new BitSet(new long[]{0x0004012C00018088L});
	public static final BitSet FOLLOW_definitions_in_document105 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_include_in_header142 = new BitSet(new long[]{0x0000000020400502L});
	public static final BitSet FOLLOW_cpp_include_in_header164 = new BitSet(new long[]{0x0000000020400502L});
	public static final BitSet FOLLOW_default_namespace_in_header182 = new BitSet(new long[]{0x0000000020400502L});
	public static final BitSet FOLLOW_namespace_in_header194 = new BitSet(new long[]{0x0000000020400502L});
	public static final BitSet FOLLOW_INCLUDE_in_include235 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_in_include237 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEFAULT_NAMESPACE_in_default_namespace262 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_default_namespace267 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_in_default_namespace273 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NAMESPACE_in_namespace299 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace303 = new BitSet(new long[]{0x0000000004200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_namespace308 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_in_namespace314 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CPP_INCLUDE_in_cpp_include340 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_in_cpp_include342 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_definition_in_definitions369 = new BitSet(new long[]{0x0004012C00018082L});
	public static final BitSet FOLLOW_const_rule_in_definition395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typedef_in_definition405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_rule_in_definition418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_senum_in_definition429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_in_definition444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_union_in_definition458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exception_in_definition473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_service_in_definition484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_const_rule511 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_const_rule515 = new BitSet(new long[]{0x0003FC100A200000L});
	public static final BitSet FOLLOW_field_type_in_const_rule519 = new BitSet(new long[]{0x000000000EB02000L});
	public static final BitSet FOLLOW_const_value_in_const_rule523 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPEDEF_in_typedef548 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_typedef552 = new BitSet(new long[]{0x0003FC100A200000L});
	public static final BitSet FOLLOW_field_type_in_typedef556 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ENUM_in_enum_rule581 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enum_rule585 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_enum_fields_in_enum_rule589 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SENUM_in_senum614 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_senum618 = new BitSet(new long[]{0x0000000004000008L});
	public static final BitSet FOLLOW_senum_values_in_senum622 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STRUCT_in_struct647 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_struct651 = new BitSet(new long[]{0x0000020000040008L});
	public static final BitSet FOLLOW_fields_in_struct655 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_type_annotations_in_struct659 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNION_in_union684 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_union688 = new BitSet(new long[]{0x0000020000040008L});
	public static final BitSet FOLLOW_fields_in_union692 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_type_annotations_in_union696 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXCEPTION_in_exception721 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_exception725 = new BitSet(new long[]{0x0000020000040008L});
	public static final BitSet FOLLOW_fields_in_exception729 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_type_annotations_in_exception733 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SERVICE_in_service758 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_service762 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_EXTENDS_in_service765 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_service769 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_functions_in_service775 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_type_annotations_in_service779 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_integer_in_const_value806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_const_value822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_const_value839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_const_value855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_const_list_in_const_value868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_const_map_in_const_value881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_const_list907 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_const_value_in_const_list913 = new BitSet(new long[]{0x000000000EB02008L});
	public static final BitSet FOLLOW_MAP_in_const_map941 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_const_map_entry_in_const_map947 = new BitSet(new long[]{0x0000000000004008L});
	public static final BitSet FOLLOW_ENTRY_in_const_map_entry976 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_const_value_in_const_map_entry980 = new BitSet(new long[]{0x000000000EB02000L});
	public static final BitSet FOLLOW_const_value_in_const_map_entry984 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_enum_field_in_enum_fields1010 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_enum_field1041 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_integer_in_enum_field1045 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_in_senum_values1074 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_field_in_fields1102 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_function_in_functions1129 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_FIELD_in_field1157 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_field1161 = new BitSet(new long[]{0x0003FC100A200000L});
	public static final BitSet FOLLOW_field_type_in_field1165 = new BitSet(new long[]{0x0000000200900000L});
	public static final BitSet FOLLOW_integer_in_field1169 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_field_req_in_field1174 = new BitSet(new long[]{0x000002000EB02008L});
	public static final BitSet FOLLOW_const_value_in_field1178 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_type_annotations_in_field1183 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_REQUIREDNESS_in_field_req1215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REQUIREDNESS_in_field_req1238 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_REQUIRED_in_field_req1240 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_REQUIREDNESS_in_field_req1252 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_OPTIONAL_in_field_req1254 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_in_function1280 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function1284 = new BitSet(new long[]{0x000BFC100A200000L});
	public static final BitSet FOLLOW_function_type_in_function1288 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_args_in_function1292 = new BitSet(new long[]{0x0000024040000008L});
	public static final BitSet FOLLOW_oneway_in_function1296 = new BitSet(new long[]{0x0000024000000008L});
	public static final BitSet FOLLOW_throws_list_in_function1300 = new BitSet(new long[]{0x0000020000000008L});
	public static final BitSet FOLLOW_type_annotations_in_function1304 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARGS_in_args1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARGS_in_args1345 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_fields_in_args1349 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ONEWAY_in_oneway1373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_type_in_function_type1411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_function_type1421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THROWS_in_throws_list1453 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_fields_in_throws_list1455 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPES_in_type_annotations1486 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_annotation_in_type_annotations1492 = new BitSet(new long[]{0x0000008000000008L});
	public static final BitSet FOLLOW_TYPE_in_type_annotation1524 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_type_annotation1528 = new BitSet(new long[]{0x0000000004900000L});
	public static final BitSet FOLLOW_annotation_value_in_type_annotation1532 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_integer_in_annotation_value1558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_annotation_value1570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_type_in_field_type1596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_field_type1613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_container_type_in_field_type1629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_real_base_type_in_base_type1654 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_type_annotations_in_base_type1658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_BOOL_in_real_base_type1681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_BYTE_in_real_base_type1693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_I16_in_real_base_type1705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_I32_in_real_base_type1718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_I64_in_real_base_type1731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_DOUBLE_in_real_base_type1744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_STRING_in_real_base_type1754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_BINARY_in_real_base_type1764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAP_in_container_type1788 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_field_type_in_container_type1792 = new BitSet(new long[]{0x0003FC100A200000L});
	public static final BitSet FOLLOW_field_type_in_container_type1796 = new BitSet(new long[]{0x0000000000000208L});
	public static final BitSet FOLLOW_cpp_type_in_container_type1800 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_type_annotations_in_container_type1806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SET_in_container_type1825 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_field_type_in_container_type1829 = new BitSet(new long[]{0x0000000000000208L});
	public static final BitSet FOLLOW_cpp_type_in_container_type1833 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_type_annotations_in_container_type1839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_container_type1858 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_field_type_in_container_type1862 = new BitSet(new long[]{0x0000000000000208L});
	public static final BitSet FOLLOW_cpp_type_in_container_type1866 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_type_annotations_in_container_type1872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CPP_TYPE_in_cpp_type1904 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_in_cpp_type1908 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTEGER_in_integer1935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEX_INTEGER_in_integer1951 = new BitSet(new long[]{0x0000000000000002L});
}
