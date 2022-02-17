package ejercicio05;

public abstract class Empleado {
	//Atributos
	private String nombre;
	protected double sueldoBase;
	protected double sueldoFinal;
	protected double dineroRecaudadoVentas;
	private int numeroEmpleado;
	static int empleadosGenerados;
		
	//Constructor
	public Empleado(String nombre, double sueldoBase, double dineroRecaudadoVentas) {
		super();
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.dineroRecaudadoVentas = dineroRecaudadoVentas;
		Empleado.empleadosGenerados++;
		this.numeroEmpleado = Empleado.empleadosGenerados;
	}
	
	
	//Getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getDineroRecaudadoVentas() {
		return dineroRecaudadoVentas;
	}

	public void setDineroRecaudadoVentas(double dineroRecaudadoVentas) {
		this.dineroRecaudadoVentas = dineroRecaudadoVentas;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public double getSueldoFinal() {
		return sueldoFinal;
	}


	public void setSueldoFinal(double sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}


	//toString
	@Override
	public String toString() {
		return "nombre=" + nombre + ", sueldoBase=" + sueldoBase + ", dineroRecaudadoVentas="
				+ dineroRecaudadoVentas + ", NUMERO DE EMPLEADO=" + numeroEmpleado;
	}
	
	//Metodos
	public abstract void calcularSueldoFinal();
	
	
}
