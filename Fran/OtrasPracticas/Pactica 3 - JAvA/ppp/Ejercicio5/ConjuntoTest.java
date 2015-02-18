package Ejercicio5;

import Ejercicio1B.ListaDeStrings;

public class ConjuntoTest {
	public static void main(String[] args){
		ListaDeStrings lista1 = new ListaDeStrings(),
					   lista2 = new ListaDeStrings();
		Conjunto con1 = new Conjunto(),
		         con2 = new Conjunto();
		
		lista1.addFirst("11");
		lista1.addFirst("2");
		lista1.addFirst("13");
		lista1.addFirst("15");
		lista1.addFirst("11");
		lista2.addFirst("1");
		lista2.addFirst("3");
		lista2.addFirst("5");
		lista2.addFirst("7");
		lista2.addFirst("9");		
		con1.addAll(lista1);
		con2.addAll(lista2);
		
		System.out.println(con1.disjunct(con2));
		con1.intersect(con2).imprimite();
	}
}
