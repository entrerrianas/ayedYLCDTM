package tp4;

import tp2.Cola;
import tp2.ListaEnlazadaGenerica;
import tp2.ListaGenerica;

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
		

		public int altura() 
		{
			int max=-1;
			int cont=0;
			ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
			if(this.getHijos().esVacia()){
				return 0;
			}
			else {
				hijos = this.getHijos();
				hijos.comenzar();
				while(!(hijos.fin()))
				{
					cont = 1 + hijos.elemento().altura();
					hijos.proximo();
					if(cont>max){
						max=cont;
					}
				}
			}
			return max++;
		}

		/*
		public int nivel2(T dato)
		{	
			int niv = 1;
			ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
			if (this.getDatoRaiz() == dato){
				return 0;
			} else {
				hijos = this.getHijos();
				hijos.comenzar();
				while ((!hijos.fin()) && (hijos.elemento().getDatoRaiz() != dato)){
					hijos.proximo();
				}
				if (!hijos.fin()){
					return 1 + hijos.elemento().nivel(dato);
				} 
			}
			return ++niv;		
		}
		*/
		
		public boolean include (T dato, ListaGenerica<ArbolGeneral<T>> lista)
		{
			lista.comenzar();
			//System.out.println(lista.elemento().getDatoRaiz());
			while (!lista.fin() && lista.elemento().getDatoRaiz()!=dato){
				//System.out.println(lista.elemento().getDatoRaiz());
				lista.proximo();
			}
			return !lista.fin();
		}
		
		public int nivel (T dato)
		{
			//System.out.println("Entra: "+this.getDatoRaiz());
			if (this.getDatoRaiz() == dato){
				return 0;
			} else {
				System.out.println("Entra: "+this.getDatoRaiz());
				ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
				hijos = this.getHijos();
				hijos.comenzar();
				while (!hijos.fin() && (!include(dato,hijos.elemento().getHijos()))){
				//	System.out.println("Sig: "+this.getDatoRaiz());
					hijos.proximo();
				}
				if (hijos.fin()){
					return -1;
				} else {
					return 1 + hijos.elemento().nivel(dato);
				}
			}
		}
		
		
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