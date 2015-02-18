package ejercicio3;

public class Prueba {

	public static void main(String[] args) {
		ArbolBinarioDeBusqueda<String> a = new ArbolBinarioDeBusqueda<String>("hola");
		a.agregar("hola");
		a.agregar("mundo");
		a.agregar("algo");
		a.agregar("google");
		a.imprimir();

	}

}
