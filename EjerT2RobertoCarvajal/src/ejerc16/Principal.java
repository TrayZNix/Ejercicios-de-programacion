package ejerc16;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		String opA="Suma", opB="Resta", opC="Multiplicación",opD="División", opE="Paridad", opF="Salir";
		int	selectorA=0, rept=1, DOS=2, UNO=1, CERO=0;
		double numA=0, numB=1, suma=0, cocDiv=0, restoDiv=0;
		do {
			System.out.printf("\n|---------------------------------------------------------------|\n");
			System.out.printf("|¿Cual de las operaciones desea realizar?\t\t\t|\n");
			System.out.printf("|...............................................................|\n");
			System.out.printf("|1.%s\t\t\t\t\t\t\t\t|\n", opA);
			System.out.printf("|2.%s\t\t\t\t\t\t\t|\n", opB);
			System.out.printf("|3.%s\t\t\t\t\t\t|\n", opC);
			System.out.printf("|4.%s\t\t\t\t\t\t\t|\n", opD);
			System.out.printf("|5.%s\t\t\t\t\t\t\t|\n", opE);
			System.out.printf("|6.%s\t\t\t\t\t\t\t|\n", opF);
			System.out.printf("|---------------------------------------------------------------|\n");
			selectorA=Leer.datoInt();
			switch (selectorA) {
				case 1:
					System.out.printf("\n|---------------------------------------------------------------|\n");
					System.out.printf("|Introduzca los número que desea sumar.\t\t\t|\n");
					for(numA=Leer.datoDouble(); numB!=0; numA=numA+numB) {
						System.out.printf("|+\t\t\t\t\t\t\t\t|\n");
						numB=Leer.datoDouble();
						
					}
					System.out.printf("|El resultado de la suma es %f.\t\t\t|", numA);
					System.out.printf("\n|---------------------------------------------------------------|\n\n");
					System.out.printf("Reiniciando programa.....\n\n");		
					break;
					
			case 2:
					System.out.printf("\n|---------------------------------------------------------------|\n");
					System.out.printf("|Introduzca los número que desea restar.\t\t\t|\n");
					for(numA=Leer.datoDouble(); numB!=0; numA=numA-numB) {
						System.out.printf("|-\t\t\t\t\t\t\t\t|\n");
						numB=Leer.datoDouble();
						
					}
					System.out.printf("|El resultado de la resta es %f.\t\t\t|", numA);
					System.out.printf("\n|---------------------------------------------------------------|\n\n");
					System.out.printf("Reiniciando programa.....\n\n");	
					break;
				case 3:
					System.out.printf("\n|---------------------------------------------------------------|\n");
					System.out.printf("|Introduzca los número que desea multiplicar.\t\t\t|\n");
					for(numA=Leer.datoDouble(); numB!=0; numA=numA*numB) {
						System.out.printf("|x\t\t\t\t\t\t\t\t|\n");
						numB=Leer.datoDouble();
						if (numB==0) {
							System.out.printf("|El resultado de la multiplicación es %f.\t\t|", numA);
							System.out.printf("\n|---------------------------------------------------------------|\n\n");
							System.out.printf("Reiniciando programa.....\n\n");	
							break;
						}
					}
				case 4:
					System.out.printf("\n|---------------------------------------------------------------|\n");
					System.out.printf("|Introduce el número que desea dividir:\t\t\t\t|\n");
					numA=Leer.datoDouble();
					System.out.printf("|Introduce el número por el que lo desea dividir:\t\t|\n");
					do {
						numB=Leer.datoDouble();
						if(numB==CERO) {
							System.out.printf("|No es posible dividir por cero, introduzca otro número\t\t|\n");
						}
						}while (numB==0);
					cocDiv=numA/numB;
					System.out.printf("|El cociente de la división es %f\t\t\t\t|", cocDiv);
					System.out.printf("\n|---------------------------------------------------------------|\n\n");
					System.out.printf("Reiniciando programa.....\n\n");
					break;
				case 5:
					System.out.printf("\n|---------------------------------------------------------------|\n");
					System.out.printf("|Introduce el número del cual desea consultar su paridad\t|\n");
					numA=Leer.datoDouble();
					numA=numA%DOS;
					if (numA==CERO) {
						System.out.printf("|El número introducido es par\t\t\t\t\t|");
						System.out.printf("\n|---------------------------------------------------------------|\n\n");
						System.out.printf("Reiniciando programa.....\n\n");
					}
					else {
						System.out.printf("|El número introducido es impar\t\t\t\t\t|");
						System.out.printf("\n|---------------------------------------------------------------|\n\n");
						System.out.printf("Reiniciando programa.....\n\n");
					}
					
					break;
				case 6:
					rept=CERO;
					break;
			}
		} while (rept==UNO);
		System.out.printf("Muchas gracias por usar este programa!");
	}

}
