package tp03.ejercicio6;

import arbolBinario.ArbolBinario;

public class ColaGenerica<T> {
	
	ListaEnlazadaGenerica<T> datos = new ListaEnlazadaGenerica<T>();
	
	
	public ColaGenerica(){
		datos = new ListaEnlazadaGenerica<T>();
	}  
	
	public boolean encolar(T d){		
		return this.datos.agregarFinal(d);
		
	}
	
	public T tope (){
		return this.datos.elemento(0);
	}
	
	public T desencolar(){
		T elem = this.datos.elemento(1);		
		this.datos.eliminar(1);
		return elem;
	}
	
	public boolean esVacia(){
		return this.datos.esVacia();
	}
	
	public double qHojas(){
		double q = 0;
		int pos = 1;
		while (!this.datos.esVacia()){
			if (this.datos.elemento(pos) != null){
				q++;
			}
			pos++;
		}
		return q;		
	}	
	
	
	public void imprimir(){
		while (!this.datos.fin()){			
			System.out.print(this.datos.elemento(this.datos.tamanio()).toString());
			this.datos.proximo();
		}
	}
	public void imprimir2(){
		int i = 1;
		while (i <= this.datos.tamanio()){
			if (this.datos.elemento(i) != null){
				System.out.println(this.datos.elemento(i).toString());
			} else {
				System.out.println("este es null!!!");
			}
			i++;
		}
	}	
	
	public int desencolarResto(){
		int q = 0;
		while (!this.esVacia()){
			ArbolBinario<T> arb = new ArbolBinario<T>(this.desencolar());
			System.out.print("Elemento = " + arb.getDatoRaiz() + " \n ");
			if (arb.getDatoRaiz() != null) {
				q++;
			} else {
				System.out.println("aca esta el null");
			}
		}
		return q;
	}
	
	public int tamanio(){
		return this.datos.tamanio();
	}
	
	
	public static void main (String [] args){
		
		
		// PRUEBA DE COLA GENERICA
		ColaGenerica<Integer> cola = new ColaGenerica<Integer>();
		
		Integer a = new Integer(1);
		Integer b = new Integer(2);
		Integer c = new Integer(3);
		Integer d = new Integer(4);
		
		if (cola.encolar(a)){
			if (cola.encolar(b)){
				if (cola.encolar(c)){
					if (cola.encolar(d)){
						System.out.println("Inseto todos");
					} else {
						System.out.println("Fallo en d");
					}
				} else {
					System.out.println("Fallo en c");
				}				
			} else {
				System.out.println("Fallo en b");
			}			
		} else {
			System.out.println("Fallo en a");
		}
		
		cola.imprimir();		
		
		while (!cola.esVacia()){
			System.out.print(cola.desencolar().toString());
		}
		
		System.out.println(" \n Tamanio => " + cola.datos.tamanio());		
	}	
}
