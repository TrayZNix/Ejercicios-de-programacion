package ejercicio05;

public class EmpleadoAComision extends Empleado {
	//Atributos
	private double porcentajeIncentivo;

	
	//Constructor
	public EmpleadoAComision(String nombre, double sueldoBase, double dineroRecaudadoVentas, double porcentajeIncentivo) {
		super(nombre, sueldoBase, dineroRecaudadoVentas);
		this.porcentajeIncentivo = porcentajeIncentivo;
	}
	//Getters y setters


	public double getPorcentajeIncentivo() {
		return porcentajeIncentivo;
	}


	public void setPorcentajeIncentivo(double porcentajeIncentivo) {
		this.porcentajeIncentivo = porcentajeIncentivo;
	}


	@Override
	public String toString() {
		return "EmpleadoAComision [porcentajeIncentivo=" + porcentajeIncentivo + ", toString()=" + super.toString()
				+ "]";
	}


	/**
	 * Multiplica el sueldo base por un segundo numero determinado por el porcentaje de comisión.
	 * Por ejemplo, si el porcentaje es un 21%, se multiplica el sueldo base por 1.<strong>21</strong>, (Se suma 0.21 a uno).
	 */
	public void calcularSueldoFinal() {
		double UNO = 1, CIEN = 100;
		double SueldoBruto = (this.dineroRecaudadoVentas + this.sueldoBase);
		this.sueldoFinal = (SueldoBruto * (UNO + this.porcentajeIncentivo/CIEN));
	}


	
	
}
