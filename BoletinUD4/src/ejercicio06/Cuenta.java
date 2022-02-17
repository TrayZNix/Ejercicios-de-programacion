package ejercicio06;

public abstract class Cuenta {
	//Atributos
	public double saldoCuenta;
	public double precioMantenimiento;
	public double comisionExtraccion;
	//Constructor	
	public Cuenta(double saldoCuenta, double precioMantenimiento, double comisionExtraccion) {
		this.saldoCuenta = saldoCuenta;
		this.precioMantenimiento = precioMantenimiento;
		this.comisionExtraccion = comisionExtraccion;
	}
	//Getters y setters
	
	public double getSaldoCuenta() {
		return saldoCuenta;
	}
	
	
	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	
	
	public double getPrecioMantenimiento() {
		return precioMantenimiento;
	}
	
	
	public void setPrecioMantenimiento(double precioMantenimiento) {
		this.precioMantenimiento = precioMantenimiento;
	}
	
	
	public double getComisionExtraccion() {
		return comisionExtraccion;
	}
	
	
	public void setComisionExtraccion(double comisionExtraccion) {
		this.comisionExtraccion = comisionExtraccion;
	}
	
	
	@Override
	public String toString() {
		return "Cuenta [saldoCuenta=" + saldoCuenta + ", precioMantenimiento=" + precioMantenimiento
				+ ", comisionExtraccion=" + comisionExtraccion + "]";
	}

	public abstract String toStringCuenta() ;
	
	//Metodos
	public void ingresarDinero(double dinero) {
		this.saldoCuenta = this.saldoCuenta + dinero;
	}
	
	public void retirarDinero(double dinero) {
		this.saldoCuenta = this.saldoCuenta - dinero;
	}
	
	


}
