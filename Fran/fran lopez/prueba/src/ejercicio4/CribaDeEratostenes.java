package ejercicio4;

import ejercicio1.*; 

public class CribaDeEratostenes {

		public ListaDeEnterosEnlazada obtenerPrimos (ListaDeEnterosEnlazada lista){
			ListaDeEnterosEnlazada lp = new ListaDeEnterosEnlazada();
			ListaDeEnterosEnlazada no_tachados = new ListaDeEnterosEnlazada();
			ListaDeEnterosEnlazada tachados = new ListaDeEnterosEnlazada();
			int n = lista.tamanio();
			
			no_tachados = lista;
			Integer i = 0;
			
			// PRIMERO TACHO LOS MULTIPLOS DE 2
			no_tachados.comenzar();
			while (no_tachados.tamanio() <= i ){				
				if ((no_tachados.elemento(i)%2) == 0){					
					no_tachados.eliminar(no_tachados.elemento(i));					
				}
				i++;				
			}
			
			/*
			
			// SIGO CON TODOS LOS NUMEROS QUE NO SE TACHARON			
			no_tachados.comenzar();
			i = 0;
			int num = anterior_al_tachado(no_tachados, i);
			num = no_tachados.elemento(i);
			eliminar_no_primos(no_tachados, num, i);
			
			/*
			 * 
			 */
			
			lp = no_tachados;
			return lp;
		}
		
		private int anterior_al_tachado(ListaDeEnterosEnlazada l, Integer i){
			while (l.tamanio() <= i && l.elemento(i)){
				i++;
			}						
			return l.elemento(i);
		}
		
		private void eliminar_no_primos(ListaDeEnterosEnlazada l, int num, Integer i){
			
			while (l.tamanio() <= i ){				
				if ((l.elemento(i)%num) == 0){					
					l.eliminar(l.elemento(i));					
				}
				i++;				
			}						
		}
	
}
