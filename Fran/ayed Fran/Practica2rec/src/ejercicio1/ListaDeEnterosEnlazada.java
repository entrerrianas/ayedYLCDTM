package ejercicio1;

public class ListaDeEnterosEnlazada extends ListaDeEnteros{
	
	private NodoEntero actual;
	private NodoEntero inicial;
	
	
	
	
	  public ListaDeEnterosEnlazada(){
		  super();
		  super.tamanio=0;
		  tamanio=0;
		  this.actual= new NodoEntero();
		  this.inicial= new NodoEntero();
	  }
	
	  public void comenzar(){
		actual=inicial;
		 // this.actual= this.inicial;
	  }
	  
	  public void proximo(){
		  if(!fin()){
			  actual=actual.getSiguiente();
		  }
	  }
	  
	  
	  public Integer elemento(){
		 return actual.getDato();
	  }
	  
	  public Integer elemento(Integer pos){
          if(pos<tamanio()){
        	this.comenzar();
  			while(pos-- >0){
  				this.proximo();	
  			} //primero pregunta y desp decrementa.
  			return actual.getDato(); 
          }
		  return null;	
	  }
	  
	  public boolean agregar(Integer elem){
			boolean ok = true;
			
			NodoEntero aux1= new NodoEntero();
			aux1.setDato(elem);
			this.actual.setDato(aux1.getDato());
		    this.actual.setSiguiente(aux1.getSiguiente());
			super.tamanio++;
			return ok;
	  }
	  
	  public boolean agregar(Integer elem, Integer pos){
		  if((pos>=0)&&(tamanio()>=pos)){//si la pos es positiva y la pos esta dentro o es igual al tamño 
			 NodoEntero nue=new NodoEntero();
			 NodoEntero ant=new NodoEntero();
			 int i=0;
			 comenzar();
			 ant=actual;
			 nue.setDato(elem);
			 while(i<pos){
				 ant=actual;
				 proximo();
				 i++;
			 }
			 if(inicial==actual){//inserto al comienzo de la lista
				inicial=nue;
			 }else{//inserto en el medio o al final
				ant.setSiguiente(nue); 
			 }
			 nue.setSiguiente(actual);
			 tamanio++;
			 return true; 
		  }
	  return false;
	  }
	  
	  
  
	  public boolean eliminar(){
//		  if (actual == null) return false;
//		  super.tamanio--;
//		  if (actual == inicial) {
//				inicial = inicial.getSiguiente();
//				return true;
//		} else {
//			NodoEntero p = inicial;
//			while (p.getSiguiente() != actual) p = p.getSiguiente();
//			p.setSiguiente(actual.getSiguiente());
//			actual = p;
//			return true;  
//	    }
		  
//		  if((tamanio!=0)&&(!fin())){
//			   // NodoEntero anterior= new NodoEntero();
//				if(inicial==actual){//si hay q eliminar del comienzo de la lista
//			    	inicial=inicial.getSiguiente();
//			    }else{//si hay q eliminar del medio o final de la lista
//			    	actual=actual.getSiguiente();
//			    }
//			    tamanio--;
//				return true;
//			}
//			return false; 

		  if (actual == null)
				return false;
			else{
			super.tamanio--;
			if (actual == inicial) {
				inicial = inicial.getSiguiente();
				return true;
			} else {
				NodoEntero p = inicial;
				while (p.getSiguiente() != actual)
					p = p.getSiguiente();
				p.setSiguiente(actual.getSiguiente());
				actual = p;
				return true;
			}
		   }

      }	  
	  

	  
	  public boolean eliminar(Integer pos){
		  if (pos < 0 || pos >= this.tamanio()) return false;
		
		  super.tamanio--;
		  if (pos == 0) {
			inicial = inicial.getSiguiente();//  
			return true;
		  }
		  this.comenzar();
		  while (--pos > 0) this.proximo();
		  actual.setSiguiente(actual.getSiguiente().getSiguiente());//engancha el anterior al actual con el siguiente
		  return true;
		  
	  }
	  
	  public boolean esVacia(){
		  return tamanio()==0;
	  }
	  
	  public boolean incluye(Integer elem){
		  this.comenzar();
		  while( !this.fin() && !this.elemento().equals(elem))
			  this.proximo();
		  return (!this.fin());
	  }
	  
	  public int tamanio(){
		  return this.tamanio;
	  }
	  
	  public boolean fin(){
		  return actual.getSiguiente()==null;
	  }
	  

}
