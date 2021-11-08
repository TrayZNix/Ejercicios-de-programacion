package tienda;
import java.util.Random;
import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	DECLARAMOS LAS VARIABLES QUE VAMOS A UTILIZAR EN EL PROGRAMA
		
		int numCalcetines=0, numMax = 0, numMin = 0, op=0, Rcount=0, UNO=1, CERO=0, CIEN=100, indice=0;
		int [] preciosCalcetines;
		double media=0, suma=0, Rprecio=0, porcMedia=0;
		boolean ended=false, endedB=false;
		Random r = new Random(System.nanoTime());
		
		
		System.out.println("<<BIENVENIDO>>");
		System.out.println("\nEste programa le ayudará a gestionar\nlos precios de su almacen de calcetines.\nComencemos:");
		
		System.out.println("\nIndique la cantidad de tipos de calcetines que posee en su almacen.\nIndique 0 para salir del programa:");
		numCalcetines=Leer.datoInt();
		
		if (numCalcetines==0) {
			
			System.out.println("\n<<HA SALIDO DEL PROGRAMA>>");
			System.out.println("<<MUCHAS GRACIAS>>");
			
		} else {
			
			preciosCalcetines = new int [numCalcetines];
			
			do {
				
				System.out.println("\n<<CARGANDO MENÚ>>");
				System.out.println("<<MENÚ CARGADO CORRECTAMENTE>>");
				System.out.println("\nMarque el número de la opción que quiera realizar.");
				System.out.println("\t1. Asignar precios a los calcetines."
						+ "\n\t2. Mostrar datos generados."
						+ "\n\t3. Calcular media de precios." //DAVID
						+ "\n\t4. Mostrar precio de calcetín concreto." //DAVID
						+ "\n\t5. Mostrar cuántos calcetines valen un precio concreto." //YO
						+ "\n\t6. Indicar porcentaje de diferencia respecto a un precio concreto y la media de todos los precios." //YO
						+ "\n\t0. Salir.");
				op=Leer.datoInt();
				
				switch (op) {
				
				case 1:
					System.out.println("Ha elegido la opción: Asignar precios a los calcetines");
					System.out.println("Indique el precio máximo a generar:");
					numMax=Leer.datoInt();
					System.out.println("Indique el precio mínimo a generar");
					numMin=Leer.datoInt();
					
					if (numMax<0) {
						
						System.out.println("<<ERROR>>\nHa introducido un valor erróneo.\nPruebe a introducir un valor máximo mayor que 0.");
						
					} else if (numMin<0) {
						
						System.out.println("<<ERROR>>\nHa introducido un valor erróneo.\nPruebe a introducir un valor mínimo mayor que 0.");
						
					} else {
						
						for (int i = 0; i < preciosCalcetines.length; i++) {
							int numRandom = r.nextInt(numMax - numMin + UNO) + numMin;
							preciosCalcetines[i] = numRandom;
						}
						
						System.out.println("\n\n<<ASIGNANDO PRECIOS>>\n<<PRECIOS ASIGNADOS CORRECTAMENTE>>");
					endedB=true;
					}
					break;

				case 2:
					System.out.println("Ha elegido la opción: Mostrar datos generados.");
					System.out.println("_________________________________________________");
					System.out.println("|\tID CALCETÍN\t\tPRECIO\t\t|");
					
					for (int i = 0; i < preciosCalcetines.length; i++) {
			
						System.out.println("|\t  <<" + (i + 1) + ">> \t\t  " + preciosCalcetines[i]+"€ \t\t|");
						
					}
					
					System.out.println("|_______________________________________________|");

					break;
					
				case 3:
					media=0;
					suma=0;
					System.out.println("Ha elegido la opción: Calcular media de precios.");
					for (int i = 0; i < preciosCalcetines.length; i++) {
							suma = suma + preciosCalcetines[i];
					}
					media = suma / preciosCalcetines.length;
					System.out.printf("La media de precios es: %.2f € \n", media);
					ended=true;
					break;
					
				case 4:
					if (endedB) {
					System.out.println("Ha elegido la opción: Mostrar precio de un calcetín concreto.");
					do {
						System.out.println("¿Qué calcetín quiere ver? Puede pulsar 0 para salir.");
						indice = Leer.datoInt();
						if (indice > preciosCalcetines.length|| indice < UNO) {
							System.out.println("ERROR, por favor introduzca un valor entre uno y el limite ");
							
						}
						else{
							System.out.println("El precio del calcetín " + indice + " es de: " + preciosCalcetines[indice - UNO] + "€");
						}
						} while (indice!=0);
					}
					else {
						System.out.println("----------------------------------------------------------");
						System.out.println("ERROR. Necesita realizar el paso 1 antes de realizar este.");
						System.out.println("----------------------------------------------------------");
					}
					
					break;
					
				case 5:
					System.out.printf("¿Cual es el precio con el que desea comparar\n?");
					Rprecio=Leer.datoInt();
					Rcount=CERO;
					for (int i=0; i<numCalcetines; i++) {
						if (preciosCalcetines[i]==Rprecio) {
							Rcount++;
						}
					}
					if (Rcount==UNO) {
						System.out.println("----------------------------------------------------------");
						System.out.printf("Hay %d calcetin con un precio de %d€\n", Rcount, Rprecio);
						System.out.println("----------------------------------------------------------");
					}
					if (Rcount>1) {
						System.out.println("----------------------------------------------------------");
						System.out.printf("Hay %d calcetines con un precio de %d€\n", Rcount, Rprecio);
						System.out.println("----------------------------------------------------------");
						}
					else {
						System.out.println("----------------------------------------------------------");
						System.out.printf("No hay calcetines con un precio de %d€\n", Rprecio);
						System.out.println("----------------------------------------------------------");
					}
					break;
				case 6:
					if (ended) {
					System.out.printf("¿Cual es su precio de referencia?\n");
					Rprecio=Leer.datoDouble();
					porcMedia=(Rprecio-media)*CIEN/media;
					if(porcMedia>0) {
						porcMedia=porcMedia+CIEN;						
					}
					if(porcMedia<0) {
						porcMedia=porcMedia-CIEN;						
					}
					System.out.printf("\n %.2f es un %.2f%% de diferente respecto a la media", Rprecio, porcMedia);
					}
					
					else {
						System.out.println("----------------------------------------------------------");
						System.out.printf("Debes calcular la media antes de realizar este apartado\n");
						System.out.printf("Puedes realizarla en el apartado: 3\n");
						System.out.println("----------------------------------------------------------");
					}
					break;
				default:
					break;
				}
				
			} while (op!=0);
			
			
		}
			
	}

}
