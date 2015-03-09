package trayectoriaPesada;
import arbolBinario.*;
import tp03.ejercicio6.*;

public class TrayectoriaPesada {
	
	public ListaGenerica<Integer> calcular(ArbolBinario<Integer> arbol) {
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		recorrido(arbol, 1, 0, lista);
		return lista;
	}
	
	private void recorrido(ArbolBinario<Integer> arbol, int nivel, int sumaParcial, ListaGenerica<Integer> lista) {
		if (!arbol.esVacio()) {
			procesar(arbol, nivel, sumaParcial, lista);
			if (arbol.tieneHijoDerecho()) {
				recorrido(arbol.getHijoDerecho(), nivel + 1, sumaParcial + nivel * arbol.getDatoRaiz(), lista);
			}
			if (arbol.tieneHijoIzquierdo()) {
				recorrido(arbol.getHijoIzquierdo(), nivel + 1, sumaParcial + nivel * arbol.getDatoRaiz(), lista);
			}
		}
	}
	
	private void procesar(ArbolBinario<Integer> arbol, int nivel, int sumaParcial, ListaGenerica<Integer> lista) {
		if (arbol.esHoja()) {			
			lista.agregarInicio(sumaParcial + arbol.getDatoRaiz() * nivel);
		}
	}
	
}