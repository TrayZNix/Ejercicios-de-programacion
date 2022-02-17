package ejercicio06;

public class CuentaCorriente extends Cuenta{
	//Atributos
	private int puntos;
	//Costructor
	public CuentaCorriente(double saldoCuenta, double precioMantenimiento, double comisionExtraccion) {
		super(saldoCuenta, precioMantenimiento, comisionExtraccion);
	}
	

	@Override
	public String toStringCuenta() {
		return "Cuenta corriente ";
	}
	
	@Override
	public void ingresarDinero(double dinero) {
		this.puntos = this.puntos++;
		this.saldoCuenta = this.saldoCuenta + dinero;
	}
	
	@Override
	public void retirarDinero(double dinero) {
		this.puntos = this.puntos++;
		this.saldoCuenta = this.saldoCuenta - dinero - this.comisionExtraccion;
	}
	
	

}
