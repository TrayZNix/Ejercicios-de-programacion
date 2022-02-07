package ejercicio04;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		int impuestoElectronica = 21, selector;
		boolean loop = true;
		
		System.out.println("Elija que hacer");
		System.out.println("------------------------------");
		System.out.println("0. Salir");
		System.out.println("1. Crear productos");
		System.out.println("2. seguir");
		selector = leer.datoInt();
		switch (selector) {
			case 0:
				loop = false;
				break;
			
			case 1:
				
				break;
				
		
		}

	}

}
