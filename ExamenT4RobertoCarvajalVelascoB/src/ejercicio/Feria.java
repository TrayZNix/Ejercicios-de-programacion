package ejercicio;

import java.util.Arrays;

public class Feria {
	//Atributos
	private int anioExpo;
	private Visitante[] visitantes;
	private int visitantesRegistrados;
	
	
	//Constructor
	public Feria(int anioExpo, int maxVisitantes) {
		super();
		this.anioExpo = anioExpo;
		visitantes = new Visitante[maxVisitantes];
	
	//Getters, setters y toString
	}
	public int getAnioExpo() {
		return anioExpo;
	}
	public void setAnioExpo(int anioExpo) {
		this.anioExpo = anioExpo;
	}
	public Visitante[] getVisitantes() {
		return visitantes;
	}
	public void setVisitantes(Visitante[] visitantes) {
		this.visitantes = visitantes;
	}
	@Override
	public String toString() {
		return "Feria [anioExpo=" + anioExpo + ", visitantes=" + Arrays.toString(visitantes) + "]";
	}
	
	//Métodos
	public double calcularPrecioEntradaUnVisitante() {
		return 0;
		
	}
	public double calcularTotalRecaudado() {
		return 0;
		
	}
	public double calcularTotalRecaudadoSoloFamiliares() {
		return 0;
		
	}
	
	public void añadirVisitante(String nombre, double precioBaseEntrada, int edad){
		Visitante v = new Visitante(nombre, precioBaseEntrada, edad);
		this.visitantes[this.visitantesRegistrados] = v;
		this.visitantesRegistrados++;
	}
	public void añadirFamiliar(String nombre, double precioBaseEntrada, int edad, int numeroHijos) {
		Familiar f = new Familiar(nombre, precioBaseEntrada, edad, numeroHijos);
		this.visitantes[this.visitantesRegistrados] = f;
		this.visitantesRegistrados++;
	}
	public void añadirEmpresario(String nombre, double precioBaseEntrada, int edad, String nombreEmpresa, double dineroAporta) {
		Empresario e = new Empresario(nombre, precioBaseEntrada, edad, nombreEmpresa, dineroAporta);
		this.visitantes[this.visitantesRegistrados] = e;
		this.visitantesRegistrados++;
	}
	public void mostrarListadoVisitantes() {
		for (int i = 0; i < visitantes.length; i++) {
			if (visitantes[i] != null) {
				System.out.println(visitantes[i].toString());
			}
		}
	}
	
}
