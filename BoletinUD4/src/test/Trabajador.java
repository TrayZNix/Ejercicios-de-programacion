package test;

public class Trabajador {
	private String nombre;
	private String puesto;
	
	public Trabajador (String nombre, String puesto) {
		this.nombre = nombre;
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	double calcularPaga(){
	
	return;
	}
	
