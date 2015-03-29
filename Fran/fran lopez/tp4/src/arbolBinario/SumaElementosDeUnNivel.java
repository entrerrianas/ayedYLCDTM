package arbolBinario;

public class SumaElementosDeUnNivel {

	public static void main(String[] args) {
		
		
		ArbolBinario<Integer> arbolBinarioA;
		arbolBinarioA=new ArbolBinario<Integer>(7);
		
		ArbolBinario<Integer> hijoIzquierdo=new ArbolBinario<Integer>(1);
		hijoIzquierdo.agregarHijoIzquierdo(new ArbolBinario<Integer>(4));		
		ArbolBinario<Integer> hijoDerecho=new ArbolBinario<Integer>(3);
		hijoDerecho.agregarHijoDerecho(new ArbolBinario<Integer>(1));
		hijoDerecho.agregarHijoIzquierdo(new ArbolBinario<Integer>(2));
		
		arbolBinarioA.agregarHijoDerecho(hijoDerecho);
		arbolBinarioA.agregarHijoIzquierdo(hijoIzquierdo);
		int niv = 4;
		int sum = arbolBinarioA.sumaElementosProfundidad(niv);
		System.out.print("Suma del nivel " + niv + ": " + sum);

	}

}
