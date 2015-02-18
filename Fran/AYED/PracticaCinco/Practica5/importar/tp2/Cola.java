package tp2;


public class Cola<T> {
	
	private ListaGenerica<T> elementos;
	
	public Cola(){
		elementos = new ListaEnlazadaGenerica<T>();
	}
	public T desencolar(){
		T e=elementos.elemento(elementos.tamanio()-1);
		elementos.eliminar(elementos.tamanio()-1);
		return e;
	}
	
	public void encolar(T e){
		elementos.agregar(e,0);
	}
	
	public boolean esVacia() {
		return elementos.esVacia();
	}

	public int length() {
		return elementos.tamanio();
	}
	
	
	
	public static void main(String[] args) {
		Cola<Integer> cola = new Cola<Integer>();
		cola.encolar(1);
		System.out.print(" L:" + cola.length());
		cola.encolar(2);
		System.out.print(" L:" + cola.length());
		cola.encolar(3);
		System.out.print(" L:" + cola.length());
		System.out.print(" E:" + cola.desencolar());
		System.out.print(" E:" + cola.desencolar());
		System.out.print(" E:" + cola.desencolar());
		System.out.print(" L:" + cola.length());
		
		}	
}
