// $ANTLR 3.5.2 compiler.g 2024-03-14 12:20:19
 //imports que se quieran incluir
package proyecto;
    import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class compilerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLEAN", "BREAK", "CASE", "CCHAR", 
		"CFLOAT", "CHAR", "CINT", "CLASS", "COMA", "COMILLA", "CORCHA", "CORCHC", 
		"CSTRING", "DEFAULT", "DIFERENTE", "DOSPUNTOS", "DOUBLE", "END", "FLOAT", 
		"ID", "IGUAL", "IGUALDAD", "IN", "INT", "LLAVEA", "LLAVEC", "MAIN", "MAYOR", 
		"MAYORIGUAL", "MENOR", "MENORIGUAL", "OPDIV", "OPMAS", "OPMENOS", "OPMULT", 
		"OUT", "PARA", "PARC", "PRINTLN", "PRIVATE", "PROTECTED", "PUBLIC", "PUNTO", 
		"PUNTOYCOMA", "STATIC", "STRING", "SWITCH", "SYSTEM", "VOID", "WS", "'False'", 
		"'True'"
	};
        private javax.swing.JTextArea salida;
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
           public void setSalida(javax.swing.JTextArea _salida)
            { salida=_salida; }

	public compilerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public compilerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return compilerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "compiler.g"; }

	 //datos miembro que se quieran incluir en el parser
	    private int CInt = 0, CId = 0;

		String switchVal = "";

	    HashMap tablaDeSimbolos = new HashMap();
		HashMap tablaMetodo = new HashMap();

		HashMap valoresGlobal = new HashMap();
		HashMap valoresLocal = new HashMap();

		boolean inMethod = false;

	    public void procesaDeclaracionGlobal(String id ,String tipo){
			Integer obj, objMetodo;
			if ((inMethod == true)){
				obj = (Integer) tablaDeSimbolos.get(id);
				objMetodo = (Integer) tablaMetodo.get(id);

				if((obj != null) && (objMetodo != null)){
					error("La variable "+id + " esta declarada 2 veces o mas");
				}
				else if (obj == null){
					obj = (Integer) tablaMetodo.get(id);
				}
			}
			else{
				obj = (Integer) tablaDeSimbolos.get(id);
			}
	        
			



	            if (obj == null){
	             if(tipo.compareTo("int")==0){
	             Integer objTipo = Integer.valueOf(1);
	             tablaDeSimbolos.put(id, objTipo);
	            }
	            else if(tipo.compareTo("float")==0){
	                Integer objTipo = Integer.valueOf(2);
	                tablaDeSimbolos.put(id, objTipo);
	            }
				else if(tipo.compareTo("double")==0){
	                Integer objTipo = Integer.valueOf(3);
	                tablaDeSimbolos.put(id, objTipo);
	            }
				else if(tipo.compareTo("char")==0){
	                Integer objTipo = Integer.valueOf(4);
	                tablaDeSimbolos.put(id, objTipo);
	            }
				else if(tipo.compareTo("String")==0){
	                Integer objTipo = Integer.valueOf(5);
	                tablaDeSimbolos.put(id, objTipo);
	            }
				else if(tipo.compareTo("boolean")==0){
	                Integer objTipo = Integer.valueOf(6);
	                tablaDeSimbolos.put(id, objTipo);
	            }

				asignarValorVariable(id, " ");
	        }
	        else{
	            error("La variable "+id+" ya se ha declarado");
	        }
	    }

		public void procesaDeclaracionLocal(String id ,String tipo){

	        Integer obj, objMetodo;
			if ((inMethod == true)){
				obj = (Integer) tablaDeSimbolos.get(id);
				objMetodo = (Integer) tablaMetodo.get(id);

				if((obj != null) && (objMetodo != null)){
					error("La variable "+id + " esta declarada 2 veces o mas");
				}
				else if (obj == null){
					obj = (Integer) tablaMetodo.get(id);
				}
			}
			else{
				obj = (Integer) tablaDeSimbolos.get(id);
			}
			



	            if (obj == null){
	             if(tipo.compareTo("int")==0){
	             Integer objTipo = Integer.valueOf(1);
	             tablaMetodo.put(id, objTipo);
	            }
	            else if(tipo.compareTo("float")==0){
	                Integer objTipo = Integer.valueOf(2);
	                tablaMetodo.put(id, objTipo);
	            }
				else if(tipo.compareTo("double")==0){
	                Integer objTipo = Integer.valueOf(3);
	                tablaMetodo.put(id, objTipo);
	            }
				else if(tipo.compareTo("char")==0){
	                Integer objTipo = Integer.valueOf(4);
	                tablaMetodo.put(id, objTipo);
	            }
				else if(tipo.compareTo("String")==0){
	                Integer objTipo = Integer.valueOf(5);
	                tablaMetodo.put(id, objTipo);
	            }
				else if(tipo.compareTo("boolean")==0){
	                Integer objTipo = Integer.valueOf(6);
	                tablaMetodo.put(id, objTipo);
	            }

				asignarValorVariable(id, " ");
	        }
	        else{
	            error("La variable "+id+" ya se ha declarado");
	        }
	    }

		public void tablaSimbolosGlobal(){
			
	        if (tablaDeSimbolos.isEmpty()) {
	               salida.append("No hay registros en la tabla de simbolos. \n");
	            } 
	        else {
	            for (Object key : tablaDeSimbolos.keySet()) {
	                String clave = (String) key;
	                int valor = ((Integer) tablaDeSimbolos.get(clave)).intValue();
	                
					if(valor == 1){
						salida.append("El Tipo de " + clave + " es int" + valor + "\n" );
					}
					else if(valor == 2){
						salida.append("El Tipo de " + clave + " es float " + valor + "\n");
					}
					else if(valor == 3){
						salida.append("El Tipo de " + clave + " es double " + valor + "\n");
					}
					else if(valor == 4){
						salida.append("El Tipo de " + clave + " es char " + valor + "\n");
					}
					else if(valor == 5){
						salida.append("El Tipo de " + clave + " es String " + valor + "\n");
					}
					else if(valor == 6){
						salida.append("El Tipo de " + clave + " es boolean " + valor + "\n");
					}
	            }
	        }
		
		}

		public void tablaSimbolosMetodo(){
			
	        if (tablaMetodo.isEmpty()) {
	               salida.append("No hay registros en la tabla de simbolos.");
	            } 
	        else {
	            for (Object key : tablaMetodo.keySet()) {
	                String clave = (String) key;
	                int valor = ((Integer) tablaMetodo.get(clave)).intValue();
	                
					if(valor == 1){
						salida.append("El Tipo de " + clave + " es int" + valor + "\n");
					}
					else if(valor == 2){
						salida.append("El Tipo de " + clave + " es float " + valor + "\n");
					}
					else if(valor == 3){
						salida.append("El Tipo de " + clave + " es double " + valor + "\n");
					}
					else if(valor == 4){
						salida.append("El Tipo de " + clave + " es char " + valor + "\n");
					}
					else if(valor == 5){
						salida.append("El Tipo de " + clave + " es String " + valor + "\n");
					}
					else if(valor == 6){
						salida.append("El Tipo de " + clave + " es boolean " + valor + "\n");
					}
	            }
	        }
		
		}

		public void limpiarTablaDeSimbolos() {
	    tablaMetodo.clear();
		valoresLocal.clear();
	}


		public String obtenerValor(String id){
			return "ta bonito";
		}

		//public void asignarValorVariable(String id, String valor) { System.out.println(id + " = " + valor);	}

		//public void asignarValorVariable(String id, String valor) { 	}

		public void asignarValorVariable(String id, String valor) {
			
			if (!inMethod) {
				valoresGlobal.put(id, valor);
			}
			else if (inMethod) {
				valoresLocal.put(id, valor);
			}
		}

		
		public void verTablaSimbolosMetodo() {
	    if (valoresLocal.isEmpty()) {
	        salida.append("No hay valores asignados en local. \n");
	    } else {
			 salida.append("TABLA LOCAL: \n");
	        for (Object key : valoresLocal.keySet()) {
	            String clave = (String) key;
	            String valor = (String) valoresLocal.get(clave); // Obtener el valor como String
	            salida.append("El id: " + clave + " con valor de: " + valor + "\n");
	        }
	    }
	}

	public void verTablaSimbolosGlobal() {
	    if (valoresGlobal.isEmpty()) {
	        salida.append("No hay valores asignados en global. \n");
	    } else {
			salida.append("TABLA GLOBAL: \n");
	        for (Object key : valoresGlobal.keySet()) {
	            String clave = (String) key;
	            String valor = (String) valoresGlobal.get(clave); // Obtener el valor como String
	            salida.append("El id: " + clave + " con valor de: " + valor + "\n");
	        }
	    }
	}




		public void error(String msg){
				salida.append("ERROR: "+msg + "\n");
			}

		public int checa(int t1, int t2, String e1, String e2){
			if(t1==t2){
				return t1;
			}else{
				error("de tipos en "+ e1 + " op "+e2 + "\n");
				return 0;
			}
		}
		



	// $ANTLR start "inicial"
	// compiler.g:265:1: inicial : mod_acceso CLASS ID LLAVEA ( metodo | atributo | sentencia )* LLAVEC EOF ;
	public final void inicial() throws RecognitionException {
		try {
			// compiler.g:265:8: ( mod_acceso CLASS ID LLAVEA ( metodo | atributo | sentencia )* LLAVEC EOF )
			// compiler.g:265:10: mod_acceso CLASS ID LLAVEA ( metodo | atributo | sentencia )* LLAVEC EOF
			{
			pushFollow(FOLLOW_mod_acceso_in_inicial23);
			mod_acceso();
			state._fsp--;

			match(input,CLASS,FOLLOW_CLASS_in_inicial25); 
			match(input,ID,FOLLOW_ID_in_inicial27); 
			match(input,LLAVEA,FOLLOW_LLAVEA_in_inicial29); 
			// compiler.g:265:37: ( metodo | atributo | sentencia )*
			loop1:
			while (true) {
				int alt1=4;
				alt1 = dfa1.predict(input);
				switch (alt1) {
				case 1 :
					// compiler.g:265:38: metodo
					{
					inMethod = true;
					pushFollow(FOLLOW_metodo_in_inicial34);
					metodo();
					state._fsp--;

					inMethod = false; verTablaSimbolosMetodo(); limpiarTablaDeSimbolos(); 
					}
					break;
				case 2 :
					// compiler.g:265:139: atributo
					{
					pushFollow(FOLLOW_atributo_in_inicial40);
					atributo();
					state._fsp--;

					}
					break;
				case 3 :
					// compiler.g:265:148: sentencia
					{
					pushFollow(FOLLOW_sentencia_in_inicial42);
					sentencia();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,LLAVEC,FOLLOW_LLAVEC_in_inicial47); 
			match(input,EOF,FOLLOW_EOF_in_inicial50); 
			verTablaSimbolosGlobal();
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
	// $ANTLR end "inicial"



	// $ANTLR start "switch_case"
	// compiler.g:269:1: switch_case returns [int typeDetected] : SWITCH PARA ID PARC LLAVEA ( case_statement | default_statement )* LLAVEC ;
	public final int switch_case() throws RecognitionException {
		int typeDetected = 0;


		Token ID1=null;
		int case_statement2 =0;

		try {
			// compiler.g:269:39: ( SWITCH PARA ID PARC LLAVEA ( case_statement | default_statement )* LLAVEC )
			// compiler.g:269:41: SWITCH PARA ID PARC LLAVEA ( case_statement | default_statement )* LLAVEC
			{
			typeDetected = 0; int primera = 0;
			match(input,SWITCH,FOLLOW_SWITCH_in_switch_case77); 
			match(input,PARA,FOLLOW_PARA_in_switch_case79); 
			ID1=(Token)match(input,ID,FOLLOW_ID_in_switch_case81); 
			obtenerValor((ID1!=null?ID1.getText():null));
			match(input,PARC,FOLLOW_PARC_in_switch_case85); 
			match(input,LLAVEA,FOLLOW_LLAVEA_in_switch_case87); 
			// compiler.g:270:64: ( case_statement | default_statement )*
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CASE) ) {
					alt2=1;
				}
				else if ( (LA2_0==DEFAULT) ) {
					alt2=2;
				}

				switch (alt2) {
				case 1 :
					// compiler.g:271:12: case_statement
					{
					pushFollow(FOLLOW_case_statement_in_switch_case102);
					case_statement2=case_statement();
					state._fsp--;


																if(primera == 0){typeDetected = case_statement2; primera++;}
																else{if(typeDetected != case_statement2)typeDetected = 0;}
																
					}
					break;
				case 2 :
					// compiler.g:275:14: default_statement
					{
					pushFollow(FOLLOW_default_statement_in_switch_case119);
					default_statement();
					state._fsp--;

					if(typeDetected==0 && primera == 0)typeDetected = 7;
					}
					break;

				default :
					break loop2;
				}
			}

			match(input,LLAVEC,FOLLOW_LLAVEC_in_switch_case148); 

															Integer id1 = tablaDeSimbolos.containsKey((ID1!=null?ID1.getText():null)) ? (Integer) tablaDeSimbolos.get((ID1!=null?ID1.getText():null)) : null;
															Integer id2 = tablaMetodo.containsKey((ID1!=null?ID1.getText():null)) ? (Integer) tablaMetodo.get((ID1!=null?ID1.getText():null)) : null;
															if (id1 != null) {
																// La variable está en la tablaDeSimbolos local
																if(id1 == typeDetected){}
																else{ error("El tipo de la variable a evaluar en Switch no coincide con alguno de los elementos casos");}
																} 
															else if (id2 != null) {
																	// La variable está en la tablaMetodo global
																	if(id2 == typeDetected){}
																	else{ error("El tipo de la variable a evaluar en Switch no coincide con alguno de los elementos casos");}
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
		return typeDetected;
	}
	// $ANTLR end "switch_case"



	// $ANTLR start "case_statement"
	// compiler.g:294:1: case_statement returns [int typeDetected] : CASE constantes DOSPUNTOS ( sentencia BREAK PUNTOYCOMA | print BREAK PUNTOYCOMA )* ;
	public final int case_statement() throws RecognitionException {
		int typeDetected = 0;


		ParserRuleReturnScope constantes3 =null;

		try {
			// compiler.g:294:43: ( CASE constantes DOSPUNTOS ( sentencia BREAK PUNTOYCOMA | print BREAK PUNTOYCOMA )* )
			// compiler.g:294:45: CASE constantes DOSPUNTOS ( sentencia BREAK PUNTOYCOMA | print BREAK PUNTOYCOMA )*
			{
			match(input,CASE,FOLLOW_CASE_in_case_statement161); 
			pushFollow(FOLLOW_constantes_in_case_statement163);
			constantes3=constantes();
			state._fsp--;

			 typeDetected = (constantes3!=null?((compilerParser.constantes_return)constantes3).typeDetected:0);
			match(input,DOSPUNTOS,FOLLOW_DOSPUNTOS_in_case_statement166); 
			// compiler.g:294:115: ( sentencia BREAK PUNTOYCOMA | print BREAK PUNTOYCOMA )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==BOOLEAN||LA3_0==CHAR||LA3_0==DOUBLE||(LA3_0 >= FLOAT && LA3_0 <= ID)||LA3_0==INT||(LA3_0 >= PRIVATE && LA3_0 <= PUBLIC)||LA3_0==STRING||LA3_0==VOID) ) {
					alt3=1;
				}
				else if ( (LA3_0==SYSTEM) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// compiler.g:294:116: sentencia BREAK PUNTOYCOMA
					{
					pushFollow(FOLLOW_sentencia_in_case_statement169);
					sentencia();
					state._fsp--;

					match(input,BREAK,FOLLOW_BREAK_in_case_statement171); 
					match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_case_statement173); 
					}
					break;
				case 2 :
					// compiler.g:294:145: print BREAK PUNTOYCOMA
					{
					pushFollow(FOLLOW_print_in_case_statement177);
					print();
					state._fsp--;

					match(input,BREAK,FOLLOW_BREAK_in_case_statement179); 
					match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_case_statement181); 
					}
					break;

				default :
					break loop3;
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
		return typeDetected;
	}
	// $ANTLR end "case_statement"



	// $ANTLR start "default_statement"
	// compiler.g:296:1: default_statement : DEFAULT DOSPUNTOS ( sentencia | print )* BREAK PUNTOYCOMA ;
	public final void default_statement() throws RecognitionException {
		try {
			// compiler.g:296:18: ( DEFAULT DOSPUNTOS ( sentencia | print )* BREAK PUNTOYCOMA )
			// compiler.g:296:20: DEFAULT DOSPUNTOS ( sentencia | print )* BREAK PUNTOYCOMA
			{
			match(input,DEFAULT,FOLLOW_DEFAULT_in_default_statement191); 
			match(input,DOSPUNTOS,FOLLOW_DOSPUNTOS_in_default_statement193); 
			// compiler.g:296:38: ( sentencia | print )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==BOOLEAN||LA4_0==CHAR||LA4_0==DOUBLE||(LA4_0 >= FLOAT && LA4_0 <= ID)||LA4_0==INT||(LA4_0 >= PRIVATE && LA4_0 <= PUBLIC)||LA4_0==STRING||LA4_0==VOID) ) {
					alt4=1;
				}
				else if ( (LA4_0==SYSTEM) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// compiler.g:296:39: sentencia
					{
					pushFollow(FOLLOW_sentencia_in_default_statement196);
					sentencia();
					state._fsp--;

					}
					break;
				case 2 :
					// compiler.g:296:52: print
					{
					pushFollow(FOLLOW_print_in_default_statement201);
					print();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			match(input,BREAK,FOLLOW_BREAK_in_default_statement205); 
			match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_default_statement207); 
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
	// $ANTLR end "default_statement"



	// $ANTLR start "atributo"
	// compiler.g:310:1: atributo : ( mod_acceso )? tipo id1= ID ( COMA id2= ID )* PUNTOYCOMA ;
	public final void atributo() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope tipo4 =null;

		try {
			// compiler.g:310:9: ( ( mod_acceso )? tipo id1= ID ( COMA id2= ID )* PUNTOYCOMA )
			// compiler.g:310:11: ( mod_acceso )? tipo id1= ID ( COMA id2= ID )* PUNTOYCOMA
			{
			// compiler.g:310:11: ( mod_acceso )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= PRIVATE && LA5_0 <= PUBLIC)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// compiler.g:310:11: mod_acceso
					{
					pushFollow(FOLLOW_mod_acceso_in_atributo252);
					mod_acceso();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_tipo_in_atributo255);
			tipo4=tipo();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_atributo259); 
			procesaDeclaracionGlobal((id1!=null?id1.getText():null) , (tipo4!=null?input.toString(tipo4.start,tipo4.stop):null));
			// compiler.g:310:87: ( COMA id2= ID )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// compiler.g:310:88: COMA id2= ID
					{
					match(input,COMA,FOLLOW_COMA_in_atributo264); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_atributo268); 
					procesaDeclaracionGlobal((id2!=null?id2.getText():null) , (tipo4!=null?input.toString(tipo4.start,tipo4.stop):null));
					}
					break;

				default :
					break loop6;
				}
			}

			match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_atributo274); 
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
	// compiler.g:314:1: metodo : ( mod_acceso )? ( directiva )? tipo ID PARA ( decl_args )? PARC LLAVEA ( sentencia | switch_case | print )* LLAVEC ;
	public final void metodo() throws RecognitionException {
		try {
			// compiler.g:314:7: ( ( mod_acceso )? ( directiva )? tipo ID PARA ( decl_args )? PARC LLAVEA ( sentencia | switch_case | print )* LLAVEC )
			// compiler.g:314:9: ( mod_acceso )? ( directiva )? tipo ID PARA ( decl_args )? PARC LLAVEA ( sentencia | switch_case | print )* LLAVEC
			{
			// compiler.g:314:9: ( mod_acceso )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= PRIVATE && LA7_0 <= PUBLIC)) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// compiler.g:314:9: mod_acceso
					{
					pushFollow(FOLLOW_mod_acceso_in_metodo284);
					mod_acceso();
					state._fsp--;

					}
					break;

			}

			// compiler.g:314:21: ( directiva )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==STATIC) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// compiler.g:314:21: directiva
					{
					pushFollow(FOLLOW_directiva_in_metodo287);
					directiva();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_tipo_in_metodo290);
			tipo();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_metodo292); 
			match(input,PARA,FOLLOW_PARA_in_metodo294); 
			// compiler.g:314:45: ( decl_args )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==BOOLEAN||LA9_0==CHAR||LA9_0==DOUBLE||LA9_0==FLOAT||LA9_0==INT||LA9_0==STRING||LA9_0==VOID) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// compiler.g:314:45: decl_args
					{
					pushFollow(FOLLOW_decl_args_in_metodo296);
					decl_args();
					state._fsp--;

					}
					break;

			}

			match(input,PARC,FOLLOW_PARC_in_metodo299); 
			match(input,LLAVEA,FOLLOW_LLAVEA_in_metodo301); 
			// compiler.g:314:68: ( sentencia | switch_case | print )*
			loop10:
			while (true) {
				int alt10=4;
				switch ( input.LA(1) ) {
				case BOOLEAN:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case ID:
				case INT:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case STRING:
				case VOID:
					{
					alt10=1;
					}
					break;
				case SWITCH:
					{
					alt10=2;
					}
					break;
				case SYSTEM:
					{
					alt10=3;
					}
					break;
				}
				switch (alt10) {
				case 1 :
					// compiler.g:314:69: sentencia
					{
					pushFollow(FOLLOW_sentencia_in_metodo304);
					sentencia();
					state._fsp--;

					}
					break;
				case 2 :
					// compiler.g:314:81: switch_case
					{
					pushFollow(FOLLOW_switch_case_in_metodo308);
					switch_case();
					state._fsp--;

					}
					break;
				case 3 :
					// compiler.g:314:95: print
					{
					pushFollow(FOLLOW_print_in_metodo312);
					print();
					state._fsp--;

					}
					break;

				default :
					break loop10;
				}
			}

			match(input,LLAVEC,FOLLOW_LLAVEC_in_metodo317); 
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



	// $ANTLR start "decl_args"
	// compiler.g:318:1: decl_args : t1= tipo i1= ID ( COMA t2= tipo i2= ID )* ;
	public final void decl_args() throws RecognitionException {
		Token i1=null;
		Token i2=null;
		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;

		try {
			// compiler.g:318:10: (t1= tipo i1= ID ( COMA t2= tipo i2= ID )* )
			// compiler.g:318:13: t1= tipo i1= ID ( COMA t2= tipo i2= ID )*
			{
			pushFollow(FOLLOW_tipo_in_decl_args332);
			t1=tipo();
			state._fsp--;

			i1=(Token)match(input,ID,FOLLOW_ID_in_decl_args337); 
			 procesaDeclaracionLocal((i1!=null?i1.getText():null),(t1!=null?input.toString(t1.start,t1.stop):null)); 
			// compiler.g:318:77: ( COMA t2= tipo i2= ID )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==COMA) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// compiler.g:318:78: COMA t2= tipo i2= ID
					{
					match(input,COMA,FOLLOW_COMA_in_decl_args341); 
					pushFollow(FOLLOW_tipo_in_decl_args347);
					t2=tipo();
					state._fsp--;

					i2=(Token)match(input,ID,FOLLOW_ID_in_decl_args353); 
					 procesaDeclaracionLocal((i2!=null?i2.getText():null),(t2!=null?input.toString(t2.start,t2.stop):null)); 
					}
					break;

				default :
					break loop11;
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
	// $ANTLR end "decl_args"



	// $ANTLR start "sentencia"
	// compiler.g:322:1: sentencia : ( asignacion | decl_local );
	public final void sentencia() throws RecognitionException {
		try {
			// compiler.g:322:10: ( asignacion | decl_local )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ID) ) {
				alt12=1;
			}
			else if ( (LA12_0==BOOLEAN||LA12_0==CHAR||LA12_0==DOUBLE||LA12_0==FLOAT||LA12_0==INT||(LA12_0 >= PRIVATE && LA12_0 <= PUBLIC)||LA12_0==STRING||LA12_0==VOID) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// compiler.g:322:12: asignacion
					{
					pushFollow(FOLLOW_asignacion_in_sentencia366);
					asignacion();
					state._fsp--;

					}
					break;
				case 2 :
					// compiler.g:322:25: decl_local
					{
					pushFollow(FOLLOW_decl_local_in_sentencia370);
					decl_local();
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



	// $ANTLR start "id"
	// compiler.g:326:1: id : ID ;
	public final void id() throws RecognitionException {
		Token ID5=null;

		try {
			// compiler.g:326:3: ( ID )
			// compiler.g:327:2: ID
			{
			ID5=(Token)match(input,ID,FOLLOW_ID_in_id381); 
			 
			        CId++;
			        Integer obj = (Integer)tablaDeSimbolos.get((ID5!=null?ID5.getText():null));
					
			        if ((obj == null)&&(inMethod == true)){
			            Integer objNuevo = Integer.valueOf(1);
			            tablaMetodo.put((ID5!=null?ID5.getText():null), objNuevo);
			        }
					else if ((obj == null)&&(inMethod == false)){
			            Integer objNuevo = Integer.valueOf(1);
			            tablaDeSimbolos.put((ID5!=null?ID5.getText():null), objNuevo);
			        }
			        else{
			            obj = obj.intValue()+1;
			            tablaDeSimbolos.put((ID5!=null?ID5.getText():null), obj);
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
	// $ANTLR end "id"



	// $ANTLR start "end"
	// compiler.g:346:1: end : END ;
	public final void end() throws RecognitionException {
		try {
			// compiler.g:346:4: ( END )
			// compiler.g:346:5: END
			{
			match(input,END,FOLLOW_END_in_end391); 
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
	// $ANTLR end "end"



	// $ANTLR start "ops_agrupacion"
	// compiler.g:353:1: ops_agrupacion : ( PARA | PARC | LLAVEA | LLAVEC | CORCHA | CORCHC );
	public final void ops_agrupacion() throws RecognitionException {
		try {
			// compiler.g:353:15: ( PARA | PARC | LLAVEA | LLAVEC | CORCHA | CORCHC )
			// compiler.g:
			{
			if ( (input.LA(1) >= CORCHA && input.LA(1) <= CORCHC)||(input.LA(1) >= LLAVEA && input.LA(1) <= LLAVEC)||(input.LA(1) >= PARA && input.LA(1) <= PARC) ) {
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
	// $ANTLR end "ops_agrupacion"



	// $ANTLR start "puntuacion"
	// compiler.g:361:1: puntuacion : ( PUNTO | PUNTOYCOMA | COMA | COMILLA );
	public final void puntuacion() throws RecognitionException {
		try {
			// compiler.g:361:11: ( PUNTO | PUNTOYCOMA | COMA | COMILLA )
			// compiler.g:
			{
			if ( (input.LA(1) >= COMA && input.LA(1) <= COMILLA)||(input.LA(1) >= PUNTO && input.LA(1) <= PUNTOYCOMA) ) {
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
	// $ANTLR end "puntuacion"



	// $ANTLR start "op_asigna"
	// compiler.g:367:1: op_asigna : IGUAL ;
	public final void op_asigna() throws RecognitionException {
		try {
			// compiler.g:367:10: ( IGUAL )
			// compiler.g:367:12: IGUAL
			{
			match(input,IGUAL,FOLLOW_IGUAL_in_op_asigna527); 
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
	// $ANTLR end "op_asigna"



	// $ANTLR start "ops_relacionales"
	// compiler.g:370:1: ops_relacionales : ( MAYOR | MENOR | MAYORIGUAL | MENORIGUAL | IGUALDAD | DIFERENTE );
	public final void ops_relacionales() throws RecognitionException {
		try {
			// compiler.g:370:17: ( MAYOR | MENOR | MAYORIGUAL | MENORIGUAL | IGUALDAD | DIFERENTE )
			// compiler.g:
			{
			if ( input.LA(1)==DIFERENTE||input.LA(1)==IGUALDAD||(input.LA(1) >= MAYOR && input.LA(1) <= MENORIGUAL) ) {
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
	// $ANTLR end "ops_relacionales"



	// $ANTLR start "mod_acceso"
	// compiler.g:378:1: mod_acceso : ( PUBLIC | PRIVATE | PROTECTED );
	public final void mod_acceso() throws RecognitionException {
		try {
			// compiler.g:378:11: ( PUBLIC | PRIVATE | PROTECTED )
			// compiler.g:
			{
			if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
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
	// $ANTLR end "mod_acceso"


	public static class tipo_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "tipo"
	// compiler.g:383:1: tipo : ( STRING | INT | FLOAT | DOUBLE | BOOLEAN | CHAR | VOID );
	public final compilerParser.tipo_return tipo() throws RecognitionException {
		compilerParser.tipo_return retval = new compilerParser.tipo_return();
		retval.start = input.LT(1);

		try {
			// compiler.g:383:5: ( STRING | INT | FLOAT | DOUBLE | BOOLEAN | CHAR | VOID )
			// compiler.g:
			{
			if ( input.LA(1)==BOOLEAN||input.LA(1)==CHAR||input.LA(1)==DOUBLE||input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==STRING||input.LA(1)==VOID ) {
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
	// $ANTLR end "tipo"



	// $ANTLR start "directiva"
	// compiler.g:393:1: directiva : STATIC ;
	public final void directiva() throws RecognitionException {
		try {
			// compiler.g:393:10: ( STATIC )
			// compiler.g:393:12: STATIC
			{
			match(input,STATIC,FOLLOW_STATIC_in_directiva710); 
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
	// $ANTLR end "directiva"



	// $ANTLR start "pals_reservadas"
	// compiler.g:396:1: pals_reservadas : ( MAIN | SYSTEM | OUT | PRINTLN | IN );
	public final void pals_reservadas() throws RecognitionException {
		try {
			// compiler.g:396:16: ( MAIN | SYSTEM | OUT | PRINTLN | IN )
			// compiler.g:
			{
			if ( input.LA(1)==IN||input.LA(1)==MAIN||input.LA(1)==OUT||input.LA(1)==PRINTLN||input.LA(1)==SYSTEM ) {
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
	// $ANTLR end "pals_reservadas"



	// $ANTLR start "ops_aritmetico"
	// compiler.g:404:1: ops_aritmetico : ( OPMAS | OPMENOS | OPDIV | OPMULT );
	public final void ops_aritmetico() throws RecognitionException {
		try {
			// compiler.g:404:15: ( OPMAS | OPMENOS | OPDIV | OPMULT )
			// compiler.g:
			{
			if ( (input.LA(1) >= OPDIV && input.LA(1) <= OPMULT) ) {
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
	// $ANTLR end "ops_aritmetico"


	public static class constantes_return extends ParserRuleReturnScope {
		public int typeDetected;
	};


	// $ANTLR start "constantes"
	// compiler.g:413:1: constantes returns [int typeDetected] : ( CSTRING | CFLOAT | CINT | CCHAR | 'True' | 'False' );
	public final compilerParser.constantes_return constantes() throws RecognitionException {
		compilerParser.constantes_return retval = new compilerParser.constantes_return();
		retval.start = input.LT(1);

		try {
			// compiler.g:413:38: ( CSTRING | CFLOAT | CINT | CCHAR | 'True' | 'False' )
			int alt13=6;
			switch ( input.LA(1) ) {
			case CSTRING:
				{
				alt13=1;
				}
				break;
			case CFLOAT:
				{
				alt13=2;
				}
				break;
			case CINT:
				{
				alt13=3;
				}
				break;
			case CCHAR:
				{
				alt13=4;
				}
				break;
			case 55:
				{
				alt13=5;
				}
				break;
			case 54:
				{
				alt13=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// compiler.g:413:40: CSTRING
					{
					match(input,CSTRING,FOLLOW_CSTRING_in_constantes873); 
					retval.typeDetected =5;
					}
					break;
				case 2 :
					// compiler.g:414:13: CFLOAT
					{
					match(input,CFLOAT,FOLLOW_CFLOAT_in_constantes888); 
					retval.typeDetected =2;
					}
					break;
				case 3 :
					// compiler.g:415:13: CINT
					{
					match(input,CINT,FOLLOW_CINT_in_constantes903); 
					retval.typeDetected =1;
					}
					break;
				case 4 :
					// compiler.g:416:13: CCHAR
					{
					match(input,CCHAR,FOLLOW_CCHAR_in_constantes918); 
					retval.typeDetected =4;
					}
					break;
				case 5 :
					// compiler.g:417:13: 'True'
					{
					match(input,55,FOLLOW_55_in_constantes933); 
					retval.typeDetected =6;
					}
					break;
				case 6 :
					// compiler.g:418:13: 'False'
					{
					match(input,54,FOLLOW_54_in_constantes948); 
					retval.typeDetected =6;
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
	// $ANTLR end "constantes"



	// $ANTLR start "print"
	// compiler.g:427:1: print : SYSTEM PUNTO OUT PUNTO PRINTLN PARA ( print_expr )* PARC PUNTOYCOMA ;
	public final void print() throws RecognitionException {
		try {
			// compiler.g:427:6: ( SYSTEM PUNTO OUT PUNTO PRINTLN PARA ( print_expr )* PARC PUNTOYCOMA )
			// compiler.g:427:8: SYSTEM PUNTO OUT PUNTO PRINTLN PARA ( print_expr )* PARC PUNTOYCOMA
			{
			match(input,SYSTEM,FOLLOW_SYSTEM_in_print1147); 
			match(input,PUNTO,FOLLOW_PUNTO_in_print1149); 
			match(input,OUT,FOLLOW_OUT_in_print1151); 
			match(input,PUNTO,FOLLOW_PUNTO_in_print1153); 
			match(input,PRINTLN,FOLLOW_PRINTLN_in_print1155); 
			match(input,PARA,FOLLOW_PARA_in_print1157); 
			// compiler.g:427:44: ( print_expr )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==CSTRING||LA14_0==ID) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// compiler.g:427:45: print_expr
					{
					pushFollow(FOLLOW_print_expr_in_print1160);
					print_expr();
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}

			match(input,PARC,FOLLOW_PARC_in_print1164); 
			match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_print1166); 
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
	// $ANTLR end "print"



	// $ANTLR start "print_expr"
	// compiler.g:429:1: print_expr : ( CSTRING | ID | ID OPMAS CSTRING | CSTRING OPMAS ID );
	public final void print_expr() throws RecognitionException {
		Token CSTRING6=null;
		Token ID7=null;
		Token ID8=null;
		Token CSTRING9=null;
		Token CSTRING10=null;
		Token ID11=null;

		try {
			// compiler.g:429:11: ( CSTRING | ID | ID OPMAS CSTRING | CSTRING OPMAS ID )
			int alt15=4;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==CSTRING) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==OPMAS) ) {
					alt15=4;
				}
				else if ( (LA15_1==CSTRING||LA15_1==ID||LA15_1==PARC) ) {
					alt15=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA15_0==ID) ) {
				int LA15_2 = input.LA(2);
				if ( (LA15_2==OPMAS) ) {
					alt15=3;
				}
				else if ( (LA15_2==CSTRING||LA15_2==ID||LA15_2==PARC) ) {
					alt15=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// compiler.g:429:13: CSTRING
					{
					CSTRING6=(Token)match(input,CSTRING,FOLLOW_CSTRING_in_print_expr1173); 
					 System.out.print((CSTRING6!=null?CSTRING6.getText():null)); System.out.println();
					}
					break;
				case 2 :
					// compiler.g:430:14: ID
					{
					ID7=(Token)match(input,ID,FOLLOW_ID_in_print_expr1190); 
					 System.out.print(((ID7!=null?ID7.getText():null))); System.out.println();
					}
					break;
				case 3 :
					// compiler.g:431:14: ID OPMAS CSTRING
					{
					ID8=(Token)match(input,ID,FOLLOW_ID_in_print_expr1207); 
					match(input,OPMAS,FOLLOW_OPMAS_in_print_expr1209); 
					CSTRING9=(Token)match(input,CSTRING,FOLLOW_CSTRING_in_print_expr1211); 
					 System.out.print(((ID8!=null?ID8.getText():null)) + (CSTRING9!=null?CSTRING9.getText():null)); System.out.println();
					}
					break;
				case 4 :
					// compiler.g:432:14: CSTRING OPMAS ID
					{
					CSTRING10=(Token)match(input,CSTRING,FOLLOW_CSTRING_in_print_expr1228); 
					match(input,OPMAS,FOLLOW_OPMAS_in_print_expr1230); 
					ID11=(Token)match(input,ID,FOLLOW_ID_in_print_expr1232); 
					 System.out.print((CSTRING10!=null?CSTRING10.getText():null) + ((ID11!=null?ID11.getText():null))); System.out.println();
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
	// $ANTLR end "print_expr"



	// $ANTLR start "decl_local"
	// compiler.g:444:1: decl_local : ( mod_acceso )? tipo t1= ID ( op_asigna c1= constantes )* ( COMA t2= ID ( op_asigna c2= constantes )* )* PUNTOYCOMA ;
	public final void decl_local() throws RecognitionException {
		Token t1=null;
		Token t2=null;
		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope tipo12 =null;

		try {
			// compiler.g:444:11: ( ( mod_acceso )? tipo t1= ID ( op_asigna c1= constantes )* ( COMA t2= ID ( op_asigna c2= constantes )* )* PUNTOYCOMA )
			// compiler.g:444:13: ( mod_acceso )? tipo t1= ID ( op_asigna c1= constantes )* ( COMA t2= ID ( op_asigna c2= constantes )* )* PUNTOYCOMA
			{
			// compiler.g:444:13: ( mod_acceso )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= PRIVATE && LA16_0 <= PUBLIC)) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// compiler.g:444:13: mod_acceso
					{
					pushFollow(FOLLOW_mod_acceso_in_decl_local1275);
					mod_acceso();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_tipo_in_decl_local1278);
			tipo12=tipo();
			state._fsp--;

			t1=(Token)match(input,ID,FOLLOW_ID_in_decl_local1284); 
			 procesaDeclaracionLocal((t1!=null?t1.getText():null),(tipo12!=null?input.toString(tipo12.start,tipo12.stop):null));
			// compiler.g:444:87: ( op_asigna c1= constantes )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==IGUAL) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// compiler.g:444:88: op_asigna c1= constantes
					{
					pushFollow(FOLLOW_op_asigna_in_decl_local1289);
					op_asigna();
					state._fsp--;

					pushFollow(FOLLOW_constantes_in_decl_local1295);
					c1=constantes();
					state._fsp--;

					asignarValorVariable((t1!=null?t1.getText():null), (c1!=null?input.toString(c1.start,c1.stop):null));
					}
					break;

				default :
					break loop17;
				}
			}

			// compiler.g:445:2: ( COMA t2= ID ( op_asigna c2= constantes )* )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// compiler.g:445:3: COMA t2= ID ( op_asigna c2= constantes )*
					{
					match(input,COMA,FOLLOW_COMA_in_decl_local1302); 
					t2=(Token)match(input,ID,FOLLOW_ID_in_decl_local1308); 
					 procesaDeclaracionLocal((t2!=null?t2.getText():null),(tipo12!=null?input.toString(tipo12.start,tipo12.stop):null));
					// compiler.g:445:65: ( op_asigna c2= constantes )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==IGUAL) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// compiler.g:445:66: op_asigna c2= constantes
							{
							pushFollow(FOLLOW_op_asigna_in_decl_local1313);
							op_asigna();
							state._fsp--;

							pushFollow(FOLLOW_constantes_in_decl_local1319);
							c2=constantes();
							state._fsp--;

							asignarValorVariable((t2!=null?t2.getText():null), (c2!=null?input.toString(c2.start,c2.stop):null));
							}
							break;

						default :
							break loop18;
						}
					}

					}
					break;

				default :
					break loop19;
				}
			}

			match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_decl_local1327); 
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
	// $ANTLR end "decl_local"



	// $ANTLR start "asignacion"
	// compiler.g:449:1: asignacion returns [int typeDetected] : ID op_asigna expr PUNTOYCOMA ;
	public final int asignacion() throws RecognitionException {
		int typeDetected = 0;


		Token ID14=null;
		ParserRuleReturnScope expr13 =null;

		try {
			// compiler.g:449:38: ( ID op_asigna expr PUNTOYCOMA )
			// compiler.g:449:40: ID op_asigna expr PUNTOYCOMA
			{
			ID14=(Token)match(input,ID,FOLLOW_ID_in_asignacion1341); 
			pushFollow(FOLLOW_op_asigna_in_asignacion1343);
			op_asigna();
			state._fsp--;

			pushFollow(FOLLOW_expr_in_asignacion1345);
			expr13=expr();
			state._fsp--;


																		int ty1 = (expr13!=null?((compilerParser.expr_return)expr13).typeDetected:0);
																		int ty2=0;

																		Integer obj;

																		 if ((inMethod == true)){
																			obj = (Integer) tablaDeSimbolos.get((ID14!=null?ID14.getText():null));
																			
																			if (obj == null){
																			obj = (Integer) tablaMetodo.get((ID14!=null?ID14.getText():null));
																			}
																		}
																		else{
																			 obj = (Integer) tablaDeSimbolos.get((ID14!=null?ID14.getText():null));
																			}



																		if (obj == null){
																			error("id: "+(ID14!=null?ID14.getText():null)+" no declarado");
																		}
																		else{
																			ty2 = obj.intValue();
																		}
																		
																		if(ty1 == ty2){
																			asignarValorVariable((ID14!=null?ID14.getText():null), ((expr13!=null?input.toString(expr13.start,expr13.stop):null)));
																			typeDetected = (expr13!=null?((compilerParser.expr_return)expr13).typeDetected:0);
																		}else{
																			error("Los tipos de ID y expr no coinciden");
																			typeDetected = 0;
																			
																		}
																		
			match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_asignacion1349); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return typeDetected;
	}
	// $ANTLR end "asignacion"


	public static class expr_return extends ParserRuleReturnScope {
		public int typeDetected;
	};


	// $ANTLR start "expr"
	// compiler.g:485:1: expr returns [int typeDetected] : ( CSTRING | CCHAR | 'True' | 'False' |m1= multExpr ( ( OPMAS | OPMENOS ) m2= multExpr )* );
	public final compilerParser.expr_return expr() throws RecognitionException {
		compilerParser.expr_return retval = new compilerParser.expr_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope m1 =null;
		ParserRuleReturnScope m2 =null;

		try {
			// compiler.g:485:32: ( CSTRING | CCHAR | 'True' | 'False' |m1= multExpr ( ( OPMAS | OPMENOS ) m2= multExpr )* )
			int alt21=5;
			switch ( input.LA(1) ) {
			case CSTRING:
				{
				alt21=1;
				}
				break;
			case CCHAR:
				{
				alt21=2;
				}
				break;
			case 55:
				{
				alt21=3;
				}
				break;
			case 54:
				{
				alt21=4;
				}
				break;
			case CFLOAT:
			case CINT:
			case ID:
			case PARA:
				{
				alt21=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// compiler.g:485:34: CSTRING
					{
					match(input,CSTRING,FOLLOW_CSTRING_in_expr1360); 
					retval.typeDetected =5;
					}
					break;
				case 2 :
					// compiler.g:486:11: CCHAR
					{
					match(input,CCHAR,FOLLOW_CCHAR_in_expr1374); 
					retval.typeDetected =4;
					}
					break;
				case 3 :
					// compiler.g:487:11: 'True'
					{
					match(input,55,FOLLOW_55_in_expr1388); 
					retval.typeDetected =6;
					}
					break;
				case 4 :
					// compiler.g:488:11: 'False'
					{
					match(input,54,FOLLOW_54_in_expr1402); 
					retval.typeDetected =6;
					}
					break;
				case 5 :
					// compiler.g:489:11: m1= multExpr ( ( OPMAS | OPMENOS ) m2= multExpr )*
					{
					pushFollow(FOLLOW_multExpr_in_expr1418);
					m1=multExpr();
					state._fsp--;

					retval.typeDetected =(m1!=null?((compilerParser.multExpr_return)m1).typeDetected:0);
					// compiler.g:489:57: ( ( OPMAS | OPMENOS ) m2= multExpr )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( ((LA20_0 >= OPMAS && LA20_0 <= OPMENOS)) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// compiler.g:489:58: ( OPMAS | OPMENOS ) m2= multExpr
							{
							if ( (input.LA(1) >= OPMAS && input.LA(1) <= OPMENOS) ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							pushFollow(FOLLOW_multExpr_in_expr1433);
							m2=multExpr();
							state._fsp--;


																checa((m1!=null?((compilerParser.multExpr_return)m1).typeDetected:0),(m2!=null?((compilerParser.multExpr_return)m2).typeDetected:0),(m1!=null?input.toString(m1.start,m1.stop):null),(m2!=null?input.toString(m2.start,m2.stop):null));
															
							}
							break;

						default :
							break loop20;
						}
					}

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


	public static class multExpr_return extends ParserRuleReturnScope {
		public int typeDetected;
	};


	// $ANTLR start "multExpr"
	// compiler.g:494:1: multExpr returns [int typeDetected] : a1= atom ( ( OPMULT | OPDIV ) a2= atom )* ;
	public final compilerParser.multExpr_return multExpr() throws RecognitionException {
		compilerParser.multExpr_return retval = new compilerParser.multExpr_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;

		try {
			// compiler.g:494:36: (a1= atom ( ( OPMULT | OPDIV ) a2= atom )* )
			// compiler.g:495:2: a1= atom ( ( OPMULT | OPDIV ) a2= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr1453);
			a1=atom();
			state._fsp--;


					retval.typeDetected =(a1!=null?((compilerParser.atom_return)a1).typeDetected:0);
				
			// compiler.g:497:4: ( ( OPMULT | OPDIV ) a2= atom )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==OPDIV||LA22_0==OPMULT) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// compiler.g:497:5: ( OPMULT | OPDIV ) a2= atom
					{
					if ( input.LA(1)==OPDIV||input.LA(1)==OPMULT ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_atom_in_multExpr1467);
					a2=atom();
					state._fsp--;


							retval.typeDetected = checa((a1!=null?((compilerParser.atom_return)a1).typeDetected:0),(a2!=null?((compilerParser.atom_return)a2).typeDetected:0),(a1!=null?input.toString(a1.start,a1.stop):null),(a2!=null?input.toString(a2.start,a2.stop):null));
						
					}
					break;

				default :
					break loop22;
				}
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
	// $ANTLR end "multExpr"


	public static class atom_return extends ParserRuleReturnScope {
		public int typeDetected;
	};


	// $ANTLR start "atom"
	// compiler.g:501:1: atom returns [int typeDetected] : ( ID | CINT | CFLOAT | PARA expr PARC );
	public final compilerParser.atom_return atom() throws RecognitionException {
		compilerParser.atom_return retval = new compilerParser.atom_return();
		retval.start = input.LT(1);

		Token ID15=null;
		ParserRuleReturnScope expr16 =null;

		try {
			// compiler.g:501:32: ( ID | CINT | CFLOAT | PARA expr PARC )
			int alt23=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt23=1;
				}
				break;
			case CINT:
				{
				alt23=2;
				}
				break;
			case CFLOAT:
				{
				alt23=3;
				}
				break;
			case PARA:
				{
				alt23=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// compiler.g:502:25: ID
					{
					ID15=(Token)match(input,ID,FOLLOW_ID_in_atom1506); 

												Integer obj = tablaDeSimbolos.containsKey((ID15!=null?ID15.getText():null)) ? (Integer) tablaDeSimbolos.get((ID15!=null?ID15.getText():null)) : null;
												Integer obj2 = tablaMetodo.containsKey((ID15!=null?ID15.getText():null)) ? (Integer) tablaMetodo.get((ID15!=null?ID15.getText():null)) : null;

												if ((obj != null)){
													retval.typeDetected = obj.intValue();
												}
												else if((obj2 != null)){
													retval.typeDetected = obj2.intValue();
												}
												else{
													error("id: "+(ID15!=null?ID15.getText():null)+" no declarado");
													retval.typeDetected =0;
												}
												
					}
					break;
				case 2 :
					// compiler.g:517:27: CINT
					{
					match(input,CINT,FOLLOW_CINT_in_atom1537); 
					retval.typeDetected =1;
					}
					break;
				case 3 :
					// compiler.g:518:27: CFLOAT
					{
					match(input,CFLOAT,FOLLOW_CFLOAT_in_atom1567); 
					retval.typeDetected =2;
					}
					break;
				case 4 :
					// compiler.g:519:27: PARA expr PARC
					{
					match(input,PARA,FOLLOW_PARA_in_atom1597); 
					pushFollow(FOLLOW_expr_in_atom1599);
					expr16=expr();
					state._fsp--;

					match(input,PARC,FOLLOW_PARC_in_atom1601); 
					retval.typeDetected =(expr16!=null?((compilerParser.expr_return)expr16).typeDetected:0);
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
	// $ANTLR end "atom"

	// Delegated rules


	protected DFA1 dfa1 = new DFA1(this);
	static final String DFA1_eotS =
		"\12\uffff";
	static final String DFA1_eofS =
		"\12\uffff";
	static final String DFA1_minS =
		"\1\4\1\uffff\1\4\1\uffff\1\27\1\uffff\1\14\1\27\1\uffff\1\14";
	static final String DFA1_maxS =
		"\1\64\1\uffff\1\64\1\uffff\1\27\1\uffff\1\57\1\27\1\uffff\1\57";
	static final String DFA1_acceptS =
		"\1\uffff\1\4\1\uffff\1\1\1\uffff\1\3\2\uffff\1\2\1\uffff";
	static final String DFA1_specialS =
		"\12\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\4\4\uffff\1\4\12\uffff\1\4\1\uffff\1\4\1\5\3\uffff\1\4\1\uffff\1\1"+
			"\15\uffff\3\2\2\uffff\1\3\1\4\2\uffff\1\4",
			"",
			"\1\4\4\uffff\1\4\12\uffff\1\4\1\uffff\1\4\4\uffff\1\4\24\uffff\1\3\1"+
			"\4\2\uffff\1\4",
			"",
			"\1\6",
			"",
			"\1\7\13\uffff\1\5\17\uffff\1\3\6\uffff\1\10",
			"\1\11",
			"",
			"\1\7\13\uffff\1\5\26\uffff\1\10"
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 265:37: ( metodo | atributo | sentencia )*";
		}
	}

	public static final BitSet FOLLOW_mod_acceso_in_inicial23 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CLASS_in_inicial25 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_inicial27 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LLAVEA_in_inicial29 = new BitSet(new long[]{0x0013380028D00210L});
	public static final BitSet FOLLOW_metodo_in_inicial34 = new BitSet(new long[]{0x0013380028D00210L});
	public static final BitSet FOLLOW_atributo_in_inicial40 = new BitSet(new long[]{0x0013380028D00210L});
	public static final BitSet FOLLOW_sentencia_in_inicial42 = new BitSet(new long[]{0x0013380028D00210L});
	public static final BitSet FOLLOW_LLAVEC_in_inicial47 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_inicial50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_switch_case77 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_PARA_in_switch_case79 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_switch_case81 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_PARC_in_switch_case85 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LLAVEA_in_switch_case87 = new BitSet(new long[]{0x0000000020020040L});
	public static final BitSet FOLLOW_case_statement_in_switch_case102 = new BitSet(new long[]{0x0000000020020040L});
	public static final BitSet FOLLOW_default_statement_in_switch_case119 = new BitSet(new long[]{0x0000000020020040L});
	public static final BitSet FOLLOW_LLAVEC_in_switch_case148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_case_statement161 = new BitSet(new long[]{0x00C0000000010580L});
	public static final BitSet FOLLOW_constantes_in_case_statement163 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DOSPUNTOS_in_case_statement166 = new BitSet(new long[]{0x001A380008D00212L});
	public static final BitSet FOLLOW_sentencia_in_case_statement169 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BREAK_in_case_statement171 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_case_statement173 = new BitSet(new long[]{0x001A380008D00212L});
	public static final BitSet FOLLOW_print_in_case_statement177 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_BREAK_in_case_statement179 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_case_statement181 = new BitSet(new long[]{0x001A380008D00212L});
	public static final BitSet FOLLOW_DEFAULT_in_default_statement191 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DOSPUNTOS_in_default_statement193 = new BitSet(new long[]{0x001A380008D00230L});
	public static final BitSet FOLLOW_sentencia_in_default_statement196 = new BitSet(new long[]{0x001A380008D00230L});
	public static final BitSet FOLLOW_print_in_default_statement201 = new BitSet(new long[]{0x001A380008D00230L});
	public static final BitSet FOLLOW_BREAK_in_default_statement205 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_default_statement207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mod_acceso_in_atributo252 = new BitSet(new long[]{0x0012000008500210L});
	public static final BitSet FOLLOW_tipo_in_atributo255 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_atributo259 = new BitSet(new long[]{0x0000800000001000L});
	public static final BitSet FOLLOW_COMA_in_atributo264 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_atributo268 = new BitSet(new long[]{0x0000800000001000L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_atributo274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mod_acceso_in_metodo284 = new BitSet(new long[]{0x0013000008500210L});
	public static final BitSet FOLLOW_directiva_in_metodo287 = new BitSet(new long[]{0x0012000008500210L});
	public static final BitSet FOLLOW_tipo_in_metodo290 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_metodo292 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_PARA_in_metodo294 = new BitSet(new long[]{0x0012020008500210L});
	public static final BitSet FOLLOW_decl_args_in_metodo296 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_PARC_in_metodo299 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_LLAVEA_in_metodo301 = new BitSet(new long[]{0x001E380028D00210L});
	public static final BitSet FOLLOW_sentencia_in_metodo304 = new BitSet(new long[]{0x001E380028D00210L});
	public static final BitSet FOLLOW_switch_case_in_metodo308 = new BitSet(new long[]{0x001E380028D00210L});
	public static final BitSet FOLLOW_print_in_metodo312 = new BitSet(new long[]{0x001E380028D00210L});
	public static final BitSet FOLLOW_LLAVEC_in_metodo317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipo_in_decl_args332 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_decl_args337 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_COMA_in_decl_args341 = new BitSet(new long[]{0x0012000008500210L});
	public static final BitSet FOLLOW_tipo_in_decl_args347 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_decl_args353 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_asignacion_in_sentencia366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_local_in_sentencia370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_in_end391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IGUAL_in_op_asigna527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_directiva710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CSTRING_in_constantes873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CFLOAT_in_constantes888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CINT_in_constantes903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CCHAR_in_constantes918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_constantes933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_constantes948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYSTEM_in_print1147 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_PUNTO_in_print1149 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_OUT_in_print1151 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_PUNTO_in_print1153 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_PRINTLN_in_print1155 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_PARA_in_print1157 = new BitSet(new long[]{0x0000020000810000L});
	public static final BitSet FOLLOW_print_expr_in_print1160 = new BitSet(new long[]{0x0000020000810000L});
	public static final BitSet FOLLOW_PARC_in_print1164 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_print1166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CSTRING_in_print_expr1173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_print_expr1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_print_expr1207 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_OPMAS_in_print_expr1209 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_CSTRING_in_print_expr1211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CSTRING_in_print_expr1228 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_OPMAS_in_print_expr1230 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_print_expr1232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mod_acceso_in_decl_local1275 = new BitSet(new long[]{0x0012000008500210L});
	public static final BitSet FOLLOW_tipo_in_decl_local1278 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_decl_local1284 = new BitSet(new long[]{0x0000800001001000L});
	public static final BitSet FOLLOW_op_asigna_in_decl_local1289 = new BitSet(new long[]{0x00C0000000010580L});
	public static final BitSet FOLLOW_constantes_in_decl_local1295 = new BitSet(new long[]{0x0000800001001000L});
	public static final BitSet FOLLOW_COMA_in_decl_local1302 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_decl_local1308 = new BitSet(new long[]{0x0000800001001000L});
	public static final BitSet FOLLOW_op_asigna_in_decl_local1313 = new BitSet(new long[]{0x00C0000000010580L});
	public static final BitSet FOLLOW_constantes_in_decl_local1319 = new BitSet(new long[]{0x0000800001001000L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_decl_local1327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_asignacion1341 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_op_asigna_in_asignacion1343 = new BitSet(new long[]{0x00C0010000810580L});
	public static final BitSet FOLLOW_expr_in_asignacion1345 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_asignacion1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CSTRING_in_expr1360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CCHAR_in_expr1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_expr1388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_expr1402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr1418 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_set_in_expr1423 = new BitSet(new long[]{0x0000010000800500L});
	public static final BitSet FOLLOW_multExpr_in_expr1433 = new BitSet(new long[]{0x0000003000000002L});
	public static final BitSet FOLLOW_atom_in_multExpr1453 = new BitSet(new long[]{0x0000004800000002L});
	public static final BitSet FOLLOW_set_in_multExpr1457 = new BitSet(new long[]{0x0000010000800500L});
	public static final BitSet FOLLOW_atom_in_multExpr1467 = new BitSet(new long[]{0x0000004800000002L});
	public static final BitSet FOLLOW_ID_in_atom1506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CINT_in_atom1537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CFLOAT_in_atom1567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARA_in_atom1597 = new BitSet(new long[]{0x00C0010000810580L});
	public static final BitSet FOLLOW_expr_in_atom1599 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_PARC_in_atom1601 = new BitSet(new long[]{0x0000000000000002L});
}
