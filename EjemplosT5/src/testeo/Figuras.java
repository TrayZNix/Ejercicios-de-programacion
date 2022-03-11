package testeo;

public abstract class Figuras {
	private double ladoA;
	private double ladoB;
	private double radio;
	private double area;
	private double perimetro;
	
	//Constructor 
	public Figuras() {
		
	}
	//Getters y setters

	public double getLadoA() {
		return ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public double getRadio() {
		return radio;
	}

	public double getArea() {
		return area;
	}

	public double getPerimetro() {
		return perimetro;
	}
	//Métodos
	
	public double calcularArea;
	public double calcularPerimetro;
	
}
