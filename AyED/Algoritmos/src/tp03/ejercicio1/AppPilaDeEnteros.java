package tp03.ejercicio1;

public class AppPilaDeEnteros{

	public static void main(String[] args){
		PilaDeEnteros p1, p2 = null;
		p1=new PilaDeEnteros();
		
		p1.apilar(1);
		p1.apilar(2);
		
		p2 = p1;
	
		@SuppressWarnings("unused")
		int valor2 = p2.desapilar();
		System.out.println("El valor del topé es: "+ p1.desapilar());
	}

}
