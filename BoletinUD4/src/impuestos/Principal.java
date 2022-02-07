package impuestos;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		
		int selector, caballos, cilindradas;
		int precioBase = 50;
		int porcentajeImpuestosCoche = 25;
		int porcentajeImpuestosMoto;
		int porcentajeImpuestosFurgo;
		boolean loopQuest = false, loop = true, transportaMercancias;
		String tipoCombustible = null;
		do {
		System.out.printf("\n\n\n");
		System.out.println("Sobre qué tipo de vehiculo desea calcular el impuesto?");
		System.out.println("----------------------------------------------------------------");
		System.out.println("1. Coche");
		System.out.println("2. Motocicleta");
		System.out.println("3. Furgoneta");
		selector = leer.datoInt();
		switch (selector) {
			case 1:
				do {
					System.out.println("Introduzca los caballos de su vehiculo: ");
					caballos = leer.datoInt();
					if(caballos <= 0) System.out.println("Error al leer");
				}while (caballos <= 0);
				do {
					System.out.println("Introduzca las cilindradas de su vehiculo: ");
					cilindradas = leer.datoInt();
					if(cilindradas <= 0) System.out.println("Error al leer");
				}while (cilindradas <= 0);
				do {
				System.out.println("¿Que combustible consume?");
				System.out.println("---------------------------------");
				System.out.println("1. Gasolina            2.Diesel");
					selector = leer.datoInt();
					if(selector <= 0) {
						System.out.println("Error al leer");
						loopQuest = true;
					}
					if (selector > 2) {
						System.out.println("Error al leer");
						loopQuest = true;
					}
					else {
						if (selector == 1) tipoCombustible = "Gasolina";
						if (selector == 2) tipoCombustible = "Diesel";
						loopQuest = false;
					}
				}while (loopQuest);
				transportaMercancias = false;
				Coche c = new Coche(caballos, cilindradas, tipoCombustible, porcentajeImpuestosCoche, precioBase, transportaMercancias);
				System.out.println(c.toString());
				break;
			case 2:
				do {
					System.out.println("Introduzca los caballos de su vehiculo: ");
					caballos = leer.datoInt();
					if(caballos <= 0) System.out.println("Error al leer");
				}while (caballos <= 0);
				do {
					System.out.println("Introduzca las cilindradas de su vehiculo: ");
					cilindradas = leer.datoInt();
					if(cilindradas <= 0) System.out.println("Error al leer");
				}while (cilindradas <= 0);
				do {
				System.out.println("¿Que combustible consume?");
				System.out.println("---------------------------------");
				System.out.println("1. Gasolina            2.Diesel");
					selector = leer.datoInt();
					if(selector <= 0) {
						System.out.println("Error al leer");
						loopQuest = true;
					}
					if (selector > 2) {
						System.out.println("Error al leer");
						loopQuest = true;
					}
					else {
						if (selector == 1) tipoCombustible = "Gasolina";
						if (selector == 2) tipoCombustible = "Diesel";
						loopQuest = false;
					}
				}while (loopQuest);
				transportaMercancias = false;
				Motocicleta m = new Motocicleta(caballos, cilindradas, tipoCombustible, porcentajeImpuestosCoche, precioBase, transportaMercancias);
				System.out.println(m.toString());
				break;
			case 3:
				do {
					System.out.println("Introduzca los caballos de su vehiculo: ");
					caballos = leer.datoInt();
					if(caballos <= 0) System.out.println("Error al leer");
				}while (caballos <= 0);
				do {
					System.out.println("Introduzca las cilindradas de su vehiculo: ");
					cilindradas = leer.datoInt();
					if(cilindradas <= 0) System.out.println("Error al leer");
				}while (cilindradas <= 0);
				do {
				System.out.println("¿Que combustible consume?");
				System.out.println("---------------------------------");
				System.out.println("1. Gasolina            2.Diesel");
					selector = leer.datoInt();
					if(selector <= 0) {
						System.out.println("Error al leer");
						loopQuest = true;
					}
					if (selector > 2) {
						System.out.println("Error al leer");
						loopQuest = true;
					}
					else {
						if (selector == 1) tipoCombustible = "Gasolina";
						if (selector == 2) tipoCombustible = "Diesel";
						loopQuest = false;
					}
				}while (loopQuest);
				transportaMercancias = false;
				Furgoneta f = new Furgoneta(caballos, cilindradas, tipoCombustible, porcentajeImpuestosCoche, precioBase, transportaMercancias);
				System.out.println(f.toString());
				break;
			case 0:
				loop = false;
				break;
			default: 
				System.out.println("Entrada desconocida");
				break;
			}
		}while(loop);
	}

}
