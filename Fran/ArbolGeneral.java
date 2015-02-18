package ejercicio1;

//import ejercicio1.Cola;
import ejercicio1.ListaEnlazadaGenerica;
import ejercicio1.ListaGenerica;

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
			ListaGenerica<ArbolGeneral<T>> hijos;
			if(this.getHijos().esVacia())
			return 0;
			else{
			hijos=this.getHijos();
			hijos.comenzar();
			while(!(hijos.fin())){
				cont= 1 + hijos.elemento().altura();
				hijos.proximo();
				if(cont>max)
					max=cont;}
			}
			return max;
		   
		}
		
		public boolean include(T dato){
			ArbolGeneral<T> aux = new ArbolGeneral<T>(dato);
			if(this.getHijos().incluye(aux)){
				return true;
				}else{return false;}
		}
			              
			
			
			
			
			
		public int nivel(T dato){
			int cont=0;
			boolean encontre=false;	
			
			if((this.getDatoRaiz()!=null)&&(this.getDatoRaiz()!=dato)){ 
					ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
					hijos = this.getHijos();
					hijos.comenzar();
				    while(!hijos.fin()&&(!encontre)){
					      if(hijos.elemento().getDatoRaiz()==dato){
                             encontre=true;} 
					        else 
					    	   cont= 1 + hijos.elemento().nivel(dato);} 
                          }		
				    else {
				    	if((this.getDatoRaiz()!=null)&&(this.getDatoRaiz()==dato)) return 0;
				    	else return -1;
				    }
			        
		return cont;	
		}    
				
		
			/*int niv = 0;
				if (this.getDatoRaiz() == dato ){
					return 0;
				} else {
					ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
					hijos = this.getHijos();
					hijos.comenzar();
					while ((!hijos.fin()) && (hijos.elemento().include(dato))){
						hijos.proximo();
					}
					if (!hijos.fin()){
						return 1 + hijos.elemento().nivel(dato);}
				}
				return niv;
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
				System.out.println("cant: "+cant);
				if (cant > max){
					max = cant;
				}	
			}
			System.out.println("Max: "+max);
			return max;
		
		}

		
	}
