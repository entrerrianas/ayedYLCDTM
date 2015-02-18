package ejercicio2;


public class Heap<T extends Comparable<T>> {
	int cantElementos;
	T []datos;


	public Heap() {
		cantElementos=0;
		datos= (T[])new Comparable[500];
		
	}
	
	public Heap(ListaGenerica<T> lista){
		cantElementos=0;
		datos= (T[])new Comparable[500];
		 
		if(lista.tamanio()!=0){
			lista.comenzar();
			while(!lista.fin()){
				this.agregar(lista.elemento());
				lista.proximo();
			}
		}
	}
	
	public Heap(T[]datos){
		this();
		for (int i=1; i<=datos.length; i++){
			this.agregar(datos[i]);
		}
	}
	
	public boolean esVacia(){
		return this.cantElementos==0;
	}
	
	public boolean agregar(T dato){
		cantElementos++;
		datos[this.cantElementos]=dato;
		
		int n= this.cantElementos;
		//filtrado hacia arriba PERCOLATE UP
		while((n/2>0)&&(this.datos[n/2].compareTo(dato)>0)){//mientras tiene padre y el padre es mayor al dato
			this.datos[n]=this.datos[n/2];
			n=n/2;
		}
		this.datos[n]=dato;
		return true;
	}
	
	public T eliminar(){
		if(!this.esVacia()){
			datos[0]=datos[1];
			int n=1;
			boolean ok= false;
			datos[1]= datos[this.cantElementos]; //reemplazo la raiz por el ultimo dato de la heap
			cantElementos--;
			
			while((n*2<=this.cantElementos)&&(!ok)){ //si tiene hijos y la heap no esta ordenada
				int h_min= 2*n;  //miro el hijo izquierdo
				if(h_min<=this.cantElementos){ //si no es el ultmio nodo de la heap
					if(this.datos[h_min+1].compareTo(this.datos[h_min])<0){//si el hijo derecho es menor al iquierdo
						h_min=h_min+1;
						//System.out.println(h_min);
					}
					//System.out.println(h_min+1+" --- "+this.datos[h_min+1]);
					if(this.datos[n].compareTo(this.datos[h_min])>0){
						T aux= datos[n];
						this.datos[n]=this.datos[h_min];
						this.datos[h_min]=aux;
						n=h_min;
					}else ok=true;
					
				}
			}
			
			
			return datos[0];
		}	
		
		return null;
	}
	
	public T minimo(){
		return this.datos[1];
	}
	
	public int getTamanio(){
		return this.cantElementos;
	}
	
	public T elemento(int pos){
		return this.datos[pos];
	}
	
	public void bajarPrioridad(int pos, T inc){
		int n=pos;
		boolean ok=false;
		this.datos[pos]=inc;
		
		while((n*2<=this.cantElementos)&&(!ok)){
			int h_min= n*2;
			if((n*2<=this.cantElementos)){//hay mas elementos en la heap
				 if(this.datos[h_min+1].compareTo(this.datos[h_min])<0)
				 {h_min=h_min+1;}//el derecho es el minimo
				 
				 if(this.datos[n].compareTo(this.datos[h_min])>0){
					 T aux= this.datos[n];
					 this.datos[n]=this.datos[h_min];
					 this.datos[h_min]=aux;
					 n=h_min;
				 }else ok=true;
			}
		}
	}
	
	public boolean incluye(T elemen){
		if(!this.esVacia()){
			int i=1;
			boolean ok=false;
			while((i<=this.getTamanio())&&(!ok)){
			   if(this.datos[i].compareTo(elemen)==0){ok=true;}
			   i++;
			}
			return ok;
		}
		return false;
	}
	
	public Heap<T> unionCon(Heap<T> OtraHeap){
		if(!OtraHeap.esVacia()){
			while(!OtraHeap.esVacia()){
				T dato=OtraHeap.eliminar();
				if(!this.incluye(dato)){
					this.agregar(dato);
				}
			}
		}
		return this;
	}
	
	public Heap<T> intersectarCon(Heap<T> OtraHeap){
		
		if(!OtraHeap.esVacia()){
			Heap<T> aux=new Heap<T>();
			while(!OtraHeap.esVacia()){
				T dato=OtraHeap.eliminar();
				if(this.incluye(dato)){
					aux.agregar(dato);
				}
			}
			this.datos=aux.datos;
			this.cantElementos=aux.cantElementos;
		}
		
		return null;
	}
	

}
