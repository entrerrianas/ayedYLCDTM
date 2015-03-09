package arbolGeneral;

import colaGenerica.*;
import listasGenericas.ListaEnlazadaGenerica;
import listasGenericas.ListaGenerica;

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
			ArbolGeneral<T> arbolTemp = lista.proximo();
			hijos.agregarFinal(arbolTemp.getRaiz());
			
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
			lista.agregarFinal(new ArbolGeneral<T>(hijos.proximo()));
			
		}

		return lista;
	}

	
	public void agregarHijo(ArbolGeneral<T> unHijo) {

		NodoGeneral<T> hijo = unHijo.getRaiz();
		this.raiz.getHijos().agregarFinal(hijo);
	}

	
	public void eliminarHijo(ArbolGeneral<T> unHijo) {

		NodoGeneral<T> hijo = unHijo.getRaiz();
		boolean ok = false;

		ListaGenerica<NodoGeneral<T>> listaHijos = (ListaGenerica<NodoGeneral<T>>) this
				.getRaiz().getHijos();
		listaHijos.comenzar();

		while (!listaHijos.fin() && !ok) {

			NodoGeneral<T> hijoTemp = listaHijos.proximo();
			if (hijoTemp.getDato().equals(hijo.getDato())) {
				ok = listaHijos.eliminar(hijoTemp);
				
			}
		}	

		
	}
	
    private Integer calcularAltura(ListaGenerica<ArbolGeneral<T>> hijos){   
    	int altura, alturaMax;
    	int i = 1;
    	alturaMax = 0;
    	while (i < hijos.tamanio()) {
    	   altura = hijos.elemento(i).altura();
    	   if (altura > alturaMax)alturaMax = altura;
    	   i++;
    	}
    	hijos.comenzar();
    	
    return alturaMax;
    }
    	
    
	public Integer altura() {	 
		if (this.getRaiz()!= null){		
			if (this.getHijos().tamanio()>0){
				return 1 + this.calcularAltura(this.getHijos()); 
			}
			}else{
				return 0;
			
		}return 0;
	}

	public int bscNivel (T dato, int nivel ){		
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		cola.poner(this);
		cola.poner(null);
		boolean ok = false;
		while (!cola.esVacia() && ok == false){
			ArbolGeneral<T> arb = cola.sacar();
			if (arb != null){
				System.out.print("Nivel : " + nivel + " - Dato: " + arb.getDatoRaiz() + " - Se busca: " + dato + " \n ");
				if (arb.getDatoRaiz() != dato){					
					ListaGenerica<ArbolGeneral<T>> l = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
					l = arb.getHijos();
					l.comenzar();
					while (!l.fin() && ok == false){
						cola.poner(l.elemento());
						l.proximo();
					}			
				} else {
					System.out.print("Lo encontre en el nivel : " + nivel + " \n");
					ok = true;
				}
			} else {	
				System.out.print("Termino nivel : " + nivel + " \n");
				if (!cola.esVacia()){
					cola.poner(null);
					nivel++;
				}
			}
		}
		if (ok){
			return nivel;
		} else {
			return -1;
		}
		//System.out.print("Salio del while, nivel: \n" + nivel);
	}
	
	public Integer nivel ( T dato){ 
		int niv = -1, t = -1;
		if (this.getHijos().tamanio() > 0){
			t = this.bscNivel(dato, niv+1);
		} else {
			if (this.getDatoRaiz().equals(dato)){
				t = 0;
			}
		}		
		System.out.print("Salio del if \n" + t);
		return t;	
		/*
		if (t > 0){
			return t;	
		} else {
			return 0;
		}	*/	
	}
	
	
	/*
	public Integer nivel( T dato){ 
		int niv = -1, t = 0;
		boolean ok = false;
		if (this.getHijos().tamanio() > 0){
			return new Integer(this.bscNivel(dato, niv+1, ok));
		} else {
			return new Integer(0);
		}		
		
	}	
*/

	public ListaGenerica<Integer> encolarNiveles (){		
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		cola.poner(this);
		cola.poner(null);
		int niv = 0;
		ArbolGeneral<T> ant = new ArbolGeneral<T>(); 
		boolean ok = true;
		int cant = 0;
		while (!cola.esVacia() && ok){			
			ArbolGeneral<T> arb = cola.sacar();					
			if (arb != null){			
				System.out.print("Nivel: " + niv + "\n");				
				cant += arb.getHijos().tamanio();
				System.out.print("Q hijos: " + arb.getHijos().tamanio() + "\n");
				ListaGenerica<ArbolGeneral<T>> l = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
				l = arb.getHijos();
				l.comenzar();
				while (!l.fin()){
					System.out.print(" - " + l.elemento().getDatoRaiz());
					cola.poner(l.elemento());
					l.proximo();
				}	
				System.out.print("\n \n");
				
			} else {	
				if (ant == null){
					ok = false;
				}
				lista.agregarFinal(cant);
				cant = 0;
				niv++;
				cola.poner(null);		
			}
			ant = arb;
		}		
		return lista; 
	}
	
	public int calcularNivelMaximo(ListaGenerica<Integer> l){
		int max = -2;
		l.comenzar();
		while (!l.fin()){	
			if (max < l.elemento()){
				max = l.elemento();
			}
			l.proximo();
		}		
		return max;
	}

	public Integer ancho (){
		int t = 0;
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		if (this.getHijos().tamanio() > 0){
			lista = this.encolarNiveles();
		} 
		System.out.print("Sale1 \n");
		t = calcularNivelMaximo(lista);
		System.out.print("Sale2 \n");
		return new Integer(t);	
	}	
}
