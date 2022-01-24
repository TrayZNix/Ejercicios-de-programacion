package ejercicio05;

import java.util.Random;

import javax.management.StringValueExp;

public class Electrodomestico {
	//Atributos
	private double precioBase;
	private double precioFinal;
	private String color;
	private char consumoEnergetico;
	private double peso;
	private String electrodomestico;
	static String coloresDisponibles[] = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
	static char tiposConsumoEnergetico[] = {'A', 'B', 'C', 'D', 'E', 'F'};
	private double correspondenciaPrecios[] = {100, 80, 60, 50, 30, 10};
	
	Random r = new Random(System.nanoTime());
	
	//Constructor
	public Electrodomestico() {
		this.precioBase = 100;
		this.peso = 5;
		this.color = coloresDisponibles[generarAleatorio(4, 0)];
		this.consumoEnergetico = tiposConsumoEnergetico[generarAleatorio(5, 0)];
		comprobarConsumoEnergetico(this.consumoEnergetico);
		comprobarColor(this.color);
		precioFinal();
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
	//Getters y setters
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}
	
	
	//Metodos
	
	public int generarAleatorio(int maximo, int minimo) {
		int aleatorio;
		aleatorio = r.nextInt(maximo - minimo)+minimo;
		return aleatorio;
		
	}

	public void comprobarConsumoEnergetico(char consumoEnergetico) {
		if(this.consumoEnergetico != 'F') {
			this.consumoEnergetico = 'F';
			
		}
	}
	
	public void comprobarColor (String color) {
		if(this.color != "Blanco") {
			this.color = "Blanco";
		}
	}
	
	public void precioFinal() {
		for(int i = 0; i < tiposConsumoEnergetico.length; i++) {
			if(this.consumoEnergetico == tiposConsumoEnergetico[i]) {
				this.precioFinal = precioBase + correspondenciaPrecios [i];
			}
		}
		
	}
	
	public double precioFinal(char consumo) {
		double precio = 0;
		for(int i = 0; i < tiposConsumoEnergetico.length; i++) {
			if(consumo == tiposConsumoEnergetico[i]) {
				precio = precioBase + correspondenciaPrecios [i];
			}
		}
		return precio;
		
	}


	
	
	

}
