package ejercicio2;



public class ArbolGeneral<T> {

		private NodoGeneral<T> raiz;
		
		

		public ArbolGeneral() {

			this.raiz = null;
		}

		public ArbolGeneral(T dato) {

			this.raiz = new NodoGeneral<T>(dato);
		}

		public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> lista) {

			this(dato);
			ListaGenerica<NodoGeneral<T>> hijos = new ListaEnlazadaGenerica<NodoGeneral<T>>();

			lista.comenzar();
			while (!lista.fin()) {
				ArbolGeneral<T> arbolTemp = lista.elemento();
				hijos.agregar(arbolTemp.getRaiz());
				lista.proximo();
			}

			raiz.setListaHijos(hijos);
		}

		private ArbolGeneral(NodoGeneral<T> nodo) {

			this.raiz = nodo;
		}


		private NodoGeneral<T> getRaiz() {

			return this.raiz;
		}

		public T getDatoRaiz() {

			return this.raiz.getDato();
		}

		
		public ListaGenerica<ArbolGeneral<T>> getHijos() {

			ListaGenerica<ArbolGeneral<T>> lista = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
			ListaGenerica<NodoGeneral<T>> hijos = (ListaGenerica<NodoGeneral<T>>) this
					.getRaiz().getHijos();
			lista.comenzar();
			hijos.comenzar();

			while (!hijos.fin()) {
				lista.agregar(new ArbolGeneral<T>(hijos.elemento()), lista
						.tamanio());
				hijos.proximo();
			}

			return lista;
		}
		
		
		public boolean include (T dato){
			return this.getHijos().incluye(new ArbolGeneral<T>(dato));		
		}

		
		public void agregarHijo(ArbolGeneral<T> unHijo) {

			NodoGeneral<T> hijo = unHijo.getRaiz();
			this.raiz.getHijos().agregar(hijo, this.raiz.getHijos().tamanio());
		}

		
		public void eliminarHijo(ArbolGeneral<T> unHijo) {

			NodoGeneral<T> hijo = unHijo.getRaiz();
			boolean ok = false;

			ListaGenerica<NodoGeneral<T>> listaHijos = (ListaGenerica<NodoGeneral<T>>) this
					.getRaiz().getHijos();
			listaHijos.comenzar();

			while (!listaHijos.fin() && !ok) {

				NodoGeneral<T> hijoTemp = listaHijos.elemento();
				if (hijoTemp.getDato().equals(hijo.getDato())) {
					ok = listaHijos.eliminar();
				} else {
					listaHijos.proximo();
				}

			}
		}
		

		public int altura() {
			int max=0;
			int cont=0;
			ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
			if(this.getHijos().esVacia()){
				return 0;
			}
			else {
				hijos = this.getHijos();
				hijos.comenzar();
				while(!(hijos.fin())){
					cont = 1 + hijos.elemento().altura();
					hijos.proximo();
					if(cont>max){
						max=cont;
					}
				}
			}
			return max++;
		}
		
		public int nivel(T dato){
			int cont=0;
			boolean encontre=false;
			ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
			
			if(getDatoRaiz().equals(dato)){//si encuentro el dato
				encontre=true;
				cont=0;
			}else{
				if(this.getHijos()!=null){
					hijos=this.getHijos();
					hijos.comenzar();
					while((!hijos.fin())|(!encontre)){
						cont=1+ hijos.elemento().nivel(dato);
						hijos.proximo();
					}	
				}
				
			}
			
			if(encontre)return cont;
			else return -1;
	
			
				
		}
		
		
		
		
		/*public int nivel(T dato){
			ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		   int cont=0;
		   boolean encontre=false;
		   if(this.getDatoRaiz().equals(dato)){
			   encontre=true;
			   cont=0;
			  return cont;
		   }else{
			 // ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
			  hijos=this.getHijos();
			  hijos.comenzar();
			  while((!hijos.fin())&&(!encontre)){
				  if(!hijos.elemento().include(dato)){
					  cont= 1 + hijos.elemento().nivel(dato);
					  hijos.proximo();
				  }
			  }
		   }
		   if(!encontre) return -1;
		   else{return cont;}
		} */
		
		/*public int nivel(T dato){
			ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		   int cont=0;
		   if(this.getDatoRaiz()==dato){
			   //cont=0;
			  return cont;
		   }else{
			 // ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
			  hijos=this.getHijos();
			  hijos.comenzar();
			  while((!hijos.fin())&&(hijos.elemento().include(dato))){
				 hijos.proximo();	
			  }
			  if(!hijos.fin()){
				  return 1 + hijos.elemento().nivel(dato); 
			  }
		   }
		   return cont;
		
		}*/
		
		/*public int nivel(T dato){
			boolean encontre=false;
			int cont=0;
			ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
			
			if(this.getRaiz().getDato().equals(dato)){
		    //if(this.getDatoRaiz().equals(dato)){
				encontre=true;
			}else{
				hijos=this.getHijos();
				hijos.comenzar();
				while((!hijos.fin())&&(!encontre)){
					cont= 1+ hijos.elemento().nivel(dato);
					hijos.proximo();
					//cont= 1+ hijos.elemento().nivel(dato);
				}
			}
			
			if(encontre){return cont;
			}else{ return -1;}	
		}*/
		
		public int ancho(){
			int max = -1;
			int cant = 0;
			ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
			ArbolGeneral<T> arbol;
			Cola<ArbolGeneral<T>> cola = new Cola<ArbolGeneral<T>>();
			cola.encolar(this);
			cola.encolar(null);
			while (!cola.esVacia()) 
			{
			
				arbol = cola.desencolar();
				while (arbol == null){
					cant = 0;
					arbol = cola.desencolar();
				}
				hijos = arbol.getHijos();
				hijos.comenzar();
				while (!hijos.fin()) 
				{
					cant++;
					cola.encolar(hijos.elemento());
					hijos.proximo();
				}
				if (cant > max){
					max = cant;
				}	
			}
			return max;
		
		}
		
	}
