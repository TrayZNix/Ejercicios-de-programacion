package ejercicio;

public class Piloto {
	
	private int numPiloto;
	private String nombre;
	private String apellido;
	private String escuderia;
	
	public Piloto(int numPiloto, String nombre, String apellido, String escuderia) {
		this.numPiloto = numPiloto;
		this.nombre = nombre;
		this.apellido = apellido;
		this.escuderia = escuderia;
	}
	
	public int getNumPiloto() {
		return numPiloto;
	}
	
	public void setNumPiloto(int numPiloto) {
		this.numPiloto = numPiloto;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getEscuderia() {
		return escuderia;
	}
	
	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}
	
	@Override
	public String toString() {
		return "Piloto [numPiloto=" + numPiloto + ", nombre=" + nombre + ", apellido=" + apellido + ", escuderia="
				+ escuderia + "]";
	}
	
	
}