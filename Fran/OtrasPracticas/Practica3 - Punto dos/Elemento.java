
public class Elemento {
	private String contenido;
	private Elemento siguiente;
	
	
	public void Elemento(String contenido){
		this.contenido = contenido;
	}
	
	
	public String getContenido() {
		return contenido;
	}
	
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	public Elemento getSiguiente() {
		return siguiente;
	}
	
	public void setSiguiente(Elemento siguiente) {
		this.siguiente = siguiente;
	}
}
