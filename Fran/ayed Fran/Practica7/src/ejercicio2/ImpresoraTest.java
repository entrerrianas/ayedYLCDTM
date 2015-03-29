package ejercicio2;

public class ImpresoraTest {

	public ImpresoraTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DispositivoDeImpresion<Documento> imp= new Impresora();
		Documento d1=new Documento("Holad");
		Documento d2=new Documento("Casa");
		Documento d3=new Documento("Viejarda");
		Documento d4=new Documento("Tarado");
		Documento d5=new Documento("dsagfdhbvergfgsdfwrfdsf");
		imp.nuevoDocumento(d1);
		imp.nuevoDocumento(d2);
		imp.nuevoDocumento(d3);
		imp.nuevoDocumento(d4);
		imp.nuevoDocumento(d5);
		
		imp.imprimir();
		imp.imprimir();
		imp.imprimir();
		imp.imprimir();
		imp.imprimir();
		imp.imprimir();
		imp.imprimir();
		

	}

}
