package ejercicio2;

import ejercicio1.ListaDeEnterosEnlazada;

public class PilaDeEnteros {
	private ListaDeEnterosEnlazada datos=new ListaDeEnterosEnlazada();

	public void poner(Integer elem){
		this.datos.agregar(elem,0);
	}
	
	public Object sacar(){
		Integer aux;
		aux=this.datos.elemento(0);
		this.datos.eliminar(0);
		return aux;
	}
	
	public Object tope(){
			return this.datos.elemento(0);
	}
	
	public boolean esVacia(){
		return datos.tamanio()==0;
		//return datos.esvacia(); //OPCION FRAN
	}

}
