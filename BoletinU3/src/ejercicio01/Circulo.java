package ejercicio01;

public class Circulo {
	//Atributos
	
	private double radio;
	
	//Constructores
	public Circulo (double radio) {
		this.radio=radio;
	}
	public Circulo () {
		
	}
	
	//Getters and setters
	
	public double getRadio () {
		return radio;
	}
	public void setRadio (double radio) {
		this.radio=radio;
	}
	
	//Métodos
	public double calcularAreaCirculoCM () {
		
		return Math.PI*(radio*radio);
	}
	public double calcularAreaCirculoM () {
		
		return Math.PI*(radio*radio/100);
	}
}
