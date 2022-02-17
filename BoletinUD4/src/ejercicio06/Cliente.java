package ejercicio06;

public class Cliente {
	//Atributos
	private String nombre;
	private String apellidos;
	private String dni;
	private String contraseñaCuenta;
	private int numeroCliente;
	private Cuenta[] cuentas;
	static int numeroClientesGenerados;
	
	//Constructor
	public Cliente(String nombre, String apellidos, String dni, String contraseñaCuenta, int totalTiposCuentas) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.contraseñaCuenta = contraseñaCuenta;
		this.cuentas = new Cuenta[totalTiposCuentas];
		numeroClientesGenerados++;
		this.numeroCliente = numeroClientesGenerados;
	}
	
	//Getters y setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getContraseñaCuenta() {
		return contraseñaCuenta;
	}

	public void setContraseñaCuenta(String contraseñaCuenta) {
		this.contraseñaCuenta = contraseñaCuenta;
	}


	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	
	
	//Metodos
	public boolean checkearCuentaCreada() {
		boolean tieneCuenta = false;
			for (int i = 0; i < cuentas.length; i++) {
				if(cuentas[i] != null) {
					tieneCuenta = true;
				}
			}
		return tieneCuenta;
	}
	
	public int verNumeroCuentasCreadas() {
		int numCuentasCreadas = 0;
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] != null) numCuentasCreadas++;
		}
		return numCuentasCreadas;
	}
	
	public void crearCuenta(Cuenta c) {
		this.cuentas[verNumeroCuentasCreadas()] = c;
	}
	
	public void imprimirCuentas() {
		int puntero = 1;
		for (int i = 0; i < verNumeroCuentasCreadas(); i++) {
			System.out.println(puntero+". "+cuentas[i].toStringCuenta());	
			puntero++;
		}
	}
	
	public void verSaldo(int numCuenta) {
		numCuenta--;
		System.out.println("El saldo actual en esta cuenta es "+cuentas[numCuenta].getSaldoCuenta()+"€");
	}
	
	public double regresarSaldo(int numCuenta) {
		numCuenta--;
		return cuentas[numCuenta].getSaldoCuenta();
	}
	
	public void ingresarEnCuenta(int numCuenta, double cantidadDinero ) {
		numCuenta--;
		cuentas[numCuenta].ingresarDinero(cantidadDinero);
	}
	public void retirarDeCuenta(int numCuenta, double cantidadDinero ) {
		numCuenta--;
		cuentas[numCuenta].retirarDinero(cantidadDinero);
	}
	
	
}
