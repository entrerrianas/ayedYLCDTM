package ejercicio2;

import ejercicio1.ListaDeEnterosEnlazada;

public class PilaDeEnteros extends ListaDeEnterosEnlazada {
	
	private ListaDeEnterosEnlazada datos;

	
	
	public PilaDeEnteros(){
		datos=new ListaDeEnterosEnlazada();
	}
	
	public void poner(Integer elem){
		this.datos.agregar(elem, 0);
	}
	
	public Object sacar(){
			int aux= datos.elemento(0);
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
