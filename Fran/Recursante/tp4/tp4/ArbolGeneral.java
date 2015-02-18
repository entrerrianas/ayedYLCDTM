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
		

		public int altura() {
		   //Falta implementar..
		   return 0;
		}
		
		
		public int nivel(T dato){
		   //Falta implementar..
		   return 0;
		}

		
		public int ancho(){
		   //Falta implementar..
		   return 0;
		}

		
	}
