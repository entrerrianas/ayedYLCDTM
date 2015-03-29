package ejercicio3;

import ejercicio1.ListaDeEnteros;
import ejercicio1.ListaDeEnterosEnlazada;

public class ColaDeEnteros {
	private ListaDeEnterosEnlazada datos;
	
	public ColaDeEnteros(){
		datos=new ListaDeEnterosEnlazada();
	}
	
	public void poner (Integer elem){
		this.datos.agregar(elem,this.datos.tamanio());
	}
	
	public int sacar(){
		int aux;
		aux= this.datos.elemento(0);
		this.datos.eliminar(0);
		return aux;
	}
	
	public int tope(){
		return this.datos.elemento(0);
	}
	
	public boolean esVacia(){
		return this.datos.esVacia();
	}

}
