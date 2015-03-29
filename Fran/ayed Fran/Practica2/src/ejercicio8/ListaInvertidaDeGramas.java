package ejercicio8;

import ejercicio6.ListaEnlazadaGenerica;



public class ListaInvertidaDeGramas {
 

   public ListaEnlazadaGenericaGrama lista=new ListaEnlazadaGenericaGrama();
	
   private int tamanio;
   
	
   public ListaInvertidaDeGramas(int longitud) {
	    this.tamanio=longitud;
		this.comenzar();
	}
	
	public void comenzar(){
		lista.comenzar();
	}
	
	public void agregar (String s){
		int longitud;
		String str;
		longitud=s.length();
		for(int i=0; i<=longitud-tamanio; i++){
			str=s.substring(i, i+tamanio);
			lista.agregar(str,s,lista.tamanio());
		}
		
		
	}
	
	public void imprimirListaInverdiraGrama(){
		lista.comenzar();
		while(!lista.fin()){
			System.out.print(lista.elemento());
			lista.comenzarPal();
			while(!lista.finPal()){
				System.out.print(" --> "+lista.elementoPalabra());
				lista.proximaPalabra();
			}
			System.out.println();
			lista.proximo();
		}
	}
	
	public ListaEnlazadaGenerica<String> recuperarListaDePalabras(String palabra){
		ListaEnlazadaGenerica<String> l=new ListaEnlazadaGenerica<String>();
		int longitud;
		String str;
		longitud=palabra.length();
		for(int i=0; i<=longitud-tamanio; i++){
			str=palabra.substring(i, i+tamanio);
			//busco por la grama
			if(lista.incluye(str)){
				lista.comenzarPal();
			    while(!lista.finPal()){
			    	//si la palabra no existe en la lista q estoy creando
			    	if(!l.incluye(lista.elementoPalabra())) {
			    		l.agregar(lista.elementoPalabra(),l.tamanio());
			    	}
			    	lista.proximaPalabra();
			    }
			}
		}
		return l;
	}
   
   
}
