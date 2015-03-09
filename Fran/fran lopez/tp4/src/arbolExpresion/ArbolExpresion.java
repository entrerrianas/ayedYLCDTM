package arbolExpresion;

import nodoBinario.NodoBinario;
import tp03.ejercicio6.ColaGenerica;
import tp03.ejercicio6.NodoGenerico;
import arbolBinario.ArbolBinario;

public class ArbolExpresion extends ArbolBinario<String> {	
	
	public static ColaGenerica<NodoBinario<String>> convertirPostFija (String [] exp){
		String [] operandos = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String [] operadores = {"+", "-", "*", "/"};
		ColaGenerica<NodoBinario<String>> cola = new ColaGenerica<NodoBinario<String>>();
		
		for (int pos = 0; pos < exp.length; pos++){
		
			boolean ok = false;
			int i = 0;
			while (i < operandos.length && ok == false){
				if (operandos[i] == exp[pos]){
					ok = true;
				}
				i++;
			}
			
			String x = new String (exp[pos]);
			if (ok){ // es un operando
				NodoBinario<String> nodo = new NodoBinario<String>(x);
				cola.encolar(nodo);			
			} else { // es un operador
				NodoBinario<String> r = new NodoBinario<String>(x);
				NodoBinario<String> aux = cola.desencolar();
				NodoBinario<String> aux1 = cola.desencolar();
				r.setHijoDerecho(aux);
				r.setHijoIzquierdo(aux1);
				cola.encolar(r);
			}
		}				
		return cola;
	}
	
	
	public static void main (String [] args){
		
		String [] str =  {"2", "5", "3", "*", "+", "1", "+"};
		ColaGenerica<NodoBinario<String>> cola = new ColaGenerica<NodoBinario<String>>();
		
		cola = convertirPostFija(str);
		NodoBinario<String>  elem = cola.desencolar();  				
		ArbolBinario<NodoBinario<String>> a = new ArbolBinario<NodoBinario<String>>(elem);
		a.impPostOrden();
		
		
	} 

}
