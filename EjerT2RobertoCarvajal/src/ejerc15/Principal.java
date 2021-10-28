package ejerc15;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		int selector=0, exit=0, UNO=1, CERO=0;
		double saldo=5600.35;
		String opcionA="1. Ver saldo", opcionB="2. Retirar dinero", opcionC="3. Ingresar dinero", opcionD="4. Comprar entradas";
		System.out.println("Bienvenido. Este programá funcionará igual que la interfaz de un cajero automático");
		do {
		System.out.printf("|-----------------------------------------------|\n");
		System.out.printf("|¿Qué desea hacer?\t\t\t\t|\n");
		System.out.printf("|%s\t\t\t\t\t|\n", opcionA);
		System.out.printf("|%s\t\t\t\t|\n", opcionB);
		System.out.printf("|%s\t\t\t\t|\n", opcionC);
		System.out.printf("|%s\t\t\t\t|\n", opcionD);
		System.out.printf("|-----------------------------------------------|\n");
		
		selector=Leer.datoInt();
		switch (selector) {
			case 1:
				System.out.printf("\n\n|-----------------------------------------------|\n");
				System.out.printf("|Su saldo actual es %.2f€\t\t\t|\n",saldo);
				System.out.printf("|\t\t\t\t\t\t|\n");
				System.out.printf("|-----------------------------------------------|\n\n");
				break;
	
			default:
				break;
			}
		}while(exit==CERO);
		System.out.printf("|-----------------------------------------------|\n");
		System.out.printf("|\t\t\t\t\t\t|\n");
		

	}

}
