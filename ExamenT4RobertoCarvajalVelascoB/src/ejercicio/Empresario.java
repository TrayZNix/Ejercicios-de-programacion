package ejercicio;

public class Empresario extends Visitante {
	//Atributos
	private String nombreEmpresa;
	private double dineroAporta;
	
	//Constructor
	public Empresario(String nombre, double precioBaseEntrada, int edad, String nombreEmpresa,
			double dineroAporta) {
		super(nombre, precioBaseEntrada, edad);
		this.nombreEmpresa = nombreEmpresa;
		this.dineroAporta = dineroAporta;
	}
	//Getters setters y toString

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public double getDineroAporta() {
		return dineroAporta;
	}

	public void setDineroAporta(double dineroAporta) {
		this.dineroAporta = dineroAporta;
	}

	@Override
	public String toString() {
		return "Empresario ["+super.toString() + nombreEmpresa + ", dineroAporta=" + dineroAporta + "]";
	}

	
	//Métodos
	public double calcularPrecioEntrada(double descuento) {
		int UNO = 1, CIEN = 100;
		double precioEntrada = 0;
		precioEntrada = super.calcularPrecioEntrada();
		if(this.dineroAporta > CIEN) {
			precioEntrada = precioEntrada * (UNO - (descuento/CIEN));
		}
		return precioEntrada;
	}
	public double calcularPrecioEntrada(double descuento, double precioBaseEntrada) {
		int UNO = 1, CIEN = 100;
		double precioEntrada = precioBaseEntrada;
		precioEntrada = super.calcularPrecioEntrada();
		if(this.dineroAporta > CIEN) {
			precioEntrada = precioEntrada * (UNO - (descuento/CIEN));
		}
		return precioEntrada;
	}
	
	public void invitarCafe() {
		System.out.println("¡Visitante de consumición gratis!");
	}
	
	
	
	
	
	
	
	
	
	
	

}
