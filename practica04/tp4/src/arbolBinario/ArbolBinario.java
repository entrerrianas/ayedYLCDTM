package arbolBinario;

import tp03.ejercicio6.ListaGenerica;
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
	
	public ListaGenerica<T> frontera() {
		// Falta implementar. Ejercicio 2.a de la práctica
		return null;
	}
	
	
	public boolean esMenor(ArbolBinario<T> unArbol) {
		// Falta implementar. Ejercicio 2.b de la práctica
		return false;
	}


	public boolean lleno() {
		// Falta implementar. Ejercicio 2.c de la práctica
		return true;
	}
	
	public boolean completo() {
		//Falta implementar. Ejercicio 2.d de la práctica
		return true;

	}
	
	
}