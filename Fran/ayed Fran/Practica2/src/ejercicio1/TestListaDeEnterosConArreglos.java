package ejercicio1;

import static org.junit.Assert.assertEquals;

public class TestListaDeEnterosConArreglos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListaDeEnterosConArreglos lista= new ListaDeEnterosConArreglos();
		lista.comenzar();
		System.out.println(lista.agregar(2, 0));		
		System.out.println(lista.agregar(10, 1));
		System.out.println(lista.agregar(5, 2));
		System.out.println(lista.agregar(4, 3));
		System.out.println(lista.agregar(20, 4));
		//lista.eliminar(1);
		System.out.println(lista.elemento(0));
	
		for (int i=0; i<5; i++){
			System.out.println(lista.elemento());
			
			lista.proximo();
		
	}
	}
		
		
   
}
