package tp03.ejercicio1;

public class PilaDeEnteros   {
	private ListaDeEnterosEnlazada datos;

	public PilaDeEnteros() {
		datos = new ListaDeEnterosEnlazada();
	}


	public boolean apilar(int elem){
		//Agrega elem a la pila.
		return datos.agregarFinal(Integer(elem));
		
		}
	
	public int desapilar(){
		//Elimina y devuelve el elemento en el tope de la pila.
		int dato;
		dato = datos.elemento(datos.tamanio());
		datos.eliminarEn(datos.tamanio());
		return dato;
	}
	
	public int tope(){
		//Devuelve el elemento en el tope de la pila sin eliminarlo.
		return datos.elemento(datos.tamanio());
	}
	
	public boolean esVacia(){
		//Retorna true si la pila está vacía, false en caso contrario.
		return datos.esVacia();
	}
}
