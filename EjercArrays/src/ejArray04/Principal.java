package ejArray04;

import java.util.Random;
import lectura.Leer;
public class Principal {

	public static void main(String[] args) {
		int hasta=99, desde=0, limite=0, read=0, verif=1, UNO=1, aleatAArray=0;
		int [] array;
		Random aleat= new Random (System.nanoTime());
		System.out.printf("Introduzca cuantos números desea generar y almacenar:\n");
		limite=Leer.datoInt();
		array= new int[limite];
		System.out.printf("Diga el menor número a generar:\n");
		desde=Leer.datoInt();
		System.out.printf("Diga el mayor número a generar:\n");
		hasta=Leer.datoInt();
		
		for(int num=1; num>=limite; num++) {
			aleatAArray=aleat.nextInt(hasta-desde+1);
			array[num]=aleatAArray;
		}
		System.out.println("Diga qué elemento de la lista quiere leer o escriba -1 para salir:");
		System.out.printf("Número no válido, introduzca un nuevo número. Recuerde que el maximo para este array es %d.\n", array.length);
		System.out.printf("read %d",read);
		System.out.printf("limite %d", limite);
		System.out.printf("En el elemento %d, se encuentra el número: %d\n", read, array[read]);
		System.out.println("Muchas gracias por usar el programa!");
	}
}