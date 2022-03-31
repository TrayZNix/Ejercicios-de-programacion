package ejercicio02;

import java.time.LocalDate;

public class Cliente {

	// Atributos
	private String dni;
	private String nombre;
	private String tlf;
	private String email;
	private LocalDate fechaNac;

	// Constructor
	public Cliente() {
		// Constructor vacío para poder crear un objeto Cliente en el main vacío
	}

	public Cliente(String dni, String nombre, String tlf, String email, LocalDate fechaNac) {
		this.dni = dni;
		this.nombre = nombre;
		this.tlf = tlf;
		this.email = email;
		this.fechaNac = fechaNac;
	}

	// Getters&Setters
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

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setfechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	// toString
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", tlf=" + tlf + ", email=" + email + ", fechaNac="
				+ fechaNac + "]";
	}
}