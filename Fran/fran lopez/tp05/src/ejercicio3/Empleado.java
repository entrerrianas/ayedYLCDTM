package ejercicio3;

import listasGenericas.ListaEnlazadaGenerica;
import listasGenericas.ListaGenerica;

public class Empleado {
    
    private String nombre;
    private int ant;
    private int cat;
    //private ListaGenerica<Empleado> listaHijos;
    
    public Empleado (){
    	this.nombre = "";
    	this.ant = 0;
    	this.cat = 0;
    	//listaHijos = new ListaEnlazadaGenerica<Empleado>();
    }
    
    public Empleado (String nom, int ant, int cat){
        this.nombre = nom;
        this.ant = ant;
        this.cat = cat;
      //  listaHijos = new ListaEnlazadaGenerica<Empleado>();
    }
    
    /*
    public ListaGenerica<Empleado> getHijos(){

        return this.listaHijos;
    }
   */
    public int getAntiguedad(){
    	return this.ant;
    }
    
    public int getCategoria(){
    	return this.cat;
    }
    
    /*
    public void setListaHijos(ListaGenerica<Empleado> lista){

        this.listaHijos = lista;
    }    
    */

}
