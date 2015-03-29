package tp03.ejercicio1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ListaInvertidaDeGramasTest {

	ListaInvertidaDeGramas li; 
	
	@Before
	public void setUp() throws Exception {
		li = new ListaInvertidaDeGramas(2);
	}
	
	@Test
	public void testComenzar() {
		
		li.agregar("univer");
		li.agregar("unile");
	
		ListaEnlazadaGenerica<String> lista = li.recuperarListaDePalabras("un");
	
		assertEquals(2, lista.tamanio());
	}


}




