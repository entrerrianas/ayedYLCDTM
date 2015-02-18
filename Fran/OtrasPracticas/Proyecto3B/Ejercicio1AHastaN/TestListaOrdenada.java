package Ejercicio1AHastaN;

public class TestListaOrdenada {
	
	public static void main(String[] basura) {
		ListaOrdenada lista = new ListaOrdenada();
		ListaOrdenada lista2 = new ListaOrdenada();
		
		lista.add("Java");
		lista.add("ADA");
		lista.add("Delphi");
		lista.add("Linux");
		lista.add("Programación");
		lista.add("Matemática 3");
		lista.add("IBD");
		lista.add("ISO");
		lista.add("Inglés");
		lista.add("1 Objetos");
		
	
		lista2.add("Java");
		lista2.add("ADA");
		lista2.add("Delphi");
		lista2.add("Linux");
		lista2.add("Programación");
		lista2.add("Matemática 3");
		lista2.add("IBD");
		lista2.add("ISO");
		lista2.add("Inglés");
		lista2.add("1 Objetos");
		
		System.out.print(lista.equals(lista2));
	}

}
