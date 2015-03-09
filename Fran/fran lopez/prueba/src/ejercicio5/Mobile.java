package ejercicio5;

public abstract class Mobile {
	
	private String marca, sistemaOperativo, modelo;
	private int costo;
	
	/*public static void mobile (){
		
		
		
	}
	*/
	
	public String getMarca(){
		return this.marca;
	}
	
	public String getSO(){
		return this.sistemaOperativo;
	}
	
	public String getModelo(){
		return this.modelo;
	}

	public int getCosto (){		
		return this.costo;
	}
	
	public void setMarca (String marca){
		this.marca = marca;
	}
	
	public void setSO (String so){
		this.sistemaOperativo = so;
	}
	
	public void setModelo (String mod){
		this.modelo = mod;
	}
	
	public void setCosto (int costo){
		this.costo = costo;
	}
	
	
	
	
	
	
	
	

}
