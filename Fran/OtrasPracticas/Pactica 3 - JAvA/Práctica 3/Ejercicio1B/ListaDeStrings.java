package Ejercicio1B;

public class ListaDeStrings {
	private NodoDeStrings inicioLista, actual;
	
	
	public void begin() {
		actual = inicioLista;
	}
	
	public void next() {
		actual = actual.siguiente();
	}
	
	public boolean end() {
		return actual.siguiente() == null;
	}
	
	public NodoDeStrings getCurrent() {
		return actual;
	}
	
	public void delete() {
		if (inicioLista == actual)
			inicioLista = inicioLista.siguiente();
		else
		{
			NodoDeStrings actualAuxiliar = inicioLista,
						  anterior = null;
			
			while ((actualAuxiliar != null) && (actualAuxiliar != actual))
			{
				anterior = actualAuxiliar;
				actualAuxiliar = actualAuxiliar.siguiente();
			}
			
			anterior.siguiente(actualAuxiliar.siguiente());
		}
		
		actual = actual.siguiente();		
	}
	
	public void addFirst(String contenido) {
		NodoDeStrings nuevoElemento = new NodoDeStrings(contenido);
		
		nuevoElemento.siguiente(inicioLista);
		inicioLista = nuevoElemento;
	}
	
	public void removeFirst() {
		//Es responsabilidad del programador verificar
		//que la lista tenga elementos antes de eliminar.
		
		if (actual == inicioLista)
			actual = actual.siguiente();
		
		inicioLista = inicioLista.siguiente();
	}
	
	public NodoDeStrings getFirst() {
		return inicioLista;
	}
	
	public void addLast(String contenido) {
		NodoDeStrings nuevoElemento = new NodoDeStrings(contenido);
		
		if (inicioLista == null)
			inicioLista = nuevoElemento;
		else
			getLast().siguiente(nuevoElemento);		
	}
	
	public void removeLast() {
		//Es responsabilidad del programador verificar
		//que la lista tenga elementos antes de eliminar.
		
		NodoDeStrings ultimo = actual,
					  anterior = null;
		
		while (ultimo.siguiente() != null)
		{
			anterior = ultimo;
			ultimo = ultimo.siguiente();
		}
		
		if (ultimo == inicioLista)
			inicioLista = null;
		else
			anterior.siguiente(null);
	}
	
	public NodoDeStrings getLast() {
		NodoDeStrings ultimo = actual;
		
		while (ultimo.siguiente() != null)
			ultimo = ultimo.siguiente();
		
		return ultimo;
	}
	
	public int size() {
		NodoDeStrings actualAuxiliar = inicioLista;
		int tamañoLista = 0;
		
		while (actualAuxiliar != null)
		{
			tamañoLista = tamañoLista + 1;
			actualAuxiliar = actualAuxiliar.siguiente();
		}
		
		return tamañoLista;
	}
	
	public boolean includes(String contenido) {
		NodoDeStrings actualAuxiliar = inicioLista;
		
		while (actualAuxiliar != null && actualAuxiliar.contenido() != contenido)
			actualAuxiliar = actualAuxiliar.siguiente();
		
		return actualAuxiliar != null;
	}
	
	public boolean isEmpty() {
		return inicioLista == null;
	}
	
	public void add(String elemento){
		NodoDeString nuevo = new NodoDeString(elemento);
		nuevo.		
	}
}
