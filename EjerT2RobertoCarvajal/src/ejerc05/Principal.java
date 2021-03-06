package ejerc05;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		int selector=0, numEntradas=0, redo=0, CERO=0, UNO=1, DOS=2, TRES=3, CUATRO=4, CINCO=5;
		double precPA=4.2, precPB=3.9, precPC=4.3, precPD=4.17, total=0;
		String pelA="Frozen", pelB="Solo en casa 2", pelC="Spiderman", pelD="Armagedon";
		String salA="Sala infantil", salB="Sala joven", salC="Sala VIP", salD="Sala 3D";
		
		//Selector	
		System.out.printf("Para hoy, estan programadas las siguientes pelÍculas:\n");
		
		System.out.printf("|-------------------------------|\n");
		System.out.printf("|1.\t%s\t\t\t|\n", pelA);
		System.out.printf("|2.\t%s\t\t|\n", pelB);
		System.out.printf("|3.\t%s\t\t|\n", pelC);
		System.out.printf("|4.\t%s\t\t|\n", pelD);
		System.out.printf("|5.\tSalir del Programa\t|\n");
		System.out.printf("|-------------------------------|\n");
				
		System.out.printf("¿Qué pelicula desea ver? (1-4): ");
		do {
			selector=Leer.datoInt();
			switch (selector) {
						
				case 1:
					System.out.printf("\nPrecio por entrada: %.2f€",precPA);
					System.out.printf("\nEn: %s", salA);
					selector=UNO;
					redo=CERO;
					break;
				
				case 2:
					System.out.printf("\nPrecio por entrada: %.2f€",precPB);
					System.out.printf("\nEn: %s", salB);
					selector=DOS;
					redo=CERO;
					break;
				
				case 3:
					System.out.printf("\nPrecio por entrada: %.2f€",precPC);
					System.out.printf("\nEn: %s", salC);
					selector=TRES;
					redo=CERO;
					break;
				
				case 4:
					System.out.printf("\nPrecio por entrada: %.2f€",precPD);
					System.out.printf("\nEn: %s", salD);
					selector=CUATRO;
					redo=CERO;
					break;
				case 5:
					System.out.printf("Gracias por usar el programa. Hasta la proxima!");
					redo=CERO;
					break;
					
				default:
					System.out.println("Entrada incorrecta, repita la selecciÓn, o teclee 5 para salir");
					redo=UNO;
					break;
			}
		}while (redo==UNO);
	
	
		
		if (selector<CINCO) {
			System.out.printf("\n¿Cuantas entradas quiere?\n");
			numEntradas=Leer.datoInt();
			switch (selector) {
				case 1:
					total=numEntradas*precPA;
					break;
				case 2:
					total=numEntradas*precPB;
					break;
				case 3:
					total=numEntradas*precPC;
					break;
				case 4:
					total=numEntradas*precPD;
					break;
			}
		System.out.printf("\nPerfecto!\nEn total serían %.2f€", total);
		System.out.println("\nMuchas gracias por su compra!");
		}
	}
}



	


