/*********************************************************
* Archivo:     Colas.java
* Lenguaje:    Java
* Estudiantes: Qaser Awan Ruiz
* Institución: Instituto Tecnológico de Costa Rica
* Notas:
*				-Restricciones:
*					No me hago responsable del uso que le den
*					a los algoritmos.
*
*        		-Observaciones:
*		  			El prototipo del trabajo fue brindado
*					en el curso de estructuras de datos.
*********************************************************/

//Definicion de la clase cola arreglo
class ColaArreglo{
	Object[] ArregloCola;
	int frente=0,fondo=0,Num_elem;
	int Cant_elem=5;
	
	//Constructor
	ColaArreglo(){
		ArregloCola=new Object[Cant_elem];
		frente=0;
		fondo=-1;
		Num_elem=0;
	}
	
	//Encola un elemento
	public void Encolar(Object x){
		if(fondo==-1){
			fondo++;
			ArregloCola[fondo]=x;
		}
		else{
			fondo++;
			if(fondo==Cant_elem)
				System.out.println("No hay campo");
			else
				ArregloCola[fondo]=x;
			}
	}
	
	//Desencola un elemento
	public void Desencolar(){
		if(VaciaCola())
			System.out.println("No hay Elementos");
		else{
			
			for(int i=frente;i<fondo; i++){
				ArregloCola[i]=ArregloCola[i+1];
			}
			ArregloCola[fondo]=null;
			
			fondo--;
		}
	}
	
	//Retorna si esta vacia la cola
	public boolean VaciaCola(){
		return (fondo<frente);
	}
	
	//Imprime al cola
	public void Imprimir(){
		int i=0;
		System.out.print("La Cola es: ");
		while(i<ArregloCola.length){
			System.out.print(ArregloCola[i]+" ");
			i++;  
		}
		System.out.println("");
		System.out.println("");
	}
}

class ColasA{
	public static void main(String[]args){
		ColaArreglo nuevo=new ColaArreglo();
		nuevo.Encolar("9");
		nuevo.Encolar("10");
		nuevo.Encolar("11");
		nuevo.Encolar("12");
		nuevo.Encolar("13");
		nuevo.Desencolar();
		nuevo.Encolar("1133");
		nuevo.Imprimir();
    }
}
		