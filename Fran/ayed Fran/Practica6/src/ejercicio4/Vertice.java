package ejercicio4;

public interface Vertice<T> {
	public T dato();
	public int posicion();
	public void conectar(Vertice<T> v, int peso);
	public void conectar(Vertice<T> v);
	public ListaGenerica<Arista<T>> adyacentes();
	public void setPosicion(int pos);

}
