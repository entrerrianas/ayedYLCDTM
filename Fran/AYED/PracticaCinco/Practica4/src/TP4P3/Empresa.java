package TP4P3;

import tp4.ArbolGeneral;
import tp2.Cola;
import tp2.ListaEnlazadaGenerica;
import tp2.ListaGenerica;
import tp4.NodoGeneral;

public class Empresa {
	
	private ArbolGeneral<NodoGeneral<Empleado>> empleados = new ArbolGeneral<NodoGeneral<Empleado>>();
	//private int categorias = 10;
	
	public ListaEnlazadaGenerica<NodoGeneral<Empleado>> empleadosPorCategoria () 
	{
		Cola<NodoGeneral<Empleado>> cola = new Cola<NodoGeneral<Empleado>>();
		NodoGeneral<Empleado> emp = new NodoGeneral<Empleado>();
		ListaEnlazadaGenerica<NodoGeneral<Empleado>> listaQueSeDevuelve = new ListaEnlazadaGenerica<NodoGeneral<Empleado>>();
		ListaGenerica<ArbolGeneral<NodoGeneral<Empleado>>> listaAux = new ListaEnlazadaGenerica<ArbolGeneral<NodoGeneral<Empleado>>>();		
		
		cola.encolar(this.empleados.getDatoRaiz());
		while (!cola.esVacia())
		{
			emp = cola.desencolar();
			listaQueSeDevuelve.agregar(emp);
			listaAux = this.empleados.getHijos();
			listaAux.comenzar();
			while (listaAux.fin()){
				cola.encolar(listaAux.elemento().getDatoRaiz());
				listaAux.proximo();
			}
		}
		return listaQueSeDevuelve;
	}
	
	public int categoriaConMasEmpleados () 
	{
		return this.empleados.ancho();
	}
	
	public int cantidadTotalDeEmpleados()
	{
		ListaEnlazadaGenerica<NodoGeneral<Empleado>> lista = new ListaEnlazadaGenerica<NodoGeneral<Empleado>>();
		int cant = 0;
		
		lista = this.empleadosPorCategoria();
		lista.comenzar();
		while (!lista.fin()){
			cant++;
			lista.proximo();
		}
		return cant;
	}
	
	
	public void presidenteDejaSuFuncion ()
	{
		
	}
	
	
}
