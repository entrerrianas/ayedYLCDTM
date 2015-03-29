package ejercicio3;

import static org.junit.Assert.assertEquals;

public class Prueba {

	public static void main(String[] args) {
		ArbolBinarioDeBusqueda<String> arbol = new ArbolBinarioDeBusqueda<String>();
		arbol.agregar("hola");
		arbol.agregar("otro");
		arbol.agregar("mundo");
		arbol.agregar("zzz");
		


		
		arbol.eliminar("otro");
		System.out.println("hola"== arbol.getDatoRaiz());
		System.out.print(arbol.getDatoRaiz());
		System.out.println("mundo"== arbol.getHijoDerecho().getDatoRaiz());
		System.out.println(arbol.getHijoDerecho().getDatoRaiz());
		
		arbol.eliminar("hola");
		System.out.println("mundo"==arbol.getDatoRaiz());
		System.out.println(arbol.getDatoRaiz());
		System.out.println("zzz"== arbol.getHijoDerecho().getDatoRaiz());
		System.out.println(arbol.getHijoDerecho().getDatoRaiz());
		//+" - "+arbol.getHijoDerecho().getDatoRaiz());
		
	}

}
