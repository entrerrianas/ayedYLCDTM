package ejercicio8;

import ejercicio6.ListaEnlazadaGenerica;

public class TestListaInvertidaDeGramas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   ListaEnlazadaGenerica<String> l=new ListaEnlazadaGenerica<String>();
       ListaInvertidaDeGramas p=new ListaInvertidaDeGramas(1);
       
       p.comenzar();
      //p.agregar("mierda");
      //p.agregar("mercancia");
     // p.agregar("catamarca");
     // p.agregar("carcasa");
     // p.agregar("tuliomo");
      p.agregar("t");
       p.imprimirListaInverdiraGrama();
       System.out.println(" ");
       l=p.recuperarListaDePalabras("camion");
       l.comenzar();
       while (!l.fin()){
    	   System.out.print(l.elemento()+" ");
    	   l.proximo();
       }
       
       
	}

}
