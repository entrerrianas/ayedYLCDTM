package ejercicio6;

public class NodoGenerico<T> {

	private T dato;
	private NodoGenerico<T> siguiente;

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
