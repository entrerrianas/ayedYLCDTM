package tp03.ejercicio1;

public class ListaInvertidaDeGramas {
	
	private ListaEnlazadaGenerica<NodoGenerico<TipoGrama>> listaInvertida;
	private int longitud;
	
	public ListaInvertidaDeGramas(int longGrama){
		listaInvertida = new ListaEnlazadaGenerica<NodoGenerico<TipoGrama>>();
		longitud = longGrama;
	}
	
	public void agregar(String palabra){
		String grama;
		
		for (int i = 0; i + longitud < palabra.length(); i++) {
	
		}
		
	}
	
	
}
