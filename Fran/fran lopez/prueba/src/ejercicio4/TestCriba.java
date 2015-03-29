package ejercicio4;
import ejercicio1.*;


public class TestCriba {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();
		ListaDeEnterosEnlazada primos = new ListaDeEnterosEnlazada();
		for (int i = 1; i <= 1000; i++){			
			l.agregarInicio(i);
		}
		
		CribaDeEratostenes c = new CribaDeEratostenes();
		
		primos = c.obtenerPrimos(l);
		

	}

}
