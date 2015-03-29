package ejercicio6;

import ejercicio6.NodoGenerico;

public class ListaEnlazadaGenerica<T> extends ListaGenerica<T> {

	private NodoGenerico<T> inicial = new NodoGenerico<T>();
	private NodoGenerico<T> actual = new NodoGenerico<T>();
	private NodoGenerico<T> anterior = new NodoGenerico<T>();
	
	
	public boolean agregar(T elem) 
	{
		NodoGenerico<T> nue= new NodoGenerico<T>();
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

	
	public boolean agregar(T elem, int pos) 
	{
		if((pos>=0)&&(tamanio>=pos))
		{
			int i=0;
			NodoGenerico<T> aux= new NodoGenerico<T>();
			NodoGenerico<T> ant= new NodoGenerico<T>();
			NodoGenerico<T> nue= new NodoGenerico<T>();
			aux=inicial;
			ant=aux;
			nue.setDato(elem);
			while((actual!=null)&&(i<pos))
			{
				ant=aux;
	            aux=aux.getSiguiente(); 		
				i++;
			}
			if(inicial==aux) //si la lista esta vacia o inserto al comienzo de la lista
			{
				nue.setSiguiente(aux);
				inicial=nue;
			} else
				{//inserto al medio o al final
					ant.setSiguiente(nue);
					nue.setSiguiente(aux);
				}
			tamanio++;
			return true;
		}
		return false;
	}

	
	public void comenzar() 
	{
		actual=inicial;
	}

	
	public T elemento() 
	{
		return actual.getDato();
	}

	
	public T elemento(int pos) 
	{
		int i=0;
		NodoGenerico<T> aux= new NodoGenerico<T>();
		aux=inicial;
		while((aux!=null)&&(pos>i)){
            aux=aux.getSiguiente(); 		
			i++;
		}
		return aux.getDato();
	}

	
	public boolean eliminar() 
	{
		if((tamanio!=0)&&(!fin()))
		{
			if(inicial==actual){//si hay q eliminar del comienzo de la lista
		    	inicial=inicial.getSiguiente();
		    	
		    } else {//si hay q eliminar del medio o final de la lista
		    	anterior.setSiguiente(actual.getSiguiente());
		    }
		    tamanio--;
			return true;
		} else {
				return false;
		}
	}

	
	public boolean eliminar(int pos)
	{
		if((pos>=0) && (pos < tamanio))
		{
			int i = 0;
			//actual = inicial;
			comenzar();
			while((!fin()) && (i<pos)){
				proximo();
				i++;
			}
			if(inicial == actual){//si hay q eliminar del comienzo de la lista
		    	inicial = inicial.getSiguiente();
		    }else{//si hay q eliminar del medio o final de la lista
		    	anterior.setSiguiente(actual.getSiguiente());
		    }
			tamanio --;
			return true;
		}
		return false;
	}

	
	public boolean esvacia() 
	{
		return inicial.vacio();
	}

	
	public boolean incluye(T elem) 
	{
		comenzar();
		if(tamanio()>0)
		{
			while((!fin())&&(actual.getDato()!=elem))
				proximo();			
			if(fin())
				return false;
			else 
				return true;
		}
		return false;	
	}

	
	public void proximo() 
	{
		if(!fin()){
			  anterior=actual;
			  actual=actual.getSiguiente();
		}
	}

	
	public int tamanio() 
	{
		return this.tamanio;
	}
	
	public boolean fin()
	{
		return actual.getSiguiente()==null;
	}
	

}
