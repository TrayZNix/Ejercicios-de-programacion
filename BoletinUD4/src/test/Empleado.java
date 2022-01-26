package test;

public class Empleado extends Trabajador {
	private int sueldo;
	private int impuestos;
	
	public Empleado(String nombre, String puesto, int sueldo, int impuesto) {
		super(nombre, puesto);
		this.sueldo = sueldo;
		this.impuestos = impuesto;
	}
}	
