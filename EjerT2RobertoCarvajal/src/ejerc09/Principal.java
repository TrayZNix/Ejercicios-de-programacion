package ejerc09;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		int input=0, num=0;
		System.out.printf("Bienvenido. Este programa realizar� la suma de los digitos que introduzca. La suma finaliza al introducir un numero negativo.\n\n");
		System.out.println("Introduzca un n�mero positivo. Recuerde: para finalizar la operacion, escriba un n�mero negativo (Este no se operar�)");
		
		if (input>=0) {
			while (input>=0) {
				System.out.println("Introduzca el siguiente n�mero:");
				input=Leer.datoInt();	
				num=num+input;
		
			}
			
		
		}
		
		num=num-input;
		System.out.printf("\n----------------------------------------------------------\n");
		System.out.printf("La suma de todos los n�meros que ha introducido es: %d",num);
	}
}
