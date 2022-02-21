package ejercicio;

public class Familiar extends Visitante {
	//Atributos
	private int numHijosCentro;

	
	//Constructor
	public Familiar(String nombre, double precioBaseEntrada, int edad, int numHijosCentro) {
		super(nombre, precioBaseEntrada, edad);
		this.numHijosCentro = numHijosCentro;
	}


	//Getters, setters y toString
	public int getNumHijosCentro() {
		return numHijosCentro;
	}


	public void setNumHijosCentro(int numHijosCentro) {
		this.numHijosCentro = numHijosCentro;
	}


	@Override
	public String toString() {
		return "Familiar ["+super.toString()+"numHijosCentro=" + numHijosCentro + "]";
	}


	
	//Métodos
	public double calcularPrecioEntrada(double eurosPorHijo) { 
		int CERO = 0;						
		double precioEntrada = 0;
		precioEntrada = (super.calcularPrecioEntrada()-(this.numHijosCentro*eurosPorHijo));
		if (precioEntrada < CERO) {
			precioEntrada = CERO;
		}
		return precioEntrada;
	}
	public double calcularPrecioEntrada(int numHijos, double eurosPorHijo, double precioEntrada) { 
		int CERO = 0;
		precioEntrada = (precioEntrada-(numHijos*eurosPorHijo));
		if (precioEntrada < CERO) {
			precioEntrada = CERO;
		}
		return precioEntrada;
	}
	
	
	
	
	

}
