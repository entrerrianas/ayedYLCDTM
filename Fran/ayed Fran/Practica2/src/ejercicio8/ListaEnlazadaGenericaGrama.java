package ejercicio8;

public class ListaEnlazadaGenericaGrama {

	public ListaEnlazadaGenericaGrama() {
		
	}
	
	 private int tamanio;
		
	   NodoGrama inicial= new NodoGrama();
	   NodoGrama actual= new NodoGrama();
	   NodoGrama anterior= new NodoGrama();
	   
	   
	   public boolean agregar(String elem,String palab) 
		{
			NodoGrama nue= new NodoGrama();
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
	   
		
		public boolean agregar(String elem,String palab, int pos) 
		{
			if((pos>=0)&&(tamanio>=pos))
			{
				//System.out.println(incluye(elem));
				if(incluye(elem)){
					if(!actual.incluyePalabra(palab))actual.setPalabra(palab);
					//actual.setPalabra(palab);
				}else{
					int i=0;
					NodoGrama aux= new NodoGrama();
					NodoGrama ant= new NodoGrama();
					NodoGrama nue= new NodoGrama();
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
					//agrego la palabra entera en el nodo grama nuevo
					nue.setPalabra(palab);//inserto en el nodo grama la palabra completa
					tamanio++;
					return true;	
				}
			}
			return false;
		}

		
		public void comenzar() 
		{
			actual=inicial;
		}
		
		public void comenzarPal(){
			actual.comenzarPal();
		}

		
		public String elemento() 
		{
			return actual.getDato();
		}
		
		public String elementoPalabra(){
			return actual.getPalabra();
		}

		
		public String elemento(int pos) 
		{
			int i=0;
			NodoGrama aux= new NodoGrama();
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

		
		public boolean incluye(String elem) 
		{
			comenzar();
			if(tamanio()>0)
			{
				//while((!fin())&&(actual.getDato()!=elem))
				while((!fin())&&(!actual.getDato().equals(elem)))
					proximo();			
				if(fin())return false;
				else return true;
			}
			return false;	
		}
		
		/*public boolean incluyePalabra(String elem){
			actual.comenzarPal();
			if(tamanioPalabra()>0)
			{
				while((!fin())&&(!actual.getPalabra().equals(elem)))
					proximaPalabra();			
				if(finPal())return false;
				else return true;
			}
			return false;	
		}*/

		
		public void proximo() 
		{
			if(!fin()){
				  anterior=actual;
				  actual=actual.getSiguiente();
			}
		}
		
		public void proximaPalabra(){
			if(!finPal()){
				actual.getSiguientePalabra();
			}
		}

		
		public int tamanio() 
		{
			return this.tamanio;
		}
		
		public int tamanioPalabra(){
			return actual.tamanioPal();
		}
		
		public boolean fin()
		{
			return actual.getSiguiente()==null;
		}
		
		public boolean finPal(){
			return actual.finPalabra();
		}

}
