package ejArray04;

import java.util.Random;
import lectura.Leer;
public class Principal {

	public static void main(String[] args) {
		int hasta=99, desde=0, nume=0, limite=0, numArray=0, nAleat=0, read=0, verif=1, UNO=1;
		int [] array;
		Random rnd= new Random (System.nanoTime());
		System.out.printf("Introduzca cuantos números desea generar y almacenar:\n");
		limite=Leer.datoInt();
		array= new int[limite];
		System.out.printf("Diga el menor número a generar:\n");
		desde=Leer.datoInt();
		System.out.printf("Diga el mayor número a generar:\n");
		hasta=Leer.datoInt();
		
		for (int num=0; num < array.length; num++){	
			array[num+UNO]=rnd.nextInt(hasta-desde);
		}
		do {
		System.out.println("Diga qué elemento de la lista quiere leer o escriba -1 para salir:");
		read=Leer.datoInt();
			do {
				if(read>array.length|read<=0) {
					verif=0;
					System.out.printf("Numero no válido, introduzca un nuevo número. Recuerde que el maximo para este array es %d", array.length);
					read=Leer.datoInt();
				}
				else {
					verif=1;
				}
			}while(verif==0);
		System.out.printf("En el elemento %d, se encuentra el número: %d\n", read, array[read]);
		}while(read!=-1);
		System.out.println("Muchas gracias por usar el programa!");
	}
}