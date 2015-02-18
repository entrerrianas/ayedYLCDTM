package ejercicio2;

public class Impresora<T> implements DispositivoDeImpresion<T> {
	Heap<String> cola;

	public Impresora() {
		this.cola= new Heap<String>();
	}
	
	public boolean imprimir(){
		if(!cola.esVacia()){
			String d=cola.eliminar();
			System.out.println(d);
			return true;
		}
		return false;
	}
	
	public void nuevoDocumento(Documento d){
		cola.agregar(d.getDocumento());
	}

}
