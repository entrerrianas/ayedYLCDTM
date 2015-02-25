package tp03.ejercicio1;

public class NodoGenerico<T> {
	private T dato;
	private NodoGenerico siguiente;
	
	public T getDato() {
		return dato;
	}
	public void setDato(T dato) {
		this.dato = dato;
	}
	public NodoGenerico getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoGenerico siguiente) {
		this.siguiente = siguiente;
	}

}
