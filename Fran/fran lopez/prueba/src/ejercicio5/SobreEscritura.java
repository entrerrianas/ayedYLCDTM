package ejercicio5;

public class SobreEscritura {
	
public static void main (String [] argv){
	
	SmartPhone sp1 = new SmartPhone();
	SmartPhone sp2 = new SmartPhone();

	sp1.setCosto(100);
	sp1.setMarca("LG");
	sp1.setModelo("101");
	sp1.setNumero(154404571);
	sp1.setSO("Linux");
	
	sp2.setCosto(100);
	sp2.setMarca("LG");
	sp2.setModelo("101");
	sp2.setNumero(154404571);
	sp2.setSO("Linux");
	
	System.out.println("Datos SmartPhone 1: " + sp1.toString());
	System.out.println("Datos SmartPhone 2: " + sp2.toString());
	System.out.println("Iguales: " + sp1.equals(sp2));
	
	}
}
