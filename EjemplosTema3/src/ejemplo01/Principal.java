package ejemplo01;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0; 
		double b=0;
		String sa, sb;
		System.out.printf("Introduzca su edad:\n");
		a=leer.datoInt();
		System.out.printf("Introduzca su nombre:\n");
		sa=leer.dato();
		System.out.printf("Introduzca su/sus apellido/s:\n");
		sb=leer.dato();
		System.out.printf("Introduzca su nota media:\n");
		b=leer.datoDouble();
		Alumno a1= new Alumno (a, sa, sb, b);
		System.out.println(a1);
	}

}
