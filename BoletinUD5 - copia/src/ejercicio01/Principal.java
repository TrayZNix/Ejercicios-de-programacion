package ejercicio01;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		int selector = 0;
				
		System.out.println("Elija que hacer");
		System.out.println(".......................");
		System.out.println("0.Salir");
		System.out.println("1. Mostrar todas las notas");
		System.out.println("2. Mostrar las notas de una asginatura");
		System.out.println("3. Mostrar la media de cada asignatura");
		selector = leer.datoInt();
		switch (selector) {
			default: 
				System.out.println("Error de lectura");
				break;
			case 1:
				
				break;
		}

	}

}
