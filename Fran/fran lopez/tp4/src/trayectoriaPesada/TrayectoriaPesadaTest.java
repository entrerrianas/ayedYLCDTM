package trayectoriaPesada;

import tp03.ejercicio6.ListaEnlazadaGenerica;
import tp03.ejercicio6.ListaGenerica;
import arbolBinario.ArbolBinario;

public class TrayectoriaPesadaTest {

	public static void main(String[] args) {
		TrayectoriaPesada tr = new TrayectoriaPesada();
		
		ListaGenerica<Integer> lis = new ListaEnlazadaGenerica<Integer>();
		ArbolBinario<Integer> arbolBinarioA;
		arbolBinarioA=new ArbolBinario<Integer>(7);
		
		ArbolBinario<Integer> hijoIzquierdo=new ArbolBinario<Integer>(1);
		hijoIzquierdo.agregarHijoIzquierdo(new ArbolBinario<Integer>(4));		
		ArbolBinario<Integer> hijoDerecho=new ArbolBinario<Integer>(3);
		hijoDerecho.agregarHijoDerecho(new ArbolBinario<Integer>(1));
		hijoDerecho.agregarHijoIzquierdo(new ArbolBinario<Integer>(2));
		
		arbolBinarioA.agregarHijoDerecho(hijoDerecho);
		arbolBinarioA.agregarHijoIzquierdo(hijoIzquierdo);
		
		lis = tr.calcular(arbolBinarioA);
		int q = 1;
		lis.comenzar();
		while (!lis.fin()){
			System.out.print("Nivel: " + q + " - Pesa: " + lis.elemento(q).toString() + "\n");
			q++;
			lis.proximo();
		}
		System.out.println("------------- \n \n");
		//arbolBinarioA.impPreOrden();
		
		
	}

}
