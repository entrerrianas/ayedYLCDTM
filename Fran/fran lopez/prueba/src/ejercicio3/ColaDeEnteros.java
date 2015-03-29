package ejercicio3;

import ejercicio1.*;

public class ColaDeEnteros {

	private ListaDeEnteros datos = new ListaDeEnterosEnlazada();
	
	
	public boolean apilar(int elem){
		return this.datos.agregarFinal(elem);
	}
	
	public int tope (){
		return this.datos.elemento(this.datos.tamanio());
	}
	
	public int desapilar(){
		
		int elemTope = this.tope();
		this.datos.eliminar(elemTope);
		return elemTope;
		
	}
	
	public boolean esVacia(){
		return this.datos.esVacia();
	}
	
	
	
}
