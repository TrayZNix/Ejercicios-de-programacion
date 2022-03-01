package ejercicio;

public class Visitante implements IEntrada{
	//Atributos
	private String Nombre;
	private int idVisitante;
	private double precioBaseEntrada;
	private int edad;
	static int visitantesRegistrados;
	
	//Constructor
	public Visitante(String nombre, double precioBaseEntrada, int edad) {
		visitantesRegistrados++;
		Nombre = nombre;
		this.idVisitante = visitantesRegistrados;
		this.precioBaseEntrada = precioBaseEntrada;
		this.edad = edad;
	}

	//Getters, setters y toString
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getIdVisitante() {
		return idVisitante;
	}

	public void setIdVisitante(int idVisitante) {
		this.idVisitante = idVisitante;
	}

	public double getPrecioBaseEntrada() {
		return precioBaseEntrada;
	}

	public void setPrecioBaseEntrada(double precioBaseEntrada) {
		this.precioBaseEntrada = precioBaseEntrada;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Visitante [Nombre=" + Nombre + ", idVisitante=" + idVisitante + ", precioBaseEntrada="
				+ precioBaseEntrada + ", edad=" + edad + "]";
	}
	
	//Métodos
	public double calcularPrecioEntrada() {
		int mayorEdad = 18, edadJubilacion = 65, DOS = 2;
		double precioEntrada = 0;
		if (this.edad<mayorEdad) {
			precioEntrada = 0;
		}
		else if(this.edad >= mayorEdad | this.edad <=edadJubilacion) {
			precioEntrada = this.precioBaseEntrada;
		}
		else if(this.edad > edadJubilacion) {
			precioEntrada = this.precioBaseEntrada / DOS; //Entre dos porque se le hace el 50%;
		}
		return precioEntrada;
	}
}
