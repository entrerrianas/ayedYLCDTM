package ejercicio3;

import colaGenerica.ColaGenerica;
import arbolGeneral.ArbolGeneral;
import arbolGeneral.NodoGeneral;
import listasGenericas.ListaEnlazadaGenerica; 
import listasGenericas.ListaGenerica;

public class Empresa {
		private ArbolGeneral<Empleado> empleado;
	
	public Empresa (Empleado emp){
		this.empleado = new ArbolGeneral<Empleado>();
	}
	
	public ListaGenerica<ArbolGeneral<Empleado>> getEmpleados(){
		return this.empleado.getHijos();
	}
		
	public int[] empleadosPorCategoria(){
		
		int epc[] = new int[10] ;
		
		for(int i = 1; i <= 10; i++){
			epc[i] = 0;
		}
		
		this.empleado.getHijos().comenzar();
		while(!this.empleado.getHijos().fin()){
			epc[this.empleado.getHijos().elemento().getDatoRaiz().getCategoria()] += 1;
		}					
		return epc;
	}
	
	public int categoriaConMasEmpleados(){
		int max = -1;
		int epc[] = new int[10] ;
		
		epc = empleadosPorCategoria();
		
		for (int i = 1; i <= epc.length; i++ ){
			if (max < epc[i]){
				max = epc[i];
			}
		}
		return max;
	}
	
	public int cantidadTotalEmpleados(){
		return this.empleado.getHijos().tamanio();
	}
	
	public ArbolGeneral<Empleado> obtenerSucesor(int categoria){
		ArbolGeneral<Empleado> emp = new ArbolGeneral<Empleado>();
		int antiguedad = -1;
		ListaGenerica<ArbolGeneral<Empleado>> lista = new ListaEnlazadaGenerica<ArbolGeneral<Empleado>>();
		while (!this.empleado.getHijos().fin()){
			if (this.empleado.getHijos().elemento().getDatoRaiz().getCategoria() == categoria){
				lista.agregarInicio(this.empleado.getHijos().elemento());
			}
			this.empleado.getHijos().proximo();
		}
		
		lista.comenzar();
		while (!lista.fin()){
			if (antiguedad < lista.elemento().getDatoRaiz().getAntiguedad()){
				emp = lista.elemento();
			}
			lista.proximo();
		}
		
		return emp;
	}
	public void reemplazarPresidente(){
		ArbolGeneral<Empleado> sucesor = obtenerSucesor(2);
		this.empleado = sucesor;			
	}
	
	public void QempleadosCategoria (){
		
		ColaGenerica<ArbolGeneral<Empleado>> cola = new ColaGenerica<ArbolGeneral<Empleado>>();
		cola.poner(this.empleado);
		cola.poner(null);
		int cat = 2;
		while (!cola.esVacia()){
			ArbolGeneral<Empleado> act = cola.sacar();
			if (act != null){
				int q = 0;
				act.getHijos().comenzar();
				while(!act.getHijos().fin()){
					q++;
					cola.poner(act.getHijos().elemento());
					act.getHijos().proximo();					
				}
			} else {
				if (!cola.esVacia()){
					cola.poner(null);
					cat++;
				}																
			}
		}
		
	}

}
