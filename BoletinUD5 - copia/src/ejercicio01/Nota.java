package ejercicio01;
	/**
	 * Esta clase se utiliza para crear cada nota.
	 * 
	 * @author carvajal.verob22
	 * @version 1.0 23/02/2022
	 */
public class Nota {
	private String asignatura;
	private double nota;
	
	public Nota(String asignatura, double nota) {
		super();
		this.asignatura = asignatura;
		this.nota = nota;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Nota [asignatura=" + asignatura + ", nota=" + nota + "]";
	}
	
	
	
}
