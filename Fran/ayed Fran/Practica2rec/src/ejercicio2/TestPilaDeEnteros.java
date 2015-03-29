package ejercicio2;

public class TestPilaDeEnteros {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PilaDeEnteros p1, p2;
		Integer valor2;
		p1=new PilaDeEnteros();
		p1.poner(1);
		p1.poner(2);
		p2=p1;
		valor2 =(p2.sacar());
		System.out.println("el tope era: " + valor2);
		System.out.println("El valor del tope de la pila p1 es: " + p1.sacar());

	}



}
