package estructurasdedatos;

public abstract class Coleccion {

	protected int tama�oMaximo;
	protected int cantElementos;
	protected ListaBase elementos;
	
	public Coleccion (int tama�o){
		tama�oMaximo = tama�o;
		elementos = new ListaBase;
	}
	
	protected int tama�o(
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
