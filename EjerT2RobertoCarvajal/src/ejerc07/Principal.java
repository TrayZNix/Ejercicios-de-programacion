package ejerc07;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		int numA=0, numB=0, result=0, max=0, ret=0;
		System.out.printf("Este programa calculará la tabla de multiplicar hasta un número, del digito que desees. \n");
		do {
			//RESETEAMOS EL VALOR B PARA EVITAR ERRORES AL REALIZAR EL BUCLE
			numB=0;			
			//INTRODUCIMOS LOS VALORES EN LA CONSOLA
			System.out.println("Introduce el número a multiplicar o introduzca '0' para salir.");
			numA=Leer.datoInt();
			if(numA==0) {
				ret=1;
			}
			
			if (ret!=1){
				System.out.printf("¿Hasta qué numero quieres multiplicar el número %d?\n", numA);
				max=Leer.datoInt();
				while (numB<max) {
					numB++;
					result=numA*numB;
						System.out.printf("%d x %d = %d\n",numA, numB, result);
				
				}
			}
		
		System.out.println("Gracias por usar este programa!");
		}while (ret!=1);

	}
}
