package ejercicio3;

import ejercicio3.NodoBinario;

public class ArbolBinarioDeBusqueda <T extends
Comparable<T>> {

	private NodoBinario<T> raiz ;
	
	public ArbolBinarioDeBusqueda(){
		this.raiz = new NodoBinario<T>();
	}
	
	public ArbolBinarioDeBusqueda(T r) 
	{	
		this.raiz = new NodoBinario<T>(r);
	}
	
	private ArbolBinarioDeBusqueda(NodoBinario<T> r)
	{
		this.raiz = r;
	}
	
	public NodoBinario<T>getRaiz()
	{
		return this.raiz;
	}
	
	public T getDatoRaiz()
	{
		return this.raiz.getDato();
	}
	
	public boolean esVacio()
	{
		return this.raiz.esVacio();
	}
	
	public NodoBinario<T> getHijoIzquierdo()
	{
		return this.raiz.getHijoIzquierdo();
	}
	
	public NodoBinario<T> getHijoDerecho()
	{
		return this.raiz.getHijoDerecho();
	}
	
	public boolean incluye(T dato)
	{
		return this.raiz.incluye(dato);
	}
	
	public T buscar (T dato)
	{
		if (this.incluye(dato))
		{
			return this.raiz.buscar(dato);
		} else {
			return null;
		}
	}
	
	public void agregar(T dato)
	{
		this.raiz.agregar(dato);
	}
	
	public void eliminar (T dato)
	{
		if (this.incluye(dato)){
			this.raiz.eliminar(dato);
		} 
	}
	
	public void imprimir ()
	{
		//this.raiz.imprimir();
	}
	
}
