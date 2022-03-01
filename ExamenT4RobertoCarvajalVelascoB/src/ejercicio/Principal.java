package ejercicio;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		//Variables
		int numMaxVisitantes, anioFeria, UNO = 1, CERO = 0, VEINTE = 20, MIL = 1000, selector = 0;
		double precioBaseEntrada = 5, eurosPorHijo = 1, descuento = 10;
		boolean loop = true;
		
		//Codigo principal
		System.out.println("Bienvenido al sistema gestor de ferias");
		System.out.println("¿De qué año es esta feria?");
		do {
			anioFeria = leer.datoInt();
			if(anioFeria < CERO) {
				System.out.println("No existen los años negativos, debe introducir un número positivo");
			}
		}while (anioFeria < CERO);
		System.out.println("¿Cuál es el numero máximo de visitantes que tendrá esta feria?");
		do {
			numMaxVisitantes = leer.datoInt();
				if(numMaxVisitantes < CERO) {
					System.out.println("No existen los visitantes negativos, debe introducir un número positivo");
				}
		}while (numMaxVisitantes < CERO);
		Feria fe = new Feria(anioFeria, numMaxVisitantes);
		fe.añadirFamiliar("Angel", precioBaseEntrada, VEINTE, UNO);
		fe.añadirEmpresario("Miguel", precioBaseEntrada, VEINTE, "Salesianos", MIL);
		fe.añadirVisitante("Luismi", precioBaseEntrada,VEINTE);
		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("------------------------------");
			System.out.println("0. Salir");
			System.out.println("1. Ver la lista de visitantes");
			System.out.println("2. Calcular el precio de una entrada");
			System.out.println("3. Mostrar recaudaciones"); //AÑADIR TOTAL Y FAMILIARES EN UN SUBMENU (SUBSWITCH)
			selector = leer.datoInt();
			switch (selector) {
				default:
					System.out.println("Error de lectura, intentelo de nuevo");
					break;
				case 1:
					fe.mostrarListadoVisitantes();
					break;
				case 2:
					System.out.println("¿Qué tipo de entrada desea calcular?");
					System.out.println("1. Visitante.     2.Familiar        3.Empresario");
					selector = leer.datoInt();
					switch (selector) {
						default: 
							System.out.println("Error de lectura");
							break;
						case 1: 
							Visitante v = null;
							System.out.println("El precio es "+v.calcularPrecioEntrada()+"€");
							break;
						case 2:
							Familiar f = null;
							System.out.println("¿Cuantos hijos tiene?");
							selector = leer.datoInt();
							System.out.println("El precio es "+f.calcularPrecioEntrada(selector, eurosPorHijo, precioBaseEntrada)+"€");
							break;
						case 3:
							Empresario e = null;
							System.out.println("El precio es "+e.calcularPrecioEntrada(descuento, precioBaseEntrada)+"€");
							break;
					}
					break;
				case 3:
					
				}
		}while(loop);
		

	}

}
