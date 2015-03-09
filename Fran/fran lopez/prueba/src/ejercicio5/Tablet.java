package ejercicio5;

public class Tablet extends Mobile {
	
	int pulgadas;
	
	/*public static void tablet(){
		
	}*/
	
	public int getPulgadas (){
		return this.pulgadas;
	}
	
	public void setPulgadas(int pul){
		this.pulgadas = pul;
	}
	
	public boolean equals(Tablet t){
				
		return this.equals(t);
	}
	
	public String toString (){
		return "Marca: " + this.getMarca()+" \n "+" SO: "+this.getSO() + " \n " + " Modelo: " + this.getModelo() + " \n " + " Costo:  " + this.getCosto() + " \n  " + " Pulgadas:  "+ this.getPulgadas();		
	}

}
