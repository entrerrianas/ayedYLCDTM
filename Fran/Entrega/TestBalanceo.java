package ejercicio7;

public class TestBalanceo {

	public static void main(String[] args) {

		String pal = "hola";
		PilaGenerica pila = new PilaGenerica();	
		for (int i = 0; i < args.length; i++)
		{
			Character car = new Character(pal.charAt(i));
			if ((car == '}')||(car == ']')||(car == ')')||(car == '{')||(car == '[')||(car == '('))
			{
				pila.poner(car);
			}
		}
		
		boolean ok = true;
		while ((!pila.esVacia()) || (ok))
		{
			car = //
			switch (car){
				case '}': if (!pila.dato.incluye('{')){ ok = false; }
				break;
				case ']': if (!pila.dato.incluye('[')){ ok = false; }
				break;
				case ')': if (!pila.dato.incluye('(')){ ok = false; }
				break;
				case '{': if (!pila.dato.incluye('}')){ ok = false; }
				break;
				case '[': if (!pila.dato.incluye(']')){ ok = false; }
				break;
				case '(': if (!pila.dato.incluye(')')){ ok = false; }
				break;
			}
		}
		
		if (ok) {
			System.out.print("La cadena esta balanceada.");
		} else {
			System.out.print("La cadena NO esta balanceada.");
		}
	}

}
