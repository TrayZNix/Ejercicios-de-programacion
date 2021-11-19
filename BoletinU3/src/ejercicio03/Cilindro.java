package ejercicio03;

public class Cilindro {
	//Atributos
	private double radio;
	private double altura;
	
	//Constructor
	
	public Cilindro (double radio, double altura){
		this.radio= radio;
		this.altura= altura;
	}
	public Cilindro () {
		
	}
	
	//GETTERS y SETTERS
	public double getRadio () {
		return radio;
	}
	public void  setRadio (double radio) {
		this.radio=radio;
	}
	public double getAltura () {
		return altura;
	}
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	//MÉTODOS
	public double calcularVolumenCilindroCM () {
		double result;
		result=Math.PI*radio*radio*altura;
		return result;
	}
}
