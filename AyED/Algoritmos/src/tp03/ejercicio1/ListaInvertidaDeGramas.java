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
		NodoGenerico<TipoGrama> gramaNuevo;
		for (int i = 0; i + longitud < palabra.length(); i++) {
			grama=palabra.substring(i,i+longitud);
			
			if (!listaInvertida.incluye(grama)){
				gramaNuevo=NodoGenerico<TipoGrama>(grama);
				}
			else{
				gramaNuevo = encontrarGrama(grama);
				}
			gramaNuevo.agregarPalabra(palabra); 
		}
		
	}
	private  NodoGenerico<TipoGrama> encontrarGrama(String grama){
		NodoGenerico<TipoGrama> aux;
		listaInvertida.comenzar();
		while (!listaInvertida.fin()){
			aux = listaInvertida.proximo();
			if (grama == aux.getDato()){
				return aux;
				}
			}
		}
	
	
	public ListaEnlazadaGenerica<String> recuperarListaDePalabras(String palabra){ // Retorna una lista de todas las
		//palabras en la lista invertida que poseen al menos uno de los gramas del
		//parámetro.
		
		String grama;
		ListaEnlazadaGenerica<String> listaPalabrasGrama;
		for (int i = 0; i + longitud < palabra.length(); i++) {
			grama=palabra.substring(i,i+longitud);
			if (!listaInvertida.incluye(grama)){
				gramaNuevo=NodoGenerico<TipoGrama>(grama);
				}
			else{
				gramaNuevo = encontrarGrama(grama);
	}
	
	
}
