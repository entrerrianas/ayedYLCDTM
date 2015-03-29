package ejercicio8;

import ejercicio6.ListaEnlazadaGenerica;
import ejercicio6.NodoGenerico;

public class NodoGrama {
    private String dato;
    private ListaEnlazadaGenerica<String> palabra;
    private NodoGrama siguiente; 
    
    public NodoGrama () 
	{
		this.dato = null;
		this.palabra=new ListaEnlazadaGenerica<String>();;
	}
	
	
	public String getDato(){
		return this.dato;
	}
	
	public String getPalabra(){
		return this.palabra.elemento();
	}
	
	
	public NodoGrama getSiguiente(){
		return this.siguiente;
	}
	
	public String getSiguientePalabra(){
		this.palabra.proximo();
		return this.palabra.elemento();
	}
	
	public void setDato(String elem){
		this.dato=elem;
	}
	
	public void setPalabra(String elem){
		this.palabra.agregar(elem,0);
	}

	
	public boolean incluyePalabra(String elem){
		comenzarPal();
		if(palabra.tamanio()>0)
		{
			while((!finPalabra())&&(!getPalabra().equals(elem)))
				getSiguientePalabra();			
			if(finPalabra())return false;
			else return true;
		}
		return false;	
	}
	
	public void setSiguiente(NodoGrama nodo){
		this.siguiente=nodo;
	}
	
	
	public boolean vacio ()
	{
		if (this.dato == null){
			return true;
		} else {
			return false;
		}
	} 
	
	public boolean finPalabra(){
		return palabra.fin();
	}
	
	public void comenzarPal(){
		palabra.comenzar();
	}
	
	public int tamanioPal(){
		return palabra.tamanio();
	}
}
