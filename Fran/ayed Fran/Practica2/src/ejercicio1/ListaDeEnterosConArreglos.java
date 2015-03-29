package ejercicio1;

import static org.junit.Assert.assertEquals;

public class ListaDeEnterosConArreglos extends ListaDeEnteros {
	
    //private int[]datos= new int[tamanio];

    private Integer[]datos= new Integer[100]; //preguntar
	//private Integer[]datos;
	private int actual=0;
	private int tamLogico=0;

	public ListaDeEnterosConArreglos() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean agregar(Integer elem) {
		if(tamLogico<100){
			//corrimientos de derecha a izq
			for (int i=tamLogico; i>=actual; i--) datos[i+1]=datos[i];
			datos[actual]= elem;
			tamLogico++;
			return true;
		}
		return false;
	}

	@Override
	public boolean agregar(Integer elem, int pos) {
		//si el tamlogico es < al fisico, la pos es posistiva y < al logico
		if((tamLogico<100)&&(pos<=tamLogico)&&(pos>=0)){
			for (int i=tamLogico-1; i>=pos; i--) datos[i+1]=datos[i];
			datos[pos]= elem;
			tamLogico++;	
			return true;
		}	
		return false;
	}

	@Override
	public void comenzar() {
      actual=0;
      //tamLogico=0;
      
      //tamanio=100;  //preguntar
     // datos= new Integer[tamanio];
	}

	@Override
	public Integer elemento() {
		return datos[actual];
	}

	@Override
	public Integer elemento(Integer pos) {
		return datos[pos];
	}

	@Override
	public boolean eliminar() {
		if((actual<tamLogico)&&(tamanio()>0)){
			for (int i=actual; i<tamLogico-1; i++) datos[i]=datos[i+1];
			tamLogico=tamLogico-1;
			tamanio=tamanio-1;
			return true;
		}
		return false;
	}

	@Override
	public boolean eliminar(Integer pos) {
		if((pos<tamLogico)&&(tamanio()>0)){
			for(int i=pos; i<tamLogico; i++) datos[i]=datos[i+1];
			tamLogico=tamLogico-1;
			 return true;
		}
		return false;
	}

	@Override
	public boolean esvacia() {
		return (tamLogico==0);
	}

	@Override
	public boolean incluye(Integer elem) {
		comenzar();
		while((actual<=tamLogico)&&(elemento()!=elem))proximo();
	    if(datos[actual]==elem) return true;
		return false;
	}

	@Override
	public void proximo() {
		if(actual<=tamanio()){
		//if(!fin()){
			actual++;
		}
	}

	@Override
	public int tamanio() {
		return tamLogico;
		//return tamanio;
	}
	
	public boolean fin(){
		return (actual>=tamanio());
	}

}
