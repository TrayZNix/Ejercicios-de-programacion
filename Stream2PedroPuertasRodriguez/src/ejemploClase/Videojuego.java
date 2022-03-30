package ejemploClase;

import java.util.Objects;

public class Videojuego implements Comparable <Videojuego>{

	private String nombre;
	private String categoria;
	private String fechaSalida;
	private String plataforma;
	private int duracion;
	private double calificacion;

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Videojuego(String nombre, String categoria, String fechaSalida, String plataforma, int duracion,
			double calificacion) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.fechaSalida = fechaSalida;
		this.plataforma = plataforma;
		this.duracion = duracion;
		this.calificacion = calificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Videojuego [nombre=" + nombre + ", categoria=" + categoria + ", fechaSalida=" + fechaSalida
				+ ", plataforma=" + plataforma + ", duracion=" + duracion + ", calificacion=" + calificacion + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Videojuego other = (Videojuego) obj;
		return Double.doubleToLongBits(calificacion) == Double.doubleToLongBits(other.calificacion)
				&& Objects.equals(categoria, other.categoria) && duracion == other.duracion
				&& Objects.equals(fechaSalida, other.fechaSalida) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(plataforma, other.plataforma);
	}

	@Override
	public int compareTo(Videojuego o) {
		// TODO Auto-generated method stub
		return nombre.toLowerCase().compareTo(o.getNombre().toLowerCase());
	}
	
}
