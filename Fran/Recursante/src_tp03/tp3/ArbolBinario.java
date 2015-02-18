package tp3;

import tp2.ListaGenerica;

public class ArbolBinario<T> {

	private NodoBinario<T> raiz;
	
	public ArbolBinario(){
		
		this.raiz = null;
	}
	
	public ArbolBinario(T dato){
		
		this.raiz = new NodoBinario<T>(dato);
	}	
	
	private ArbolBinario(NodoBinario<T> nodo){
		
		this.raiz = nodo;
	}
	
	private NodoBinario<T> getRaiz(){
		
		return this.raiz;
	}
	
	public T getDatoRaiz(){

		return (this.raiz==null)?null:this.raiz.getDato();
	}
	
	public ArbolBinario<T> getHijoIzquierdo(){
		
		return new ArbolBinario<T>(this.raiz.getHijoIzquierdo());
	}
	
	public ArbolBinario<T> getHijoDerecho(){
		
		return new ArbolBinario<T>(this.raiz.getHijoDerecho());
	}	
	
	public void agregarHijoIzquierdo(ArbolBinario<T> hijo){
		
		this.raiz.setHijoIzquierdo(hijo.getRaiz());
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo){
		
		this.raiz.setHijoDerecho(hijo.getRaiz());
	}	
	
	public void eliminarHijoIzquierdo(){
		
		this.raiz.setHijoIzquierdo(null);
	}
	
	public void eliminarHijoDerecho(){
		
		this.raiz.setHijoDerecho(null);
	}	
	
	public ListaGenerica<T> frontera() {
		// Falta implementar
		return null;
	}

	public boolean esMenor(ArbolBinario<T> unArbol) {
		// Falta implementar
		return false;
	}


	public boolean lleno() {
		// Falta implementar
		return false;
	}
	
	public boolean completo() {
		//Falta implementar
		return false;

	}
	
}
