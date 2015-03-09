package ejercicioUnoParciales;

import arbolBinario.*;
import tp03.ejercicio6.*;
import trayectoriaPesada.TrayectoriaPesada;

public class RedBinaria {

	public static void main(String[] args) {
		
			TrayectoriaPesada tr = new TrayectoriaPesada();
			ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
			ArbolBinario<Integer>arbolBinarioA;
			
			
			arbolBinarioA=new ArbolBinario<Integer>(7);
			
			
			ArbolBinario<Integer> hijoIzquierdo=new ArbolBinario<Integer>(1);
			hijoIzquierdo.agregarHijoIzquierdo(new ArbolBinario<Integer>(4));		
			ArbolBinario<Integer> hijoDerecho=new ArbolBinario<Integer>(3);
			hijoDerecho.agregarHijoDerecho(new ArbolBinario<Integer>(1));
			hijoDerecho.agregarHijoIzquierdo(new ArbolBinario<Integer>(2));
			
			arbolBinarioA.agregarHijoDerecho(hijoDerecho);
			arbolBinarioA.agregarHijoIzquierdo(hijoIzquierdo);			
			
			lista = tr.calcular(arbolBinarioA);
			Integer max = -1, pos = 1;
			
			lista.comenzar();
			while (!lista.fin()){
				if (lista.elemento() > max){
					max = lista.elemento();
				}
				pos++;
				lista.proximo();				
			}
			
			System.out.print("El retardo mas grande es de:  " +max);
			
			
			

	}

}
