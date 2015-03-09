package tp03.ejercicio1;

public class PilaGenerica<T> {

	private ListaEnlazadaGenerica<T> datos;

	public PilaGenerica() {
		datos = new ListaEnlazadaGenerica<T>();
	}

	public boolean apilar(T elem){
		//Agrega elem a la pila.
		return datos.agregarFinal(elem);
	}
	
	public T desapilar(){
		//Elimina y devuelve el elemento en el tope de la pila.
		T dato;
		dato = datos.elemento(datos.tamanio());
		datos.eliminarEn(datos.tamanio());
		return dato;
	}
	
	public T tope(){
		//Devuelve el elemento en el tope de la pila sin eliminarlo.
		return datos.elemento(datos.tamanio());
	}
	
	public boolean esVacia(){
		//Retorna true si la pila está vacía, false en caso contrario.
		return datos.esVacia();
	}

}
