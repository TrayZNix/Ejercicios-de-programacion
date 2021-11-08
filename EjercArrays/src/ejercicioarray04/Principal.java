package ejercicioarray04;

import java.util.Random;
import lectura.Leer;
public class Principal {

	public static void main(String[] args) {
		int hasta=99, desde=0, limite=0, read=0, UNO=1, aleatInt=0;
		int [] numeros;
		Random aleat= new Random (System.nanoTime());
		System.out.println("Bienvenido/a. Este programa almacenará numeros aleatorios situados entre los valores que desee,"
				+ " en un array de la longitud que usted prefiera ");
		System.out.printf("Introduzca cuantos números desea generar y almacenar:\n");
		limite=Leer.datoInt();
		numeros= new int[limite];
		System.out.printf("Diga el menor número a generar:\n");
		desde=Leer.datoInt();
		System.out.printf("Diga el mayor número a generar:\n");
		hasta=Leer.datoInt();
		
		for(int num=0; num<limite; num++) {
			aleatInt=aleat.nextInt(hasta-desde);
			numeros[num]=aleatInt;
		}
		do {
			System.out.printf("Diga qué elemento de la lista quiere leer (De 1 a %d) o escriba 0 para salir:", limite);
			read=Leer.datoInt()-UNO;
					if(read==-UNO) {
						break;
					}
					else if (read<-UNO){
						System.out.println("------------------------------------------------------------------------------------------");
						System.out.printf("\n---Error, introduzca valores positivos menores o iguales al límite (%d), o 0 para salir---\n\n", limite);
						System.out.println("------------------------------------------------------------------------------------------");
							
					}
					else if (read>=limite) {
						System.out.println("------------------------------------------------------------------------------------------");
						System.out.printf("\n---Error, introduzca menores o iguales al límite (%d), o 0 para salir---\n\n", limite);
						System.out.println("------------------------------------------------------------------------------------------");
					}
					else {
						System.out.printf("En el elemento %d, se encuentra el número: %d\n",read+UNO , numeros[read]);
					}			
			}while(read!=-UNO);				

		System.out.printf("\nMuchas gracias por usar el programa!");
		
	}
}