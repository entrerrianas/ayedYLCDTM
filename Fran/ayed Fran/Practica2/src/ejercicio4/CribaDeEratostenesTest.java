package ejercicio4;

public class CribaDeEratostenesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CribaDeEratostenes c=new CribaDeEratostenes();
		//System.out.println("Escriba la cantidad de elementos: ");
		//System.in.read(int n);
		
		c.cargar(45);
		c.imprimirLista();
		System.out.println(" ");
		c.obtenerPrimos();
		c.imprimirLista();

	}

}
