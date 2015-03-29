package ejercicio6;

import ejercicio1.NodoEntero;
import ejercicio6.ListaGenerica;
import ejercicio6.NodoGenerico;

public class ListaEnlazadaGenerica<T> extends ListaGenerica<T> {
	
	private NodoGenerico<T> inicio;
	private NodoGenerico<T> actual;
	
	public ListaEnlazadaGenerica(){
		inicio= new NodoGenerico<T>();
		actual= new NodoGenerico<T>();
	}
	
	
	public boolean agregar(T elem) {
		boolean ok = true;
		
		NodoGenerico<T> aux1= new NodoGenerico<T>();
		aux1.setDato(elem);
		this.actual.setDato(aux1.getDato());
	    this.actual.setSiguiente(aux1.getSiguiente());
		super.tamanio++;
		return ok;

	}

	public boolean agregar(T elem, int pos) {
		 if((pos>=0)&&(tamanio()>=pos)){//si la pos es positiva y la pos esta dentro o es igual al tamño 
			 NodoGenerico<T> nue=new NodoGenerico<T>();
			 NodoGenerico<T> ant=new NodoGenerico<T>();
			 int i=0;
			 comenzar();
			 ant=actual;
			 nue.setDato(elem);
			 while(i<pos){
				 ant=actual;
				 proximo();
				 i++;
			 }
			 if(inicio==actual){//inserto al comienzo de la lista
				inicio=nue;
			 }else{//inserto en el medio o al final
				ant.setSiguiente(nue); 
			 }
			 nue.setSiguiente(actual);
			 tamanio++;
			 return true; 
		  }
	  return false;

	}
	
	public void comenzar() {
		actual=inicio;
	}

	public T elemento() {

		return this.actual.getDato();
	}

	public T elemento(int pos) {
		if(pos<tamanio()){
        	this.comenzar();
  			while(pos-- >0){
  				this.proximo();	
  			} //primero pregunta y desp decrementa.
  			return actual.getDato(); 
          }
		  return null;	
	}

	public boolean eliminar() {
//		if (actual == null) return false;
//		  super.tamanio--;
//		  if (actual == inicio) {
//				inicio = inicio.getSiguiente();
//				return true;
//		} else {
//			NodoGenerico<T> p = inicio;
//			while (p.getSiguiente() != actual) p = p.getSiguiente();
//			p.setSiguiente(actual.getSiguiente());
//			actual = p;
//			return true;  
//	    }
		
		

		
		
	}
	
	public boolean eliminar(int pos) {
		if (pos < 0 || pos >= this.tamanio()) return false;
		
		  super.tamanio--;
		  if (pos == 0) {
			inicio = inicio.getSiguiente();//  
			return true;
		  }
		  this.comenzar();
		  while (--pos > 0) this.proximo();
		  actual.setSiguiente(actual.getSiguiente().getSiguiente());//yo para esto manejaba un anterior y un actual
		  return true;	
	}

	public boolean esVacia() {
		return tamanio()==0;
	}

	public boolean fin() {	
		return this.actual.getSiguiente()==null;
	}

	public boolean incluye(T elem) {
		this.comenzar();
		  while( !this.fin() && !this.elemento().equals(elem))
			  this.proximo();
		  return (!this.fin());
	}

	public void proximo() {
		//this.actual= this.actual.getSiguiente();
		  if(!fin()){
			  actual=actual.getSiguiente();
		  }
	}

	public int tamanio() {
	
		return this.tamanio;
	}
	
	

}
