package tp03.ejercicio1;

import java.util.Arrays;

public class StringBalanceado {
	
	private PilaGenerica<Character> datos;
	
	public StringBalanceado(){
		datos = new PilaGenerica<Character>();
	}
	
	public boolean verificarString(String entrada){
		int i = 0;
		boolean balanceado = true;
		Character[] charApertura = {'(','{','['};
		Character[] charCierre = {')','}',']'};

		while (i < entrada.length() && balanceado) {
			if (Arrays.asList(charApertura).contains(entrada.charAt(i))){
				datos.apilar(entrada.charAt(i));
			} else if (Arrays.asList(charCierre).contains(entrada.charAt(i))){
				Character dato = datos.desapilar();
				switch (entrada.charAt(i)) {
				case ')':
					if (dato != '('){
						balanceado = false;
					}
					break;
				case ']':
					if (dato != '['){
						balanceado = false;
					}
					break;
				case '}':
					if (dato != '{'){
						balanceado = false;
					}
					break;
				default:
					break;
				}
			}
			i++;
		}
		return balanceado;
	}
}
