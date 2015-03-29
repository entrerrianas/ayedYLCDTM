package ejercicio1;

public class NodoBinario<T> {
  private T dato;
  private NodoBinario<T> hijoIzquierdo;
  private NodoBinario<T> hijoDerecho;
  
  public NodoBinario(){
	  this.dato=null;
	  this.hijoDerecho=null;
	  this.hijoIzquierdo=null;	  
  }
  
  public NodoBinario(T elem){
	  this.dato=elem;
	  this.hijoDerecho=null;
	  this.hijoIzquierdo=null;
  }
  
  public T getDato(){
	  return this.dato;
  }
  
  public NodoBinario<T> getHijoIzquierdo(){
	  return this.hijoIzquierdo;
  }
  
  public NodoBinario<T> getHijoDerecho(){
	  return this.hijoDerecho;
  }
  
  public void setDato(T elem){
	  this.dato=elem;
  }
  
  public void setHijoDerecho(NodoBinario<T> hd){
	  this.hijoDerecho=hd;
  }
  
  public void setHijoIzquierdo(NodoBinario<T> hi){
	  this.hijoIzquierdo=hi;
  }
}
