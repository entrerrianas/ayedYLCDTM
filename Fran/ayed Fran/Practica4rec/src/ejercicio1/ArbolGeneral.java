package ejercicio1;

import ejercicio1.ListaGenerica;

public class ArbolGeneral<T> {
	
	private NodoGeneral<T> raiz;
	
	public ArbolGeneral(){
		this.raiz=null;
	}
	
	public ArbolGeneral(T dato){
		this.raiz= new NodoGeneral<T>(dato);
	}
	
	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> lista){
		this(dato);
		ListaGenerica<NodoGeneral<T>> hijos= new ListaEnlazadaGenerica<NodoGeneral<T>>(); 
		lista.comenzar();
		while(!lista.fin()){
			ArbolGeneral<T> arbolTemp= lista.elemento();
			
			hijos.agregar(arbolTemp.getRaiz());
			lista.proximo();
		}
		raiz.setListaDeHijos(hijos);
	}
	
	private NodoGeneral<T> getRaiz(){ 
		return this.raiz;
	}


}
