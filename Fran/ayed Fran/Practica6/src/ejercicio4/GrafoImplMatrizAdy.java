package ejercicio4;

public class GrafoImplMatrizAdy<T> implements Grafo<T> {

	private int maxVertices;
	ListaGenerica<Vertice<T>> vertices;
	int[][] matrizAdy;
	
	public GrafoImplMatrizAdy(int maxVert) {
		maxVertices = maxVert;
		vertices = new ListaEnlazadaGenerica<Vertice<T>>();
		matrizAdy = new int[maxVertices][maxVertices];
		for(int i=0; i<maxVertices; i++){
			for(int j=0; j<maxVertices; j++){
				matrizAdy[i][j] = 0;
			}
		}
	}
	
	public void agregarVertice(Vertice<T> v) 
	{
		if (!this.vertices.incluye(v)){
			((VerticeImplMatrizAdy<T>)v).setPosicion(this.vertices.tamanio());
			vertices.agregar(v,this.vertices.tamanio());
			}
	}
	
	
	public void conectar(Vertice<T> origen, Vertice<T> destino, int peso) 
	{
		matrizAdy[((VerticeImplMatrizAdy<T>)origen). getPosicion()][((VerticeImplMatrizAdy<T>)destino).getPosicion()] = peso;
		// faltahacer la conexion de destino a origen
	}
	
	public void conectar(Vertice<T> origen, Vertice<T> destino) 
	{
		matrizAdy[((VerticeImplMatrizAdy<T>)origen).getPosicion()][((VerticeImplMatrizAdy<T>)destino).getPosicion()] = (Integer)destino.dato();
	}
	
	public void desConectar(Vertice<T> origen, Vertice<T> destino) 
	{
		matrizAdy[((VerticeImplMatrizAdy<T>)origen).getPosicion()][((VerticeImplMatrizAdy<T>)destino).getPosicion()] = 0;
	}
	
	public boolean esVacio()
	{
		return this.vertices.esVacia();
	}
	
	
	public ListaGenerica<Arista<T>> listaDeAdyacentes(Vertice<T> v) 
	{
		/*for (int i=0; i<=this.maxVertices-1; i++){
			for(int j=0; j<=this.maxVertices-1; j++){
				System.out.print(this.matrizAdy[i][j]+'-');
			}
		 System.out.println(' ');
		}*/
		
		ListaGenerica<Arista<T>> lista = new ListaEnlazadaGenerica<Arista<T>>();
		for (int i = 0; i <= this.maxVertices-1; i++){
			if ((this.matrizAdy[v.posicion()][i] != 0)){
				Vertice<T> nv = VerticeImplMatrizAdy<T>((Integer)this.matrizAdy[v.posicion()][i]);
				Arista<T> a = new AristaImpl<T>(v,this.matrizAdy[v.posicion()][i]); // aca no va v, se tiene que crear el vertice destino
				if (!lista.incluye(a)){
					lista.agregar(a,lista.tamanio());
				}
			}
		}
		return lista;
	}
	
	public ListaEnlazadaGenerica<Vertice<T>> listaDeVertices() 
	{
		//retorna una lista con todos los vertices del grafo
		return (ListaEnlazadaGenerica<Vertice<T>>)this.vertices;
	}
	
	
	public Vertice<T> vertice(int posicion) 
	{
		//retorna el vertice dada una posicion
		return this.vertices.elemento(posicion);
	}
	
	
	public int peso(Vertice<T> origen, Vertice<T> destino) 
	{
		return matrizAdy[((VerticeImplMatrizAdy<T>)origen). getPosicion()][((VerticeImplMatrizAdy<T>)destino).getPosicion()];
	}
	
	public void eliminarVertice(Vertice<T> v)
	{
		
		if (this.vertices.incluye(v))
		{
			// lo eliminas la arista que los une en la matriz
			for (int i = 0; i <= this.maxVertices-1; i++){
				this.matrizAdy[i][v.posicion()] = 0;
				this.matrizAdy[v.posicion()][i] = 0;
			}
			
			boolean ok=false;
			int pos = 0;
			
			this.vertices.comenzar();
			while(!ok){
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
		return matrizAdy[((VerticeImplMatrizAdy<T>)origen). getPosicion()][((VerticeImplMatrizAdy<T>)destino).getPosicion()] != 0;
	}
	
	/*public void imprimirMatriz(){
		for (int i=0; i<=this.maxVertices; i++){
			for(int j=0; j<=this.maxVertices; j++){
				System.out.print(this.matrizAdy[j][i]+' ');
			}
		 System.out.println();
		}
	}*/


}
