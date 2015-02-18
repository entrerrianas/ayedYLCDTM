package Ejercicio5;

import Ejercicio1B.ListaDeStrings;;


public class Conjunto {
	private ListaDeStrings elementos = new ListaDeStrings();
	

	private void add (String elemento){
		elementos.addFirst(elemento);
	}
	
	public void imprimite(){
		elementos.imprimite();
	}
	
	public void addAll(ListaDeStrings unaLista) {
		int x = unaLista.size();
		String elemento;
		
		unaLista.begin();
		for (int y = 0; y < x; y++)
		{
			if (!elementos.includes(elemento = unaLista.getCurrent().contenido()))
				elementos.addFirst(elemento);
			
			unaLista.next();
		}
	}
	
	public boolean include (String elemento){
		return elementos.includes(elemento);
	}
	
	public boolean disjunct (Conjunto conjunto2){
		elementos.begin();
		while (!elementos.end() && !conjunto2.include(elementos.getCurrent().contenido()))
			elementos.next();
		
		return elementos.end();
	}
	
	public Conjunto intersect (Conjunto conjunto2){
		Conjunto resultado = new Conjunto();
		
		elementos.begin();
		while (!elementos.end())
		{
			if (conjunto2.include(elementos.getCurrent().contenido()))
				resultado.add(elementos.getCurrent().contenido());
			
			elementos.next();
		}
		
		return resultado;
	}		
}    

