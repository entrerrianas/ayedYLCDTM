package ejercicio9;

import ejercicio6.ListaEnlazadaGenerica;
import ejercicio8.ListaInvertidaDeGramas;

public class TestSugeridor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
          Sugeridor s =new Sugeridor();		
		  ListaEnlazadaGenerica<String> l=new ListaEnlazadaGenerica<String>();
	      ListaInvertidaDeGramas p=new ListaInvertidaDeGramas(2);
	      
	    /*  p.comenzar();    
	      for(int i=0; i<args.length-1; i++){
	    	 p.agregar(args[i]); 
	      } 
	      l=s.quisoDecir(p,args[args.length]);*/
	       
	       p.comenzar();
	      p.agregar("mierda");
	      p.agregar("mercancia");
	      p.agregar("catamarca");
	      p.agregar("carcasa");
	      p.agregar("tuliomo");
	      p.agregar("tulio"); 
	      
	      p.imprimirListaInverdiraGrama();
	      System.out.println(" ");
	      l=s.quisoDecir(p,"tulin");
	     // l=p.recuperarListaDePalabras("camion");
	       l.comenzar();
	       while (!l.fin()){
	    	   System.out.print(l.elemento()+" ");
	    	   l.proximo();
	       }
	      
	      

	}

}
