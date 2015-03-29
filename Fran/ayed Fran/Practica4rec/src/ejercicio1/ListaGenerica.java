package ejercicio1;

public abstract class ListaGenerica<T> {
	 int tamanio=0;
	 
	 public abstract void comenzar();
	 
	 public abstract void proximo();
	 
	 public abstract boolean fin();
	 
	 public abstract T elemento();
	 
	 public abstract T elemento(int pos);
	 
	 public abstract boolean agregar(T elem);
	 
	 public abstract boolean agregar(T elem, int pos);
	 
	 public abstract boolean eliminar();
	 
	 public abstract boolean eliminar(int pos);
	 
	 public abstract boolean esVacia();
	 
	 public abstract int tamanio();
	 
	 public abstract boolean incluye(T elem);
	 
	 
	 
	

}
