package estructurasdedatos;

public class Lista extends colecciones {

	int i;
	
	public Lista (int tamañoMaximo){
		super(tamañoMaximo);
	}
	
	public Lista (){
		super(52);
	}
	
	public void agregar (Object elementos){
		this.elementos.add(elementos);
	}
	
	public Object get(int i) {
		return i ;
	}

	public void set(int i, Object elementos) {
		this.i = elementos;
	}
	
	public void agregar (int i, Object elementos){
		this.elementos.i = elementos;
	}
	
	public Object remover (int i){
		elementos.delete(i);
	}
	
	
}
