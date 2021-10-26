package ejerc08;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		//VARIABLES
		int i=0, sum=0, mult=1, count=0, DIEZ=10, restan=0, CERO=0;
		//PRESENTACIÓN
		System.out.println("Bienvenido. Este programa le calculará la suma de una secuencia de dígitos, y el producto de todos ellos");
		//DESARROLLO
		System.out.printf("Introduzca 10 números para operarlos:\n", restan);
		while (count<DIEZ) {
			restan=DIEZ-count;
			if (count>CERO) {
				System.out.printf("\n(Le faltan %d números por introducir) Introduzca los numeros a operar:\n", restan);
				}
			i=Leer.datoInt();
			count++;
			sum=sum+i;
			mult=i*mult;
		} 
		System.out.println(i);
		System.out.println(mult);
		System.out.printf("\nEl resultado de la suma de todos los dígitos introducidos es %d\n", sum);
		System.out.printf("-----------------------------------------------------------------\n");
		System.out.printf("El resultado de la multiplicación de todos los dígitos introducidos es %d", mult);
		
	}

}
