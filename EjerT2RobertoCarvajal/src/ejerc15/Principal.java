package ejerc15;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		int selector=0, exit=0, UNO=1, CERO=0, ret=1;
		double saldo=5600.35, extrae=0, ingresa=0;
		String opcionA="1. Ver saldo", opcionB="2. Retirar dinero", opcionC="3. Ingresar dinero", opcionD="4. Comprar entradas";
		String peliA="Titanic", peliB="Frozen", peliC="Matrix";
		System.out.println("Bienvenido. Este programá funcionará igual que la interfaz de un cajero automático");
		do {
		System.out.printf("|---------------------------------------------------------------|\n");
		System.out.printf("|¿Qué desea hacer?\t\t\t\t\t\t|\n");
		System.out.printf("|%s\t\t\t\t\t\t\t|\n", opcionA);
		System.out.printf("|%s\t\t\t\t\t\t|\n", opcionB);
		System.out.printf("|%s\t\t\t\t\t\t|\n", opcionC);
		System.out.printf("|%s\t\t\t\t\t\t|\n", opcionD);
		System.out.printf("|\t\t\t\t\t\t\t\t|\n");
		System.out.printf("|Para salir, escriba 0\t\t\t\t\t\t|\n");
		System.out.printf("|---------------------------------------------------------------|\n");
		
		selector=Leer.datoInt();
		switch (selector) {
			case 0:
				exit=UNO;
				break;
			case 1:
				System.out.printf("\n\n|---------------------------------------------------------------|\n");
				System.out.printf("|Su saldo actual es %.2f€\t\t\t\t\t|\n",saldo);
				System.out.printf("|\t\t\t\t\t\t\t\t|\n");
				System.out.printf("|---------------------------------------------------------------|\n\n\n");
				break;
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
			case 4:
				System.out.printf("\n|---------------------------------------------------------------|\n");
				System.out.printf("|Tenemos en taquilla tenemos las siguientes películas\t\t|\n");
				System.out.printf("|%s\t\t\t\t\t\t\t|\n", peliA);
				System.out.printf("|%s\t\t\t\t\t\t\t\t|\n", peliB);
				System.out.printf("|%s\t\t\t\t\t\t\t\t|\n", peliC);
				System.out.printf("|---------------------------------------------------------------|\n\n");
				break;
			default:
				break;
			}
		}while(exit==CERO);
		System.out.printf("|--------------------------------------------------------|\n");
		System.out.printf("|Hasta la proxima. ¡Muchas gracias!\t\t|\n");
		System.out.printf("|--------------------------------------------------------|\n");
		

	}

}
