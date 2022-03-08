package ejercicio03;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		int selector, edad, UNO = 1, confirmacion;
		boolean loop = true;
		String nombre, apellidos, dni;
		Aula a = new Aula(1, 'A');
		
		do {
		System.out.println("Elija que desea hacer");
		System.out.println("-----------------------------");
		System.out.println("0. Salir");
		System.out.println("1. Mostrar alumnos");
		System.out.println("2. Añadir alumnos");
		System.out.println("3. Modificar alumnos");
		System.out.println("4. Eliminar alumnos");
		selector = leer.datoInt();
		switch(selector) {
			default: 
				System.out.println("Error de lectura");
				break;
			case 0:
				loop = false;
				break;
			case 1:
				a.mostrarLista();
				break;
			case 2:
				System.out.println("Introduzca el nombre del alumno");
				nombre = leer.dato();
				System.out.println("Introduzca los apellidos del alumno");
				apellidos = leer.dato();
				System.out.println("Introduzca la edad del alumno");
				edad = leer.datoInt();
				System.out.println("¿Cual es el dni del alumno?");
				dni = leer.dato();
				a.anyadirAlumno(nombre, apellidos, edad, dni);
				System.out.println("Se ha añadido el alumno");
				break;
			case 3:
				System.out.println("Introduzca el dni del alumno que quiere modificar");
				System.out.println(".........................................");
				dni = leer.dato();
				if (a.comprobarExiste(dni)){
					System.out.println("Introduzca el nombre");
					nombre = leer.dato();
					System.out.println("Introduzca el apellido");
					apellidos = leer.dato();
					System.out.println("Introduzca la edad");
					edad = leer.datoInt();
					a.modificarAlumno(nombre, apellidos, edad, dni);
				}
				else {
					System.out.println("No se ha encontrado ningun alumno con ese DNI");
				}
				break;
			case 4:
				System.out.println("Elija que alumno desea modificar");
				System.out.println(".........................................");
				a.mostrarLista();		
				selector = leer.datoInt();
				selector--;
				System.out.println("Seguro que desea eliminar este alumno?");
				System.out.println("0.No            1. Sí ");
				confirmacion = leer.datoInt();
				if (confirmacion == UNO) {
					a.eliminarAlumno(selector);
					System.out.println("Se ha eliminado el alumno");
				}
				break;
		}
		}while (loop);
		System.out.println("Gracias por usar este programa");
	}
	

}
