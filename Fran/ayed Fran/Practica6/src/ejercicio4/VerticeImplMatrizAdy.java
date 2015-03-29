package ejercicio4;

public class VerticeImplMatrizAdy<T> implements Vertice<T> {

	private T dato;
	private int posicion;

	
	public VerticeImplMatrizAdy(T d) {
		dato = d;	
	}
	
	public VerticeImplMatrizAdy(T d, int pos) {
		dato = d;	
		posicion = pos;
	}
	
	public T dato(){
		return dato;
	}

	
	public int getPosicion()
	{
		return posicion;
	}


	@Override
	public ListaGenerica<Arista<T>> adyacentes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void conectar(Vertice<T> v, int peso) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void conectar(Vertice<T> v) {
		// TODO Auto-generated method stub
		
	}

	
	public void setPosicion(int pos) {
		this.posicion = pos;
	}
	
	public int posicion(){
		return this.posicion;
	}
	

}
