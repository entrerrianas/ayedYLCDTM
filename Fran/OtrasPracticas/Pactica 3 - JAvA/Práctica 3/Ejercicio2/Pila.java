package Ejercicio2;

import Ejercicio1B.*;

public class Pila {
	private ListaDeStrings elementos = new ListaDeStrings();
	
	
	public void push(String elemento) {
		elementos.addFirst(elemento);
	}
	
	public String pop() {
		NodoDeStrings sacado = elementos.getFirst();
		
		elementos.removeFirst();
		return sacado.contenido();
	}
	
	public String top() {
		return elementos.getFirst().contenido();
	}
	
	public boolean isEmpty() {
		return elementos.isEmpty();
	}
	
	public int size() {
		return elementos.size();
	}
}
