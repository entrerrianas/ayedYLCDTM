package ejercicio4;

public class GrafoImplListAdy<T> implements Grafo<T> {
	ListaGenerica<Vertice<T>> vertices = new ListaEnlazadaGenerica<Vertice<T>>();

	public GrafoImplListAdy() {
		
	}

	@Override
	public void agregarVertice(Vertice<T> v) {
		if (!this.vertices.incluye(v))
		{
			((VerticeImplListAdy<T>) v).setPosicion(this.vertices.tamanio());
			this.vertices.agregar(v,this.vertices.tamanio());
		} 
	}

	@Override
	public void conectar(Vertice<T> origen, Vertice<T> destino) 
	{
		((VerticeImplListAdy<T>) origen).conectar(destino);		
	}

	@Override
	public void conectar(Vertice<T> origen, Vertice<T> destino, int peso) 
	{
		((VerticeImplListAdy<T>) origen).conectar(destino,peso);
	}

	@Override
	public void desConectar(Vertice<T> origen, Vertice<T> destino) 
	{
		((VerticeImplListAdy<T>) origen).desConectar(destino);
	}

	@Override
	public void eliminarVertice(Vertice<T> v) {
		boolean ok = false;
		int pos=0;
		if (this.vertices.incluye(v)){
			this.vertices.comenzar();
			//busco mientras no lo encuentre y no llegue al final de la lista
			while((!ok)&&(!this.vertices.fin())){
				if(this.vertices.elemento()==v){
					ok=true;
				}
				this.vertices.proximo();
				pos++;
			}
			if(ok){
				this.vertices.eliminar(pos-1);
			}
		}

	}

	
	public boolean esAdyacente(Vertice<T> origen, Vertice<T> destino) 
	{
		return((VerticeImplListAdy<T>) origen).esAdyacente(destino);
	}

	@Override
	public boolean esVacio() {
		
		return this.vertices.esVacia();
	}

	@Override
	public ListaGenerica<Arista<T>> listaDeAdyacentes(Vertice<T> v) {
		
		//devuelve una de aristas adyacentes al vertice
		
		if(this.vertices.incluye(v)){
			boolean ok=false;
			int pos =0;
			Vertice<T> aux;
			
			this.vertices.comenzar();
			while(!ok){
				if(this.vertices.elemento()==v){
					ok=true;
				}
				this.vertices.proximo();
				pos++;
			}
			if(ok){
				aux= this.vertices.elemento(pos-1);
				return ((VerticeImplListAdy<T>)aux).adyacentes();
			}
			
		} 
		return null;
	}

	
	public ListaEnlazadaGenerica<Vertice<T>> listaDeVertices() 
	{
		return (ListaEnlazadaGenerica<Vertice<T>>)this.vertices;
	}

	public int peso(Vertice<T> origen, Vertice<T> destino) 
	{
		return ((VerticeImplListAdy<T>) origen).peso(destino);
	}

	public Vertice<T> vertice(int posicion) 
	{
		return this.vertices.elemento(posicion);
	}

	
}

