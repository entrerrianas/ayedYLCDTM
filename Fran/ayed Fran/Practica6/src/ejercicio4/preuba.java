package ejercicio4;

public class preuba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GrafoImplMatrizAdy<Integer> grafo;
		grafo = new GrafoImplMatrizAdy<Integer>(10);
		
		VerticeImplMatrizAdy<Integer> vert1 = new VerticeImplMatrizAdy<Integer>(1);
		grafo.agregarVertice(vert1);
		System.out.println(grafo.vertice(vert1.posicion()) == vert1);
		
		VerticeImplMatrizAdy<Integer> vert2 = new VerticeImplMatrizAdy<Integer>(1);
		grafo.agregarVertice(vert2);
		System.out.println(grafo.vertice(vert2.posicion()) == vert2);
		System.out.println(vert2);
		System.out.println(grafo.vertice(vert2.posicion()));

	}

}
