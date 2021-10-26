package ejerc01;
import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bienvenido. Este programa comparará cual es el numero mayor entre dos números introducidos.");
		double numA=0, numB=0;
		System.out.println("Introduzca el primer número:");
		numA=Leer.datoDouble();
		System.out.println("Introduzca el segundo número:");
		numB=Leer.datoDouble();
			if (numA==numB) {
				System.out.println("Los numeros son iguales, o su diferencia es menor a 0.00000001 unidades.");
			}
			else {
				if (numA<numB) 
					System.out.printf("El primer número (%f) es menor al segundo numero (%f)\n\n8", numA, numB);
				System.out.printf("El primer número (%f) es mayor al segundo numero(%f)", numA, numB);
		
			}
		System.out.println("Muchas gracias por usar este programa!");
		}

}
