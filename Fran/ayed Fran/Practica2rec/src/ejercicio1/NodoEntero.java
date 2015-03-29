package ejercicio1;

public class NodoEntero {
//	private Integer dato;
//	private NodoEntero siguiente;
//	
//	public NodoEntero(){
//		dato=null;
//		siguiente=null;
//	}
//	
//	public Integer getDato(){
//		return this.dato;
//	}
//	
//	public void setDato(Integer elem){
//		this.dato=elem;
//	}
//	
//	public NodoEntero getSiguiente(){
//		return this.siguiente;
//	}
//	
//	public void setSiguiente(NodoEntero nodo){
//		this.siguiente=nodo;
//	}
	
	
	private Integer dato;
	private NodoEntero siguiente;
	
	//Constructor
	public NodoEntero(){
		this.dato=null;
		this.siguiente=null;
	}
	
	public int getDato(){
		return this.dato;
	}
	
	public NodoEntero getSiguiente(){
		return this.siguiente;
	}
	
	public void setDato(int elem){
		this.dato=elem;
	}
	
	public void setSiguiente(NodoEntero nodo){
		this.siguiente=nodo;
	}
	
	public boolean vacio(){
		if(this.dato==null)return true;
		return false;
	}


}
