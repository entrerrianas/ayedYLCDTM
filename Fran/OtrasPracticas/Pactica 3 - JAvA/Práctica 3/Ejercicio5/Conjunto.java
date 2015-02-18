package Ejercicio5;

import Ejercicio1B.ListaDeStrings;;

public class Conjunto {
	private ListaDeStrings elementos = new ListaDeStrings();
	
	
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
}
