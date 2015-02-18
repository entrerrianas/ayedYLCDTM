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
	
	public boolean esVacio()
	{
		return this.raiz.esVacio();
	}
	public boolean cumpleAVL()
	{
		if (this.esVacio()){
			return true;
		} else {
			return this.chequearAlturas()>=0; 
		}
	}
	

	public int chequearAlturas()
	{
		return this.raiz.chequearAlturas();
	}
	
	public boolean esMinimal()
	{
		if (this.cumpleAVL()){
			//System.out.println("Cantidad Minima de Nodos: "+this.raiz.min(this.raiz.altura()));
			//System.out.println("Cantidad de Nodos: "+this.cantidadDeNodos());
			if (this.raiz.min(this.raiz.altura()) == this.cantidadDeNodos()){
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public int cantidadDeNodos()
	{
		return this.raiz.cantidadDeNodos();
	}
	
	public int altura ()
	{
		if (this.getDatoRaiz() == null){
			return -1;
		} else {
			return this.raiz.altura();
		}
	}
	
	public void imprimir()
	{
		this.raiz.imprimir();
	}
	

	public void balancear()
	{
		this.raiz.balancear();
	}
	

}
