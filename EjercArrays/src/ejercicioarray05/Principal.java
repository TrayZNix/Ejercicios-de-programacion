package ejercicioarray05;

import java.util.Random;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		int hasta=99, desde=0, limite=0, aleatInt=0, suma=0;
		int [] numeros;
		int [] maxmin;
		Random aleat= new Random (System.nanoTime());
		System.out.printf("Introduzca el máximo de números que desea generar y almacenar:\n");
		limite=Leer.datoInt();
		numeros= new int[limite];
		maxmin= new int [limite];
		System.out.printf("Diga el menor número aleatorio a generar:\n");
		desde=Leer.datoInt();
		System.out.printf("Diga el mayor número aleatorio a generar:\n");
		hasta=Leer.datoInt();
		//INTRODUCIMOS LOS VALORES ALEATORIOS EN EL ARRAY
		for(int numC=0; numC<limite; numC++) {
			aleatInt=aleat.nextInt(hasta-desde);
			numeros[numC]=aleatInt;
		}
		//REALIZAMOS LA SUMA
		for (int numS=0; numS<limite; numS++) {
			suma=suma+numeros[numS];
		}
		System.out.printf("La suma de todos los números del array es: %d.",suma);
			
		//BUSCAMOS EL MAYOR	
		for (int numMa=0; numMa<limite; numMa++) {
			maxmin[numMa]=numeros[numMa];
		}

	}

}
