package ejercicio1;
import lectura.Leer;

import java.security.DrbgParameters.NextBytes;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		/*Crear array unidimensional. Crear un menu. Case 1 (Generar aleatoriamente el numero de litros recogidos),
		case 2 (Mostrar los datos por columnas), case 3(Mostrar los litros caidos en un dia), case 4 (Mostrar los dias 
		que ha llovido algo), case 5(Calcular y mostrar la media de lluvia), case 6(Calcular el porcentaje de lluvia caida 
		en un dia siendo 15 litros el 100%).*/
		
		int limite=0, dia=0, selector=0, selecMenuC=0, hasta=0, desde=0, dato=0, exit=0, fail=1, leerDato=0, mediaReferencia=15;
		int  totLlovidos=0, CERO=0, UNO=1, CIEN=100, diaPorc=0;
		double mediaLluvia=0, porcent=0, totalLluvia=0;
		int [] pluv;
		String opcA="Generar datos de Lluvia", opcB="Mostrar datos en columnas", opcC="Litros caidos en un dia";
		String opcD="Mostrar número de dias de lluvia", opcE="Media de lluvia", opcF="Porcentaje de lluvia respecto a 15 litros", opcG="Salir";
		Random num= new Random(System.nanoTime());
		
		System.out.println("¿De cuantos dias quiere almacenar los datos de lluvia?");
		limite=Leer.datoInt();
		pluv = new int [limite];
		
		//PRESENTACION MENU
		do {
		System.out.printf("\n---------------------------------------------------------------------");	
		System.out.printf("\n¿Qué acción desea realizar?\n");
		System.out.printf("1.%s\n", opcA);
		System.out.printf("2.%s\n", opcB);
		System.out.printf("3.%s\n", opcC);
		System.out.printf("4.%s\n", opcD);
		System.out.printf("5.%s\n", opcE);
		System.out.printf("6.%s\n", opcF);
		System.out.printf("7.%s\n", opcG);
		System.out.printf("---------------------------------------------------------------------");
		selector=Leer.datoInt();
		switch (selector) {
			//RELLENAR ALEAT
			case 1:
				System.out.printf("Introduzca el máximo numero de litros a generar:");
				hasta=Leer.datoInt();
				System.out.printf("Introduzca el mínimo numero de litros a generar:");
				desde=Leer.datoInt();				
				for (int i=0; i<limite; i++) {
					dato=num.nextInt(hasta-desde+UNO);
					pluv[i]=dato;
				}
				System.out.printf("\nDatos almacenados correctamente");
				break;
			case 2:
				System.out.printf("Dia\t\t Cantidad\n");
				for (int i=0; i<limite; i++) {
					
					dia=i+UNO;
					System.out.printf("%d\t\t%d\n", dia, pluv[i]);
				}
				break;
			case 3:
				fail=UNO;
				do {
				System.out.printf("\n-Introduzca el número del día que desea consultar o 0 para salir\n");
				System.out.printf("-Recuerde, el número máximo de consulta es %d\n", limite);
				selecMenuC=Leer.datoInt();
				if(selecMenuC>=limite) {
					fail=UNO;
					System.out.println("---------------------------------------------------------------------");
					System.out.printf("\nError. Elija un día menor o igual al número de dias almacenados\n");
					System.out.println("---------------------------------------------------------------------");
				}
				else if(selecMenuC<=CERO) {
					fail=UNO;
					System.out.println("-------------------------------------------------------------------");
					System.out.printf("\nErorr. Por favor, elija un valor entre %d y %d\n", UNO, limite);
					System.out.println("-------------------------------------------------------------------");
				}
				else {
					fail=CERO;
					dia=selecMenuC;
					leerDato=selecMenuC-1;
					System.out.println(pluv[0]);
					System.out.printf("El día %d cayeron %d litros",dia, pluv[leerDato]);
				}
				}while (fail==UNO);
				break;
			case 4:
				for(int i=0; i<limite; i++) {
					if (pluv[i]>0) {
						totLlovidos++;
					}
				}
				System.out.printf("Ha llovido un total de %d dias.", totLlovidos);					
				break;
			case 5:
				for(int i=0; i<limite; i++) {
					totalLluvia=totalLluvia+pluv[i];
					}
				mediaLluvia=totalLluvia/(limite-UNO);
				System.out.printf("Ha llovido una media de %.2f litros diarios", mediaLluvia);
				break;
			case 6:
				System.out.printf("¿Qué día desea consultar?");
				diaPorc=Leer.datoInt();
				if(diaPorc>limite) {
					fail=UNO;
					System.out.println("---------------------------------------------------------------------");
					System.out.printf("\nError. Elija un día menor o igual al número de dias almacenados (%d)\n", limite);
					System.out.println("---------------------------------------------------------------------");
				}
				else if(diaPorc<=CERO) {
					fail=UNO;
					System.out.println("-------------------------------------------------------------------");
					System.out.printf("\nErorr. Por favor, elija un valor entre %d y %d\n", UNO, limite);
					System.out.println("-------------------------------------------------------------------");
				}
				else {
					porcent=pluv[diaPorc-UNO]*CIEN/mediaReferencia;
					System.out.printf("Siendo %d la lluvia media de referencia, cayó un %.2f%% el día %d", mediaReferencia, porcent, diaPorc);
				}
					break;
			case 7:
				exit=1;
				break;
				
			default:
				System.out.println("Entrada desconocida, seleccione de nuevo");
				break;
			}
		}while (exit!=UNO);
		System.out.printf("\n\nMuchas gracias por usar este programa!");
		
	}

}
