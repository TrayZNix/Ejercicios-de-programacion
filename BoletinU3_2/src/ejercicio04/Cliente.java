package ejercicio04;

public class Cliente {
	
	//ATRIBUTOS
	private String dni;
	private String nombre;
	private String apellidos;
	private Boolean activo;
	private double peso;
	private double alturaCM;
	private int edad;
	private static int clienteNumero;
	
	//CONSTRUCTOR
	public Cliente() {
		
	}
	
	public Cliente(String dni, String nombre, String apellidos, double peso, double alturaCM, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.activo = true;
		this.peso = peso;
		this.alturaCM = alturaCM;
		this.edad = edad;
		clienteNumero++;
		
	}
	
	//GETTERS Y SETTERS
	
	public static int getClienteNumero() {
		return clienteNumero;
	}

	public static void setClienteNumero(int clienteNumero) {
		Cliente.clienteNumero = clienteNumero;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

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

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAlturaCM() {
		return alturaCM;
	}

	public void setAlturaCM(double alturaCM) {
		this.alturaCM = alturaCM;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//METODOS
	public double calcularIMC() {
		double IMC, alturaM;
		alturaM = this.alturaCM / 100;
		IMC = this.peso / Math.pow(alturaM, 2); 
		return IMC;
	}
}
