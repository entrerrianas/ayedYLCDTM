package tp03.ejercicio1;

public class TipoGrama {

	private String dato;
	private ListaEnlazadaGenerica<String> listaPalabras;
	
	public TipoGrama(String grama){
		dato = grama;
		listaPalabras = ListaEnlazadaGenerica<String>();
	}
	
	public String getDato() {
		return dato;
	}
	public void setDato(String dato) {
		this.dato = dato;
	}
	
	public boolean agregarPalabra(String palabra){
		listaPalabras.agregarFinal(palabra);
		return true;
		}
	
	public ListaEnlazadaGenerica<String> getListaPalabras() {
		return listaPalabras;
	}
	
	public 
	
	
	
	
	

}
