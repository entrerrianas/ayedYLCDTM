package ejercicio6;

import ejercicio5.SmartPhone;
import ejercicio5.Tablet;

public class listaEnlazadaGenericaTest {
	
	public static void main(String[] args) {
		
		SmartPhone sp1 = new SmartPhone();
		SmartPhone sp2 = new SmartPhone();
		Tablet t1 = new Tablet();
		Tablet t2 = new Tablet();
		ListaEnlazadaGenerica lg = new ListaEnlazadaGenerica();
		
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
		
		t1.setCosto(100);
		t1.setMarca("LG");
		t1.setModelo("101");
		t1.setPulgadas(10);
		t1.setSO("Linux");
		
		t2.setCosto(100);
		t2.setMarca("LG");
		t2.setModelo("101");
		t2.setPulgadas(10);
		t2.setSO("Linux");		
		
		lg.agregarInicio(sp1);
		lg.agregarInicio(sp2);
		lg.agregarInicio(t1);
		lg.agregarInicio(t2);		
		
		lg.comenzar();
		while(!lg.fin()){
			System.out.print(lg.proximo().toString());
			System.out.print("\n ----------- \n");			
		}

	}
	

}
