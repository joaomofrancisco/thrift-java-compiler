// $ANTLR 3.5 com/facebook/swift/parser/antlr/Thrift.g 2015-08-08 15:57:01

    package com.facebook.swift.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ThriftLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ThriftLexer() {} 
	public ThriftLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ThriftLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "com/facebook/swift/parser/antlr/Thrift.g"; }

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:6:7: ( '(' )
			// com/facebook/swift/parser/antlr/Thrift.g:6:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:7:7: ( ')' )
			// com/facebook/swift/parser/antlr/Thrift.g:7:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:8:7: ( '*' )
			// com/facebook/swift/parser/antlr/Thrift.g:8:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:9:7: ( ':' )
			// com/facebook/swift/parser/antlr/Thrift.g:9:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:10:7: ( ';' )
			// com/facebook/swift/parser/antlr/Thrift.g:10:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:11:7: ( '<' )
			// com/facebook/swift/parser/antlr/Thrift.g:11:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:12:7: ( '=' )
			// com/facebook/swift/parser/antlr/Thrift.g:12:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:13:7: ( '>' )
			// com/facebook/swift/parser/antlr/Thrift.g:13:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:14:7: ( '[' )
			// com/facebook/swift/parser/antlr/Thrift.g:14:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:15:7: ( ']' )
			// com/facebook/swift/parser/antlr/Thrift.g:15:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:16:7: ( 'async' )
			// com/facebook/swift/parser/antlr/Thrift.g:16:9: 'async'
			{
			match("async"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:17:7: ( 'const' )
			// com/facebook/swift/parser/antlr/Thrift.g:17:9: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:18:7: ( 'cpp_include' )
			// com/facebook/swift/parser/antlr/Thrift.g:18:9: 'cpp_include'
			{
			match("cpp_include"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:19:7: ( 'cpp_namespace' )
			// com/facebook/swift/parser/antlr/Thrift.g:19:9: 'cpp_namespace'
			{
			match("cpp_namespace"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:20:7: ( 'cpp_type' )
			// com/facebook/swift/parser/antlr/Thrift.g:20:9: 'cpp_type'
			{
			match("cpp_type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:21:7: ( 'enum' )
			// com/facebook/swift/parser/antlr/Thrift.g:21:9: 'enum'
			{
			match("enum"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:22:7: ( 'exception' )
			// com/facebook/swift/parser/antlr/Thrift.g:22:9: 'exception'
			{
			match("exception"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:23:7: ( 'extends' )
			// com/facebook/swift/parser/antlr/Thrift.g:23:9: 'extends'
			{
			match("extends"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:24:7: ( 'include' )
			// com/facebook/swift/parser/antlr/Thrift.g:24:9: 'include'
			{
			match("include"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:25:7: ( 'list' )
			// com/facebook/swift/parser/antlr/Thrift.g:25:9: 'list'
			{
			match("list"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:26:7: ( 'map' )
			// com/facebook/swift/parser/antlr/Thrift.g:26:9: 'map'
			{
			match("map"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:27:7: ( 'namespace' )
			// com/facebook/swift/parser/antlr/Thrift.g:27:9: 'namespace'
			{
			match("namespace"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:28:7: ( 'oneway' )
			// com/facebook/swift/parser/antlr/Thrift.g:28:9: 'oneway'
			{
			match("oneway"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:29:7: ( 'optional' )
			// com/facebook/swift/parser/antlr/Thrift.g:29:9: 'optional'
			{
			match("optional"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:30:7: ( 'php_namespace' )
			// com/facebook/swift/parser/antlr/Thrift.g:30:9: 'php_namespace'
			{
			match("php_namespace"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:31:7: ( 'required' )
			// com/facebook/swift/parser/antlr/Thrift.g:31:9: 'required'
			{
			match("required"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:32:7: ( 'senum' )
			// com/facebook/swift/parser/antlr/Thrift.g:32:9: 'senum'
			{
			match("senum"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:33:7: ( 'service' )
			// com/facebook/swift/parser/antlr/Thrift.g:33:9: 'service'
			{
			match("service"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:34:7: ( 'set' )
			// com/facebook/swift/parser/antlr/Thrift.g:34:9: 'set'
			{
			match("set"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:35:7: ( 'struct' )
			// com/facebook/swift/parser/antlr/Thrift.g:35:9: 'struct'
			{
			match("struct"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:36:7: ( 'throws' )
			// com/facebook/swift/parser/antlr/Thrift.g:36:9: 'throws'
			{
			match("throws"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:37:7: ( 'typedef' )
			// com/facebook/swift/parser/antlr/Thrift.g:37:9: 'typedef'
			{
			match("typedef"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:38:7: ( 'union' )
			// com/facebook/swift/parser/antlr/Thrift.g:38:9: 'union'
			{
			match("union"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:39:7: ( 'void' )
			// com/facebook/swift/parser/antlr/Thrift.g:39:9: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:40:7: ( '{' )
			// com/facebook/swift/parser/antlr/Thrift.g:40:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:41:7: ( '}' )
			// com/facebook/swift/parser/antlr/Thrift.g:41:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__88"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:218:5: ( ( '+' | '-' )? ( DIGIT )+ )
			// com/facebook/swift/parser/antlr/Thrift.g:218:7: ( '+' | '-' )? ( DIGIT )+
			{
			// com/facebook/swift/parser/antlr/Thrift.g:218:7: ( '+' | '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='+'||LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// com/facebook/swift/parser/antlr/Thrift.g:218:20: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "HEX_INTEGER"
	public final void mHEX_INTEGER() throws RecognitionException {
		try {
			int _type = HEX_INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:222:5: ( '0x' ( HEX_DIGIT )+ )
			// com/facebook/swift/parser/antlr/Thrift.g:222:7: '0x' ( HEX_DIGIT )+
			{
			match("0x"); 

			// com/facebook/swift/parser/antlr/Thrift.g:222:12: ( HEX_DIGIT )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'F')||(LA3_0 >= 'a' && LA3_0 <= 'f')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_INTEGER"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:226:5: ( ( '+' | '-' )? ( DIGIT )* ( '.' ( DIGIT )+ )? ( ( 'E' | 'e' ) INTEGER )? )
			// com/facebook/swift/parser/antlr/Thrift.g:226:7: ( '+' | '-' )? ( DIGIT )* ( '.' ( DIGIT )+ )? ( ( 'E' | 'e' ) INTEGER )?
			{
			// com/facebook/swift/parser/antlr/Thrift.g:226:7: ( '+' | '-' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='+'||LA4_0=='-') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// com/facebook/swift/parser/antlr/Thrift.g:226:20: ( DIGIT )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			// com/facebook/swift/parser/antlr/Thrift.g:226:27: ( '.' ( DIGIT )+ )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='.') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:226:28: '.' ( DIGIT )+
					{
					match('.'); 
					// com/facebook/swift/parser/antlr/Thrift.g:226:32: ( DIGIT )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// com/facebook/swift/parser/antlr/Thrift.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					}
					break;

			}

			// com/facebook/swift/parser/antlr/Thrift.g:226:41: ( ( 'E' | 'e' ) INTEGER )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='E'||LA8_0=='e') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:226:42: ( 'E' | 'e' ) INTEGER
					{
					if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					mINTEGER(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "TYPE_BOOL"
	public final void mTYPE_BOOL() throws RecognitionException {
		try {
			int _type = TYPE_BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:249:10: ( 'bool' )
			// com/facebook/swift/parser/antlr/Thrift.g:249:12: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_BOOL"

	// $ANTLR start "TYPE_BYTE"
	public final void mTYPE_BYTE() throws RecognitionException {
		try {
			int _type = TYPE_BYTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:250:10: ( 'byte' )
			// com/facebook/swift/parser/antlr/Thrift.g:250:12: 'byte'
			{
			match("byte"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_BYTE"

	// $ANTLR start "TYPE_I16"
	public final void mTYPE_I16() throws RecognitionException {
		try {
			int _type = TYPE_I16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:251:9: ( 'i16' )
			// com/facebook/swift/parser/antlr/Thrift.g:251:11: 'i16'
			{
			match("i16"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_I16"

	// $ANTLR start "TYPE_I32"
	public final void mTYPE_I32() throws RecognitionException {
		try {
			int _type = TYPE_I32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:252:9: ( 'i32' )
			// com/facebook/swift/parser/antlr/Thrift.g:252:11: 'i32'
			{
			match("i32"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_I32"

	// $ANTLR start "TYPE_I64"
	public final void mTYPE_I64() throws RecognitionException {
		try {
			int _type = TYPE_I64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:253:9: ( 'i64' )
			// com/facebook/swift/parser/antlr/Thrift.g:253:11: 'i64'
			{
			match("i64"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_I64"

	// $ANTLR start "TYPE_DOUBLE"
	public final void mTYPE_DOUBLE() throws RecognitionException {
		try {
			int _type = TYPE_DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:254:12: ( 'double' )
			// com/facebook/swift/parser/antlr/Thrift.g:254:14: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_DOUBLE"

	// $ANTLR start "TYPE_STRING"
	public final void mTYPE_STRING() throws RecognitionException {
		try {
			int _type = TYPE_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:255:12: ( 'string' )
			// com/facebook/swift/parser/antlr/Thrift.g:255:14: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_STRING"

	// $ANTLR start "TYPE_BINARY"
	public final void mTYPE_BINARY() throws RecognitionException {
		try {
			int _type = TYPE_BINARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:256:12: ( 'binary' )
			// com/facebook/swift/parser/antlr/Thrift.g:256:14: 'binary'
			{
			match("binary"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE_BINARY"

	// $ANTLR start "LITERAL"
	public final void mLITERAL() throws RecognitionException {
		try {
			int _type = LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:259:5: ( ( ( '\"' (~ '\"' )* '\"' ) | ( '\\'' (~ '\\'' )* '\\'' ) ) )
			// com/facebook/swift/parser/antlr/Thrift.g:259:7: ( ( '\"' (~ '\"' )* '\"' ) | ( '\\'' (~ '\\'' )* '\\'' ) )
			{
			// com/facebook/swift/parser/antlr/Thrift.g:259:7: ( ( '\"' (~ '\"' )* '\"' ) | ( '\\'' (~ '\\'' )* '\\'' ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='\"') ) {
				alt11=1;
			}
			else if ( (LA11_0=='\'') ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:259:8: ( '\"' (~ '\"' )* '\"' )
					{
					// com/facebook/swift/parser/antlr/Thrift.g:259:8: ( '\"' (~ '\"' )* '\"' )
					// com/facebook/swift/parser/antlr/Thrift.g:259:9: '\"' (~ '\"' )* '\"'
					{
					match('\"'); 
					// com/facebook/swift/parser/antlr/Thrift.g:259:13: (~ '\"' )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '\u0000' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '\uFFFF')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// com/facebook/swift/parser/antlr/Thrift.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop9;
						}
					}

					match('\"'); 
					}

					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/Thrift.g:259:26: ( '\\'' (~ '\\'' )* '\\'' )
					{
					// com/facebook/swift/parser/antlr/Thrift.g:259:26: ( '\\'' (~ '\\'' )* '\\'' )
					// com/facebook/swift/parser/antlr/Thrift.g:259:27: '\\'' (~ '\\'' )* '\\''
					{
					match('\''); 
					// com/facebook/swift/parser/antlr/Thrift.g:259:32: (~ '\\'' )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\u0000' && LA10_0 <= '&')||(LA10_0 >= '(' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// com/facebook/swift/parser/antlr/Thrift.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop10;
						}
					}

					match('\''); 
					}

					}
					break;

			}

			 setText(getText().substring(1, getText().length() - 1)); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LITERAL"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:264:5: ( ( LETTER | '_' ) ( LETTER | DIGIT | '.' | '_' )* )
			// com/facebook/swift/parser/antlr/Thrift.g:264:7: ( LETTER | '_' ) ( LETTER | DIGIT | '.' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// com/facebook/swift/parser/antlr/Thrift.g:264:22: ( LETTER | DIGIT | '.' | '_' )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='.'||(LA12_0 >= '0' && LA12_0 <= '9')||(LA12_0 >= 'A' && LA12_0 <= 'Z')||LA12_0=='_'||(LA12_0 >= 'a' && LA12_0 <= 'z')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:
					{
					if ( input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop12;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:268:5: ( ',' )
			// com/facebook/swift/parser/antlr/Thrift.g:268:7: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// com/facebook/swift/parser/antlr/Thrift.g:272:5: ( 'A' .. 'Z' | 'a' .. 'z' )
			// com/facebook/swift/parser/antlr/Thrift.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// com/facebook/swift/parser/antlr/Thrift.g:276:5: ( '0' .. '9' )
			// com/facebook/swift/parser/antlr/Thrift.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// com/facebook/swift/parser/antlr/Thrift.g:280:5: ( DIGIT | 'A' .. 'F' | 'a' .. 'f' )
			// com/facebook/swift/parser/antlr/Thrift.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:284:5: ( ( ' ' | '\\t' | '\\r' '\\n' | '\\n' )+ )
			// com/facebook/swift/parser/antlr/Thrift.g:284:7: ( ' ' | '\\t' | '\\r' '\\n' | '\\n' )+
			{
			// com/facebook/swift/parser/antlr/Thrift.g:284:7: ( ' ' | '\\t' | '\\r' '\\n' | '\\n' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=5;
				switch ( input.LA(1) ) {
				case ' ':
					{
					alt13=1;
					}
					break;
				case '\t':
					{
					alt13=2;
					}
					break;
				case '\r':
					{
					alt13=3;
					}
					break;
				case '\n':
					{
					alt13=4;
					}
					break;
				}
				switch (alt13) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:284:8: ' '
					{
					match(' '); 
					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/Thrift.g:284:14: '\\t'
					{
					match('\t'); 
					}
					break;
				case 3 :
					// com/facebook/swift/parser/antlr/Thrift.g:284:21: '\\r' '\\n'
					{
					match('\r'); 
					match('\n'); 
					}
					break;
				case 4 :
					// com/facebook/swift/parser/antlr/Thrift.g:284:33: '\\n'
					{
					match('\n'); 
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/facebook/swift/parser/antlr/Thrift.g:288:5: ( '/*' ( options {greedy=false; } : . )* '*/' | ( '//' | '#' ) (~ '\\n' )* )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='/') ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1=='*') ) {
					alt17=1;
				}
				else if ( (LA17_1=='/') ) {
					alt17=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA17_0=='#') ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// com/facebook/swift/parser/antlr/Thrift.g:288:7: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// com/facebook/swift/parser/antlr/Thrift.g:288:12: ( options {greedy=false; } : . )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0=='*') ) {
							int LA14_1 = input.LA(2);
							if ( (LA14_1=='/') ) {
								alt14=2;
							}
							else if ( ((LA14_1 >= '\u0000' && LA14_1 <= '.')||(LA14_1 >= '0' && LA14_1 <= '\uFFFF')) ) {
								alt14=1;
							}

						}
						else if ( ((LA14_0 >= '\u0000' && LA14_0 <= ')')||(LA14_0 >= '+' && LA14_0 <= '\uFFFF')) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// com/facebook/swift/parser/antlr/Thrift.g:288:39: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop14;
						}
					}

					match("*/"); 

					 _channel = HIDDEN; 
					}
					break;
				case 2 :
					// com/facebook/swift/parser/antlr/Thrift.g:289:7: ( '//' | '#' ) (~ '\\n' )*
					{
					// com/facebook/swift/parser/antlr/Thrift.g:289:7: ( '//' | '#' )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0=='/') ) {
						alt15=1;
					}
					else if ( (LA15_0=='#') ) {
						alt15=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// com/facebook/swift/parser/antlr/Thrift.g:289:8: '//'
							{
							match("//"); 

							}
							break;
						case 2 :
							// com/facebook/swift/parser/antlr/Thrift.g:289:15: '#'
							{
							match('#'); 
							}
							break;

					}

					// com/facebook/swift/parser/antlr/Thrift.g:289:20: (~ '\\n' )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( ((LA16_0 >= '\u0000' && LA16_0 <= '\t')||(LA16_0 >= '\u000B' && LA16_0 <= '\uFFFF')) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// com/facebook/swift/parser/antlr/Thrift.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop16;
						}
					}

					 _channel = HIDDEN; 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// com/facebook/swift/parser/antlr/Thrift.g:1:8: ( T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | INTEGER | HEX_INTEGER | DOUBLE | TYPE_BOOL | TYPE_BYTE | TYPE_I16 | TYPE_I32 | TYPE_I64 | TYPE_DOUBLE | TYPE_STRING | TYPE_BINARY | LITERAL | IDENTIFIER | COMMA | WS | COMMENT )
		int alt18=52;
		alt18 = dfa18.predict(input);
		switch (alt18) {
			case 1 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:10: T__53
				{
				mT__53(); 

				}
				break;
			case 2 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:16: T__54
				{
				mT__54(); 

				}
				break;
			case 3 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:22: T__55
				{
				mT__55(); 

				}
				break;
			case 4 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:28: T__56
				{
				mT__56(); 

				}
				break;
			case 5 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:34: T__57
				{
				mT__57(); 

				}
				break;
			case 6 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:40: T__58
				{
				mT__58(); 

				}
				break;
			case 7 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:46: T__59
				{
				mT__59(); 

				}
				break;
			case 8 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:52: T__60
				{
				mT__60(); 

				}
				break;
			case 9 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:58: T__61
				{
				mT__61(); 

				}
				break;
			case 10 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:64: T__62
				{
				mT__62(); 

				}
				break;
			case 11 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:70: T__63
				{
				mT__63(); 

				}
				break;
			case 12 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:76: T__64
				{
				mT__64(); 

				}
				break;
			case 13 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:82: T__65
				{
				mT__65(); 

				}
				break;
			case 14 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:88: T__66
				{
				mT__66(); 

				}
				break;
			case 15 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:94: T__67
				{
				mT__67(); 

				}
				break;
			case 16 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:100: T__68
				{
				mT__68(); 

				}
				break;
			case 17 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:106: T__69
				{
				mT__69(); 

				}
				break;
			case 18 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:112: T__70
				{
				mT__70(); 

				}
				break;
			case 19 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:118: T__71
				{
				mT__71(); 

				}
				break;
			case 20 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:124: T__72
				{
				mT__72(); 

				}
				break;
			case 21 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:130: T__73
				{
				mT__73(); 

				}
				break;
			case 22 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:136: T__74
				{
				mT__74(); 

				}
				break;
			case 23 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:142: T__75
				{
				mT__75(); 

				}
				break;
			case 24 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:148: T__76
				{
				mT__76(); 

				}
				break;
			case 25 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:154: T__77
				{
				mT__77(); 

				}
				break;
			case 26 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:160: T__78
				{
				mT__78(); 

				}
				break;
			case 27 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:166: T__79
				{
				mT__79(); 

				}
				break;
			case 28 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:172: T__80
				{
				mT__80(); 

				}
				break;
			case 29 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:178: T__81
				{
				mT__81(); 

				}
				break;
			case 30 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:184: T__82
				{
				mT__82(); 

				}
				break;
			case 31 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:190: T__83
				{
				mT__83(); 

				}
				break;
			case 32 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:196: T__84
				{
				mT__84(); 

				}
				break;
			case 33 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:202: T__85
				{
				mT__85(); 

				}
				break;
			case 34 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:208: T__86
				{
				mT__86(); 

				}
				break;
			case 35 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:214: T__87
				{
				mT__87(); 

				}
				break;
			case 36 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:220: T__88
				{
				mT__88(); 

				}
				break;
			case 37 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:226: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 38 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:234: HEX_INTEGER
				{
				mHEX_INTEGER(); 

				}
				break;
			case 39 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:246: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 40 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:253: TYPE_BOOL
				{
				mTYPE_BOOL(); 

				}
				break;
			case 41 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:263: TYPE_BYTE
				{
				mTYPE_BYTE(); 

				}
				break;
			case 42 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:273: TYPE_I16
				{
				mTYPE_I16(); 

				}
				break;
			case 43 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:282: TYPE_I32
				{
				mTYPE_I32(); 

				}
				break;
			case 44 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:291: TYPE_I64
				{
				mTYPE_I64(); 

				}
				break;
			case 45 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:300: TYPE_DOUBLE
				{
				mTYPE_DOUBLE(); 

				}
				break;
			case 46 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:312: TYPE_STRING
				{
				mTYPE_STRING(); 

				}
				break;
			case 47 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:324: TYPE_BINARY
				{
				mTYPE_BINARY(); 

				}
				break;
			case 48 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:336: LITERAL
				{
				mLITERAL(); 

				}
				break;
			case 49 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:344: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 50 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:355: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 51 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:361: WS
				{
				mWS(); 

				}
				break;
			case 52 :
				// com/facebook/swift/parser/antlr/Thrift.g:1:364: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA18 dfa18 = new DFA18(this);
	static final String DFA18_eotS =
		"\1\36\12\uffff\16\43\2\uffff\1\36\2\77\1\uffff\3\43\5\uffff\5\43\1\36"+
		"\21\43\2\uffff\13\43\1\150\1\151\1\152\1\43\1\154\7\43\1\164\14\43\1\u0084"+
		"\3\43\3\uffff\1\u0088\1\uffff\7\43\1\uffff\5\43\1\u0095\1\u0096\1\u0097"+
		"\2\43\1\u009a\1\u009b\3\43\1\uffff\3\43\1\uffff\5\43\1\u00a7\5\43\1\u00ad"+
		"\3\uffff\2\43\2\uffff\7\43\1\u00b7\3\43\1\uffff\1\43\1\u00bc\1\u00bd\1"+
		"\u00be\1\43\1\uffff\1\u00c0\1\u00c1\4\43\1\u00c6\1\u00c7\1\43\1\uffff"+
		"\3\43\1\u00cc\3\uffff\1\u00cd\2\uffff\2\43\1\u00d0\1\43\2\uffff\1\43\1"+
		"\u00d3\1\43\1\u00d5\2\uffff\2\43\1\uffff\1\u00d8\1\u00d9\1\uffff\1\43"+
		"\1\uffff\2\43\2\uffff\1\43\1\u00de\2\43\1\uffff\2\43\1\u00e3\1\u00e4\2"+
		"\uffff";
	static final String DFA18_eofS =
		"\u00e5\uffff";
	static final String DFA18_minS =
		"\1\11\12\uffff\1\163\1\157\1\53\1\61\1\151\2\141\1\156\1\150\2\145\1\150"+
		"\1\156\1\157\2\uffff\1\60\2\56\1\uffff\1\53\1\151\1\157\5\uffff\1\171"+
		"\1\156\1\160\1\165\1\143\1\56\1\143\1\66\1\62\1\64\1\163\1\160\1\155\1"+
		"\145\1\164\1\160\1\161\1\156\2\162\1\160\2\151\2\uffff\1\157\1\164\1\156"+
		"\1\165\1\156\1\163\1\137\1\155\2\145\1\154\3\56\1\164\1\56\1\145\1\167"+
		"\1\151\1\137\2\165\1\166\1\56\1\151\1\157\1\145\1\157\1\144\1\154\1\145"+
		"\1\141\1\142\1\143\1\164\1\151\1\56\1\160\1\156\1\165\3\uffff\1\56\1\uffff"+
		"\1\163\1\141\1\157\1\156\1\151\1\155\1\151\1\uffff\1\143\1\156\1\167\1"+
		"\144\1\156\3\56\1\162\1\154\2\56\1\156\1\141\1\171\1\uffff\1\164\2\144"+
		"\1\uffff\1\160\1\171\1\156\1\141\1\162\1\56\1\143\1\164\1\147\1\163\1"+
		"\145\1\56\3\uffff\1\171\1\145\2\uffff\1\143\1\155\1\160\1\151\1\163\1"+
		"\145\1\141\1\56\1\141\1\155\1\145\1\uffff\1\145\3\56\1\146\1\uffff\2\56"+
		"\1\154\2\145\1\157\2\56\1\143\1\uffff\1\154\1\145\1\144\1\56\3\uffff\1"+
		"\56\2\uffff\1\165\1\163\1\56\1\156\2\uffff\1\145\1\56\1\163\1\56\2\uffff"+
		"\1\144\1\160\1\uffff\2\56\1\uffff\1\160\1\uffff\1\145\1\141\2\uffff\1"+
		"\141\1\56\2\143\1\uffff\2\145\2\56\2\uffff";
	static final String DFA18_maxS =
		"\1\175\12\uffff\1\163\1\160\1\170\1\156\1\151\2\141\1\160\1\150\1\145"+
		"\1\164\1\171\1\156\1\157\2\uffff\1\71\1\170\1\145\1\uffff\1\71\1\171\1"+
		"\157\5\uffff\1\171\1\156\1\160\1\165\1\164\1\172\1\143\1\66\1\62\1\64"+
		"\1\163\1\160\1\155\1\145\1\164\1\160\1\161\1\164\2\162\1\160\2\151\2\uffff"+
		"\1\157\1\164\1\156\1\165\1\156\1\163\1\137\1\155\2\145\1\154\3\172\1\164"+
		"\1\172\1\145\1\167\1\151\1\137\2\165\1\166\1\172\1\165\1\157\1\145\1\157"+
		"\1\144\1\154\1\145\1\141\1\142\1\143\2\164\1\172\1\160\1\156\1\165\3\uffff"+
		"\1\172\1\uffff\1\163\1\141\1\157\1\156\1\151\1\155\1\151\1\uffff\1\143"+
		"\1\156\1\167\1\144\1\156\3\172\1\162\1\154\2\172\1\156\1\141\1\171\1\uffff"+
		"\1\164\2\144\1\uffff\1\160\1\171\1\156\1\141\1\162\1\172\1\143\1\164\1"+
		"\147\1\163\1\145\1\172\3\uffff\1\171\1\145\2\uffff\1\143\1\155\1\160\1"+
		"\151\1\163\1\145\1\141\1\172\1\141\1\155\1\145\1\uffff\1\145\3\172\1\146"+
		"\1\uffff\2\172\1\154\2\145\1\157\2\172\1\143\1\uffff\1\154\1\145\1\144"+
		"\1\172\3\uffff\1\172\2\uffff\1\165\1\163\1\172\1\156\2\uffff\1\145\1\172"+
		"\1\163\1\172\2\uffff\1\144\1\160\1\uffff\2\172\1\uffff\1\160\1\uffff\1"+
		"\145\1\141\2\uffff\1\141\1\172\2\143\1\uffff\2\145\2\172\2\uffff";
	static final String DFA18_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\16\uffff\1\43\1\44"+
		"\3\uffff\1\47\3\uffff\1\60\1\61\1\62\1\63\1\64\27\uffff\1\46\1\45\50\uffff"+
		"\1\52\1\53\1\54\1\uffff\1\25\7\uffff\1\35\17\uffff\1\20\3\uffff\1\24\14"+
		"\uffff\1\42\1\50\1\51\2\uffff\1\13\1\14\13\uffff\1\33\5\uffff\1\41\11"+
		"\uffff\1\27\4\uffff\1\36\1\56\1\37\1\uffff\1\57\1\55\4\uffff\1\22\1\23"+
		"\4\uffff\1\34\1\40\2\uffff\1\17\2\uffff\1\30\1\uffff\1\32\2\uffff\1\21"+
		"\1\26\4\uffff\1\15\4\uffff\1\16\1\31";
	static final String DFA18_specialS =
		"\u00e5\uffff}>";
	static final String[] DFA18_transitionS = {
			"\2\45\2\uffff\1\45\22\uffff\1\45\1\uffff\1\42\1\46\3\uffff\1\42\1\1\1"+
			"\2\1\3\1\33\1\44\1\33\1\uffff\1\46\1\34\11\35\1\4\1\5\1\6\1\7\1\10\2"+
			"\uffff\4\43\1\37\25\43\1\11\1\uffff\1\12\1\uffff\1\43\1\uffff\1\13\1"+
			"\40\1\14\1\41\1\15\3\43\1\16\2\43\1\17\1\20\1\21\1\22\1\23\1\43\1\24"+
			"\1\25\1\26\1\27\1\30\4\43\1\31\1\uffff\1\32",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\47",
			"\1\50\1\51",
			"\1\36\1\uffff\1\36\2\uffff\12\54\64\uffff\1\52\11\uffff\1\53",
			"\1\56\1\uffff\1\57\2\uffff\1\60\67\uffff\1\55",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64\1\uffff\1\65",
			"\1\66",
			"\1\67",
			"\1\70\16\uffff\1\71",
			"\1\72\20\uffff\1\73",
			"\1\74",
			"\1\75",
			"",
			"",
			"\12\35",
			"\1\36\1\uffff\12\35\13\uffff\1\36\37\uffff\1\36\22\uffff\1\76",
			"\1\36\1\uffff\12\35\13\uffff\1\36\37\uffff\1\36",
			"",
			"\1\36\1\uffff\1\36\2\uffff\12\54",
			"\1\102\5\uffff\1\100\11\uffff\1\101",
			"\1\103",
			"",
			"",
			"",
			"",
			"",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110\20\uffff\1\111",
			"\1\43\1\uffff\12\54\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125\3\uffff\1\126\1\uffff\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"",
			"",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\153",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\166\13\uffff\1\165",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081\4\uffff\1\u0082\5\uffff\1\u0083",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"",
			"",
			"",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u0098",
			"\1\u0099",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"",
			"",
			"\1\u00ae",
			"\1\u00af",
			"",
			"",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"",
			"\1\u00bb",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u00bf",
			"",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u00c8",
			"",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"",
			"",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"",
			"\1\u00ce",
			"\1\u00cf",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u00d1",
			"",
			"",
			"\1\u00d2",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u00d4",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"",
			"\1\u00d6",
			"\1\u00d7",
			"",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\u00da",
			"",
			"\1\u00db",
			"\1\u00dc",
			"",
			"",
			"\1\u00dd",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u00df",
			"\1\u00e0",
			"",
			"\1\u00e1",
			"\1\u00e2",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\43\1\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			""
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | INTEGER | HEX_INTEGER | DOUBLE | TYPE_BOOL | TYPE_BYTE | TYPE_I16 | TYPE_I32 | TYPE_I64 | TYPE_DOUBLE | TYPE_STRING | TYPE_BINARY | LITERAL | IDENTIFIER | COMMA | WS | COMMENT );";
		}
	}

}
