package Ejercicio1B;

private class NodoDeStrings {
	private String contenido;
	private NodoDeStrings siguiente;
	
	
	public NodoDeStrings(String contenido) {
		contenido(contenido);
	}
	
	
	public String contenido() {
		return contenido;
	}
	
	public void contenido(String contenido) {
		contenido = contenido;
	}
	
	public NodoDeStrings siguiente() {
		return siguiente;
	}
	
	public void siguiente(NodoDeStrings siguiente) {
		siguiente = siguiente;
	}
	
	public void imprimite() {
		System.out.println(contenido);
	}
}
