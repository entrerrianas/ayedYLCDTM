package Ejercicio2;

public class TestPila {
	public static void main(String[] argumentos) {
		Pila p1, p2;
		
		
		p1 = new Pila();
		p1.push("1");
		p1.push("2");
		p2 = p1;	//Dos variables apuntando al mismo objeto//
		p2.pop();

		System.out.println("El valor del tope de la pila p1 es: " +
				           p1.pop());
	}
}
