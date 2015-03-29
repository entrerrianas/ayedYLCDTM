
package ejercicio4;

import junit.framework.TestCase;
//import ejercicio4.ListaGenerica;
//import estructuras.grafo.Arista;
import ejercicio4.*;
import ejercicio4.Arista;
import ejercicio4.Grafo;



/**
 * @author Catedra
 *
 */
public class TestGrafoImplListAdy extends TestCase {
	GrafoImplListAdy<Integer> grafo;
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		grafo = new GrafoImplListAdy<Integer>();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link estructuras.grafo.impl.listaAdy.GrafoImplListAdy#agregarVertice(estructuras.grafo.Vertice)}.
	 */
	public void testAgregarYeliminarVertice() {
		int tamAntes = grafo.listaDeVertices().tamanio();
		VerticeImplListAdy<Integer> vert1 = new VerticeImplListAdy<Integer>(1);
		VerticeImplListAdy<Integer> vert2 = new VerticeImplListAdy<Integer>(2);
		VerticeImplListAdy<Integer> vert3 = new VerticeImplListAdy<Integer>(3);
		grafo.agregarVertice(vert1);
		grafo.agregarVertice(vert2);
		grafo.agregarVertice(vert3);
		grafo.conectar(vert1, vert2);
		grafo.conectar(vert1, vert3);
		grafo.conectar(vert2, vert1);
		grafo.conectar(vert2, vert3);
		grafo.conectar(vert3, vert1);
		grafo.conectar(vert3, vert2);
		int tamDesp = grafo.listaDeVertices().tamanio();
		assertTrue(tamDesp == tamAntes+3);
		grafo.eliminarVertice(vert1);
		grafo.eliminarVertice(vert2);
		grafo.eliminarVertice(vert3);
		int tamFin = grafo.listaDeVertices().tamanio();
		assertTrue(tamFin == tamAntes);
	}

	/**
	 * Test method for {@link estructuras.grafo.impl.listaAdy.GrafoImplListAdy#conectar(estructuras.grafo.Vertice, estructuras.grafo.Vertice)}.
	 */
	public void testConectarYdesconectar() {
		VerticeImplListAdy<Integer> vert1 = new VerticeImplListAdy<Integer>(1);
		VerticeImplListAdy<Integer> vert2 = new VerticeImplListAdy<Integer>(2);
		grafo.agregarVertice(vert1);
		grafo.agregarVertice(vert2);
		grafo.conectar(vert1, vert2);
		boolean ok = false;
		
		//ListaGenerica<Arista> lista = grafo.listaDeAdyacentes(vert1);
		ListaGenerica<Arista<Integer>> lista = grafo.listaDeAdyacentes(vert1);
		Arista arista;
		lista.comenzar();
		while(!lista.fin()){
			arista = lista.elemento();
			if (arista.verticeDestino() == vert2){
				ok= true;
			}
			lista.proximo();
		}

		assertTrue(ok);
		
		grafo.desConectar(vert1, vert2);
		ok=false;
		lista = grafo.listaDeAdyacentes(vert1);
		lista.comenzar();
		while(!lista.fin()){
			arista = lista.elemento();
			if (arista.verticeDestino() == vert2){
				ok= true;
			}
			lista.proximo();
		}
		assertFalse(ok);
	}

	/**
	 * Test method for {@link estructuras.grafo.impl.listaAdy.GrafoImplListAdy#esAdyacente(estructuras.grafo.Vertice, estructuras.grafo.Vertice)}.
	 */
	public void testEsAdyacente() {
		VerticeImplListAdy<Integer> vert1 = new VerticeImplListAdy<Integer>(1);
		VerticeImplListAdy<Integer> vert2 = new VerticeImplListAdy<Integer>(2);
		grafo.agregarVertice(vert1);
		grafo.agregarVertice(vert2);
		grafo.conectar(vert1, vert2);
		assertTrue(grafo.esAdyacente(vert1,vert2));
		assertFalse(grafo.esAdyacente(vert2,vert1));
	}

	/**
	 * Test method for {@link estructuras.grafo.impl.listaAdy.GrafoImplListAdy#esVacio()}.
	 */
	public void testEsVacio() {
		assertTrue(grafo.esVacio());
		VerticeImplListAdy<Integer> vert1 = new VerticeImplListAdy<Integer>(1);
		grafo.agregarVertice(vert1);
		assertFalse(grafo.esVacio());
	}

	/**
	 * Test method for {@link estructuras.grafo.impl.listaAdy.GrafoImplListAdy#listaDeVertices()}.
	 */
	public void testListaDeVertices() {
		assertTrue(grafo.listaDeVertices().tamanio()==0);
		VerticeImplListAdy<Integer> vert1 = new VerticeImplListAdy<Integer>(1);
		grafo.agregarVertice(vert1);
		assertTrue(grafo.listaDeVertices().tamanio()==1);
		VerticeImplListAdy<Integer> vert2 = new VerticeImplListAdy<Integer>(2);
		grafo.agregarVertice(vert2);
		assertTrue(grafo.listaDeVertices().tamanio()==2);
	}

	/**
	 * Test method for {@link estructuras.grafo.impl.listaAdy.GrafoImplListAdy#peso(estructuras.grafo.Vertice, estructuras.grafo.Vertice)}.
	 */
	public void testPeso() {
		VerticeImplListAdy<Integer> vert1 = new VerticeImplListAdy<Integer>(1);
		VerticeImplListAdy<Integer> vert2 = new VerticeImplListAdy<Integer>(2);
		grafo.agregarVertice(vert1);
		grafo.agregarVertice(vert2);
		grafo.conectar(vert1, vert2,5);
		assertTrue(grafo.peso(vert1, vert2) == 5);
	}

	/**
	 * Test method for {@link estructuras.grafo.impl.listaAdy.GrafoImplListAdy#listaDeAdyacentes(estructuras.grafo.Vertice)}.
	 */
	public void testListaDeAdyacentes() {
		VerticeImplListAdy<Integer> vert1 = new VerticeImplListAdy<Integer>(1);
		grafo.agregarVertice(vert1);
		assertTrue(grafo.listaDeAdyacentes(vert1).tamanio() == 0);
		VerticeImplListAdy<Integer> vert2 = new VerticeImplListAdy<Integer>(2);
		grafo.agregarVertice(vert2);
		assertTrue(grafo.listaDeAdyacentes(vert2).tamanio() == 0);
		grafo.conectar(vert1, vert2);
		assertTrue(grafo.listaDeAdyacentes(vert1).tamanio() == 1);
		assertTrue(grafo.listaDeAdyacentes(vert2).tamanio() == 0);
		grafo.conectar(vert2, vert1);
		assertTrue(grafo.listaDeAdyacentes(vert1).tamanio() == 1);
		assertTrue(grafo.listaDeAdyacentes(vert2).tamanio() == 1);
	}

	/**
	 * Test method for {@link estructuras.grafo.impl.listaAdy.GrafoImplListAdy#vetice(int)}.
	 */
	public void testVetice() {
		VerticeImplListAdy<Integer> vert1 = new VerticeImplListAdy<Integer>(1);
		grafo.agregarVertice(vert1);
		assertEquals(grafo.vertice(vert1.posicion()),vert1);
		
		VerticeImplListAdy<Integer> vert2 = new VerticeImplListAdy<Integer>(1);
		grafo.agregarVertice(vert2);
		assertEquals(grafo.vertice(vert2.posicion()),vert2);
	}

}
