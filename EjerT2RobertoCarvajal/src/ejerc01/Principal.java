package ejerc01;
import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bienvenido. Este programa comparar� cual es el numero mayor entre dos n�meros introducidos.");
		double numA=0, numB=0;
		System.out.println("Introduzca el primer n�mero:");
		numA=Leer.datoDouble();
		System.out.println("Introduzca el segundo n�mero:");
		numB=Leer.datoDouble();
			if (numA==numB) {
				System.out.println("Los numeros son iguales, o su diferencia es menor a 0.00000001 unidades.");
			}
			else {
				if (numA<numB) 
					System.out.printf("El primer n�mero (%f) es menor al segundo numero (%f)\n\n8", numA, numB);
				System.out.printf("El primer n�mero (%f) es mayor al segundo numero(%f)", numA, numB);
		
			}
		System.out.println("Muchas gracias por usar este programa!");
		}

}
