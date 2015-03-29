package ejercicio2;

public class HeapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Heap<Integer> H= new Heap<Integer>();
		H.agregar(2);
		H.agregar(3);
		H.agregar(4);
		H.agregar(6);
		H.agregar(7);
			
		
		for(int i=1; i<=H.getTamanio(); i++){
		  System.out.print(H.elemento(i)+" ");
		}
		//H.eliminar();
		//H.eliminar();
		H.bajarPrioridad(2, 8);
		
		
		
		System.out.println();
		for(int i=1; i<=H.getTamanio(); i++){
			  System.out.print(H.elemento(i)+" ");
			}

		
		
		
	/*	Integer[]a=new Integer[100];
		a[1]=4;
		a[2]=16;
		a[3]=1;
		a[4]=25;
		a[5]=2;
		a[6]=5;
		a[7]=33;
		
		for(int i=1; i<=7; i++){
			  System.out.print(a[i]+" ");
		}
		
		Heap<Integer> h= new Heap<Integer>(a);
		
		for(int i=1; i<=h.getTamanio(); i++){
			  System.out.print(h.elemento(i)+" ");
		}*/
		
		
		Heap<Integer> H= new Heap<Integer>();
		Heap<Integer> H2= new Heap<Integer>();
		H.agregar(2);
		H.agregar(3);
		H.agregar(4);
		H.agregar(6);
		H.agregar(7);
		H2.agregar(4);
		H2.agregar(3);
		H2.agregar(5);
		H2.agregar(9);
		H2.agregar(7);
		for(int i=1; i<=H.getTamanio(); i++){
			  System.out.print(H.elemento(i)+" ");
			}		
		System.out.println();
		for(int i=1; i<=H2.getTamanio(); i++){
				 System.out.print(H2.elemento(i)+" ");
		}
		
		//H.unionCon(H2);
		H.intersectarCon(H2);
		System.out.println();
		for(int i=1; i<=H.getTamanio(); i++){
			  System.out.print(H.elemento(i)+" ");
			}		
	}

	
	
}
