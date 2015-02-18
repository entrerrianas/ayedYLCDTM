public class Lista {
	private Elemento primerElemento;
	private Elemento elementoActual;
	private Elemento anteriorElemento;
	private int tama�o;

	
	public static void main(String[] args){
		
	}
	
	public Elemento getElementoActual() {
		return elementoActual;
	}

	public void setElementoActual(Elemento elementoActual) {
		this.elementoActual = elementoActual;
	}

	public Elemento getPrimerElemento() {
		return primerElemento;
	}

	public void setPrimerElemento(Elemento primerElemento) {
		this.primerElemento = primerElemento;
	}

	
	private boolean noNil(Elemento elemento) {
		return (elemento != null);
	}

	private void avanzarHastaFinal() {
		while (noNil(elementoActual)) {
			anteriorElemento = elementoActual;
			elementoActual = elementoActual.getSiguiente();
		}
	}
	
	private void decrementarTama�o(){
		tama�o = tama�o - 1;
	
	}
	
	private void incrementarTama�o(){
		tama�o = tama�o + 1;
	}
	

	public void begin() {
		elementoActual = primerElemento;
		anteriorElemento = null;
	}

	public Elemento getCurrent() {
		return elementoActual;
		}

	public void next() {
		if (noNil(elementoActual))
			{
				anteriorElemento = elementoActual;
				elementoActual = elementoActual.getSiguiente();
			}
	}

	public boolean end() {
		return !noNil(elementoActual);
	}

	public void delete() {
		if (noNil(elementoActual))
			{
				anteriorElemento.setSiguiente(elementoActual.getSiguiente());
				elementoActual = elementoActual.getSiguiente();
				decrementarTama�o();
		}
	}

	public void addFirst(String elem) {
		Elemento e = new Elemento(elem);
		e.setSiguiente(primerElemento);
		primerElemento = e;
		incrementarTama�o();
	}

	public void addLast(String elem) {
		Elemento e = new Elemento(elem);
		avanzarHastaFinal();
		e.setSiguiente(elementoActual);
		elementoActual = e;
		incrementarTama�o();

		if (noNil(primerElemento))
			anteriorElemento.setSiguiente(e);
		else
			primerElemento = e;
	}

	public void removeFirst() {
		if (noNil(primerElemento)) {
			
			primerElemento = primerElemento.getSiguiente();
			decrementarTama�o();
		}
	}

	public void removeLast() {
		while (noNil(elementoActual) && noNil(elementoActual.getSiguiente())) {
			anteriorElemento = elementoActual;
			elementoActual = elementoActual.getSiguiente();
		}
		
		if(noNil(elementoActual)) {
			anteriorElemento.setSiguiente(null);
			elementoActual = anteriorElemento;
			decrementarTama�o();
			}
	}

	public Elemento getFirst() {
		return primerElemento;
	}

	public Elemento getLast(){
		avanzarHastaFinal();
		return anteriorElemento;
	}

	public boolean isEmpty (){
		return !noNil(primerElemento);
	}
	
	public boolean includes (String elem){
		Elemento aux = primerElemento;
		Elemento antAux;
		
		while (noNil(aux) && aux.getContenido() != elem)
		{
			antAux = aux;
			aux = aux.getSiguiente();
		}
		return noNil(aux);
	}
	
	public int size(){
		return tama�o;
	}
	
	


}
