package ejercicio1;

public class ListaDeEnterosEnlazada  extends ListaDeEnteros  {
	private NodoEntero inicio;
	private NodoEntero actual;
	private NodoEntero fin;

	private int tamanio;

	
	public void comenzar() {
		actual = inicio;
	}

	
	public Integer proximo() {
		Integer elto = actual.getDato();
		actual = actual.getSiguiente();
		return elto;
	}

	  
	public boolean fin() {
		return (actual == null);
	}

	  
	public Integer elemento(int pos) {
		if (pos < 1 || pos > this.tamanio())
			return null;
		NodoEntero n = this.inicio;
		while (pos-- > 1)
			n = n.getSiguiente();
		return n.getDato();
	}

	  
	public boolean agregarEn(Integer elem, int pos) {
		if (pos < 1 || pos > this.tamanio() + 1)
			return false;
		this.tamanio++;
		NodoEntero aux = new NodoEntero();
		aux.setDato(elem);
		if (pos == 1) {
			aux.setSiguiente(inicio);
			inicio = aux;
		} else {
			NodoEntero n = this.inicio;
			NodoEntero ant = null;
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

	  
	public boolean agregarInicio(Integer elem) {
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
		NodoEntero n = this.inicio;
		NodoEntero ant = null;
		while (!(n == null) && (pos > 1)) {
			pos--;
			ant = n;
			n = n.getSiguiente();
		}
		ant.setSiguiente(n.getSiguiente());
		return true;
	}
	
	public boolean eliminar(Integer elem){
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
		NodoEntero n = this.inicio;
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
	
	public boolean incluye(Integer elem){
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
	
	public boolean agregarFinal(Integer elem){
		return this.agregarEn(elem, this.tamanio()+1);
	}
}
