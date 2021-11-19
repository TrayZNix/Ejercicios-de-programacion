package ejercicio02;

import lectura.leer;

public class Principal {
	
	public static void main(String[] args) {
		int num = 0, exit = 1;
		String posit="Comprobar si un número es positivo o negativo", paridad="Comprobar si un número es par o impar";
		Operaciones operaciones;
	
		System.out.println("Bienvenido. Este programa le ayudará a calcular si un número es positivo o negativo, o si es par o impar");
		do {
			System.out.println("¿Qué acción desea realizar?");
			System.out.printf("1. %s\n", posit);
			System.out.printf("2. %s\n", paridad);
			num=leer.datoInt();
			switch (num) {
				case 0:
					exit = 0;
				case 1:
					while (num != 0) {
					System.out.println("¿Qué número desea consultar? Escriba 0 para salir al menú");
					num=leer.datoInt();
					
						operaciones = new Operaciones();
						
						System.out.printf("Su número es %s\n\n", operaciones.generarPositivoNegativo(num));
					}
					
					
					
					break;
				
				case 2:
					while (num != 0) {
					System.out.println("¿Qué número desea consultar? Escriba 0 para salir al menú");
					num=leer.datoInt();
							
							operaciones = new Operaciones();
							
							System.out.printf("Su número es %s\n\n", operaciones.paridad(num));		
						}
					
					break;
	
				default:
					System.out.println("Entrada desconocida, por favor, intentelo de nuevo");
					break;
				}
			
		}while (exit!=0);
		
		System.out.println("¡Muchas gracias por usar este programa!");

	}

}
