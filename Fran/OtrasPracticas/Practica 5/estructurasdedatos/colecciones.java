package estructurasdedatos;

public abstract class Coleccion {

	protected int tamañoMaximo;
	protected int cantElementos;
	protected ListaBase elementos;
	
	public Coleccion (int tamaño){
		tamañoMaximo = tamaño;
		elementos = new ListaBase;
	}
	
	protected int tamaño(
		return cantElementos;
	}
	
	protected boolean esVacia (){
		return cantElementos = 0;
	}
	
	protected boolean contiene (Object elemento){
		return elementos.includes(elemento);
	}
	
	protected abstract void agregar (Object elemento);
	
	protected void eliminar (Object elemento){
		elementos.remove(elemento);
	}
	
	protected void comenzar (){
		elementos.begin;
	}
	
	protected  Object obtenerActual (){
		return elementos.getActual();
	}
		
	protected void siguiente (){
		elementos.siguiente();
	}
	
	protected boolean fin (){
		return elementos.end();
	}
	
	
	
	
}
