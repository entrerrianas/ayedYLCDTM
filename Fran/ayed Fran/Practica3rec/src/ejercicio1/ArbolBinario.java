package ejercicio1;

public class ArbolBinario<T> {
	private NodoBinario<T> raiz;
	
	public ArbolBinario (T dato){
		raiz= new NodoBinario<T>(dato);
	}
	
	public ArbolBinario(){
		raiz=new NodoBinario<T>();
	}
	
	private ArbolBinario(NodoBinario<T> nodo){
		raiz=nodo;
	}
	
	public T getDatoRaiz(){
		return this.raiz.getDato();
	}
	
	private NodoBinario<T> getRaiz(){
		return this.raiz;
	}
	
	public ArbolBinario<T> getHijoIzquierdo(){
		ArbolBinario<T> subArbol= new ArbolBinario<T>(this.raiz.getHijoIzquierdo()); 
		return subArbol;
	}
	
	public ArbolBinario<T> getHijoDerecho(){
		ArbolBinario<T> subArbol=new ArbolBinario<T>(this.raiz.getHijoDerecho());
		return subArbol;
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

}
