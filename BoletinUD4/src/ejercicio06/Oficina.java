package ejercicio06;

public class Oficina {
	//Atributos
	private double precioMantenimientoCJoven = 0, precioMantenimientoCCorriente = 5.99, precioMantenimientoCEmpresa = 9.99; //Precios por defecto manteniemiento de cuentas.
	private double comisionCajeroCJoven = -1, comisionCajeroCCorriente = 0, comisionCajeroCEmpresa = 1; //Comisiones por usar cajero. NUMEROS NEGATIVOS: DAN DINERO AL USUARIO
	private Cliente[] clientes;
	
	//Constructor
	public Oficina(int clientesMaximos) {
		clientes = new Cliente[clientesMaximos];
	}
	
	//Getters y setters
	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
		
	public double getPrecioMantenimientoCJoven() {
		return precioMantenimientoCJoven;
	}

	public void setPrecioMantenimientoCJoven(double precioMantenimientoCJoven) {
		this.precioMantenimientoCJoven = precioMantenimientoCJoven;
	}

	public double getPrecioMantenimientoCCorriente() {
		return precioMantenimientoCCorriente;
	}

	public void setPrecioMantenimientoCCorriente(double precioMantenimientoCCorriente) {
		this.precioMantenimientoCCorriente = precioMantenimientoCCorriente;
	}

	public double getPrecioMantenimientoCEmpresa() {
		return precioMantenimientoCEmpresa;
	}

	public void setPrecioMantenimientoCEmpresa(double precioMantenimientoCEmpresa) {
		this.precioMantenimientoCEmpresa = precioMantenimientoCEmpresa;
	}

	public double getComisionCajeroCJoven() {
		return comisionCajeroCJoven;
	}

	public void setComisionCajeroCJoven(double comisionCajeroCJoven) {
		this.comisionCajeroCJoven = comisionCajeroCJoven;
	}

	public double getComisionCajeroCCorriente() {
		return comisionCajeroCCorriente;
	}

	public void setComisionCajeroCCorriente(double comisionCajeroCCorriente) {
		this.comisionCajeroCCorriente = comisionCajeroCCorriente;
	}

	public double getComisionCajeroCEmpresa() {
		return comisionCajeroCEmpresa;
	}

	public void setComisionCajeroCEmpresa(double comisionCajeroCEmpresa) {
		this.comisionCajeroCEmpresa = comisionCajeroCEmpresa;
	}

	//Metodos
	public void darAltaCliente (String nombre, String apellidos, String dni, String contrase??aCuenta, int totalTiposCuentas) {
		int UNO = 1;
		Cliente c = new Cliente(nombre, apellidos, dni, contrase??aCuenta, totalTiposCuentas);
		clientes[Cliente.numeroClientesGenerados - UNO] = c;
		
	}
	public boolean identificarCliente(String dni, String contrase??a) {
		boolean logueado = false;
		for (int i = 0; i < Cliente.numeroClientesGenerados; i++) {
			
			if (clientes[i].getDni().equals(dni)) {
				if (clientes[i].getContrase??aCuenta().equals(contrase??a)) {
					logueado = true;
				}
			}
		}
		return logueado;
	}
	
	public int conseguirNumeroCliente(String dni, String contrase??a) {
		int numeroCliente = 0;
		for (int i = 0; i < Cliente.numeroClientesGenerados; i++) {
			if (clientes[i].getDni() == dni) {
				numeroCliente =	clientes[i].getNumeroCliente();			
			}
		}
		return numeroCliente;
	}
	
	public void crearCuentaCliente(int numCliente, int tipoCuenta) {
		int CERO = 0;
		if (tipoCuenta == 1) {
			CuentaJoven c = new CuentaJoven(CERO, precioMantenimientoCJoven, comisionCajeroCJoven);
			clientes[numCliente].crearCuenta(c);
		}
		if (tipoCuenta == 2) {
			CuentaCorriente c = new CuentaCorriente (CERO, precioMantenimientoCCorriente, comisionCajeroCCorriente);
			clientes[numCliente].crearCuenta(c);
		}
		if (tipoCuenta == 3) {
			CuentaEmpresa c = new CuentaEmpresa (CERO, precioMantenimientoCEmpresa, comisionCajeroCEmpresa);
			clientes[numCliente].crearCuenta(c);
		}
	}
	/**
	 * Este metodo caga dinero con pies <em>Hola danno wapo</em>
	 * @see 
	 * @param 
	 */
	public void imprimirCuentasCliente(int numCliente) {
		clientes[numCliente].imprimirCuentas();
	}
	
	public void verSaldo(int numeroClienteArray, int numeroCuentaArray) {
		clientes[numeroClienteArray].verSaldo(numeroCuentaArray);
	}
	
	public double regresarSaldoCuenta(int numeroClienteArray, int numeroCuentaArray) {
		return clientes[numeroClienteArray].regresarSaldo(numeroCuentaArray);
	}
	
	public void ingresarDinero(int numeroClienteArray, int numeroCuentaArray, double cantidad) {
		clientes[numeroClienteArray].ingresarEnCuenta(numeroCuentaArray, cantidad);
	}
	
	public void retirarDinero(int numeroClienteArray, int numeroCuentaArray, double cantidad) {
		clientes[numeroClienteArray].retirarDeCuenta(numeroCuentaArray, cantidad);
	}
	
}
