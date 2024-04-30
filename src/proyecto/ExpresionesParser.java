// $ANTLR 3.5.2 Expresiones.g 2023-10-02 11:49:22

    // manda el import hasta la seccion de imports del codigo generado..
package proyecto;
    import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExpresionesParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLEANO", "CADENA", "CLASE", 
		"COMA", "ENTERO", "EQ", "FLOAT", "ID", "INT", "INVISIBLE", "LLAVEABIERTA", 
		"LLAVECERRADA", "PARAB", "PARCE", "REAL", "SEMICOLON", "VACIO", "VISIBLE", 
		"WS"
	};
	private javax.swing.JTextArea salida;
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

	public void setSalida(javax.swing.JTextArea _salida){
		salida=_salida;
	}
	
	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ExpresionesParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExpresionesParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ExpresionesParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Expresiones.g"; }


	    HashMap memory = new HashMap();
	    private int codigoEntero=1;
	    private int codigoReal=2;

	    public void displayRecognitionError (String [] tokenNames, RecognitionException e) {
	        String hdr = getErrorHeader(e);
	        String msg = getErrorMessage(e, tokenNames);
	        salida.append("Error sintactico: " + hdr +" " +msg+"\n");
	    }



	// $ANTLR start "asignacion"
	// Expresiones.g:20:1: asignacion : modificadorAcceso CLASE ID LLAVEABIERTA ( miembro )* LLAVECERRADA ;
	public final void asignacion() throws RecognitionException {
		try {
			// Expresiones.g:20:12: ( modificadorAcceso CLASE ID LLAVEABIERTA ( miembro )* LLAVECERRADA )
			// Expresiones.g:20:17: modificadorAcceso CLASE ID LLAVEABIERTA ( miembro )* LLAVECERRADA
			{
			pushFollow(FOLLOW_modificadorAcceso_in_asignacion24);
			modificadorAcceso();
			state._fsp--;

			match(input,CLASE,FOLLOW_CLASE_in_asignacion26); 
			match(input,ID,FOLLOW_ID_in_asignacion28); 
			match(input,LLAVEABIERTA,FOLLOW_LLAVEABIERTA_in_asignacion50); 
			// Expresiones.g:22:21: ( miembro )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==INVISIBLE||LA1_0==VISIBLE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Expresiones.g:22:21: miembro
					{
					pushFollow(FOLLOW_miembro_in_asignacion72);
					miembro();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,LLAVECERRADA,FOLLOW_LLAVECERRADA_in_asignacion95); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "asignacion"



	// $ANTLR start "miembro"
	// Expresiones.g:26:1: miembro : ( atributo | metodo );
	public final void miembro() throws RecognitionException {
		try {
			// Expresiones.g:26:8: ( atributo | metodo )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==INVISIBLE||LA2_0==VISIBLE) ) {
				int LA2_1 = input.LA(2);
				if ( ((LA2_1 >= BOOLEANO && LA2_1 <= CADENA)||LA2_1==ENTERO||LA2_1==REAL) ) {
					int LA2_2 = input.LA(3);
					if ( (LA2_2==ID) ) {
						int LA2_4 = input.LA(4);
						if ( (LA2_4==COMA||LA2_4==SEMICOLON) ) {
							alt2=1;
						}
						else if ( (LA2_4==PARAB) ) {
							alt2=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA2_1==VACIO) ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Expresiones.g:26:10: atributo
					{
					pushFollow(FOLLOW_atributo_in_miembro123);
					atributo();
					state._fsp--;

					}
					break;
				case 2 :
					// Expresiones.g:26:21: metodo
					{
					pushFollow(FOLLOW_metodo_in_miembro127);
					metodo();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "miembro"



	// $ANTLR start "atributo"
	// Expresiones.g:28:1: atributo : modAccess= modificadorAcceso declVar ;
	public final void atributo() throws RecognitionException {
		ParserRuleReturnScope modAccess =null;

		try {
			// Expresiones.g:28:10: (modAccess= modificadorAcceso declVar )
			// Expresiones.g:28:12: modAccess= modificadorAcceso declVar
			{
			pushFollow(FOLLOW_modificadorAcceso_in_atributo140);
			modAccess=modificadorAcceso();
			state._fsp--;

			salida.append("Modificador de acceso: " + (modAccess!=null?input.toString(modAccess.start,modAccess.stop):null)+"\n");
			pushFollow(FOLLOW_declVar_in_atributo144);
			declVar();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "atributo"



	// $ANTLR start "metodo"
	// Expresiones.g:31:1: metodo : modificadorAcceso tipoDatoMetodo idMetodo= ID PARAB ( parametro )? PARCE LLAVEABIERTA ( sentencia )* LLAVECERRADA ;
	public final void metodo() throws RecognitionException {
		Token idMetodo=null;

		try {
			// Expresiones.g:31:9: ( modificadorAcceso tipoDatoMetodo idMetodo= ID PARAB ( parametro )? PARCE LLAVEABIERTA ( sentencia )* LLAVECERRADA )
			// Expresiones.g:31:11: modificadorAcceso tipoDatoMetodo idMetodo= ID PARAB ( parametro )? PARCE LLAVEABIERTA ( sentencia )* LLAVECERRADA
			{
			pushFollow(FOLLOW_modificadorAcceso_in_metodo155);
			modificadorAcceso();
			state._fsp--;

			pushFollow(FOLLOW_tipoDatoMetodo_in_metodo157);
			tipoDatoMetodo();
			state._fsp--;

			idMetodo=(Token)match(input,ID,FOLLOW_ID_in_metodo161); 
			salida.append("Comienza metodo: " + (idMetodo!=null?idMetodo.getText():null)+"\n");
			match(input,PARAB,FOLLOW_PARAB_in_metodo172); 
			// Expresiones.g:32:13: ( parametro )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= BOOLEANO && LA3_0 <= CADENA)||LA3_0==ENTERO||LA3_0==REAL) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Expresiones.g:32:13: parametro
					{
					pushFollow(FOLLOW_parametro_in_metodo174);
					parametro();
					state._fsp--;

					}
					break;

			}

			match(input,PARCE,FOLLOW_PARCE_in_metodo177); 
			match(input,LLAVEABIERTA,FOLLOW_LLAVEABIERTA_in_metodo187); 
			// Expresiones.g:34:10: ( sentencia )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= BOOLEANO && LA4_0 <= CADENA)||LA4_0==ENTERO||LA4_0==ID||LA4_0==REAL) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Expresiones.g:34:10: sentencia
					{
					pushFollow(FOLLOW_sentencia_in_metodo199);
					sentencia();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			match(input,LLAVECERRADA,FOLLOW_LLAVECERRADA_in_metodo211); 
			salida.append("Termina metodo: " + (idMetodo!=null?idMetodo.getText():null)+"\n");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "metodo"



	// $ANTLR start "sentencia"
	// Expresiones.g:38:1: sentencia : (id= ID EQ expr1= expr SEMICOLON | declVar );
	public final void sentencia() throws RecognitionException {
		Token id=null;
		ParserRuleReturnScope expr1 =null;

		try {
			// Expresiones.g:38:11: (id= ID EQ expr1= expr SEMICOLON | declVar )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				alt5=1;
			}
			else if ( ((LA5_0 >= BOOLEANO && LA5_0 <= CADENA)||LA5_0==ENTERO||LA5_0==REAL) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// Expresiones.g:38:13: id= ID EQ expr1= expr SEMICOLON
					{
					id=(Token)match(input,ID,FOLLOW_ID_in_sentencia232); 
					match(input,EQ,FOLLOW_EQ_in_sentencia234); 
					pushFollow(FOLLOW_expr_in_sentencia238);
					expr1=expr();
					state._fsp--;


							Integer simbolo = (Integer) memory.get((id!=null?id.getText():null));
					           if (simbolo==null) salida.append("Var no declarada: "+(id!=null?id.getText():null)+"\n");
					           else{  
					                int tipoID = simbolo.intValue(); 
					                         salida.append("id: "+(id!=null?id.getText():null) + " tipo:"+tipoID+"\n");
					                int tipoExprDerecha =(expr1!=null?((ExpresionesParser.expr_return)expr1).valTipo:0);
					                   if (tipoExprDerecha==0){  // es algo como x= yyy;
					                         // si (expr1!=null?((ExpresionesParser.expr_return)expr1).valTipo:0) es 0, significa que "expr" es un ID 
					                         // entonces debemos averiguar el tipo del ID en 
					                         // la tabla de símbolos, también puede darse el caso de 
					                         // que no esté, en cuyo caso es un error, por var no definida
					                   }
					                // pintamos el tipo de expr para tracear
					                salida.append("expr: "+(expr1!=null?input.toString(expr1.start,expr1.stop):null)+ " tipo: "+(expr1!=null?((ExpresionesParser.expr_return)expr1).valTipo:0)+"\n");
					                if(tipoID!=tipoExprDerecha){
					                   salida.append("Error de tipo con: "+(id!=null?id.getText():null)+" = "+(expr1!=null?input.toString(expr1.start,expr1.stop):null)+"\n");  
					                }
					               }  
					        
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_sentencia244); 
					}
					break;
				case 2 :
					// Expresiones.g:58:14: declVar
					{
					pushFollow(FOLLOW_declVar_in_sentencia248);
					declVar();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sentencia"


	public static class expr_return extends ParserRuleReturnScope {
		public int valTipo;
	};


	// $ANTLR start "expr"
	// Expresiones.g:61:1: expr returns [int valTipo] : ( INT | FLOAT | ID );
	public final ExpresionesParser.expr_return expr() throws RecognitionException {
		ExpresionesParser.expr_return retval = new ExpresionesParser.expr_return();
		retval.start = input.LT(1);

		try {
			// Expresiones.g:61:27: ( INT | FLOAT | ID )
			int alt6=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt6=1;
				}
				break;
			case FLOAT:
				{
				alt6=2;
				}
				break;
			case ID:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// Expresiones.g:61:30: INT
					{
					match(input,INT,FOLLOW_INT_in_expr262); 
					retval.valTipo = 1;
					}
					break;
				case 2 :
					// Expresiones.g:62:30: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_expr297); 
					retval.valTipo = 2;
					}
					break;
				case 3 :
					// Expresiones.g:63:30: ID
					{
					match(input,ID,FOLLOW_ID_in_expr331); 
					retval.valTipo = 0;
					}
					break;

			}
			retval.stop = input.LT(-1);

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
	// $ANTLR end "expr"



	// $ANTLR start "declVar"
	// Expresiones.g:68:1: declVar : t1= tipoDato id1= ID ( ',' id2= ID )* SEMICOLON ;
	public final void declVar() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope t1 =null;

		try {
			// Expresiones.g:68:10: (t1= tipoDato id1= ID ( ',' id2= ID )* SEMICOLON )
			// Expresiones.g:68:12: t1= tipoDato id1= ID ( ',' id2= ID )* SEMICOLON
			{
			pushFollow(FOLLOW_tipoDato_in_declVar376);
			t1=tipoDato();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_declVar380); 

								Integer previa = (Integer)memory.get((id1!=null?id1.getText():null));
								if(previa == null){
									String sTipo = (t1!=null?input.toString(t1.start,t1.stop):null);
									if(sTipo.compareTo("entero") == 0){
										memory.put((id1!=null?id1.getText():null), Integer.valueOf(codigoEntero));
										salida.append("A TSYM Decl arg Var: " + (id1!=null?id1.getText():null) + " tipo:" + sTipo+" : " + codigoEntero+"\n");
									} else if(sTipo.compareTo("real") == 0){
										memory.put((id1!=null?id1.getText():null), Integer.valueOf(codigoReal));
										salida.append("A TSYM Decl arg Var: " + (id1!=null?id1.getText():null) + " tipo:" + sTipo+" : " + codigoReal+"\n");
									}
								} else {
									salida.append("ERROR: Variable ya declarada: " + (id1!=null?id1.getText():null)+"\n");
								}
							
			// Expresiones.g:84:5: ( ',' id2= ID )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==COMA) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Expresiones.g:84:6: ',' id2= ID
					{
					match(input,COMA,FOLLOW_COMA_in_declVar395); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_declVar399); 

										Integer previa2 = (Integer)memory.get((id2!=null?id2.getText():null));
										if(previa2 == null){
											String sTipo = (t1!=null?input.toString(t1.start,t1.stop):null);
											if(sTipo.compareTo("entero") == 0){
												memory.put((id2!=null?id2.getText():null), Integer.valueOf(codigoEntero));
												salida.append("A TSYM Decl arg Var: " + (id2!=null?id2.getText():null) + " tipo:" + sTipo+" : " + codigoEntero+"\n");
											} else if(sTipo.compareTo("real") == 0){
												memory.put((id2!=null?id2.getText():null), Integer.valueOf(codigoReal));
												salida.append("A TSYM Decl arg Var: " + (id2!=null?id2.getText():null) + " tipo:" + sTipo+" : " + codigoReal+"\n");
											}
										} else {
											salida.append("ERROR: Variable ya declarada: " + (id2!=null?id2.getText():null)+"\n");
										}
									
					}
					break;

				default :
					break loop7;
				}
			}

			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declVar420); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declVar"



	// $ANTLR start "parametro"
	// Expresiones.g:104:1: parametro : (t1= tipoDato v1= ID ) ( ',' t2= tipoDato v2= ID )* ;
	public final void parametro() throws RecognitionException {
		Token v1=null;
		Token v2=null;
		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;

		try {
			// Expresiones.g:104:11: ( (t1= tipoDato v1= ID ) ( ',' t2= tipoDato v2= ID )* )
			// Expresiones.g:104:13: (t1= tipoDato v1= ID ) ( ',' t2= tipoDato v2= ID )*
			{
			// Expresiones.g:104:13: (t1= tipoDato v1= ID )
			// Expresiones.g:104:14: t1= tipoDato v1= ID
			{
			pushFollow(FOLLOW_tipoDato_in_parametro432);
			t1=tipoDato();
			state._fsp--;

			v1=(Token)match(input,ID,FOLLOW_ID_in_parametro436); 

								Integer previa3 = (Integer)memory.get((v1!=null?v1.getText():null));
								if(previa3 == null){
									String sTipo = (t1!=null?input.toString(t1.start,t1.stop):null);
									if(sTipo.compareTo("entero")==0){
										memory.put((v1!=null?v1.getText():null), Integer.valueOf(codigoEntero));
										salida.append("A TSYM Decl arg Var: " + (v1!=null?v1.getText():null) + " tipo:" + sTipo+" : " + codigoEntero+"\n");
									} else if(sTipo.compareTo("real") == 0){
										memory.put((v1!=null?v1.getText():null), Integer.valueOf(codigoReal));
										salida.append("A TSYM Decl arg Var: " + (v1!=null?v1.getText():null) + " tipo:" + sTipo+" : " + codigoReal+"\n");
									}
								}else{
									salida.append("ERROR: Variable ya declarada: " + (v1!=null?v1.getText():null));
								}
								salida.append("Parametro: " + (t1!=null?input.toString(t1.start,t1.stop):null) + " " + (v1!=null?v1.getText():null)+"\n");
							
			}

			// Expresiones.g:121:5: ( ',' t2= tipoDato v2= ID )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Expresiones.g:121:6: ',' t2= tipoDato v2= ID
					{
					match(input,COMA,FOLLOW_COMA_in_parametro452); 
					pushFollow(FOLLOW_tipoDato_in_parametro456);
					t2=tipoDato();
					state._fsp--;

					v2=(Token)match(input,ID,FOLLOW_ID_in_parametro460); 

										Integer previa4 = (Integer)memory.get((v2!=null?v2.getText():null));
										if(previa4 == null){
											String sTipo = (t2!=null?input.toString(t2.start,t2.stop):null);
											if(sTipo.compareTo("entero")==0){
												memory.put((v2!=null?v2.getText():null), Integer.valueOf(codigoEntero));
												salida.append("A TSYM Decl arg Var: " + (v2!=null?v2.getText():null) + " tipo:" + sTipo+" : " + codigoEntero+"\n");
											} else if(sTipo.compareTo("real") == 0){
												memory.put((v2!=null?v2.getText():null), Integer.valueOf(codigoReal));
												salida.append("A TSYM Decl arg Var: " + (v2!=null?v2.getText():null) + " tipo:" + sTipo+" : " + codigoReal+"\n");
											}
										}else{
											salida.append("ERROR: Variable ya declarada: " + (v2!=null?v2.getText():null)+"\n");
										}
										// salida.append("Parametro: " + (t1!=null?input.toString(t1.start,t1.stop):null) + " " + (v1!=null?v1.getText():null));
										// salida.append("Parametro: " + (t2!=null?input.toString(t2.start,t2.stop):null) + " " + (v2!=null?v2.getText():null));
									
					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parametro"


	public static class tipoDato_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "tipoDato"
	// Expresiones.g:140:1: tipoDato : ( ENTERO | CADENA | REAL | BOOLEANO );
	public final ExpresionesParser.tipoDato_return tipoDato() throws RecognitionException {
		ExpresionesParser.tipoDato_return retval = new ExpresionesParser.tipoDato_return();
		retval.start = input.LT(1);

		try {
			// Expresiones.g:140:10: ( ENTERO | CADENA | REAL | BOOLEANO )
			// Expresiones.g:
			{
			if ( (input.LA(1) >= BOOLEANO && input.LA(1) <= CADENA)||input.LA(1)==ENTERO||input.LA(1)==REAL ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "tipoDato"



	// $ANTLR start "tipoDatoMetodo"
	// Expresiones.g:142:1: tipoDatoMetodo : ( ENTERO | CADENA | VACIO | REAL | BOOLEANO );
	public final void tipoDatoMetodo() throws RecognitionException {
		try {
			// Expresiones.g:142:15: ( ENTERO | CADENA | VACIO | REAL | BOOLEANO )
			// Expresiones.g:
			{
			if ( (input.LA(1) >= BOOLEANO && input.LA(1) <= CADENA)||input.LA(1)==ENTERO||input.LA(1)==REAL||input.LA(1)==VACIO ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tipoDatoMetodo"


	public static class modificadorAcceso_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "modificadorAcceso"
	// Expresiones.g:145:1: modificadorAcceso : ( VISIBLE | INVISIBLE );
	public final ExpresionesParser.modificadorAcceso_return modificadorAcceso() throws RecognitionException {
		ExpresionesParser.modificadorAcceso_return retval = new ExpresionesParser.modificadorAcceso_return();
		retval.start = input.LT(1);

		try {
			// Expresiones.g:145:18: ( VISIBLE | INVISIBLE )
			// Expresiones.g:
			{
			if ( input.LA(1)==INVISIBLE||input.LA(1)==VISIBLE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

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
	// $ANTLR end "modificadorAcceso"



	// $ANTLR start "expre"
	// Expresiones.g:167:1: expre : ( ID | FLOAT | INT );
	public final void expre() throws RecognitionException {
		try {
			// Expresiones.g:167:6: ( ID | FLOAT | INT )
			// Expresiones.g:
			{
			if ( (input.LA(1) >= FLOAT && input.LA(1) <= INT) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expre"

	// Delegated rules



	public static final BitSet FOLLOW_modificadorAcceso_in_asignacion24 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CLASE_in_asignacion26 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_asignacion28 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_LLAVEABIERTA_in_asignacion50 = new BitSet(new long[]{0x000000000020A000L});
	public static final BitSet FOLLOW_miembro_in_asignacion72 = new BitSet(new long[]{0x000000000020A000L});
	public static final BitSet FOLLOW_LLAVECERRADA_in_asignacion95 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atributo_in_miembro123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_metodo_in_miembro127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modificadorAcceso_in_atributo140 = new BitSet(new long[]{0x0000000000040130L});
	public static final BitSet FOLLOW_declVar_in_atributo144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modificadorAcceso_in_metodo155 = new BitSet(new long[]{0x0000000000140130L});
	public static final BitSet FOLLOW_tipoDatoMetodo_in_metodo157 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_metodo161 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_PARAB_in_metodo172 = new BitSet(new long[]{0x0000000000060130L});
	public static final BitSet FOLLOW_parametro_in_metodo174 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_PARCE_in_metodo177 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_LLAVEABIERTA_in_metodo187 = new BitSet(new long[]{0x0000000000048930L});
	public static final BitSet FOLLOW_sentencia_in_metodo199 = new BitSet(new long[]{0x0000000000048930L});
	public static final BitSet FOLLOW_LLAVECERRADA_in_metodo211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_sentencia232 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_EQ_in_sentencia234 = new BitSet(new long[]{0x0000000000001C00L});
	public static final BitSet FOLLOW_expr_in_sentencia238 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_SEMICOLON_in_sentencia244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declVar_in_sentencia248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_expr297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipoDato_in_declVar376 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_declVar380 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_COMA_in_declVar395 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_declVar399 = new BitSet(new long[]{0x0000000000080080L});
	public static final BitSet FOLLOW_SEMICOLON_in_declVar420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipoDato_in_parametro432 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_parametro436 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_COMA_in_parametro452 = new BitSet(new long[]{0x0000000000040130L});
	public static final BitSet FOLLOW_tipoDato_in_parametro456 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ID_in_parametro460 = new BitSet(new long[]{0x0000000000000082L});
}