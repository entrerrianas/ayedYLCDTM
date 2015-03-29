package ejercicio5;

import ejercicio4.*;

public class PruebaEjercicio5 {

	public static void main(String[] args) {
		
		GrafoImplListAdy<Integer> grafo = new GrafoImplListAdy<Integer>();
		GrafoImplListAdy<Integer> grafo2 = new GrafoImplListAdy<Integer>();
		VerticeImplListAdy<Integer> v1 = new VerticeImplListAdy<Integer>(1);
		VerticeImplListAdy<Integer> v2 = new VerticeImplListAdy<Integer>(2);
		VerticeImplListAdy<Integer> v3 = new VerticeImplListAdy<Integer>(3);
		VerticeImplListAdy<Integer> v4 = new VerticeImplListAdy<Integer>(4);
		VerticeImplListAdy<Integer> v5 = new VerticeImplListAdy<Integer>(5);
		VerticeImplListAdy<Integer> v6 = new VerticeImplListAdy<Integer>(6);
		
		// para grafo
		/*grafo.agregarVertice(v1);
		grafo.agregarVertice(v2);
		grafo.agregarVertice(v3);
		grafo.agregarVertice(v4);
		grafo.agregarVertice(v5);
		grafo.agregarVertice(v6);	
		grafo.conectar(v1, v6);
		grafo.conectar(v1, v3);
		grafo.conectar(v6, v2);
		grafo.conectar(v3, v4);
		grafo.conectar(v5, v4);*/
		
		// para grafo2
		grafo2.agregarVertice(v1);
		grafo2.agregarVertice(v2);
		grafo2.agregarVertice(v3);
		grafo2.agregarVertice(v4);
		grafo2.agregarVertice(v5);
		grafo2.agregarVertice(v6);
		
		grafo2.conectar(v1, v5);
		grafo2.conectar(v1, v4);
		grafo2.conectar(v4, v6);
		grafo2.conectar(v6, v2);
		grafo2.conectar(v5, v3); 
		
		Recorridos<Integer> recorrido = new Recorridos<Integer>(); 
		ListaEnlazadaGenerica<Vertice<Integer>> lista = new ListaEnlazadaGenerica<Vertice<Integer>>();
		ListaEnlazadaGenerica<Vertice<Integer>> lista2 = new ListaEnlazadaGenerica<Vertice<Integer>>();
		lista = recorrido.recorridoDfs(grafo2);
		System.out.print("Lista: ");
		lista.comenzar();
		while (!lista.fin()){
			System.out.print(lista.elemento().dato()+" - ");
			lista.proximo();
		}
		System.out.println("Tiene que quedar Grafo2(para dfs): 1 - 5 - 3 - 2 - 4 - 6");
		lista2 = recorrido.recorridoBfs(grafo);
		System.out.print("Lista: ");
		lista2.comenzar();
		while (!lista2.fin()){
			System.out.print(lista2.elemento().dato()+" - ");
			lista2.proximo();
		}
		System.out.print("Tiene que quedar Grafo1(para bfs): 1 - 6 - 3 - 2 - 4 - 5");
		 
	}

}
