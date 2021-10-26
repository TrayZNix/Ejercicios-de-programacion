package ejerc09;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		int input=0, num=0;
		System.out.printf("Bienvenido. Este programa realizará la suma de los digitos que introduzca. La suma finaliza al introducir un numero negativo.\n\n");
		System.out.println("Introduzca un número positivo. Recuerde: para finalizar la operacion, escriba un número negativo (Este no se operará)");
		
		if (input>=0) {
			while (input>=0) {
				System.out.println("Introduzca el siguiente número:");
				input=Leer.datoInt();	
				num=num+input;
		
			}
			
		
		}
		
		num=num-input;
		System.out.printf("\n----------------------------------------------------------\n");
		System.out.printf("La suma de todos los números que ha introducido es: %d",num);
	}
}
