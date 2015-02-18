package tp4;

import tp2.ListaEnlazadaGenerica;
import tp2.ListaGenerica;

public class test {

	public static void main(String[] args) {
		
		ArbolGeneral<Integer> ag = new ArbolGeneral<Integer>(1); 
		ArbolGeneral<Integer> a2 = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> a3 = new ArbolGeneral<Integer>(3); 
		ArbolGeneral<Integer> a4 = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> a5 = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> a6 = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> a7 = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> a8 = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> a9 = new ArbolGeneral<Integer>(9);
		
		
		ag.agregarHijo(a2);
		ag.agregarHijo(a3);
		ag.agregarHijo(a4);
		a2.agregarHijo(a5);
		a3.agregarHijo(a6);
		a3.agregarHijo(a7);
		a3.agregarHijo(a8);
		a4.agregarHijo(a9);
		
		for (int i = 5; i <= 5; i++){
			System.out.println("Dato: "+i+"  - Nivel: "+ag.nivel(i));
		}
	/*	System.out.println("Prueba para Arbol de solo una hoja ( Arbol a5)");
		System.out.println("Dato: 5  - Nivel: "+a5.nivel(5));
		
	/*	ListaGenerica<ArbolGeneral<Integer>> lista = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>(); 
		lista = ag.getHijos();
		System.out.print(lista.tamanio());*/

	}

}
