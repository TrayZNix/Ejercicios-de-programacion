package testeo;

public class Circulo extends Figuras{
	//Atributos
	private double radio;
	//Constructor
	public Circulo() {
		
	}
	
	//Getters y setters

	//Metodos
	public double calcularPerimetro() {
		return getRadio()*2*Math.PI;
	}
	
	public double calcularArea() {
		int DOS = 2;
		return Math.PI*(Math.pow(getRadio(), DOS));
	}
	
	
}
