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
			if (dato.compareTo(this.dato) == 0){
				return true;
			} else {
				if (dato.compareTo(this.dato) < 0){
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
			if (dato.compareTo(this.dato) < 0){
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
			this.hijoDerecho = new NodoBinario<T>();
			this.hijoIzquierdo = new NodoBinario<T>();
		} else { 
				if (dato.compareTo(this.dato) < 0){
					this.hijoIzquierdo.agregar(dato);
				} else {
					if (dato.compareTo(this.dato) > 0){
							this.hijoDerecho.agregar(dato);
					}
					 else {
						this.dato = dato;
					 }
				}
		}
	}
	
	private NodoBinario<T> buscarMin()
	{
	
		if(this.getHijoDerecho().getDato()!=null){
			this.getHijoDerecho().buscarMin();
		}
		return this;	
	}
	
	public void eliminar (T dato)
	{
		NodoBinario<T> act;
		NodoBinario<T> aux;
		
		act = this;
		if (dato.compareTo(act.dato) < 0)
		{
			act.getHijoIzquierdo().eliminar(dato);
		}else if (dato.compareTo(act.dato) > 0){
			act.getHijoDerecho().eliminar(dato);
		}
		else{//lo encontro
			if(act.getHijoDerecho().getDato()==null){//si no tiene hijo derecho
				act.dato=act.getHijoIzquierdo().dato;
				act.hijoIzquierdo=act.getHijoIzquierdo().getHijoIzquierdo();
				act.hijoDerecho=act.getHijoIzquierdo().getHijoDerecho();
			}else if(act.getHijoIzquierdo().getDato()==null){//si no tiene hijo izquierdo
				act.dato=act.getHijoDerecho().dato;
				act.hijoDerecho=act.getHijoDerecho().getHijoDerecho();
				act.hijoIzquierdo=act.getHijoDerecho().getHijoIzquierdo();
			}else{//tiene los dos hijos
				aux=act.getHijoIzquierdo().buscarMin();//busca el minimo del sub arbol derecho
				act.dato=aux.dato;
				//act.eliminar(act.dato);
			}
			
		}
		
		
	}
	
	/*public void imprimir ()
	{
		if (this.dato != null){
			System.out.println(this.dato);
			this.getHijoDerecho().imprimir();
			this.getHijoIzquierdo().imprimir();
		} else {
			System.out.println("Fin");
		}
	}*/

}
