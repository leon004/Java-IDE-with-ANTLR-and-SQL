// $ANTLR 3.5.2 Expresiones.g 2023-10-02 11:49:22
package proyecto;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExpresionesLexer extends Lexer {
	public static final int EOF=-1;
	public static final int BOOLEANO=4;
	public static final int CADENA=5;
	public static final int CLASE=6;
	public static final int COMA=7;
	public static final int ENTERO=8;
	public static final int EQ=9;
	public static final int FLOAT=10;
	public static final int ID=11;
	public static final int INT=12;
	public static final int INVISIBLE=13;
	public static final int LLAVEABIERTA=14;
	public static final int LLAVECERRADA=15;
	public static final int PARAB=16;
	public static final int PARCE=17;
	public static final int REAL=18;
	public static final int SEMICOLON=19;
	public static final int VACIO=20;
	public static final int VISIBLE=21;
	public static final int WS=22;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExpresionesLexer() {} 
	public ExpresionesLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExpresionesLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Expresiones.g"; }

	// $ANTLR start "CLASE"
	public final void mCLASE() throws RecognitionException {
		try {
			int _type = CLASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:147:6: ( 'clase' )
			// Expresiones.g:147:8: 'clase'
			{
			match("clase"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASE"

	// $ANTLR start "VISIBLE"
	public final void mVISIBLE() throws RecognitionException {
		try {
			int _type = VISIBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:149:8: ( 'visible' )
			// Expresiones.g:149:10: 'visible'
			{
			match("visible"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VISIBLE"

	// $ANTLR start "INVISIBLE"
	public final void mINVISIBLE() throws RecognitionException {
		try {
			int _type = INVISIBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:150:10: ( 'invisible' )
			// Expresiones.g:150:12: 'invisible'
			{
			match("invisible"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INVISIBLE"

	// $ANTLR start "COMA"
	public final void mCOMA() throws RecognitionException {
		try {
			int _type = COMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:152:5: ( ',' )
			// Expresiones.g:152:7: ','
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

	// $ANTLR start "PARAB"
	public final void mPARAB() throws RecognitionException {
		try {
			int _type = PARAB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:153:6: ( '(' )
			// Expresiones.g:153:8: '('
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
	// $ANTLR end "PARAB"

	// $ANTLR start "PARCE"
	public final void mPARCE() throws RecognitionException {
		try {
			int _type = PARCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:154:6: ( ')' )
			// Expresiones.g:154:8: ')'
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
	// $ANTLR end "PARCE"

	// $ANTLR start "LLAVEABIERTA"
	public final void mLLAVEABIERTA() throws RecognitionException {
		try {
			int _type = LLAVEABIERTA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:155:13: ( '{' )
			// Expresiones.g:155:15: '{'
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
	// $ANTLR end "LLAVEABIERTA"

	// $ANTLR start "LLAVECERRADA"
	public final void mLLAVECERRADA() throws RecognitionException {
		try {
			int _type = LLAVECERRADA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:156:13: ( '}' )
			// Expresiones.g:156:15: '}'
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
	// $ANTLR end "LLAVECERRADA"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:157:3: ( '=' )
			// Expresiones.g:157:5: '='
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
	// $ANTLR end "EQ"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:158:10: ( ';' )
			// Expresiones.g:158:12: ';'
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
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "CADENA"
	public final void mCADENA() throws RecognitionException {
		try {
			int _type = CADENA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:161:17: ( 'cadena' )
			// Expresiones.g:161:21: 'cadena'
			{
			match("cadena"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CADENA"

	// $ANTLR start "ENTERO"
	public final void mENTERO() throws RecognitionException {
		try {
			int _type = ENTERO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:162:17: ( 'entero' )
			// Expresiones.g:162:21: 'entero'
			{
			match("entero"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENTERO"

	// $ANTLR start "REAL"
	public final void mREAL() throws RecognitionException {
		try {
			int _type = REAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:163:17: ( 'real' )
			// Expresiones.g:163:21: 'real'
			{
			match("real"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REAL"

	// $ANTLR start "VACIO"
	public final void mVACIO() throws RecognitionException {
		try {
			int _type = VACIO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:164:17: ( 'vacio' )
			// Expresiones.g:164:21: 'vacio'
			{
			match("vacio"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VACIO"

	// $ANTLR start "BOOLEANO"
	public final void mBOOLEANO() throws RecognitionException {
		try {
			int _type = BOOLEANO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:165:11: ( 'booleano' )
			// Expresiones.g:165:13: 'booleano'
			{
			match("booleano"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEANO"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:169:9: ( ( '0' .. '9' )+ )
			// Expresiones.g:169:11: ( '0' .. '9' )+
			{
			// Expresiones.g:169:11: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Expresiones.g:
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

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
			// Expresiones.g:170:9: ( INT '.' INT )
			// Expresiones.g:170:11: INT '.' INT
			{
			mINT(); 

			match('.'); 
			mINT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:174:9: ( ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// Expresiones.g:174:11: ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Expresiones.g:174:34: ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Expresiones.g:
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expresiones.g:176:9: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
			// Expresiones.g:176:11: ( ' ' | '\\n' | '\\t' | '\\r' )+
			{
			// Expresiones.g:176:11: ( ' ' | '\\n' | '\\t' | '\\r' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Expresiones.g:
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
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
		// Expresiones.g:1:8: ( CLASE | VISIBLE | INVISIBLE | COMA | PARAB | PARCE | LLAVEABIERTA | LLAVECERRADA | EQ | SEMICOLON | CADENA | ENTERO | REAL | VACIO | BOOLEANO | INT | FLOAT | ID | WS )
		int alt4=19;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// Expresiones.g:1:10: CLASE
				{
				mCLASE(); 

				}
				break;
			case 2 :
				// Expresiones.g:1:16: VISIBLE
				{
				mVISIBLE(); 

				}
				break;
			case 3 :
				// Expresiones.g:1:24: INVISIBLE
				{
				mINVISIBLE(); 

				}
				break;
			case 4 :
				// Expresiones.g:1:34: COMA
				{
				mCOMA(); 

				}
				break;
			case 5 :
				// Expresiones.g:1:39: PARAB
				{
				mPARAB(); 

				}
				break;
			case 6 :
				// Expresiones.g:1:45: PARCE
				{
				mPARCE(); 

				}
				break;
			case 7 :
				// Expresiones.g:1:51: LLAVEABIERTA
				{
				mLLAVEABIERTA(); 

				}
				break;
			case 8 :
				// Expresiones.g:1:64: LLAVECERRADA
				{
				mLLAVECERRADA(); 

				}
				break;
			case 9 :
				// Expresiones.g:1:77: EQ
				{
				mEQ(); 

				}
				break;
			case 10 :
				// Expresiones.g:1:80: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 11 :
				// Expresiones.g:1:90: CADENA
				{
				mCADENA(); 

				}
				break;
			case 12 :
				// Expresiones.g:1:97: ENTERO
				{
				mENTERO(); 

				}
				break;
			case 13 :
				// Expresiones.g:1:104: REAL
				{
				mREAL(); 

				}
				break;
			case 14 :
				// Expresiones.g:1:109: VACIO
				{
				mVACIO(); 

				}
				break;
			case 15 :
				// Expresiones.g:1:115: BOOLEANO
				{
				mBOOLEANO(); 

				}
				break;
			case 16 :
				// Expresiones.g:1:124: INT
				{
				mINT(); 

				}
				break;
			case 17 :
				// Expresiones.g:1:128: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 18 :
				// Expresiones.g:1:134: ID
				{
				mID(); 

				}
				break;
			case 19 :
				// Expresiones.g:1:137: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\1\uffff\3\17\7\uffff\3\17\1\31\2\uffff\10\17\2\uffff\16\17\1\61\1\17"+
		"\1\63\2\17\1\66\2\17\1\uffff\1\17\1\uffff\1\72\1\17\1\uffff\1\17\1\75"+
		"\1\17\1\uffff\1\77\1\17\1\uffff\1\17\1\uffff\1\17\1\103\1\104\2\uffff";
	static final String DFA4_eofS =
		"\105\uffff";
	static final String DFA4_minS =
		"\1\11\2\141\1\156\7\uffff\1\156\1\145\1\157\1\56\2\uffff\1\141\1\144\1"+
		"\163\1\143\1\166\1\164\1\141\1\157\2\uffff\1\163\1\145\3\151\1\145\2\154"+
		"\1\145\1\156\1\142\1\157\1\163\1\162\1\60\1\145\1\60\1\141\1\154\1\60"+
		"\1\151\1\157\1\uffff\1\141\1\uffff\1\60\1\145\1\uffff\1\142\1\60\1\156"+
		"\1\uffff\1\60\1\154\1\uffff\1\157\1\uffff\1\145\2\60\2\uffff";
	static final String DFA4_maxS =
		"\1\175\1\154\1\151\1\156\7\uffff\1\156\1\145\1\157\1\71\2\uffff\1\141"+
		"\1\144\1\163\1\143\1\166\1\164\1\141\1\157\2\uffff\1\163\1\145\3\151\1"+
		"\145\2\154\1\145\1\156\1\142\1\157\1\163\1\162\1\172\1\145\1\172\1\141"+
		"\1\154\1\172\1\151\1\157\1\uffff\1\141\1\uffff\1\172\1\145\1\uffff\1\142"+
		"\1\172\1\156\1\uffff\1\172\1\154\1\uffff\1\157\1\uffff\1\145\2\172\2\uffff";
	static final String DFA4_acceptS =
		"\4\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\4\uffff\1\22\1\23\10\uffff\1\20"+
		"\1\21\26\uffff\1\15\1\uffff\1\1\2\uffff\1\16\3\uffff\1\13\2\uffff\1\14"+
		"\1\uffff\1\2\3\uffff\1\17\1\3";
	static final String DFA4_specialS =
		"\105\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\20\2\uffff\1\20\22\uffff\1\20\7\uffff\1\5\1\6\2\uffff\1\4\3\uffff"+
			"\12\16\1\uffff\1\12\1\uffff\1\11\3\uffff\32\17\4\uffff\1\17\1\uffff\1"+
			"\17\1\15\1\1\1\17\1\13\3\17\1\3\10\17\1\14\3\17\1\2\4\17\1\7\1\uffff"+
			"\1\10",
			"\1\22\12\uffff\1\21",
			"\1\24\7\uffff\1\23",
			"\1\25",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\26",
			"\1\27",
			"\1\30",
			"\1\32\1\uffff\12\16",
			"",
			"",
			"\1\33",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"",
			"",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\1\62",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\1\64",
			"\1\65",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\1\67",
			"\1\70",
			"",
			"\1\71",
			"",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\1\73",
			"",
			"\1\74",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\1\76",
			"",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\1\100",
			"",
			"\1\101",
			"",
			"\1\102",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( CLASE | VISIBLE | INVISIBLE | COMA | PARAB | PARCE | LLAVEABIERTA | LLAVECERRADA | EQ | SEMICOLON | CADENA | ENTERO | REAL | VACIO | BOOLEANO | INT | FLOAT | ID | WS );";
		}
	}

}
