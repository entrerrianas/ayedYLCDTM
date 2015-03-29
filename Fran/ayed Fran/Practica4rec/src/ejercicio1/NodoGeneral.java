package ejercicio1;


import ejercicio1.ListaGenerica;
import ejercicio1.ListaEnlazadaGenerica;

public class NodoGeneral<T> {
	private T dato;
	private ListaGenerica<NodoGeneral<T>> listaHijos;
	
	public NodoGeneral(T dato){
		this.dato=dato;
		listaHijos= new ListaEnlazadaGenerica<NodoGeneral<T>>();
	}
	
	public T getDato(){
		return this.dato;
	}
	
	public ListaGenerica<NodoGeneral<T>> getHijos(){
		return this.listaHijos;
	}
	
	public void setdato(T dato){
		this.dato=dato;
	}
	
	public void setListaDeHijos(ListaGenerica<NodoGeneral<T>> lista){
		this.listaHijos=lista;
	}
	
}


