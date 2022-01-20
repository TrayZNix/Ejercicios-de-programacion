package ejercicio04;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		int puntero = 1, selector;
		double IMC;
		boolean loop = true;
		
		String nombre, apellidos, dni;
		double peso, alturaCM;
		int edad;
		
		Gimnasio g = new Gimnasio();
		Cliente[] listaClientes;
		do {
		listaClientes = g.getListaClientes();
		System.out.printf("\n\n\n");
		System.out.println("¿Qué desea hacer?");
		System.out.println("................................");
		System.out.println("0. Salir del programa.");
		System.out.println("1. Calcular el IMC de un cliente.");
		System.out.println("2. Mostrar la lista de clientes.");
		System.out.println("3. Añadir un cliente.");
		System.out.println("4. Dar de baja un cliente.");
		System.out.println("5. Funciones de estadística.");
		System.out.printf("\n\n\n");
		selector = leer.datoInt();
		switch (selector) {
		default: 
			System.out.println("Error al leer. Intentelo de nuevo, por favor");
			break;
			
		case 0:
			loop = false;
			break;
			
		case 1:
			System.out.println("¿De que cliente desea calcular su IMC?");
			for(int i = 0; i < listaClientes.length; i++) {
				System.out.println(puntero+". "+listaClientes[i].getNombre()+" "+listaClientes[i].getApellidos());
			puntero++;
			}
			selector = leer.datoInt();
			IMC = g.calcularIMCCliente(selector);
			System.out.println("Su IMC es "+IMC);
			break;
			
		case 2:
			System.out.println("Clientes actuales:");
			for(int i = 0; i < listaClientes.length; i++) {
				System.out.println(puntero+". "+listaClientes[i].getNombre()+" "+listaClientes[i].getApellidos()+". DNI: "+listaClientes[i].getDni());
			puntero++;
			}
			break;
		case 3:
			System.out.println("Introduzca el nombre del nuevo cliente");
			nombre = leer.dato();
			System.out.println("Introduzca sus apellidos");
			apellidos = leer.dato();
			System.out.println("Introduzca su DNI");
			dni = leer.dato();
			System.out.println("Introduzca su peso");
			peso = leer.datoDouble();
			System.out.println("Introduzca su altura");
			alturaCM = leer.datoDouble();
			System.out.println("Introduzca su edad");
			edad = leer.datoInt();
			
		case 5:
			do {

			System.out.printf("\n\n\n");
			System.out.println("¿Qué estadistica desea consultar?");
			System.out.println("................................");
			System.out.println("1. Media de IMC.");
			System.out.println("2. Media de altura.");
			System.out.println("3. Media de peso.");
			System.out.println("0. Regresar");
			System.out.printf("\n\n\n");
			selector = leer.datoInt();
			switch (selector) {
				default: 
					System.out.println("Error al leer. Por favor, intentelo de nuevo");
					break;
				case 1:
					//Media IMC clientes
					break;
				case 2:
					//Media altura clientes
					break;
				case 3:
					//Media de peso
					break;
				case 0:
					loop = false;
					break;
			}
			}while (loop);
			loop = true;
			
		
		}
		}while(loop);
		System.out.printf("\n\n\n");
		System.out.println("Gracias por usar este programa!");
	}
	
}
