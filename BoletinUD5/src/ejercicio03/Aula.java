package ejercicio03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Aula {
	private HashSet <Alumno> alumnos = new HashSet<Alumno>();
	private int curso;
	private char claseCurso;
	
	public Aula(int curso, char claseCurso) {
		this.curso = curso;
		this.claseCurso = claseCurso;
	}

	public HashSet<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(HashSet<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public char getClaseCurso() {
		return claseCurso;
	}

	public void setClaseCurso(char claseCurso) {
		this.claseCurso = claseCurso;
	}

	@Override
	public String toString() {
		return "Aula [alumnos=" + alumnos + ", curso=" + curso + ", claseCurso=" + claseCurso + "]";
	}
	
	//Métodos
	
	public void mostrarLista() {
		int puntero = 1;
		System.out.printf("\n\n");
		System.out.println("Alumnos de "+this.curso+"º."+this.claseCurso);
		System.out.println(".......................................................");
		for (Alumno a : this.alumnos) {
		      System.out.println(puntero+". "+a);
		      puntero++;
		}
		System.out.printf("\n\n");
	}
	public void anyadirAlumno(String nombre, String apellidos, int edad, String dni) {
		Alumno a = new Alumno(nombre, apellidos, edad, dni);
		this.alumnos.add(a);
	}
	
	public void modificarAlumno(String nombre, String apellidos, int edad, String dni) {
		int contador = 0;
		for (Alumno a : this.alumnos) {
			if (a.getDni().equalsIgnoreCase(dni)) {
				a.setNombre(nombre);
				a.setApellidos(apellidos);
				a.setEdad(edad);
			}
			
		}
	}
	
	public void eliminarAlumno(String dni) {
		int contador = 0;
		for (Alumno a : this.alumnos) {
			if (a.getDni().equalsIgnoreCase(dni)) {
				this.alumnos.remove(a);
			}
			
		}
	}
	
	public boolean comprobarExiste(String dni) {
		for(Alumno a : this.alumnos) {
			if(a.getDni().equalsIgnoreCase(dni)) {
				return true;
			}
		}
		return false;
	}
	public void imprimirListaOrdenada() {
		SortedSet<Alumno> setSortAlumnos = new TreeSet<Alumno>(this.alumnos);
		for(Alumno a : setSortAlumnos) {
			System.out.println(a);
		}
	}
	public void imprimirListaOrdenadaEdad(){
		Set<Alumno> alumnao = new TreeSet<Alumno>(new CompararSegunEdad());
		alumnao.addAll(this.alumnos);
		for(Alumno a : alumnao) {
			System.out.println(a);
		}
	}
	
	
	
}
