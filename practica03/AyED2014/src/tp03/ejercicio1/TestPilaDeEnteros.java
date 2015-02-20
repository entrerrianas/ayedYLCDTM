package tp03.ejercicio1;

public class TestPilaDeEnteros{

	public main(){
		PilaDeEnteros p1, p2;
		int valor2=0;
		p1=new PilaDeEnteros();
		p1.apilar(1);
		p2.apilar(2);
		p2=p1;
		valor2=p2.desapilar();
		System.out.println("El valor del topé es: "+p1.desapilar());
	}

}
