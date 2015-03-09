package tp03.ejercicio1;

public class ColaDeEnteros   {

	private ListaDeEnterosEnlazada datos;
	
	public boolean encolar(int elem){
		
		return datos.agregarFinal((Integer) elem);
				
	}
	public int desencolar(){
		int dato;
		dato = datos.elemento(1);
		datos.eliminarEn(1);
		return dato;
	}
	
	public int tope(){
		return datos.elemento(1);
	}

	public boolean esVacia(){
		return datos.esVacia();
	}

}
