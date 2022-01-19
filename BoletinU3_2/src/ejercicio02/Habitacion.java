package ejercicio02;

public class Habitacion {
	private static int numeroHabitacion;
	private int superficie;
	private int tipo;
	private double precio;
	private boolean extras;
	
	public Habitacion() {
		numeroHabitacion++;
		this.numeroHabitacion = numeroHabitacion;
	}
}
