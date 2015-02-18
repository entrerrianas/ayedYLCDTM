package ejercicio3;

import tp2.*;

public class NodoAVL<T extends
Comparable<T>> {

	private T dato;
	private int altura;
	private NodoAVL<T> hijoDerecho;
	private NodoAVL<T> hijoIzquierdo;
	
	public NodoAVL() 
	{
		this.dato = null;
		this.altura = -1;
		this.hijoDerecho = null;
		this.hijoIzquierdo = null;
	}
	
	public NodoAVL(T dato) 
	{
		this.dato = dato;
		this.hijoDerecho = new NodoAVL<T>();
		this.hijoIzquierdo = new NodoAVL<T>();
		this.altura = -1;
	}
	
	public T getDato()
	{
		return this.dato;
	}
	
	public NodoAVL<T> getHijoIzquierdo()
	{
		return this.getHijoIzquierdo();
	}
	
	public NodoAVL<T> getHijoDerecho()
	{
		return this.getHijoDerecho();
	}
	
	public boolean esVacio()
	{
		return this.dato == null;
	}
	
	public boolean incluye (T dato)
	{
		if (!this.esVacio()){
			if (dato.compareTo(this.dato) == 0){
				return true;
			} else {
				if (dato.compareTo(this.dato) < 0){
					return this.hijoIzquierdo.incluye(dato);
				} else {
					return this.hijoDerecho.incluye(dato);
				}
			}
		} else {
			return false;
		}
	}
	
	public T buscar (T dato)
	{
		if (this.dato == dato){
			return this.dato;
		} else {
			if (dato.compareTo(this.dato) < 0){
				return this.hijoIzquierdo.buscar(dato);
			} else {
				return this.hijoDerecho.buscar(dato);
			}
		}
	}

	
	public void agregar (T dato)
	{
		if (this.dato == null){
			this.dato = dato;
			this.hijoDerecho = new NodoAVL<T>();
			this.hijoIzquierdo = new NodoAVL<T>();
			this.altura = 0;
		} else { 
				if (dato.compareTo(this.dato) < 0){
					this.hijoIzquierdo.agregar(dato);
				} else {
					if (dato.compareTo(this.dato) > 0){
							this.hijoDerecho.agregar(dato);
					}
					 else {
						this.dato = dato;
					 }
				}
		}
		this.altura = Math.max(this.hijoDerecho.altura, this.hijoIzquierdo.altura)+1;
	}
	
	
	private NodoAVL<T> buscarMin()
	{
	
		if(this.getHijoDerecho().getDato()!=null){
			this.getHijoDerecho().buscarMin();
		}
		return this;	
	}
	
	
	public void eliminar (T dato)
	{
		NodoAVL<T> act;
		NodoAVL<T> aux;
		
		act = this;
		if (dato.compareTo(act.dato) < 0)
		{
			act.getHijoIzquierdo().eliminar(dato);
		}else if (dato.compareTo(act.dato) > 0){
			act.getHijoDerecho().eliminar(dato);
		}
		else{//lo encontro
			if(act.getHijoDerecho().getDato()==null){//si no tiene hijo derecho
				act.dato=act.getHijoIzquierdo().dato;
				act.hijoIzquierdo=act.getHijoIzquierdo().getHijoIzquierdo();
				act.hijoDerecho=act.getHijoIzquierdo().getHijoDerecho();
			}else if(act.getHijoIzquierdo().getDato()==null){//si no tiene hijo izquierdo
				act.dato=act.getHijoDerecho().dato;
				act.hijoDerecho=act.getHijoDerecho().getHijoDerecho();
				act.hijoIzquierdo=act.getHijoDerecho().getHijoIzquierdo();
			}else{//tiene los dos hijos
				aux=act.getHijoIzquierdo().buscarMin();//busca el minimo del sub arbol derecho
				act.dato=aux.dato;
				//act.eliminar(act.dato);
			}
		}
	}
	
	public int chequearAlturas()
	{
		int alt;
		if (this.esVacio()){
			return 0;
		} else {
			int hd = 0, hi = 0;
			alt = -1;
			hi = this.hijoIzquierdo.chequearAlturas();
			hd = this.hijoDerecho.chequearAlturas();
			
			if (hi != -1 && hd != -1 && Math.abs(hd - hi)<2){
				alt = Math.max(hi, hd)+1;
			}
			return alt;		
		}
	}
	
	public int getAltura()
	{
		if (this.dato == null){
			return -1;
		} else {
			return this.altura;
		}
	}
	public int min (int altura)
	{
		if (altura <= 1){
			return altura + 1;
		} else {
			altura = altura + this.min(altura - 1) - this.min(altura - 2);
			return altura + 1;
		}
		
	}

	
	public int cantidadDeNodos()
	{
		ListaGenerica<NodoAVL<T>> lista = new ListaEnlazadaGenerica<NodoAVL<T>>();
		Cola<NodoAVL<T>> cola = new Cola<NodoAVL<T>>();
		NodoAVL<T> nodo;
		
		cola.encolar(this);
		while (!cola.esVacia()){
			nodo = cola.desencolar();
			lista.agregar(nodo);
			if (nodo.hijoDerecho.dato != null){
				cola.encolar(nodo.hijoDerecho);
			} 
			if (nodo.hijoIzquierdo.dato != null){
				cola.encolar(nodo.hijoIzquierdo);
			}
		}
		return lista.tamanio();
	}
	
	public int altura()
	{
		return Math.max(this.hijoDerecho.altura, this.hijoIzquierdo.altura) + 1;
	}
	
	public void imprimir()
	{
		if (!this.esVacio()){
			System.out.print("| Dato:"+this.getDato()+" - Altura: "+this.altura);
			this.hijoIzquierdo.imprimir();
			this.hijoDerecho.imprimir();
		}
	}
	
	
	
	
	
	public void rotacionIzq()
	{
		System.out.print("Legue a la RSI");
		NodoAVL<T> aux = new NodoAVL<T>();
		// lo tengo que hacer variable de instancia por variable de instancia
		 // preguntar por que
		 
		// aux = this.hijoDerecho;
		aux.dato = this.hijoDerecho.dato;
		aux.altura = this.hijoDerecho.altura;
		aux.hijoDerecho = this.hijoDerecho.hijoDerecho;
		aux.hijoIzquierdo = this.hijoDerecho.hijoIzquierdo;
		
		 this.hijoDerecho = aux.hijoIzquierdo;
		/*this.hijoDerecho.dato = aux.hijoIzquierdo.dato;
		this.hijoDerecho.altura = aux.hijoIzquierdo.altura;
		this.hijoDerecho.hijoDerecho = aux.hijoIzquierdo.hijoDerecho;
		this.hijoDerecho.hijoIzquierdo = aux.hijoIzquierdo.hijoIzquierdo;*/
		
		 aux.hijoIzquierdo = this;
		/*aux.hijoIzquierdo.dato = this.dato;
		aux.hijoIzquierdo.altura = this.altura;
		aux.hijoIzquierdo.hijoIzquierdo = this.hijoIzquierdo;
		aux.hijoIzquierdo.hijoDerecho = this.hijoDerecho;*/
		
		// this = aux;
		this.dato = aux.dato;
		this.hijoDerecho = aux.hijoDerecho;
		this.hijoIzquierdo = aux.hijoIzquierdo;
		this.altura = aux.altura;
	}
	// TODAVIA NO LO PIDE
	
	public void rotacionDer()
	{
		NodoAVL<T> aux = new NodoAVL<T>();
		aux = this.hijoIzquierdo;
		aux.dato = this.hijoIzquierdo.dato;
		aux.altura = this.hijoIzquierdo.altura;
		aux.hijoDerecho = this.hijoIzquierdo.hijoDerecho;
		aux.hijoIzquierdo = this.hijoIzquierdo.hijoIzquierdo;
		
		this.hijoIzquierdo = aux.hijoDerecho;
		
		aux.hijoDerecho = this;
		
		this.dato = aux.dato;
		this.hijoDerecho = aux.hijoDerecho;
		this.hijoIzquierdo = aux.hijoIzquierdo;
		this.altura = aux.altura;
	}
	
	public void rotacionDobleIzq()
	{
		System.out.print("Legue a la RDI");
		this.rotacionDer();
		this.rotacionIzq();
	}
	
	public void rotacionDobleDer()
	{
		System.out.print("Legue a la RDD");
		this.rotacionIzq();
		this.rotacionDer();		
	}
	
	public void balancear()
	{
		if ((this.hijoIzquierdo.altura - this.hijoDerecho.altura) == 2){
			if (this.hijoIzquierdo.altura > this.hijoDerecho.altura){
				System.out.print("Entra bien");
				this.rotacionIzq();
			} else {
				this.rotacionDobleIzq();
			}
		} else {
			if ((this.hijoDerecho.altura - this.hijoIzquierdo.altura) == 2){
				if (this.hijoDerecho.altura > this.hijoIzquierdo.altura){
					this.rotacionDer();
				} else {
					this.rotacionDobleDer();
				}
			}
		}
	}
	
	
	
}
