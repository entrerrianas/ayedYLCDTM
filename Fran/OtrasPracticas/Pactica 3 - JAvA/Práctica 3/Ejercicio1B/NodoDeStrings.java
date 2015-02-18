package Ejercicio1B;

public class NodoDeStrings {
	private String contenido;
	private NodoDeStrings siguiente;
	
	
	public NodoDeStrings(String contenido) {
		contenido(contenido);
	}
	
	
	public String contenido() {
		return contenido;
	}
	
	public void contenido(String contenido) {
		this.contenido = contenido;
	}
	
	public NodoDeStrings siguiente() {
		return siguiente;
	}
	
	public void siguiente(NodoDeStrings siguiente) {
		this.siguiente = siguiente;
	}
}
