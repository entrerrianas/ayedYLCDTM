package ejercicio3;

import ejercicio1.ListaDeEnterosEnlazada;

public class ColaDeEnteros {
	private ListaDeEnterosEnlazada datos=new ListaDeEnterosEnlazada();
	
	public void ColaDeEnteros(){
		//datos= new ListaDeEnterosEnlazada();
	}
	
	public void poner(Integer elem){
		datos.agregar(elem,datos.tamanio());
	}
	
	public Object sacar(){
			Integer aux=this.datos.elemento(0);
			this.datos.eliminar(0);
			return aux;
	}
	
	public boolean esVacia(){
		return ((datos.tamanio()==0));
		//return datos.esvacia(); //OPCION FRAN
	}
	
	public Object tope(){
		return this.datos.elemento(0);
	}

}
