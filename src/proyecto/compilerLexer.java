// $ANTLR 3.5.2 compiler.g 2024-03-14 12:20:19
package proyecto;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class compilerLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int BOOLEAN=4;
	public static final int BREAK=5;
	public static final int CASE=6;
	public static final int CCHAR=7;
	public static final int CFLOAT=8;
	public static final int CHAR=9;
	public static final int CINT=10;
	public static final int CLASS=11;
	public static final int COMA=12;
	public static final int COMILLA=13;
	public static final int CORCHA=14;
	public static final int CORCHC=15;
	public static final int CSTRING=16;
	public static final int DEFAULT=17;
	public static final int DIFERENTE=18;
	public static final int DOSPUNTOS=19;
	public static final int DOUBLE=20;
	public static final int END=21;
	public static final int FLOAT=22;
	public static final int ID=23;
	public static final int IGUAL=24;
	public static final int IGUALDAD=25;
	public static final int IN=26;
	public static final int INT=27;
	public static final int LLAVEA=28;
	public static final int LLAVEC=29;
	public static final int MAIN=30;
	public static final int MAYOR=31;
	public static final int MAYORIGUAL=32;
	public static final int MENOR=33;
	public static final int MENORIGUAL=34;
	public static final int OPDIV=35;
	public static final int OPMAS=36;
	public static final int OPMENOS=37;
	public static final int OPMULT=38;
	public static final int OUT=39;
	public static final int PARA=40;
	public static final int PARC=41;
	public static final int PRINTLN=42;
	public static final int PRIVATE=43;
	public static final int PROTECTED=44;
	public static final int PUBLIC=45;
	public static final int PUNTO=46;
	public static final int PUNTOYCOMA=47;
	public static final int STATIC=48;
	public static final int STRING=49;
	public static final int SWITCH=50;
	public static final int SYSTEM=51;
	public static final int VOID=52;
	public static final int WS=53;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public compilerLexer() {} 
	public compilerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public compilerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "compiler.g"; }

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:2:7: ( 'False' )
			// compiler.g:2:9: 'False'
			{
			match("False"); 

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
			// compiler.g:3:7: ( 'True' )
			// compiler.g:3:9: 'True'
			{
			match("True"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:300:7: ( 'switch' )
			// compiler.g:300:9: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:301:6: ( 'break' )
			// compiler.g:301:8: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:302:5: ( 'case' )
			// compiler.g:302:7: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:303:8: ( 'default' )
			// compiler.g:303:10: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT"

	// $ANTLR start "DOSPUNTOS"
	public final void mDOSPUNTOS() throws RecognitionException {
		try {
			int _type = DOSPUNTOS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:304:10: ( ':' )
			// compiler.g:304:12: ':'
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
	// $ANTLR end "DOSPUNTOS"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:347:4: ( ( 'end' | 'END' ) )
			// compiler.g:347:6: ( 'end' | 'END' )
			{
			// compiler.g:347:6: ( 'end' | 'END' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='e') ) {
				alt1=1;
			}
			else if ( (LA1_0=='E') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// compiler.g:347:7: 'end'
					{
					match("end"); 

					}
					break;
				case 2 :
					// compiler.g:347:15: 'END'
					{
					match("END"); 

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
	// $ANTLR end "END"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:351:6: ( 'class' )
			// compiler.g:351:8: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASS"

	// $ANTLR start "PARA"
	public final void mPARA() throws RecognitionException {
		try {
			int _type = PARA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:354:5: ( '(' )
			// compiler.g:354:7: '('
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
	// $ANTLR end "PARA"

	// $ANTLR start "PARC"
	public final void mPARC() throws RecognitionException {
		try {
			int _type = PARC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:355:5: ( ')' )
			// compiler.g:355:7: ')'
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
	// $ANTLR end "PARC"

	// $ANTLR start "LLAVEA"
	public final void mLLAVEA() throws RecognitionException {
		try {
			int _type = LLAVEA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:356:7: ( '{' )
			// compiler.g:356:9: '{'
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
	// $ANTLR end "LLAVEA"

	// $ANTLR start "LLAVEC"
	public final void mLLAVEC() throws RecognitionException {
		try {
			int _type = LLAVEC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:357:7: ( '}' )
			// compiler.g:357:9: '}'
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
	// $ANTLR end "LLAVEC"

	// $ANTLR start "CORCHA"
	public final void mCORCHA() throws RecognitionException {
		try {
			int _type = CORCHA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:358:7: ( '[' )
			// compiler.g:358:9: '['
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
	// $ANTLR end "CORCHA"

	// $ANTLR start "CORCHC"
	public final void mCORCHC() throws RecognitionException {
		try {
			int _type = CORCHC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:359:7: ( ']' )
			// compiler.g:359:9: ']'
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
	// $ANTLR end "CORCHC"

	// $ANTLR start "PUNTO"
	public final void mPUNTO() throws RecognitionException {
		try {
			int _type = PUNTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:362:6: ( '.' )
			// compiler.g:362:8: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUNTO"

	// $ANTLR start "PUNTOYCOMA"
	public final void mPUNTOYCOMA() throws RecognitionException {
		try {
			int _type = PUNTOYCOMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:363:11: ( ';' )
			// compiler.g:363:13: ';'
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
	// $ANTLR end "PUNTOYCOMA"

	// $ANTLR start "COMA"
	public final void mCOMA() throws RecognitionException {
		try {
			int _type = COMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:364:5: ( ',' )
			// compiler.g:364:7: ','
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
	// $ANTLR end "COMA"

	// $ANTLR start "COMILLA"
	public final void mCOMILLA() throws RecognitionException {
		try {
			int _type = COMILLA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:365:8: ( '\"' )
			// compiler.g:365:10: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMILLA"

	// $ANTLR start "IGUAL"
	public final void mIGUAL() throws RecognitionException {
		try {
			int _type = IGUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:368:6: ( '=' )
			// compiler.g:368:8: '='
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
	// $ANTLR end "IGUAL"

	// $ANTLR start "MAYOR"
	public final void mMAYOR() throws RecognitionException {
		try {
			int _type = MAYOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:371:6: ( '>' )
			// compiler.g:371:8: '>'
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
	// $ANTLR end "MAYOR"

	// $ANTLR start "MENOR"
	public final void mMENOR() throws RecognitionException {
		try {
			int _type = MENOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:372:6: ( '<' )
			// compiler.g:372:8: '<'
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
	// $ANTLR end "MENOR"

	// $ANTLR start "MAYORIGUAL"
	public final void mMAYORIGUAL() throws RecognitionException {
		try {
			int _type = MAYORIGUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:373:11: ( '>=' )
			// compiler.g:373:13: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAYORIGUAL"

	// $ANTLR start "MENORIGUAL"
	public final void mMENORIGUAL() throws RecognitionException {
		try {
			int _type = MENORIGUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:374:11: ( '<=' )
			// compiler.g:374:13: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MENORIGUAL"

	// $ANTLR start "IGUALDAD"
	public final void mIGUALDAD() throws RecognitionException {
		try {
			int _type = IGUALDAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:375:9: ( '==' )
			// compiler.g:375:11: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IGUALDAD"

	// $ANTLR start "DIFERENTE"
	public final void mDIFERENTE() throws RecognitionException {
		try {
			int _type = DIFERENTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:376:10: ( '!=' )
			// compiler.g:376:12: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIFERENTE"

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:379:7: ( 'public' )
			// compiler.g:379:9: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUBLIC"

	// $ANTLR start "PRIVATE"
	public final void mPRIVATE() throws RecognitionException {
		try {
			int _type = PRIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:380:8: ( 'private' )
			// compiler.g:380:10: 'private'
			{
			match("private"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRIVATE"

	// $ANTLR start "PROTECTED"
	public final void mPROTECTED() throws RecognitionException {
		try {
			int _type = PROTECTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:381:10: ( 'protected' )
			// compiler.g:381:12: 'protected'
			{
			match("protected"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROTECTED"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:385:7: ( 'String' )
			// compiler.g:385:9: 'String'
			{
			match("String"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:386:4: ( 'int' )
			// compiler.g:386:6: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:387:6: ( 'float' )
			// compiler.g:387:8: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:388:7: ( 'double' )
			// compiler.g:388:9: 'double'
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
	// $ANTLR end "DOUBLE"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:389:8: ( 'boolean' )
			// compiler.g:389:10: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:390:5: ( 'char' )
			// compiler.g:390:7: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:391:5: ( 'void' )
			// compiler.g:391:7: 'void'
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
	// $ANTLR end "VOID"

	// $ANTLR start "STATIC"
	public final void mSTATIC() throws RecognitionException {
		try {
			int _type = STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:394:7: ( 'static' )
			// compiler.g:394:9: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATIC"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:398:5: ( 'main' )
			// compiler.g:398:7: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "SYSTEM"
	public final void mSYSTEM() throws RecognitionException {
		try {
			int _type = SYSTEM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:399:7: ( 'System' )
			// compiler.g:399:9: 'System'
			{
			match("System"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYSTEM"

	// $ANTLR start "OUT"
	public final void mOUT() throws RecognitionException {
		try {
			int _type = OUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:400:4: ( 'out' )
			// compiler.g:400:6: 'out'
			{
			match("out"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OUT"

	// $ANTLR start "PRINTLN"
	public final void mPRINTLN() throws RecognitionException {
		try {
			int _type = PRINTLN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:401:8: ( 'println' )
			// compiler.g:401:10: 'println'
			{
			match("println"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTLN"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:402:3: ( 'in' )
			// compiler.g:402:5: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "OPMAS"
	public final void mOPMAS() throws RecognitionException {
		try {
			int _type = OPMAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:406:6: ( '+' )
			// compiler.g:406:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPMAS"

	// $ANTLR start "OPMENOS"
	public final void mOPMENOS() throws RecognitionException {
		try {
			int _type = OPMENOS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:407:8: ( '-' )
			// compiler.g:407:10: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPMENOS"

	// $ANTLR start "OPDIV"
	public final void mOPDIV() throws RecognitionException {
		try {
			int _type = OPDIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:408:6: ( '/' )
			// compiler.g:408:8: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPDIV"

	// $ANTLR start "OPMULT"
	public final void mOPMULT() throws RecognitionException {
		try {
			int _type = OPMULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:409:7: ( '*' )
			// compiler.g:409:9: '*'
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
	// $ANTLR end "OPMULT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:411:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// compiler.g:411:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// compiler.g:411:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// compiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop2;
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
	// $ANTLR end "ID"

	// $ANTLR start "CCHAR"
	public final void mCCHAR() throws RecognitionException {
		try {
			int _type = CCHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:420:6: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' | ':' | 'á' | 'é' | 'í' | 'ó' | 'ú' | '�?' | 'Ó' | 'Ú' ) '\\'' )
			// compiler.g:420:8: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' | ':' | 'á' | 'é' | 'í' | 'ó' | 'ú' | '�?' | 'Ó' | 'Ú' ) '\\''
			{
			match('\''); 
			// compiler.g:420:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' | ':' | 'á' | 'é' | 'í' | 'ó' | 'ú' | '�?' | 'Ó' | 'Ú' )
			int alt3=14;
			switch ( input.LA(1) ) {
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				{
				alt3=1;
				}
				break;
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				{
				alt3=2;
				}
				break;
			case '_':
				{
				alt3=3;
				}
				break;
			case ' ':
				{
				alt3=4;
				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				{
				alt3=5;
				}
				break;
			case ':':
				{
				alt3=6;
				}
				break;
			case '\u00C3':
				{
				switch ( input.LA(2) ) {
				case '\u00A1':
					{
					alt3=7;
					}
					break;
				case '\u00A9':
					{
					alt3=8;
					}
					break;
				case '\u00AD':
					{
					alt3=9;
					}
					break;
				case '\u00B3':
					{
					alt3=10;
					}
					break;
				case '\u00BA':
					{
					alt3=11;
					}
					break;
				case '\uFFFD':
					{
					alt3=12;
					}
					break;
				case '\u201C':
					{
					alt3=13;
					}
					break;
				case '\u0161':
					{
					alt3=14;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// compiler.g:420:14: 'a' .. 'z'
					{
					matchRange('a','z'); 
					}
					break;
				case 2 :
					// compiler.g:420:27: 'A' .. 'Z'
					{
					matchRange('A','Z'); 
					}
					break;
				case 3 :
					// compiler.g:420:39: '_'
					{
					match('_'); 
					}
					break;
				case 4 :
					// compiler.g:420:45: ' '
					{
					match(' '); 
					}
					break;
				case 5 :
					// compiler.g:420:51: '0' .. '9'
					{
					matchRange('0','9'); 
					}
					break;
				case 6 :
					// compiler.g:420:63: ':'
					{
					match(':'); 
					}
					break;
				case 7 :
					// compiler.g:420:69: 'á'
					{
					match("á"); 

					}
					break;
				case 8 :
					// compiler.g:420:76: 'é'
					{
					match("é"); 

					}
					break;
				case 9 :
					// compiler.g:420:83: 'í'
					{
					match("í"); 

					}
					break;
				case 10 :
					// compiler.g:420:90: 'ó'
					{
					match("ó"); 

					}
					break;
				case 11 :
					// compiler.g:420:97: 'ú'
					{
					match("ú"); 

					}
					break;
				case 12 :
					// compiler.g:420:105: '�?'
					{
					match("�?"); 

					}
					break;
				case 13 :
					// compiler.g:420:112: 'Ó'
					{
					match("Ó"); 

					}
					break;
				case 14 :
					// compiler.g:420:119: 'Ú'
					{
					match("Ú"); 

					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CCHAR"

	// $ANTLR start "CSTRING"
	public final void mCSTRING() throws RecognitionException {
		try {
			int _type = CSTRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:421:8: ( '\\\"' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' | ':' | 'á' | 'é' | 'í' | 'ó' | 'ú' | '�?' | 'Ó' | 'Ú' )* '\\\"' )
			// compiler.g:421:9: '\\\"' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' | ':' | 'á' | 'é' | 'í' | 'ó' | 'ú' | '�?' | 'Ó' | 'Ú' )* '\\\"'
			{
			match('\"'); 
			// compiler.g:421:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | ' ' | '0' .. '9' | ':' | 'á' | 'é' | 'í' | 'ó' | 'ú' | '�?' | 'Ó' | 'Ú' )*
			loop4:
			while (true) {
				int alt4=15;
				switch ( input.LA(1) ) {
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt4=1;
					}
					break;
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					{
					alt4=2;
					}
					break;
				case '_':
					{
					alt4=3;
					}
					break;
				case ' ':
					{
					alt4=4;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					{
					alt4=5;
					}
					break;
				case ':':
					{
					alt4=6;
					}
					break;
				case '\u00C3':
					{
					switch ( input.LA(2) ) {
					case '\u00A1':
						{
						alt4=7;
						}
						break;
					case '\u00A9':
						{
						alt4=8;
						}
						break;
					case '\u00AD':
						{
						alt4=9;
						}
						break;
					case '\u00B3':
						{
						alt4=10;
						}
						break;
					case '\u00BA':
						{
						alt4=11;
						}
						break;
					case '\uFFFD':
						{
						alt4=12;
						}
						break;
					case '\u201C':
						{
						alt4=13;
						}
						break;
					case '\u0161':
						{
						alt4=14;
						}
						break;
					}
					}
					break;
				}
				switch (alt4) {
				case 1 :
					// compiler.g:421:15: 'a' .. 'z'
					{
					matchRange('a','z'); 
					}
					break;
				case 2 :
					// compiler.g:421:28: 'A' .. 'Z'
					{
					matchRange('A','Z'); 
					}
					break;
				case 3 :
					// compiler.g:421:40: '_'
					{
					match('_'); 
					}
					break;
				case 4 :
					// compiler.g:421:46: ' '
					{
					match(' '); 
					}
					break;
				case 5 :
					// compiler.g:421:52: '0' .. '9'
					{
					matchRange('0','9'); 
					}
					break;
				case 6 :
					// compiler.g:421:64: ':'
					{
					match(':'); 
					}
					break;
				case 7 :
					// compiler.g:421:70: 'á'
					{
					match("á"); 

					}
					break;
				case 8 :
					// compiler.g:421:77: 'é'
					{
					match("é"); 

					}
					break;
				case 9 :
					// compiler.g:421:84: 'í'
					{
					match("í"); 

					}
					break;
				case 10 :
					// compiler.g:421:91: 'ó'
					{
					match("ó"); 

					}
					break;
				case 11 :
					// compiler.g:421:98: 'ú'
					{
					match("ú"); 

					}
					break;
				case 12 :
					// compiler.g:421:106: '�?'
					{
					match("�?"); 

					}
					break;
				case 13 :
					// compiler.g:421:113: 'Ó'
					{
					match("Ó"); 

					}
					break;
				case 14 :
					// compiler.g:421:120: 'Ú'
					{
					match("Ú"); 

					}
					break;

				default :
					break loop4;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CSTRING"

	// $ANTLR start "CFLOAT"
	public final void mCFLOAT() throws RecognitionException {
		try {
			int _type = CFLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:422:7: ( ( '0' .. '9' )+ ( '.' )+ ( '0' .. '9' )+ )
			// compiler.g:422:9: ( '0' .. '9' )+ ( '.' )+ ( '0' .. '9' )+
			{
			// compiler.g:422:9: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// compiler.g:
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			// compiler.g:422:22: ( '.' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='.') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// compiler.g:422:22: '.'
					{
					match('.'); 
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			// compiler.g:422:27: ( '0' .. '9' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// compiler.g:
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
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CFLOAT"

	// $ANTLR start "CINT"
	public final void mCINT() throws RecognitionException {
		try {
			int _type = CINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:423:5: ( ( '0' .. '9' )+ )
			// compiler.g:423:7: ( '0' .. '9' )+
			{
			// compiler.g:423:7: ( '0' .. '9' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// compiler.g:
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
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CINT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:523:3: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
			// compiler.g:523:5: ( ' ' | '\\n' | '\\t' | '\\r' )+
			{
			// compiler.g:523:5: ( ' ' | '\\n' | '\\t' | '\\r' )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '\t' && LA9_0 <= '\n')||LA9_0=='\r'||LA9_0==' ') ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// compiler.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			 _channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// compiler.g:1:8: ( T__54 | T__55 | SWITCH | BREAK | CASE | DEFAULT | DOSPUNTOS | END | CLASS | PARA | PARC | LLAVEA | LLAVEC | CORCHA | CORCHC | PUNTO | PUNTOYCOMA | COMA | COMILLA | IGUAL | MAYOR | MENOR | MAYORIGUAL | MENORIGUAL | IGUALDAD | DIFERENTE | PUBLIC | PRIVATE | PROTECTED | STRING | INT | FLOAT | DOUBLE | BOOLEAN | CHAR | VOID | STATIC | MAIN | SYSTEM | OUT | PRINTLN | IN | OPMAS | OPMENOS | OPDIV | OPMULT | ID | CCHAR | CSTRING | CFLOAT | CINT | WS )
		int alt10=52;
		alt10 = dfa10.predict(input);
		switch (alt10) {
			case 1 :
				// compiler.g:1:10: T__54
				{
				mT__54(); 

				}
				break;
			case 2 :
				// compiler.g:1:16: T__55
				{
				mT__55(); 

				}
				break;
			case 3 :
				// compiler.g:1:22: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 4 :
				// compiler.g:1:29: BREAK
				{
				mBREAK(); 

				}
				break;
			case 5 :
				// compiler.g:1:35: CASE
				{
				mCASE(); 

				}
				break;
			case 6 :
				// compiler.g:1:40: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 7 :
				// compiler.g:1:48: DOSPUNTOS
				{
				mDOSPUNTOS(); 

				}
				break;
			case 8 :
				// compiler.g:1:58: END
				{
				mEND(); 

				}
				break;
			case 9 :
				// compiler.g:1:62: CLASS
				{
				mCLASS(); 

				}
				break;
			case 10 :
				// compiler.g:1:68: PARA
				{
				mPARA(); 

				}
				break;
			case 11 :
				// compiler.g:1:73: PARC
				{
				mPARC(); 

				}
				break;
			case 12 :
				// compiler.g:1:78: LLAVEA
				{
				mLLAVEA(); 

				}
				break;
			case 13 :
				// compiler.g:1:85: LLAVEC
				{
				mLLAVEC(); 

				}
				break;
			case 14 :
				// compiler.g:1:92: CORCHA
				{
				mCORCHA(); 

				}
				break;
			case 15 :
				// compiler.g:1:99: CORCHC
				{
				mCORCHC(); 

				}
				break;
			case 16 :
				// compiler.g:1:106: PUNTO
				{
				mPUNTO(); 

				}
				break;
			case 17 :
				// compiler.g:1:112: PUNTOYCOMA
				{
				mPUNTOYCOMA(); 

				}
				break;
			case 18 :
				// compiler.g:1:123: COMA
				{
				mCOMA(); 

				}
				break;
			case 19 :
				// compiler.g:1:128: COMILLA
				{
				mCOMILLA(); 

				}
				break;
			case 20 :
				// compiler.g:1:136: IGUAL
				{
				mIGUAL(); 

				}
				break;
			case 21 :
				// compiler.g:1:142: MAYOR
				{
				mMAYOR(); 

				}
				break;
			case 22 :
				// compiler.g:1:148: MENOR
				{
				mMENOR(); 

				}
				break;
			case 23 :
				// compiler.g:1:154: MAYORIGUAL
				{
				mMAYORIGUAL(); 

				}
				break;
			case 24 :
				// compiler.g:1:165: MENORIGUAL
				{
				mMENORIGUAL(); 

				}
				break;
			case 25 :
				// compiler.g:1:176: IGUALDAD
				{
				mIGUALDAD(); 

				}
				break;
			case 26 :
				// compiler.g:1:185: DIFERENTE
				{
				mDIFERENTE(); 

				}
				break;
			case 27 :
				// compiler.g:1:195: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 28 :
				// compiler.g:1:202: PRIVATE
				{
				mPRIVATE(); 

				}
				break;
			case 29 :
				// compiler.g:1:210: PROTECTED
				{
				mPROTECTED(); 

				}
				break;
			case 30 :
				// compiler.g:1:220: STRING
				{
				mSTRING(); 

				}
				break;
			case 31 :
				// compiler.g:1:227: INT
				{
				mINT(); 

				}
				break;
			case 32 :
				// compiler.g:1:231: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 33 :
				// compiler.g:1:237: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 34 :
				// compiler.g:1:244: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 35 :
				// compiler.g:1:252: CHAR
				{
				mCHAR(); 

				}
				break;
			case 36 :
				// compiler.g:1:257: VOID
				{
				mVOID(); 

				}
				break;
			case 37 :
				// compiler.g:1:262: STATIC
				{
				mSTATIC(); 

				}
				break;
			case 38 :
				// compiler.g:1:269: MAIN
				{
				mMAIN(); 

				}
				break;
			case 39 :
				// compiler.g:1:274: SYSTEM
				{
				mSYSTEM(); 

				}
				break;
			case 40 :
				// compiler.g:1:281: OUT
				{
				mOUT(); 

				}
				break;
			case 41 :
				// compiler.g:1:285: PRINTLN
				{
				mPRINTLN(); 

				}
				break;
			case 42 :
				// compiler.g:1:293: IN
				{
				mIN(); 

				}
				break;
			case 43 :
				// compiler.g:1:296: OPMAS
				{
				mOPMAS(); 

				}
				break;
			case 44 :
				// compiler.g:1:302: OPMENOS
				{
				mOPMENOS(); 

				}
				break;
			case 45 :
				// compiler.g:1:310: OPDIV
				{
				mOPDIV(); 

				}
				break;
			case 46 :
				// compiler.g:1:316: OPMULT
				{
				mOPMULT(); 

				}
				break;
			case 47 :
				// compiler.g:1:323: ID
				{
				mID(); 

				}
				break;
			case 48 :
				// compiler.g:1:326: CCHAR
				{
				mCCHAR(); 

				}
				break;
			case 49 :
				// compiler.g:1:332: CSTRING
				{
				mCSTRING(); 

				}
				break;
			case 50 :
				// compiler.g:1:340: CFLOAT
				{
				mCFLOAT(); 

				}
				break;
			case 51 :
				// compiler.g:1:347: CINT
				{
				mCINT(); 

				}
				break;
			case 52 :
				// compiler.g:1:352: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA10 dfa10 = new DFA10(this);
	static final String DFA10_eotS =
		"\1\uffff\6\43\1\uffff\2\43\11\uffff\1\64\1\67\1\71\1\73\1\uffff\7\43\6"+
		"\uffff\1\106\1\uffff\15\43\10\uffff\4\43\1\132\4\43\2\uffff\13\43\2\152"+
		"\5\43\1\161\1\uffff\3\43\1\165\1\43\1\167\4\43\1\174\1\43\1\176\2\43\1"+
		"\uffff\6\43\1\uffff\1\43\1\u0088\1\u0089\1\uffff\1\u008a\1\uffff\2\43"+
		"\1\u008d\1\43\1\uffff\1\u008f\1\uffff\10\43\1\u0098\3\uffff\1\u0099\1"+
		"\u009a\1\uffff\1\43\1\uffff\1\43\1\u009d\1\u009e\3\43\1\u00a2\1\u00a3"+
		"\3\uffff\1\u00a4\1\u00a5\2\uffff\1\u00a6\1\u00a7\1\43\6\uffff\1\43\1\u00aa"+
		"\1\uffff";
	static final String DFA10_eofS =
		"\u00ab\uffff";
	static final String DFA10_minS =
		"\1\11\1\141\1\162\1\164\1\157\1\141\1\145\1\uffff\1\156\1\116\11\uffff"+
		"\1\40\3\75\1\uffff\1\162\1\164\1\156\1\154\1\157\1\141\1\165\6\uffff\1"+
		"\56\1\uffff\1\154\1\165\1\151\1\141\1\145\1\157\1\163\2\141\1\146\1\165"+
		"\1\144\1\104\10\uffff\1\142\1\151\1\162\1\163\1\60\1\157\2\151\1\164\2"+
		"\uffff\1\163\1\145\2\164\1\141\1\154\1\145\1\163\1\162\1\141\1\142\2\60"+
		"\1\154\1\156\1\164\1\151\1\164\1\60\1\uffff\1\141\1\144\1\156\1\60\1\145"+
		"\1\60\1\143\1\151\1\153\1\145\1\60\1\163\1\60\1\165\1\154\1\uffff\1\151"+
		"\1\141\1\164\1\145\1\156\1\145\1\uffff\1\164\2\60\1\uffff\1\60\1\uffff"+
		"\1\150\1\143\1\60\1\141\1\uffff\1\60\1\uffff\1\154\1\145\1\143\1\164\1"+
		"\154\1\143\1\147\1\155\1\60\3\uffff\2\60\1\uffff\1\156\1\uffff\1\164\2"+
		"\60\1\145\1\156\1\164\2\60\3\uffff\2\60\2\uffff\2\60\1\145\6\uffff\1\144"+
		"\1\60\1\uffff";
	static final String DFA10_maxS =
		"\1\175\1\141\1\162\1\167\1\162\1\154\1\157\1\uffff\1\156\1\116\11\uffff"+
		"\1\u00c3\3\75\1\uffff\1\165\1\171\1\156\1\154\1\157\1\141\1\165\6\uffff"+
		"\1\71\1\uffff\1\154\1\165\1\151\1\141\1\145\1\157\1\163\2\141\1\146\1"+
		"\165\1\144\1\104\10\uffff\1\142\1\157\1\162\1\163\1\172\1\157\2\151\1"+
		"\164\2\uffff\1\163\1\145\2\164\1\141\1\154\1\145\1\163\1\162\1\141\1\142"+
		"\2\172\1\154\1\166\1\164\1\151\1\164\1\172\1\uffff\1\141\1\144\1\156\1"+
		"\172\1\145\1\172\1\143\1\151\1\153\1\145\1\172\1\163\1\172\1\165\1\154"+
		"\1\uffff\1\151\1\141\1\164\1\145\1\156\1\145\1\uffff\1\164\2\172\1\uffff"+
		"\1\172\1\uffff\1\150\1\143\1\172\1\141\1\uffff\1\172\1\uffff\1\154\1\145"+
		"\1\143\1\164\1\154\1\143\1\147\1\155\1\172\3\uffff\2\172\1\uffff\1\156"+
		"\1\uffff\1\164\2\172\1\145\1\156\1\164\2\172\3\uffff\2\172\2\uffff\2\172"+
		"\1\145\6\uffff\1\144\1\172\1\uffff";
	static final String DFA10_acceptS =
		"\7\uffff\1\7\2\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\4\uffff"+
		"\1\32\7\uffff\1\53\1\54\1\55\1\56\1\57\1\60\1\uffff\1\64\15\uffff\1\23"+
		"\1\61\1\31\1\24\1\27\1\25\1\30\1\26\11\uffff\1\62\1\63\23\uffff\1\52\17"+
		"\uffff\1\10\6\uffff\1\37\3\uffff\1\50\1\uffff\1\2\4\uffff\1\5\1\uffff"+
		"\1\43\11\uffff\1\44\1\46\1\1\2\uffff\1\4\1\uffff\1\11\10\uffff\1\40\1"+
		"\3\1\45\2\uffff\1\41\1\33\3\uffff\1\36\1\47\1\42\1\6\1\34\1\51\2\uffff"+
		"\1\35";
	static final String DFA10_specialS =
		"\u00ab\uffff}>";
	static final String[] DFA10_transitionS = {
			"\2\46\2\uffff\1\46\22\uffff\1\46\1\27\1\23\4\uffff\1\44\1\12\1\13\1\42"+
			"\1\37\1\22\1\40\1\20\1\41\12\45\1\7\1\21\1\26\1\24\1\25\2\uffff\4\43"+
			"\1\11\1\1\14\43\1\31\1\2\6\43\1\16\1\uffff\1\17\1\uffff\1\43\1\uffff"+
			"\1\43\1\4\1\5\1\6\1\10\1\33\2\43\1\32\3\43\1\35\1\43\1\36\1\30\2\43\1"+
			"\3\2\43\1\34\4\43\1\14\1\uffff\1\15",
			"\1\47",
			"\1\50",
			"\1\52\2\uffff\1\51",
			"\1\54\2\uffff\1\53",
			"\1\55\6\uffff\1\57\3\uffff\1\56",
			"\1\60\11\uffff\1\61",
			"",
			"\1\62",
			"\1\63",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\65\1\uffff\1\65\15\uffff\13\65\6\uffff\32\65\4\uffff\1\65\1\uffff"+
			"\32\65\110\uffff\1\65",
			"\1\66",
			"\1\70",
			"\1\72",
			"",
			"\1\75\2\uffff\1\74",
			"\1\76\4\uffff\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\105\1\uffff\12\45",
			"",
			"\1\107",
			"\1\110",
			"\1\111",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\124",
			"\1\125\5\uffff\1\126",
			"\1\127",
			"\1\130",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\131\6\43",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"",
			"",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\153",
			"\1\155\7\uffff\1\154",
			"\1\156",
			"\1\157",
			"\1\160",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\162",
			"\1\163",
			"\1\164",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\166",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\175",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\177",
			"\1\u0080",
			"",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"",
			"\1\u0087",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\u008b",
			"\1\u008c",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u008e",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\u009b",
			"",
			"\1\u009c",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u00a8",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00a9",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__54 | T__55 | SWITCH | BREAK | CASE | DEFAULT | DOSPUNTOS | END | CLASS | PARA | PARC | LLAVEA | LLAVEC | CORCHA | CORCHC | PUNTO | PUNTOYCOMA | COMA | COMILLA | IGUAL | MAYOR | MENOR | MAYORIGUAL | MENORIGUAL | IGUALDAD | DIFERENTE | PUBLIC | PRIVATE | PROTECTED | STRING | INT | FLOAT | DOUBLE | BOOLEAN | CHAR | VOID | STATIC | MAIN | SYSTEM | OUT | PRINTLN | IN | OPMAS | OPMENOS | OPDIV | OPMULT | ID | CCHAR | CSTRING | CFLOAT | CINT | WS );";
		}
	}

}
