package ejerc15;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		int selectorMenu=0, selectorPeli=0, exitA=0, exitB=0, UNO=1, CERO=0, ret=1, cantidad=0;
		double saldo=5600.35, extrae=0, ingresa=0, total=0, precioA=3.5, precioB=3;
		String opcionA="Ver saldo", opcionB="Retirar dinero", opcionC="Ingresar dinero", opcionD="Comprar entradas";
		String peliA="Titanic", peliB="Frozen", salir="Exit";
		System.out.println("Bienvenido. Este programá funcionará igual que la interfaz de un cajero automático");
		do {
		System.out.printf("|---------------------------------------------------------------|\n");
		System.out.printf("|¿Qué desea hacer?\t\t\t\t\t\t|\n");
		System.out.printf("|...............................................................|\n");
		System.out.printf("|1.%s\t\t\t\t\t\t\t|\n", opcionA);
		System.out.printf("|2.%s\t\t\t\t\t\t|\n", opcionB);
		System.out.printf("|3.%s\t\t\t\t\t\t|\n", opcionC);
		System.out.printf("|4.%s\t\t\t\t\t\t|\n", opcionD);
		System.out.printf("|5.%s\t\t\t\t\t\t\t\t|\n", salir);
		System.out.printf("|\t\t\t\t\t\t\t\t|\n");
		System.out.printf("|---------------------------------------------------------------|\n");
		
		selectorMenu=Leer.datoInt();
		switch (selectorMenu) {
			//VER SALDO
			case 1:
				System.out.printf("\n\n|---------------------------------------------------------------|\n");
				System.out.printf("|Su saldo actual es %.2f€\t\t\t\t\t|\n",saldo);
				System.out.printf("|\t\t\t\t\t\t\t\t|\n");
				System.out.printf("|---------------------------------------------------------------|\n\n\n");
				break;
			//RETIRAR DINERO
			case 2:
				do {
				System.out.printf("|---------------------------------------------------------------|\n");
				System.out.printf("|¿Cuanto dinero desea retirar?\t\t\t\t\t|\n");
				System.out.printf("|---------------------------------------------------------------|\n\n");
				extrae=Leer.datoDouble();
				if(saldo>=extrae) {
					ret=CERO;
					System.out.printf("\n\n|---------------------------------------------------------------|\n");
					System.out.printf("|Ha retirado %.2f€\t\t\t\t\t\t|\n", extrae);
					saldo=saldo-extrae;
					System.out.printf("|\t\t\t\t\t\t\t\t|\n");
					System.out.printf("|Le quedan %.2f€ en su cuenta.\t\t\t\t|\n", saldo);
					System.out.printf("|---------------------------------------------------------------|\n\n");
				}
				else {
					ret=UNO;
					System.out.printf("\n\n|---------------------------------------------------------------|\n");
					System.out.printf("|ERROR :(\t\t\t\t\t\t\t|\n");
					System.out.printf("|No tiene suficiente dinero. \t\t\t\t\t|\n");
					System.out.printf("|Indique una nueva cantidad:\t\t\t\t\t|\n");
				}
				}while (ret==UNO);
				break;
			//INGRESAR DINERO
			case 3:
				System.out.printf("|---------------------------------------------------------------|\n");
				System.out.printf("|¿Cuanto dinero desea ingresar?\t\t\t\t\t|\n");
				System.out.printf("|---------------------------------------------------------------|\n");
				ingresa=Leer.datoDouble();
				saldo=saldo+ingresa;
				System.out.printf("|---------------------------------------------------------------|\n");
				System.out.printf("|Ha ingresado %.2f€\t\t\t\t\t\t|\n", ingresa);
				System.out.printf("|Su saldo actual es %.2f€\t\t\t\t\t|\n", saldo);
				System.out.printf("|---------------------------------------------------------------|\n\n");
				break;
			//COMPRAR ENTRADAS
			case 4:
				total=0;
				System.out.printf("\n|---------------------------------------------------------------|\n");
				System.out.printf("|Tenemos en taquilla tenemos las siguientes películas\t\t|\n");
				System.out.printf("|1.%s\t\t\t\t\t\t\t|\n", peliA);
				System.out.printf("|2.%s\t\t\t\t\t\t\t|\n", peliB);
				System.out.printf("|¿Cual desea ver? Escojala pulsando el número que le corresponde|\n");
				System.out.printf("|o escriba 0 para salir\t\t\t\t\t\t|\n");
				System.out.printf("|---------------------------------------------------------------|\n\n");
				do {
				selectorPeli=Leer.datoInt();
				switch (selectorPeli) {
				case 1:
					System.out.println("¿Cuantas entradas quiere?");
					cantidad=Leer.datoInt();
					total=precioA*cantidad;
					System.out.printf("En total serán %f€, muchas gracias!", total);
					
					break;
				case 2:
					System.out.printf("¿Cuantas entradas quiere?\n");
					cantidad=Leer.datoInt();
					total=precioB*cantidad;
					System.out.printf("\nEn total serán %f€, muchas gracias!", total);					
					break;
				default:
					System.out.printf("Entrada desconocida, por favor, introduzca el numero de nuevo");
					break;
				}
				
				break;
			}while (exitB==UNO);
			//SALIR
			case 5:
				exitA=UNO;
				break;
			} 
		} while(exitA==CERO);
		System.out.printf("\n|-------------------------------------------------------|\n");
		System.out.printf("|Hasta la proxima. ¡Muchas gracias!\t\t\t|\n");
		System.out.printf("|-------------------------------------------------------|\n");
		

	}

}
