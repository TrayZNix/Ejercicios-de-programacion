package ejercicio;

import java.util.Random;

public class Deposito {
	//Atributos
	private int idDeposito;
	private double radio;
	private double altura;
	private double volumenMax;
	private double precioCoste;
	static int numDeposito;
	static int capacidadTotal; //De cada deposito usando el volumen sin decimales
	
	//Constructor
	public Deposito(double radio, double altura, double precio) {
		this.radio = radio;
		this.altura = altura;
		this.precioCoste = precio/3;
		this.volumenMax = calcularVolumen(radio, altura);
		numDeposito++;
		this.idDeposito = numDeposito;
		capacidadTotal = capacidadTotal + (int) (Math.floor(this.volumenMax));
				
	}

	//Getters y setters
	public int getIdDeposito() {
		return idDeposito;
	}

	public void setIdDeposito(int idDeposito) {
		this.idDeposito = idDeposito;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getVolumen() {
		return volumenMax;
	}

	public void setVolumen(int volumen) {
		this.volumenMax = volumen;
	}

	public double getPrecioCoste() {
		return precioCoste;
	}

	public void setPrecioCoste(double precioCoste) {
		this.precioCoste = precioCoste;
	}

	public static int getNumDeposito() {
		return numDeposito;
	}

	public static void setNumDeposito(int numDeposito) {
		Deposito.numDeposito = numDeposito;
	}
	
	//Metodos
	
	public double calcularVolumen(double radio, double altura) {		
		return Math.floor(( Math.pow(radio, 2) * Math.PI * altura ));
		
	}
	
}
