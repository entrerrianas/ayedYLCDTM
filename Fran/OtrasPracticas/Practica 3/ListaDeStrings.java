
public class ListaDeStrings {
	private String[] elementos;
	private int posicionActual = -1;
	private int posicionUltimo = -1;
	
	
	public ListaDeStrings(int longitud){
		elementos = new String[longitud];		
	}
	
	
	private void desplazarElementos(int posicion){
		if (!isEmpty())
			{
				for (int x = posicion; x < posicionUltimo; x++)
					elementos[x] = elementos[x+1];
				
				posicionUltimo = posicionUltimo - 1;
			}
	}
	
	private boolean notFull(){
		return true;
	}
	
	
	public void begin(){
		if (!isEmpty())
			posicionActual = 0;
	}
	
	public String getCurrent(){
		if (isEmpty())
			return null;
		else
			return elementos[posicionActual];
	}
	
	public void next(){
		if (posicionActual < posicionUltimo)	
			posicionActual = posicionActual + 1;
	}
	
	public boolean end(){
		return isEmpty() || posicionActual == elementos.length;
	}
			
	public void delete(){
		desplazarElementos(posicionActual);
	}
	
	public void addFirst(String elemento) {
		if (notFull())
			{
				for (int x = posicionUltimo; x > 1; x--)
					elementos[x] = elementos[x-1];
			}		
	}
	
	public void addLast(String elemento) {
		if (posicionUltimo != elementos.length)
			{
				posicionUltimo = posicionUltimo + 1;
				elementos[posicionUltimo] = elemento;
				
				//Se actualiza el puntero del elemento actual
				//al último agregado
				posicionActual = posicionUltimo;
			}
	}
	
	public void removeFirst(){
		desplazarElementos(0);
	}
	
	public void removeLast(){
		if (!isEmpty())
		{
			posicionUltimo = posicionUltimo - 1;
			if (isEmpty())
				posicionActual = -1;
		}
	}

	public String getFirst(){
		if (isEmpty())
			return null;
		else
			return elementos[0];
	}
	
	public String getLast(){
		if (isEmpty())
			return null;
		else
			return elementos [posicionUltimo];
	}
	
	public boolean isEmpty(){
		return (posicionUltimo == -1);
	}
	
	public boolean includes(String elemento){
		return !isEmpty() && elementos.equals(elemento);
	}
	
	public int size(){		
		return posicionUltimo;
	}
}
