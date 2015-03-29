package ejercicio4;

public class VerticeImplListAdy<T> implements Vertice<T> {
	
	private T dato;
	private int posicion;
	private ListaGenerica<Arista<T>> adyacentes;
	

	public VerticeImplListAdy(T d) 
	{
		posicion = 0;
		dato=d;
		adyacentes= new ListaEnlazadaGenerica<Arista<T>>();	
	}

	public T dato() {
	    
		return dato;
	}

	public int posicion() 
	{
		return posicion;
	}
	
	public void setPosicion (int p)
	{
		posicion=p;
	}
	
	public void conectar(Vertice<T> v, int peso) 
	{
		Arista<T> a = new AristaImpl<T>(v, peso);
		if(!this.adyacentes.incluye(a)){
			adyacentes.agregar(a);
		}
	}
	
	public void conectar(Vertice<T> v)
	{
		Arista<T> a = new AristaImpl<T>(v);
		if(!this.adyacentes.incluye(a)){
			adyacentes.agregar(a);
		}
	}
	
	
	public void desConectar(Vertice<T> destino)
	{
		boolean ok = false;
		int pos=0;
		
		this.adyacentes.comenzar();
		while (!this.adyacentes.fin() && (ok==false)){
			if (this.adyacentes.elemento().verticeDestino() == destino){
				ok = true;
			}
			pos++;
			this.adyacentes.proximo();
		}
		if (ok){
			this.adyacentes.eliminar(pos-1);
		}
	}
	
	
	public int peso(Vertice<T> v) 
	{
		Arista<T> arista = obtenerArista(v);
		int ret = 0;
		if(arista != null){
		ret = arista.peso();
		}
		return ret;
		}
	
	public boolean esAdyacente (Vertice<T> v)
	{
		//recorro la lista de aristas del vertice y me fijo si en las mismas se incluye el vertice v
		boolean ok = false;
		this.adyacentes.comenzar();
		while ((!ok) && (!this.adyacentes.fin()))
		{
			if (this.adyacentes.elemento().verticeDestino() == v){
				ok = true;
			}
			this.adyacentes.proximo();
		}
		return ok;
	}
	
	public ListaGenerica<Arista<T>> adyacentes()
	{
		return this.adyacentes;
	}
	
	private Arista<T> obtenerArista(Vertice<T> v) 
	{
		Arista<T> arista = new AristaImpl<T>(v);
		boolean ok = false;
		int pos = 0;
		
		this.adyacentes.comenzar();
		while ((!ok) && (!this.adyacentes.fin()))
		{
			if (this.adyacentes.elemento().verticeDestino() == arista.verticeDestino()){
				ok = true;
			}
			pos++;
			this.adyacentes.proximo();
		}
		if (ok){
			return this.adyacentes.elemento(pos-1); 
		} else {
			return null;
		}
	}
	
}

