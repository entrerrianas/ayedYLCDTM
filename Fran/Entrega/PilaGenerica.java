package ejercicio7;

import ejercicio6.ListaEnlazadaGenerica;

public class PilaGenerica {
	
	private ListaEnlazadaGenerica dato = new ListaEnlazadaGenerica();
	
	public void poner (Object elem)
	{
		this.dato.agregar(elem, 0);
	}
	
	public Object sacar ()
	{
		Object aux = new Object();
		aux = this.dato.elemento(0);
		this.dato.eliminar(0);
		return aux;
	}
	
	public Object tope ()
	{
		return this.dato.elemento(0);
	}
	
	public boolean esVacia()
	{
		return this.dato.esvacia();
	}
	
}
