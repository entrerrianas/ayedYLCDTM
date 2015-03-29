package ejercicio4;

public class AristaImpl<T> implements Arista<T> {

	private int peso;
	private Vertice<T> verticeDestino;
	
	public AristaImpl(Vertice<T> v, int p) {
		peso=p;
		verticeDestino=v;
	}
	
	public AristaImpl(Vertice<T> v) {
		verticeDestino=v;
	}
	
	public Vertice<T> verticeDestino(){
		return verticeDestino;
	}
	
	public int peso(){
		return peso;
	}
	
	

}
