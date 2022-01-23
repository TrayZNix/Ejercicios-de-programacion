package ejercicio06;

import java.util.Random;

public class Entrada {
	//Atributos
	static int entradasCreadas;
	private static double precio;
	private int idEntrada;
	private int numFila;
	private int numButaca;
	static boolean[][] butacasOcupadas = new boolean[2][5];
	
	Random r = new Random(System.nanoTime());
	
	//Constructor
	public Entrada( int fila, int butaca) {
		this.numButaca = butaca;
		this.numFila = fila;
		entradasCreadas++;
		idEntrada = entradasCreadas;
		butacasOcupadas[fila][butaca] = true;
	}

	//Getters y setters
	public int getIdEntrada() {
		return idEntrada;
	}

	public void setIdEntrada(int idEntrada) {
		this.idEntrada = idEntrada;
	}

	public static double getPrecio() {
		return precio;
	}

	public static void setPrecio(double precioNuevo) {
		precio = precioNuevo;
	}

	public int getNumFila() {
		return numFila;
	}

	public void setNumFila(int numFila) {
		this.numFila = numFila;
	}

	public int getNumButaca() {
		return numButaca;
	}

	public void setNumButaca(int numButaca) {
		this.numButaca = numButaca;
	}

	public static int getEntradasCreadas() {
		return entradasCreadas;
	}

	public static void setEntradasCreadas(int entradasCreadas) {
		Entrada.entradasCreadas = entradasCreadas;
	}
	
	//Metodos
	
	
}
