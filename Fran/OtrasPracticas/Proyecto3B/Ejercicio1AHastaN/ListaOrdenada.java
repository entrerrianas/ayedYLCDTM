package Ejercicio1AHastaN;

import Ejercicio1B.*;

public class ListaOrdenada extends ListaDeStrings {
	
	public void add(String elemento) {
		NodoDeStrings anterior = null,
		              actual = inicioLista,
		              nuevo = new NodoDeStrings(elemento);
		
		while ((actual != null) && (elemento.compareTo(actual.contenido()) > 0))
			{
				anterior = actual;
				actual = actual.siguiente();
			}
				
		nuevo.siguiente(actual);
		if (actual == inicioLista)
			inicioLista = nuevo;
		else
			anterior.siguiente(nuevo);
	}
	
	public void addFirst(String elemento) {
		super.add(elemento);
	}
	
	public void addLast(String elemento) {
		this.add(elemento);
	}

	public boolean equals(Object objeto){
		try{
			return this.equals((ListaOrdenada) objeto);
		}
		catch (ClassCastException e) {
		return false;
		}
	}	
	
	public boolean equals(ListaOrdenada auxiliar){
		//if (this.getClass().equals(objeto.getClass()))
		{
//			ListaOrdenada auxiliar = (ListaOrdenada) objeto;
			if (auxiliar.size() == this.size())
			{
				this.begin();
				auxiliar.begin();
				
				while (!(auxiliar.end()) &&
					   (this.getCurrent().contenido() == auxiliar.getCurrent().contenido()))
				{
					this.next();
					auxiliar.next();
				}
				
				return auxiliar.end();
			}
			else
				return false;
		}
		else
			return false;
	}
	
	
}
