package Ejercicio3;

import Ejercicio1B.*;

public class Cola {
	private ListaDeStrings elementos = new ListaDeStrings();
	
	
	public void push(String elemento) {
		elementos.addLast(elemento);
	}
	
	public String pop() {
		NodoDeStrings sacado = elementos.getFirst();
		
		elementos.removeFirst();
		return sacado.contenido();
	}
	
	public String top() {
		return elementos.getFirst().contenido();
	}
	
	public String buttom() {
		return elementos.getLast().contenido();
	}
	
	public boolean isEmpty() {
		return elementos.isEmpty();
	}
	
	public int size() {
		return elementos.size();
	}
}
