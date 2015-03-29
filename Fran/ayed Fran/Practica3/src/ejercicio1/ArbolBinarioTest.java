package ejercicio1;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

/*import Practica2. ListaEnlazadaGenerica;
import Practica3.ListaGenerica;
import Practica3.ArbolBinario;*/

public class ArbolBinarioTest {

	ArbolBinario<Integer> arbolBinarioA;
	ArbolBinario<Integer> arbolBinarioB;
	ArbolBinario<Integer> arbolBinarioC;
	ArbolBinario<Integer> arbolBinarioD;
	ArbolBinario<Integer> arbolBinarioE;
	ArbolBinario<Integer> arbolBinarioF;
	
	@Before
	public void setUp() throws Exception {
		// ----- arbolBinarioA -----
		arbolBinarioA=new ArbolBinario<Integer>(1);
		
		ArbolBinario<Integer> hijoIzquierdo=new ArbolBinario<Integer>(2);
		hijoIzquierdo.agregarHijoIzquierdo(new ArbolBinario<Integer>(3));
		hijoIzquierdo.agregarHijoDerecho(new ArbolBinario<Integer>(4));
		
		ArbolBinario<Integer> hijoDerecho=new ArbolBinario<Integer>(5);
		hijoDerecho.agregarHijoIzquierdo(new ArbolBinario<Integer>(6));
		hijoDerecho.agregarHijoDerecho(new ArbolBinario<Integer>(7));

		arbolBinarioA.agregarHijoIzquierdo(hijoIzquierdo);
		arbolBinarioA.agregarHijoDerecho(hijoDerecho);


		// ----- arbolBinarioB -----
		arbolBinarioB=new ArbolBinario<Integer>(1);
		
		ArbolBinario<Integer> hijoIzquierdoB=new ArbolBinario<Integer>(2);
		hijoIzquierdoB.agregarHijoIzquierdo(new ArbolBinario<Integer>(3));
		hijoIzquierdoB.agregarHijoDerecho(new ArbolBinario<Integer>(4));
		
		ArbolBinario<Integer> hijoDerechoB=new ArbolBinario<Integer>(6);
		hijoDerechoB.agregarHijoIzquierdo(new ArbolBinario<Integer>(7));
		hijoDerechoB.agregarHijoDerecho(new ArbolBinario<Integer>(8));

		
		arbolBinarioB.agregarHijoIzquierdo(hijoIzquierdoB);
		arbolBinarioB.agregarHijoDerecho(hijoDerechoB);
		
		// ----- arbolBinarioC -----		
		
		arbolBinarioC=new ArbolBinario<Integer>(11);
		
		ArbolBinario<Integer> hijoIzquierdoC=new ArbolBinario<Integer>(12);
		hijoIzquierdoC.agregarHijoIzquierdo(new ArbolBinario<Integer>(13));
		hijoIzquierdoC.agregarHijoDerecho(new ArbolBinario<Integer>(14));
		
		ArbolBinario<Integer> hijoDerechoC=new ArbolBinario<Integer>(15);
		hijoDerechoC.agregarHijoDerecho(new ArbolBinario<Integer>(8));

		
		arbolBinarioC.agregarHijoIzquierdo(hijoIzquierdoC);
		arbolBinarioC.agregarHijoDerecho(hijoDerechoC);
		
		// ----- arbolBinarioD -----		
		
		arbolBinarioD=new ArbolBinario<Integer>(11);
		
		ArbolBinario<Integer> hijoIzquierdoD=new ArbolBinario<Integer>(12);
		hijoIzquierdoD.agregarHijoIzquierdo(new ArbolBinario<Integer>(13));
		hijoIzquierdoD.agregarHijoDerecho(new ArbolBinario<Integer>(14));
		
		ArbolBinario<Integer> hijoDerechoD=new ArbolBinario<Integer>(15);
		hijoDerechoD.agregarHijoIzquierdo(new ArbolBinario<Integer>(8));

		
		arbolBinarioD.agregarHijoIzquierdo(hijoIzquierdoD);
		arbolBinarioD.agregarHijoDerecho(hijoDerechoD);
		
		// ----- arbolBinarioE -----		
		
		arbolBinarioE=new ArbolBinario<Integer>(1);
		
		ArbolBinario<Integer> hijoIzquierdoE=new ArbolBinario<Integer>(2);
		hijoIzquierdoE.agregarHijoIzquierdo(new ArbolBinario<Integer>(4));
		hijoIzquierdoE.agregarHijoDerecho(new ArbolBinario<Integer>(5));
		
		ArbolBinario<Integer> hijoDerechoE=new ArbolBinario<Integer>(3);
		hijoDerechoE.agregarHijoIzquierdo(new ArbolBinario<Integer>(6));

		
		arbolBinarioE.agregarHijoIzquierdo(hijoIzquierdoE);
		arbolBinarioE.agregarHijoDerecho(hijoDerechoE);
		
		// ----- arbolBinarioF -----		
		
		arbolBinarioF=new ArbolBinario<Integer>(1);
		
		ArbolBinario<Integer> hijoIzquierdoF=new ArbolBinario<Integer>(3);
		hijoIzquierdoF.agregarHijoDerecho(new ArbolBinario<Integer>(6));
		
		ArbolBinario<Integer> hijoDerechoF=new ArbolBinario<Integer>(2);
		hijoDerechoF.agregarHijoIzquierdo(new ArbolBinario<Integer>(5));
		hijoDerechoF.agregarHijoDerecho(new ArbolBinario<Integer>(4));
		

		
		arbolBinarioF.agregarHijoIzquierdo(hijoIzquierdoF);
		arbolBinarioF.agregarHijoDerecho(hijoDerechoF);
		
		
		
		
	}

	@Test
	public void testFrontera() {
		
		//CASO arbolBinarioA
		ListaEnlazadaGenerica<Integer> listaFronteraEsperada=new ListaEnlazadaGenerica<Integer>();
		listaFronteraEsperada.agregar(3);
		listaFronteraEsperada.agregar(4);
		listaFronteraEsperada.agregar(6);
		listaFronteraEsperada.agregar(7);
		
		ListaGenerica<Integer> listaFronteraDeArbolBinario=arbolBinarioA.frontera();
		assertEquals(listaFronteraEsperada.elemento(0), listaFronteraDeArbolBinario.elemento(0));
		assertEquals(listaFronteraEsperada.elemento(1), listaFronteraDeArbolBinario.elemento(1));
		assertEquals(listaFronteraEsperada.elemento(2), listaFronteraDeArbolBinario.elemento(2));
		assertEquals(listaFronteraEsperada.elemento(3), listaFronteraDeArbolBinario.elemento(3));
		
		
		//CASO arbolBinarioC
		listaFronteraEsperada=new ListaEnlazadaGenerica<Integer>();
		listaFronteraEsperada.agregar(13);
		listaFronteraEsperada.agregar(14);
		listaFronteraEsperada.agregar(8);
		
		listaFronteraDeArbolBinario=arbolBinarioC.frontera();
		assertEquals(listaFronteraEsperada.elemento(0), listaFronteraDeArbolBinario.elemento(0));
		assertEquals(listaFronteraEsperada.elemento(1), listaFronteraDeArbolBinario.elemento(1));
		assertEquals(listaFronteraEsperada.elemento(2), listaFronteraDeArbolBinario.elemento(2));
	}

	
	@Test
	public void testEsMenor() {
		assertTrue(!arbolBinarioB.esMenor(arbolBinarioA));
	}	
	
	
	@Test
	public void testLleno() {
		assertTrue(arbolBinarioA.lleno());
		assertFalse(arbolBinarioD.lleno());
	}
	

	@Test
	public void testCompleto() {
		assertTrue(arbolBinarioA.completo());
		assertFalse(arbolBinarioC.completo());
		assertTrue(arbolBinarioD.completo());
	}


	

	
}
