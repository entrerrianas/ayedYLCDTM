package tp03.ejercicio1;

public class TipoGrama extends NodoGenerico<String>{

	private ListaEnlazadaGenerica<String> listaPalabras;
	
	public TipoGrama(String grama){
		this.dato = grama;
		this.listaPalabras = new ListaEnlazadaGenerica<String>();
	}
	
	public boolean agregarPalabra(String palabra){
		listaPalabras.agregarFinal(palabra);
		return true;
	}
	
	public ListaEnlazadaGenerica<String> getListaPalabras() {
		return listaPalabras;
	}
		
}
