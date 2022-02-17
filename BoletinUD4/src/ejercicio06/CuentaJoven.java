package ejercicio06;

public class CuentaJoven extends Cuenta{

	public CuentaJoven(double saldoCuenta, double precioMantenimiento, double comisionExtraccion) {
		super(saldoCuenta, precioMantenimiento, comisionExtraccion);
	}

	@Override
	public String toStringCuenta() {
		return "Cuenta Joven";
	}
	
	@Override
	public void ingresarDinero(double dinero) {
		int recompensaIngreso = 1;
		this.saldoCuenta = this.saldoCuenta + dinero + recompensaIngreso;
	}
	
	@Override
	public void retirarDinero(double dinero) {
		this.saldoCuenta = this.saldoCuenta - dinero - this.comisionExtraccion;
	}
	
	

}
