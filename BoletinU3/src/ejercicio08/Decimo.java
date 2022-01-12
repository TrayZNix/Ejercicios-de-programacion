package ejercicio08;

import java.util.Random;

public class Decimo {
	//ATRIBUTOS
	private double precio;
	private int num;
	
	//CONSTRUCTOR
	public Decimo (double precio, int num) {
		this.precio = precio;
		this.num = num;
	}

	public Decimo() {
		// TODO Auto-generated constructor stub
	}

	//GETTERS Y SETTERS	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	//METODOS
	
	public int generarBoletoAleatorio() {
		int boletoAleatorio;
		Random aleatorio = new Random(System.nanoTime());
		boletoAleatorio = aleatorio.nextInt(99999-1)+1;
		return boletoAleatorio;
	}
	
}
