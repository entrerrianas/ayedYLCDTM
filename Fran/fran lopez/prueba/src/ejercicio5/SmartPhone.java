package ejercicio5;

public class SmartPhone extends Mobile {
	
	int numero;
	
	/*public static void smartphone (){
		
	}*/
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int num){
		this.numero = num;
	}
	
	public boolean equals(SmartPhone sp){
		
		boolean ok = false;
		
		if (sp.getCosto() == this.getCosto()){
			if (sp.getMarca() == this.getMarca()){
				if (sp.getModelo() == this.getModelo()){
					if (sp.getNumero() == this.getNumero()){
						if (sp.getSO() == this.getSO()){
							ok = true;
						}
					}
				}
				
			}
		}
		return ok;
	}
			

	public String toString(){
			return "Marca: " + this.getMarca()+" \n "+" SO: "+this.getSO() + " \n " + " Modelo: " + this.getModelo() + " \n " + " Costo:  " + this.getCosto() + " \n  " + " Numero:  "+ this.getNumero();		
	}
	
}
