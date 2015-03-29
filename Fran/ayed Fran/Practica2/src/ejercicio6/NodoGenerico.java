package ejercicio6;

import ejercicio6.NodoGenerico;

public class NodoGenerico<T> {

	private T dato;
	private NodoGenerico<T> siguiente;
	
	public NodoGenerico () 
	{
		this.dato = null;
	}
	
	
	public T getDato(){
		return this.dato;
	}
	
	public NodoGenerico<T> getSiguiente(){
		return this.siguiente;
	}
	
	public void setDato(T elem){
		this.dato=elem;
	}
	
	public void setSiguiente(NodoGenerico<T> nodo){
		this.siguiente=nodo;
	}
	
	public boolean vacio ()
	{
		if (this.dato == null){
			return true;
		} else {
			return false;
		}
	}
}
