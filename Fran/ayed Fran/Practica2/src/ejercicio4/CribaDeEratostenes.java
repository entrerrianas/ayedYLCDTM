package ejercicio4;

import ejercicio1.ListaDeEnterosEnlazada;

public class CribaDeEratostenes {
	private ListaDeEnterosEnlazada criba= new ListaDeEnterosEnlazada();
	
	public ListaDeEnterosEnlazada cargar(int n){
		//ListaDeEnterosEnlazada criba= new ListaDeEnterosEnlazada();
		for(int i=1; i<n+1; i++){
		  criba.agregar(i,i-1);	
		}
		return criba;
	}
	
	public boolean esPrimo(int n){
		for(int i=2; i<n; i++)if(n%i==0)return false;
		return true;
	}
	
	public ListaDeEnterosEnlazada obtenerPrimos(){
		criba.comenzar();
		while(!criba.fin()){
			if(!esPrimo(criba.elemento()))criba.eliminar();
			criba.proximo();
		}
		return criba;
	}
	
	
	/**
	 * 
	 */
	public void imprimirLista(){
		criba.comenzar();
		while(!criba.fin()){
		   System.out.print(criba.elemento()+" ");
		   criba.proximo();
		}
	}
	
	
}
