package ejercicio5;

import java.lang.reflect.Array;

import ejercicio4.*;

public class Recorridos<T> {

	/* **************** RECORRIDO DFS **************** */

	private void dfs(int i, Grafo<T> grafo, ListaEnlazadaGenerica<Vertice<T>> l, boolean []marca)
	{
		marca[i] = true;
		l.agregar(grafo.listaDeVertices().elemento(i),l.tamanio());
		ListaGenerica<Arista<T>> lista = grafo.listaDeVertices().elemento(i).adyacentes();
		lista.comenzar();
		while(!lista.fin()){
			if(!marca[lista.elemento().verticeDestino().posicion()]){
				this.dfs(lista.elemento().verticeDestino().posicion(), grafo, l, marca);
			}
			lista.proximo();
		}
	}
	
	
	public ListaEnlazadaGenerica<Vertice<T>> recorridoDfs(Grafo<T> grafo)
	{
		boolean []marca = new boolean[grafo.listaDeVertices().tamanio()];
		for (int i = 0; i < grafo.listaDeVertices().tamanio();i++){
			marca[i] = false;
		}
		ListaEnlazadaGenerica<Vertice<T>> listaVertices = new ListaEnlazadaGenerica<Vertice<T>>();
		for (int i = 0; i < grafo.listaDeVertices().tamanio();i++){
			if(!marca[i]){
				this.dfs(i,grafo,listaVertices,marca);
			}
		}
		return listaVertices;
	}

	/* **************** FIN RECORRIDO DFS **************** */
	 	
	public void bfs (int i, Grafo<T> grafo, ListaEnlazadaGenerica<Vertice<T>> lista, boolean []marca)
	{	
		marca[i] = true;
		lista.agregar(grafo.listaDeVertices().elemento(i),lista.tamanio());
		ListaGenerica<Arista<T>> listaAristas = grafo.listaDeVertices().elemento(i).adyacentes();
		listaAristas.comenzar();
		while (!listaAristas.fin()){
			if (!marca[listaAristas.elemento().verticeDestino().posicion()]){				
				lista.agregar(listaAristas.elemento().verticeDestino(),lista.tamanio());
				marca[listaAristas.elemento().verticeDestino().posicion()] = true;
			}
			listaAristas.proximo();
		}
	}
	
	public ListaEnlazadaGenerica<Vertice<T>> recorridoBfs (Grafo<T> grafo)
	{
		boolean []marca = new boolean[grafo.listaDeVertices().tamanio()];
		for (int i = 0; i < grafo.listaDeVertices().tamanio(); i++){
			marca[i] = false;
		}
		ListaEnlazadaGenerica<Vertice<T>> listaVertices = new ListaEnlazadaGenerica<Vertice<T>>();
		for (int i = 0; i < grafo.listaDeVertices().tamanio(); i++){
			if (!marca[i]){
				this.bfs(i,grafo, listaVertices, marca);
			}
		}
		return listaVertices;
	}

}
