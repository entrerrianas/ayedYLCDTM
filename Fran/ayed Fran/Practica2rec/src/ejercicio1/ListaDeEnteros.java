package ejercicio1;

public abstract class ListaDeEnteros {
  int tamanio;
  
  public abstract void comenzar();
  
  public abstract void proximo();
  
  public abstract Integer elemento();
  
  public abstract Integer elemento(Integer pos);
  
  public abstract boolean agregar(Integer elem);
  
  public abstract boolean agregar(Integer elem, Integer pos);
  
  public abstract boolean eliminar();
  
  public abstract boolean eliminar(Integer pos);
  
  public abstract boolean esVacia();
  
  public abstract boolean incluye(Integer elem);
  
  public abstract int tamanio();
  
  public abstract boolean fin();
  
  


}
