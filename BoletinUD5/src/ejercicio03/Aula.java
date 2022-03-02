package ejercicio03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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
	public void anyadirAlumno(String nombre, String apellidos, int edad) {
		Alumno a = new Alumno(nombre, apellidos, edad);
		this.alumnos.add(a);
	}
	
	public void modificarAlumno(int selector, String nombre, String apellidos, int edad) {
		int contador = 0;
		for (Alumno a : this.alumnos) {
			if(contador == selector) {
				this.alumnos.remove(a);
				Alumno b = new Alumno(nombre, apellidos, edad);
				this.alumnos.add(b);
			}
			contador++;
		}
	}
	
	public void eliminarAlumno(int selector) {
		this.alumnos.remove(selector);
		
		
	}
	
	
	
	
}
