package ejercicio9;

import ejercicio6.ListaEnlazadaGenerica;
import ejercicio8.ListaEnlazadaGenericaGrama;
import ejercicio8.ListaInvertidaDeGramas;

public class Sugeridor {
	
	public ListaEnlazadaGenerica<String> quisoDecir (ListaInvertidaDeGramas lista, String palabra){
		ListaEnlazadaGenerica<String> l=new ListaEnlazadaGenerica<String>();
		ListaEnlazadaGenerica<String> l2=new ListaEnlazadaGenerica<String>();
		int i;  
		
		//creo una lista con las palabras q tienen coincidencias con las gramas
		l=lista.recuperarListaDePalabras(palabra);
		l2.comenzar();
		l.comenzar();
		while(!l.fin()){
			
			//saco la distancia entre las dos palabras
			i=EditDistance.compararStrings(palabra,l.elemento());
			if(i<=2)l2.agregar(l.elemento(),l2.tamanio());
			l.proximo();
		}	
		return l2;
	}
}
