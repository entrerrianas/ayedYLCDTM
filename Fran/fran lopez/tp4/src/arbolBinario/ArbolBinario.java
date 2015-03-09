package arbolBinario;

import tp03.ejercicio6.ColaGenerica;
import tp03.ejercicio6.ListaEnlazadaGenerica;
import tp03.ejercicio6.ListaGenerica;
import tp03.ejercicio6.NodoGenerico;
import nodoBinario.NodoBinario;

public class ArbolBinario<T> {

	private NodoBinario<T> raiz;
	
	public ArbolBinario(){		
		this.raiz = null;
	}
		
	
	public ArbolBinario(T dato){		
		this.raiz = new NodoBinario<T>(dato);
	}	
	
	private ArbolBinario(NodoBinario<T> nodo){		
		this.raiz = nodo;
	}

	
	private NodoBinario<T> getRaiz(){		
		return raiz;
	}
	
	public T getDatoRaiz(){
		if (this.getRaiz() != null){
			return this.getRaiz().getDato();
		}else{
			return null;
		}
	}
	
	public ArbolBinario<T> getHijoIzquierdo(){		
		return new ArbolBinario<T>(this.raiz.getHijoIzquierdo());
	}
	
	public ArbolBinario<T> getHijoDerecho(){		
		return new ArbolBinario<T>(this.raiz.getHijoDerecho());
	}	
	
	public void agregarHijoIzquierdo(ArbolBinario<T> hijo){		
		this.raiz.setHijoIzquierdo(hijo.getRaiz());
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo){		
		this.raiz.setHijoDerecho(hijo.getRaiz());
	}	
	
	public void eliminarHijoIzquierdo(){		
		this.raiz.setHijoIzquierdo(null);
	}
	
	public void eliminarHijoDerecho(){		
		this.raiz.setHijoDerecho(null);
	}	
	
	
	private void preOrden(ListaGenerica<T> hojas){
		if (this.getDatoRaiz() != null){
			if (this.getHijoIzquierdo().getDatoRaiz() == null && this.getHijoDerecho().getDatoRaiz() == null){
				hojas.agregarFinal(this.getDatoRaiz());
			}  else {
				if (this.getHijoIzquierdo() != null){
					this.getHijoIzquierdo().preOrden(hojas);
				}
				if (this.getHijoDerecho() != null){
					this.getHijoDerecho().preOrden( hojas);
				}						
			}
		} 
	}
		
	public ListaGenerica<T> frontera() {
		// Falta implementar. Ejercicio 2.a de la pr√°ctica
		ListaGenerica<T> hojas = new ListaEnlazadaGenerica<T>();
		if (this.getDatoRaiz() != null){									
			this.preOrden(hojas);
		} else {
			System.out.print("La RaÌz es NULL");
		}						
		
		return hojas;
	}
	
	
	public boolean esMenor(ArbolBinario<T> unArbol) {
		// Falta implementar. Ejercicio 2.b de la pr√°ctica
		return false;
	}

	public void impPreOrden(){
		if (this.getDatoRaiz() != null){
			System.out.println(this.getDatoRaiz());
				if (this.getHijoIzquierdo() != null){
					this.getHijoIzquierdo().impPreOrden();
				}
				if (this.getHijoDerecho() != null){
					this.getHijoDerecho().impPreOrden();
				}						
		} else {
			System.out.println("Final");
		} 
	}
	
	public void impPostOrden(){
		if (this.getDatoRaiz() != null){
			if (this.getHijoIzquierdo() != null){
				this.getHijoIzquierdo().impPreOrden();
			}
			if (this.getHijoDerecho() != null){
				this.getHijoDerecho().impPreOrden();
			}			
			System.out.println(this.getDatoRaiz());						
		} else {
			System.out.println("Final");
		} 
	}
	
	
	public boolean esHoja(){
		return this.raiz.esHoja();
	}
	
	public boolean tieneDosHijos(){
		if (this.getHijoIzquierdo() != null && this.getHijoDerecho() != null){
			return true;
		} else {
			return false;
		}
	}	
	
	public boolean lleno(){
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(this);
		cola.encolar(null);
		double qHojasNoNull = 0;
		int nivel = 0;
		boolean ok = true;
		while (!cola.esVacia() && ok){			
			ArbolBinario<T> elem = cola.desencolar();			
			if (elem != null){				
				System.out.println(" - Procesando : " + elem.getDatoRaiz().toString());
				if (elem.esHoja()){
					// el arbol esta en una hoja, 
					double qnxn = Math.pow(2, nivel); // me fijo la q de hojas que debe tener en el nivel actual 
					System.out.println("Nivel " + nivel + " -  Hojas " + qnxn);
					System.out.println("\nTiene realmente " + qHojasNoNull);
					if (qnxn == qHojasNoNull){
						return true;
					} else {
						ok = false;
					}						
				} else {
					if (elem.tieneDosHijos()){						
						System.out.println(" - Tiene 2 hijos");
						System.out.println(" - HI: " + elem.getHijoIzquierdo().getDatoRaiz());
						System.out.println(" - HD: " + elem.getHijoDerecho().getDatoRaiz());
						if (elem.getHijoIzquierdo().getDatoRaiz() != null){
							qHojasNoNull++;
						}
						if (elem.getHijoDerecho().getDatoRaiz() != null){
							qHojasNoNull++;
						}						
						cola.encolar(elem.getHijoIzquierdo());						
						cola.encolar(elem.getHijoDerecho());						
						System.out.print(" - TamaÒo cola => " + cola.tamanio() + " \n ");						
					} else {
						ok =  false;
					}
				}				
			} else {
				nivel=nivel+1;
				qHojasNoNull--;
				cola.encolar(null);
				System.out.println("Fin del nivel  " + nivel);
				System.out.print(" --------------  \n ");
			}
		}
		return ok;		
	}
	
	public boolean completo() {
		//Falta implementar. Ejercicio 2.d de la pr√°ctica
		return true;

	}
	
	
	public boolean tieneHijoDerecho (){
		return (this.getHijoDerecho() != null);
	}
	
	public boolean tieneHijoIzquierdo (){
		return (this.getHijoIzquierdo() != null);
	}	
	
	public boolean esVacio(){
		return (this.getDatoRaiz() == null);
	}
	
	private void recorrerPreOrden(int prof, ListaGenerica<T> l, int niv){
		if (!this.esVacio()){
			if (niv == prof){
				l.agregarInicio(this.getDatoRaiz());
			}
			if (this.getHijoIzquierdo() != null){
				this.getHijoIzquierdo().recorrerPreOrden(prof, l, niv+1);
			}
			if (this.getHijoDerecho() != null){
				this.getHijoDerecho().recorrerPreOrden(prof, l, niv+1);
			}
		}
	}
	
	public Integer sumarElementos(ListaGenerica<T> l){
		Integer sum = 0;		
		l.comenzar();
		while (!l.fin()){
			sum+= (Integer)l.elemento();
			l.proximo();
		}
		return sum;
	}	
	
	public Integer sumaElementosProfundidad (int prof){
		int niv = 1;
		ListaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
		this.recorrerPreOrden(prof, lista, niv);			
		return sumarElementos(lista);
	}
	
	public void recorrerPreGuiado(ListaGenerica<Integer> l){
		
		if (!this.esHoja()){
			//System.out.print("=> " + this.getDatoRaiz());
			if (this.getHijoDerecho().getDatoRaiz() != null  && this.getHijoIzquierdo().getDatoRaiz() != null ){
				if ((Integer)this.getHijoDerecho().getDatoRaiz() <= (Integer)this.getHijoIzquierdo().getDatoRaiz()){
					l.agregarFinal((Integer)this.getHijoDerecho().getDatoRaiz());
					this.getHijoDerecho().recorrerPreGuiado(l);
					l.agregarFinal((Integer)this.getHijoIzquierdo().getDatoRaiz());
					this.getHijoIzquierdo().recorrerPreGuiado(l);
				} else {
					l.agregarFinal((Integer)this.getHijoIzquierdo().getDatoRaiz());
					this.getHijoIzquierdo().recorrerPreGuiado(l);
					l.agregarFinal((Integer)this.getHijoDerecho().getDatoRaiz());
					this.getHijoDerecho().recorrerPreGuiado(l);
				}
				/*this.getHijoDerecho().recorrerPreGuiado(l);	
				this.getHijoIzquierdo().recorrerPreGuiado(l);	*/			
											
			} else {
				if (this.getHijoDerecho().getDatoRaiz() != null){
					l.agregarFinal((Integer)this.getHijoDerecho().getDatoRaiz());
					this.getHijoDerecho().recorrerPreGuiado(l);					
				} else {
					l.agregarFinal((Integer)this.getHijoIzquierdo().getDatoRaiz());
					this.getHijoIzquierdo().recorrerPreGuiado(l);					
				}
			}			
		} 
		//l.agregarInicio((Integer)this.getDatoRaiz());
	}
	
	public ListaGenerica<Integer> recorridoGuiado (){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
		this.recorrerPreGuiado(l);
		return l;
	}
	
}