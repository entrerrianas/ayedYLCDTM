package arbolBinario;

import tp03.ejercicio6.ListaEnlazadaGenerica;
import tp03.ejercicio6.ListaGenerica;

public class RecorrerGuiado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArbolBinario<Integer> arbolBinarioA;
		arbolBinarioA=new ArbolBinario<Integer>(7);
		
		ArbolBinario<Integer> hijoIzquierdo=new ArbolBinario<Integer>(1);
		hijoIzquierdo.agregarHijoIzquierdo(new ArbolBinario<Integer>(4));		
		ArbolBinario<Integer> hijoDerecho=new ArbolBinario<Integer>(3);
		hijoDerecho.agregarHijoDerecho(new ArbolBinario<Integer>(1));
		hijoDerecho.agregarHijoIzquierdo(new ArbolBinario<Integer>(2));
		
		arbolBinarioA.agregarHijoDerecho(hijoDerecho);
		arbolBinarioA.agregarHijoIzquierdo(hijoIzquierdo);
		
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		lista.agregarFinal(arbolBinarioA.getDatoRaiz());
		lista = arbolBinarioA.recorridoGuiado();
		
		lista.comenzar();
		while(!lista.fin()){
			System.out.print("=> " + lista.elemento());
			lista.proximo();			
		}

	}

}
