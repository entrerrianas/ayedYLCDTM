package ejercicio1;

public class ListaDeEnterosConArreglos extends ListaDeEnteros {

	private Integer[]datos;//=new Integer[500];;
	private Integer actual=0;
	private Integer tamLogico=0;
	
  public ListaDeEnterosConArreglos(){
		this(500);
	}
	
	public ListaDeEnterosConArreglos(int n){
		datos=new Integer[n];
		this.tamanio=n;
	}
	
	public void comenzar(){
		actual=0;
	}
	
	public void proximo(){
		if(actual<tamanio()){
				actual++;
			}
	}
	
	public boolean fin(){
		return actual==tamanio();
	}
	
	public Integer elemento(){
		return datos[actual];
	}
	
	public Integer elemento(Integer pos){
		return datos[pos];
	}
	
	public boolean agregar(Integer elem){
		if(tamanio==tamLogico){
			return false;
		}
		datos[actual]=elem;
		tamLogico ++;
		return true;
	}
	
	public boolean agregar (Integer elem, Integer pos){
		//si el tamlogico es < al fisico, la pos es posistiva y < al logico
		if((tamanio()<tamanio)&&(pos<=tamanio())&&(pos>=0)){
			for (int i=tamLogico-1; i>=pos; i--) datos[i+1]=datos[i];
			datos[pos]= elem;
			tamLogico++;	
			return true;
		}	
		return false;
	}
	
	public boolean eliminar(){
		if(actual<tamLogico){
			//coorimiento a izq
			for (int i= actual; i<tamLogico-1; i++){
				datos[i]=datos[i+1];
			}
			tamLogico--;
			return true;
		}
		return false;
	}
	
	public boolean eliminar(Integer pos) {		
		if((pos<tamanio())&&(tamanio()>0)){
			for(int i=pos; i<tamLogico; i++) datos[i]=datos[i+1];
			tamLogico=tamLogico-1;
			 return true;
		}
		return false;
	 }
	
	
	public boolean esVacia(){
		return tamLogico==0;
	}
	
	public boolean incluye (Integer elem){
		boolean ok=false;
		int i=0;
		while((i<tamLogico)&&(!ok)){
			if(datos[i]==elem){ok=true;}
			i++;
		}
		return ok;
	}
	
	public int tamanio(){
		return this.tamLogico;
	}
	

}
