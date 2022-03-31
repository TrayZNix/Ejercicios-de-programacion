package ejercicio02;

import java.time.LocalDate;

public class Reserva implements Comparable<Reserva> {

	// Atributos
	private LocalDate fecha;
	private boolean reserva;
	private double precio;

	// Constructor
	public Reserva(LocalDate fecha, boolean reserva, double precio) {
		this.fecha = fecha;
		this.reserva = reserva;
		this.precio = precio;
	}

	// Getters&Setters
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public boolean isReserva() {
		return reserva;
	}

	public void setReserva(boolean reserva) {
		this.reserva = reserva;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// toString
	@Override
	public String toString() {
		return "Reserva [fecha=" + fecha + ", reserva=" + reserva + ", precio=" + precio + "]";
	}

	// Métodos

	// Métodod para ordenar las fechas de reserva de menor a mayor
	public int compareTo(Reserva r) {
		if (fecha.isBefore(r.getFecha())) {
			return -1;
		} else {
			if (fecha.isAfter(r.getFecha())) {
				return 1;
			}
			return 0;
		}
	}
}