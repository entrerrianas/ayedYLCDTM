package ejercicio7;

import ejercicio6.*; // lista generica


public class TestBalanceo {	
		
	
	public static void main (String [] args){
		
		boolean ok = true;
		String [] vec = new String [6];
		ListaEnlazadaGenerica lg = new ListaEnlazadaGenerica(); // aca van los caracteres
		ListaEnlazadaGenerica esperados = new ListaEnlazadaGenerica(); // aca va una lista de caracteres esperados
		// Si entra una { el esperado va a ser una }, si despues de la  { entra un ( el esperado es )
		ListaEnlazadaGenerica cierran = new ListaEnlazadaGenerica();
		ListaEnlazadaGenerica abren = new ListaEnlazadaGenerica();
		
		cierran.agregarInicio("}");
		cierran.agregarInicio("]");
		cierran.agregarInicio(")");
		
		abren.agregarInicio("{");
		abren.agregarInicio("[");
		abren.agregarInicio("(");
		
		vec[0] = "}";
		vec[1] = "]";
		vec[2] = ")";
		vec[3] = "(";
		vec[4] = "[";
		vec[5] = "{";
		
		for (int i = 0; i < vec.length; i++){			
			lg.agregarInicio(vec[i]);					
		}		
				
		System.out.print("palabra ingresada: ");
		lg.comenzar();
		while (!lg.fin()){
			System.out.print(lg.proximo().toString());
		}					
		System.out.print("\n");
		/*
		lg.comenzar();
		int i = 0;
		while (!lg.fin() && ok){
			while (!lg.fin() && lg.elemento(i)){
				
			}
			
		}*/
		
		
		
		
		
		
	}
}
