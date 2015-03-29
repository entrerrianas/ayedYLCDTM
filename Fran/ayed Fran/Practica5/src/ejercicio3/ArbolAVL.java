package ejercicio3;

public class ArbolAVL <T extends
Comparable<T>> {

	private NodoAVL<T> raiz;
	
	public ArbolAVL() 
	{
		this.raiz = new NodoAVL<T>();
	}
	
	public ArbolAVL(T dato)
	{
		this.raiz = new NodoAVL<T>(dato);
	}
	
	private ArbolAVL (NodoAVL<T> nodo)
	{
		this.raiz = nodo;
	}
	
	private NodoAVL<T> getRaiz()
	{
		return this.raiz;
	}
	
	public T getDatoRaiz()
	{
		return this.raiz.getDato();
	}
	
	public ArbolAVL<T> getHijoIzquierdo()
	{
		return new ArbolAVL(this.raiz.getHijoIzquierdo());
	}
	
	public ArbolAVL<T> getHijoDerecho()
	{
		return new ArbolAVL(this.raiz.getHijoDerecho());
	}
	
	public boolean incluye (T dato)
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
	

}
