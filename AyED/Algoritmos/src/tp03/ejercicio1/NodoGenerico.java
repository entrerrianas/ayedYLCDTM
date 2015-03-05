package tp03.ejercicio1;

public class NodoGenerico<T> {
	protected T dato;
	protected NodoGenerico<T> siguiente;
	
	public T getDato() {
		return dato;
	}
	public void setDato(T dato) {
		this.dato = dato;
	}
	public NodoGenerico<T> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoGenerico<T> siguiente) {
		this.siguiente = siguiente;
	}

}
