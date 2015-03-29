package ejercicio2;
import ejercicio1.*;

public class PilaDeEnteros {

		private ListaDeEnteros datos = new ListaDeEnterosEnlazada();					
		
		public boolean apilar(int elem){
			return this.datos.agregarInicio(elem);
		}
		
		public int tope (){
			return this.datos.elemento(this.datos.tamanio());
		}
		
		public int desapilar(){
			
			int elemTope = this.tope();
			this.datos.eliminar(elemTope);
			return elemTope;
			
		}
		
		public boolean esVacia(){
			return this.datos.esVacia();
		}
		

}
