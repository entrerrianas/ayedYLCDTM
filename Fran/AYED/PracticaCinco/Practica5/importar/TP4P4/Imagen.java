package TP4P4;

// LA DIMENSIÓN DE LA IMAGEN TIENE QUE SER MULTIPLO DE 4
import tp4.ArbolGeneral;
import tp4.NodoGeneral;
import tp2.ListaEnlazadaGenerica;
import tp2.ListaGenerica;

public class Imagen {
	
	private boolean imagen[][];
	private int y;
	private int x;
	
	public Imagen(int dim)
	{
		this.x = dim;
		this.y = dim;
		this.imagen=new boolean[dim][dim];
	}
	
	public Imagen (Imagen img, int dim)
	{
		//
	}

	private void set(int fila, int columna)
	{
		this.imagen[fila][columna] = true;
	}
	
	private boolean get (int fila, int columna)
	{
		return this.imagen[fila][columna];
	}
	
	private int dimension ()
	{
		return this.x;
	}
	
	private boolean igualColor (boolean value)
	{
		int x = 1;
		int y = 1;
		while ((y <= this.y) && (value == get(y,x)))
		{
			x = 1;
			while ((x <= this.x) && (value == this.imagen[x][y]))
			{
				x++;
			}
			y++;
		}
		return !(y <= this.y);
	}
	
	public ListaEnlazadaGenerica<Imagen> dividirEnSubImagenes()
	{
		ListaEnlazadaGenerica<Imagen> listaDeImagenes = new ListaEnlazadaGenerica<Imagen>();
		Imagen img1 = new Imagen(this.x/4);
		Imagen img2 = new Imagen(this.x/4);
		Imagen img3 = new Imagen(this.x/4);
		Imagen img4 = new Imagen(this.x/4);
		
		listaDeImagenes.agregar(img1);
		listaDeImagenes.agregar(img2);
		listaDeImagenes.agregar(img3);
		listaDeImagenes.agregar(img4);
		
		return listaDeImagenes;
	}
	
	public ArbolGeneral<Boolean> comprimirImagen()
	{
		ArbolGeneral<Boolean> arbol;
		// SI ES NEGRA O BLANCA
		if (this.igualColor(false) || (this.igualColor(true))){
			if (this.igualColor(false)){
				arbol = new ArbolGeneral<Boolean>(false);
			} else {
				arbol = new ArbolGeneral<Boolean>(true);
			}
			return arbol;
		} else {
			ListaEnlazadaGenerica<Imagen> listaDeImagenes = new ListaEnlazadaGenerica<Imagen>();
			listaDeImagenes = this.dividirEnSubImagenes();
			listaDeImagenes.comenzar();
			while (!listaDeImagenes.fin()){
				listaDeImagenes.elemento().comprimirImagen();
				listaDeImagenes.proximo();
			}
		}
	}
	
	
	
}
