package tp03.ejercicio1;

public class ListaInvertidaDeGramas {
	
	private ListaEnlazadaGenerica<TipoGrama> listaInvertida;
	private int longitud;
	
	public ListaInvertidaDeGramas(int longGrama){
		this.listaInvertida = new ListaEnlazadaGenerica<TipoGrama>();
		this.longitud = longGrama;
	}
	
	public void agregar(String palabra){
		String grama;
		TipoGrama gramaNuevo = null;
		for (int i = 0; i + longitud <= palabra.length(); i++) {
			grama = palabra.substring(i, i+longitud);	
			gramaNuevo = new TipoGrama(grama);	
			if (listaInvertida.incluye(gramaNuevo)){		
				gramaNuevo = this.encontrarGrama(grama);
			} else {
				listaInvertida.agregarFinal(gramaNuevo);
			}
			gramaNuevo.agregarPalabra(palabra); 
		}	
		
	}
	
	private TipoGrama encontrarGrama(String grama){
		TipoGrama aux = null;

		listaInvertida.comenzar();
		while (!listaInvertida.fin()){
			aux = listaInvertida.proximo();
			if (grama.equals(aux.getDato())){
				return aux;
			}
		}
		return aux;	
	}
	
	public ListaEnlazadaGenerica<String> recuperarListaDePalabras(String palabra){ 
		// Retorna una lista de todas las
		// palabras en la lista invertida que poseen al menos uno de los gramas del
		// parámetro.
		
		String grama;
		TipoGrama nodoGrama = new TipoGrama("");
		ListaEnlazadaGenerica<String> listaPalabrasGrama = new ListaEnlazadaGenerica<String>();
		
		for (int i = 0; i + longitud <= palabra.length(); i++) {
			grama = palabra.substring(i,i+longitud);
			nodoGrama.setDato(grama);
			
			if (!listaInvertida.incluye(nodoGrama)){
				TipoGrama nodoCumpleGrama = this.encontrarGrama(grama);
				listaPalabrasGrama.agregarFinal(nodoCumpleGrama.getListaPalabras().elemento(1));
			} 

		}
		return listaPalabrasGrama;
	}
}