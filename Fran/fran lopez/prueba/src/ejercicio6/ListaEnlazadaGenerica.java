package ejercicio6;

public class ListaEnlazadaGenerica<T> extends ListaGenerica<T> {
	private NodoGenerico<T> inicio;
	private NodoGenerico<T> actual;

	private int tamanio;

	
	public void comenzar() {
		actual = inicio;
	}

	
	public T proximo() {
		T elto = actual.getDato();
		actual = actual.getSiguiente();
		return elto;
	}

	  
	public boolean fin() {
		return (actual == null);
	}

	  
	public T elemento(int pos) {
		if (pos < 1 || pos > this.tamanio())
			return null;
		NodoGenerico<T> n = this.inicio;
		while (pos-- > 1)
			n = n.getSiguiente();
		return n.getDato();
	}

	  
	public boolean agregarEn(T elem, int pos) {
		if (pos < 1 || pos > this.tamanio() + 1)
			return false;
		this.tamanio++;
		NodoGenerico<T> aux = new NodoGenerico<T>();
		aux.setDato(elem);
		if (pos == 1) {
			aux.setSiguiente(inicio);
			inicio = aux;
		} else {
			NodoGenerico<T> n = this.inicio;
			NodoGenerico<T> ant = null;
			int posActual = 1;
			while (!(n == null) && (posActual < pos)) {
				ant = n;
				n = n.getSiguiente();
				posActual++;
			}
			aux.setSiguiente(n);
			ant.setSiguiente(aux);
		}
		return true;
	}

	  
	public boolean agregarInicio(T elem) {
		this.agregarEn(elem, 1);
		return true;
	}

	  
	public boolean eliminarEn(int pos) {

		
		if (pos < 1 || pos > this.tamanio())
			return false;
		this.tamanio--;
		if (pos == 1) {
			inicio = inicio.getSiguiente();
			return true;
		}
		NodoGenerico<T> n = this.inicio;
		NodoGenerico<T> ant = null;
		while (!(n == null) && (pos > 1)) {
			pos--;
			ant = n;
			n = n.getSiguiente();
		}
		ant.setSiguiente(n.getSiguiente());
		return true;
	}
	
	public boolean eliminar(T elem){
		if (!this.incluye(elem)){
			return false;
		} else {
			this.comenzar();
			int ind;
			while (!this.fin() && elem != this.elemento(this.tamanio())){
				this.proximo();				
			}
			ind = this.tamanio();
			return this.eliminarEn(ind);			
		}
	}
	
	  
	public String toString() {
		String str = "";
		NodoGenerico<T> n = this.inicio;
		while (n != null) {
			str = str + n.getDato() + " -> ";
			n = n.getSiguiente();
		}
		if (str.length() > 1)
			str = str.substring(0, str.length() - 4);
		return str;
	}

	  
	public int tamanio() {
		return this.tamanio;
	}

	  
	public boolean esVacia() {
		return (inicio == null);
	}
	
	public boolean incluye(T elem){
		if (this.esVacia()){
			return false;
		} else {
			this.comenzar();
			while (!this.fin() && elem != this.elemento(this.tamanio())){
				this.proximo();				
			}
			return elem == this.elemento(this.tamanio);
		}
	}
	
	public boolean agregarFinal(T elem){
		return this.agregarEn(elem, this.tamanio()+1);
	}

}
