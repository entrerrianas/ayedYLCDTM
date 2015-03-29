package ejercicio2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//import tp4.ArbolGeneral;



public class ArbolGeneralTest {

	ArbolGeneral<Integer> ag;
	ArbolGeneral<Integer> a2;
	ArbolGeneral<Integer> a3;
	ArbolGeneral<Integer> a4;
	ArbolGeneral<Integer> a5;
	ArbolGeneral<Integer> a6;
	ArbolGeneral<Integer> a7;
	ArbolGeneral<Integer> a8;
	ArbolGeneral<Integer> a9;
	
	@Before
	public void setUp() throws Exception {
		
		ag = new ArbolGeneral<Integer>(1);
		
		a2 = new ArbolGeneral<Integer>(2);
		a3 = new ArbolGeneral<Integer>(3);
		a4 = new ArbolGeneral<Integer>(4);
		a5 = new ArbolGeneral<Integer>(5);
		a6 = new ArbolGeneral<Integer>(6);
		a7 = new ArbolGeneral<Integer>(7);
		a8 = new ArbolGeneral<Integer>(8);
		a9 = new ArbolGeneral<Integer>(9);
		
		ag.agregarHijo(a2);
		ag.agregarHijo(a3);
		ag.agregarHijo(a4);
		a2.agregarHijo(a5);
		a3.agregarHijo(a6);
		a3.agregarHijo(a7);
		a3.agregarHijo(a8);
		a4.agregarHijo(a9);
		
		
/*      Arbol usado en las pruebas
 					1
		2			3			4
		5		6	7	8		9
		
*/
				
	}

	@Test
	public void testAltura() {
		assertEquals(2, ag.altura());
		assertEquals(1, a2.altura());
		assertEquals(0, a5.altura());
	}

	@Test
	public void testNivel() {
		//Prueba para un arbol que es solo una hoja
		assertEquals(0, a5.nivel(5));
		
		//Prueba para distintos elementos del arbol ag
		assertEquals(0, ag.nivel(1));
		assertEquals(1, ag.nivel(2));
		assertEquals(2, ag.nivel(7));
		assertEquals(2, ag.nivel(9));
		assertEquals(-1, ag.nivel(10));
	}

	@Test
	public void testAncho() {
		assertEquals(5, ag.ancho());
		assertEquals(3, a3.ancho());
		assertEquals(1, a4.ancho());	
	}

}
