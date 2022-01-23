package ejercicio05;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		// Variables
		int selector;
		boolean loop = true;
		char consumo;
		Tienda t = new Tienda();
		Electrodomestico eCalc = new Electrodomestico();
		
		//Menu
		do {
			System.out.printf("\n\n\n");
			System.out.println("Elija que hacer");
			System.out.println("------------------------------");
			System.out.println("0. Salir");
			System.out.println("1. Calcular el precio de un electrodoméstico");
			System.out.println("2. Calcular el precio por todos los electrodomésticos");
			System.out.println("3. Calcular la media de precio de todos los electrodomésticos");
			System.out.printf("\n\n\n");
			selector = leer.datoInt();
			switch (selector) {
			case 0:
				loop = false;
				break;
			case 1:
				System.out.printf("\n\n\n");
				System.out.println("¿Cual es el consumo energético que quiere en su electrodoméstico? (A, B, C, D, E, F)");
				consumo = Character.toUpperCase(leer.datoChar());
				System.out.println("El precio para un electrodomestico "+consumo+" es "+eCalc.precioFinal(consumo)+"€");
				System.out.printf("\n\n\n");
				break;
			case 2: 
				System.out.println("El precio de todos los electrodomesticos juntos es "+t.calcularPrecioTodosJuntos()+"€");
				break;
			case 3:
				System.out.println("Los electrodomésticos valen de media "+t.calcularMediaPrecioProductos()+"€");
				break;
			default:
				System.out.println("Error al leer. Intentelo de nuevo");
				break;
			}
		}while (loop);
		System.out.printf("\n\n\n");
		System.out.println("Gracias por usar este programa!");
	}

}
