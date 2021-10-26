package ejerc02;
import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bienvenido. Este programa le ayudará a realizar la división de un numero, entre otro");
		double numA=0, numB=0, resul=0;
		System.out.println("Introduzca el número a dividir:");
		numA=Leer.datoDouble();
		System.out.printf("Introduzca por cuanto quiere dividir %f\n", numA);
		Leer.datoDouble();
		while (numB==0) {
			System.out.println("No es posible realizar una división por cero, por favor, introduzca otro número");
			numB=Leer.datoDouble();
		}
		resul=numA/numB;
		System.out.printf("El número %f, dividido entre %f, es %.2f\n", numA, numB, resul);
		System.out.println("Muchas gracias por usar el programa!");
		

		
		}
}
