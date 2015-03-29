package ejercicio1;


public class ListaDeEnterosEnlazada extends ListaDeEnteros {
	
	private NodoEntero inicial= new NodoEntero();
	private NodoEntero actual= new NodoEntero();
	private NodoEntero anterior= new NodoEntero();

	@Override
	public boolean agregar(Integer elem) {
		NodoEntero nue= new NodoEntero();
		nue.setDato(elem);
	    if(inicial==actual){//si la lista esta vacia o inserto al comienzo de la lista
			nue.setSiguiente(actual);
			inicial=nue;
		}else{//inserto al medio o al final
			anterior.setSiguiente(nue);
			nue.setSiguiente(actual);
		}
	    tamanio++;
		return false;
	}

	@Override
	public boolean agregar(Integer elem, int pos) {
		if((pos>=0)&&(tamanio>=pos)){
			int i=0;
			NodoEntero aux= new NodoEntero();
			NodoEntero ant= new NodoEntero();
			NodoEntero nue= new NodoEntero();
			aux=inicial;
			ant=aux;
			nue.setDato(elem);
			while((actual!=null)&&(i<pos)){
				ant=aux;
	            aux=aux.getSiguiente(); 		
				i++;
			}
			if(inicial==aux){//si la lista esta vacia o inserto al comienzo de la lista
				nue.setSiguiente(aux);
				inicial=nue;
			}else{//inserto al medio o al final
				ant.setSiguiente(nue);
				nue.setSiguiente(aux);
			}
			tamanio++;
			return true;
		}
		return false;
	}

	@Override
	public void comenzar() {
        actual=inicial;
	}

	@Override
	public Integer elemento() {
		return actual.getDato();
	}

	@Override
	public Integer elemento(Integer pos) {
		int i=0;
		NodoEntero aux= new NodoEntero();
		aux=inicial;
		while((aux!=null)&&(pos>i)){
            aux=aux.getSiguiente(); 		
			i++;
		}
		return aux.getDato();
	}

	@Override
	public boolean eliminar() {
		if((tamanio!=0)&&(!fin())){
			
			if(inicial==actual){//si hay q eliminar del comienzo de la lista
		    	inicial=inicial.getSiguiente();
		    }else{//si hay q eliminar del medio o final de la lista
		    	anterior.setSiguiente(actual.getSiguiente());
		    }
		    tamanio--;
			return true;
		}
		return false; 
	}

	@Override
	public boolean eliminar(Integer pos) {
		if((pos>=0)&&(pos<tamanio())){
			int i=0;
			comenzar();
			while((!fin())&&(i<pos)){
				proximo();
				i++;
			}
			if(inicial==actual){//si hay q eliminar del comienzo de la lista
		    	inicial=inicial.getSiguiente();
		    }else{//si hay q eliminar del medio o final de la lista
		    	anterior.setSiguiente(actual.getSiguiente());
		    }
			tamanio--;
			return true;
		}
		return false;
	}

	@Override
	public boolean esvacia() {
		return inicial==null; 
		//return inicial.vacio(); //OPCION FRAN
	}

	@Override
	public boolean incluye(Integer elem) {
		comenzar();
		if(tamanio()>0){
			while((!fin())&&(actual.getDato()!=elem))proximo();
			if(fin())return false;
			else return true;
		}
		return false;
	}

	@Override
	public void proximo() {
		if(!fin()){
			  anterior=actual;
			  actual=actual.getSiguiente();
		}
	}

	@Override
	public int tamanio() {
		// TODO Auto-generated method stub
		return this.tamanio;
	}
	
	public boolean fin(){
		return actual.getSiguiente()==null;
	}

}
