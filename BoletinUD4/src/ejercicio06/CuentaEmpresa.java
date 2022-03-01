package ejercicio06;

public class CuentaEmpresa extends Cuenta{

	public CuentaEmpresa(double saldoCuenta, double precioMantenimiento, double comisionExtraccion) {
		super(saldoCuenta, precioMantenimiento, comisionExtraccion);
	}

	@Override
	public String toStringCuenta() {
		return "Cuenta de Empresa";
	}
	
	@Override
	public void ingresarDinero(double dinero) {
		this.saldoCuenta = this.saldoCuenta + dinero;
	}
	
	@Override
	public void retirarDinero(double dinero) {
		this.saldoCuenta = this.saldoCuenta - dinero - this.comisionExtraccion;
		
	} 

}
