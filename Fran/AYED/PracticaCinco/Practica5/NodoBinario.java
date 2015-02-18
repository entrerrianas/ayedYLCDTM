package ejercicio3;

public class NodoBinario<T extends
Comparable<T>>{

	private T dato;
	private NodoBinario<T> hijoIzquierdo;
	private NodoBinario<T> hijoDerecho;
	
	public NodoBinario()
	{
		this.dato = null;
		this.hijoDerecho = null;
		this.hijoIzquierdo = null;
	}
	
	public NodoBinario(T dato)	
	{
		this.dato = dato;
		this.hijoDerecho = new NodoBinario<T>();
		this.hijoIzquierdo = new NodoBinario<T>();
	}

	
	public T getDato ()
	{
		return this.dato;
	}
	
	public T getDatoRaiz(){
		return this.dato;
	}
	
	public boolean esVacio()
	{
		return this.dato == null;
	}
	
	public NodoBinario<T> getHijoIzquierdo()
	{
		return this.hijoIzquierdo;
	}
	
	public NodoBinario<T> getHijoDerecho()
	{
		return this.hijoDerecho;
	}
	
	public boolean incluye (T dato)
	{
		if (!this.esVacio()){
			if (this.dato == dato){
				return true;
			} else {
				if (dato.compareTo(this.dato) > 0){
					return this.hijoIzquierdo.incluye(dato);
				} else {
					return this.hijoDerecho.incluye(dato);
				}
			}
		} else {
			return false;
		}
	}
	
	public T buscar (T dato)
	{
		if (this.dato == dato){
			return this.dato;
		} else {
			if (dato.compareTo(this.dato) > 0){
				return this.hijoIzquierdo.buscar(dato);
			} else {
				return this.hijoDerecho.buscar(dato);
			}
		}
	}
	
	public void agregar (T dato)
	{
		if (this.dato == null){
			this.dato = dato;
		} else { 
				if (dato.compareTo(this.dato) > 0){
					this.hijoDerecho.agregar(dato);
				} else {
					if (dato.compareTo(this.dato) < 0){
							this.hijoIzquierdo.agregar(dato);
					}
					 else {
						this.dato = dato;
					 }
				}
		}
	}
	
	private NodoBinario<T> buscarMin()
	{
		NodoBinario<T> act;
		act = this;
		while (act.getHijoIzquierdo() != null){
			act = act.getHijoIzquierdo();
		} 
		return act;	
	}
	
	public void eliminar (T dato)
	{
		NodoBinario<T> act;
		NodoBinario<T> ant;
		NodoBinario<T> aux;
		
		act = this;
		while (act.getDato() != dato)
		{
			ant = act;
			if (dato.compareTo(this.dato) > 0){
				act = this.getHijoIzquierdo();
			} else {
				act = this.getHijoDerecho();
			}
		}
		aux = this;
		if (act.getHijoIzquierdo() == null){
			act = act.getHijoDerecho();
		} else { 
			if (act.getHijoIzquierdo() == null){
				act = act.getHijoIzquierdo();
			} else {
				aux = buscarMin();
				act.dato = aux.dato;
				act.eliminar(act.getHijoDerecho().getDato());
			}
		}
	}
	
	public void imprimir ()
	{
		if (this.dato != null){
			System.out.println(this.dato);
			this.getHijoDerecho().imprimir();
			this.getHijoIzquierdo().imprimir();
		} else {
			System.out.print("Fin");
		}
	}

}
