package ejercicio01;

public class Tablet extends Ordenador {
	//Atributos
	private double precioSeguroPantalla;
	private double precioSeguroRobo;
	private double pesoKg;
	
	//Constructor
	public Tablet(String marca, String nombre, double frecuenciaCPU, double precioBase, int capacidadAlmacenamiento,
			double precioSeguroPantalla, double precioSeguroRobo, double pesoKg) {
		super(marca, nombre, frecuenciaCPU, precioBase, capacidadAlmacenamiento);
		this.precioSeguroPantalla = precioSeguroPantalla;
		this.precioSeguroRobo = precioSeguroRobo;
		this.pesoKg = pesoKg;
	}
	
	
}
