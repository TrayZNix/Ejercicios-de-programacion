package ejercicio05;

public class EmpleadoFijo extends Empleado {
	
	//Atributos
	private double porcentajeImpuestos; //Porcentaje del sueldo total que debemos quitar como "impuestos"
	

	//Constructor
	public EmpleadoFijo(String nombre, double sueldoBase, double dineroRecaudadoVentas, double porcentajeImpuestos) {
		super(nombre, sueldoBase, dineroRecaudadoVentas);
		this.porcentajeImpuestos = porcentajeImpuestos;
	
	}
	
	//Getters y setters

	public double getPorcentajeImpuestos() {
		return porcentajeImpuestos;
	}

	public void setPorcentajeImpuestos(double porcentajeImpuestos) {
		this.porcentajeImpuestos = porcentajeImpuestos;
	}

	//ToString
	@Override
	public String toString() {
		return "EmpleadoFijo [porcentajeImpuestos=" + porcentajeImpuestos + ", toString()=" + super.toString() + "]";
	}
	
	//Metodos
	
	/**
	 * Multiplica la suma del sueldo base y el dinero recaudado por un segundo numero determinado por el porcentaje de impuestos.
	 * Por ejemplo, si el porcentaje es un 21%, se multiplica el sueldo base por 0.<strong>79</strong>. (Se resta a 1, 0.21).
	 */
	public void calcularSueldoFinal() {
		double UNO = 1, CIEN = 100;
		double SueldoBruto = (this.dineroRecaudadoVentas + this.sueldoBase);
		this.sueldoFinal = SueldoBruto * (UNO - (this.porcentajeImpuestos/CIEN)); 
	}
	
	
}
