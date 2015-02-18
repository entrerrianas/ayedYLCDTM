package ejercicio3;

import static org.junit.Assert.assertEquals;

public class Prueba {

	public static void main(String[] args) {
		ArbolAVL<String> arbol = new ArbolAVL<String>("hola");
		arbol.agregar("otro");
		System.out.println("Agregue: otro - CumpleAVL: "+arbol.cumpleAVL());
		arbol.agregar("mundo");
		System.out.println("Agregue: mundo - CumpleAVL: "+arbol.cumpleAVL());
		//arbol.agregar("arbol");
		//System.out.println("Agregue: arbol - CumpleAVL: "+arbol.cumpleAVL());
		//arbol.agregar("aibol");
		//System.out.println("Agregue: aibol - CumpleAVL: "+arbol.cumpleAVL());
		//System.out.println(arbol.esMinimal());
		System.out.println(arbol.cumpleAVL());
		arbol.balancear();
		System.out.println(arbol.cumpleAVL());
	}

}
