package testeo;

public class Circulo extends Figuras{
	//Atributos
	private double radio;
	
	//Constructor
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	//Getters y setters
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	//Metodos
	public double calcularPerimetro() {
		return getRadio()*2*Math.PI;
	}
	
	public double calcularArea() {
		int DOS = 2;
		return Math.PI*(Math.pow(getRadio(), DOS));
	}
	
	
}
