package ejercicio1;

public class NodoGenerico<T> {
	private T dato;
	private NodoGenerico<T> siguiente;
	
	public NodoGenerico(){
		dato=null;
		siguiente=null;
	}
	
	public T getDato(){
		return this.dato;
	}
	
	public void setDato(T elem){
		this.dato= elem;
	}
	
	public NodoGenerico<T> getSiguiente(){
		return this.siguiente;
	}
	
	public void setSiguiente(NodoGenerico<T> nodo){
		this.siguiente=nodo;
	}

}
