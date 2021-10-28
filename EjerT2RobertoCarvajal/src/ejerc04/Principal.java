package ejerc04;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		//DECLARAMOS LAS VARIABLES
		int numero=0, DOS=2, CERO=0;
		//IMPONEMOS LAS CONDICIONES PARA SABER SI ES PAR O IMPAR, 
		//Y UN BUCLE PARA PODER REPETIR UN ANALISIS SIN REINICIAR EL PROGRAMA
		do {
			System.out.println("Introduce el número a analizar o escriba 0 para salir del programa");
			numero=Leer.datoInt();
			if (numero==CERO) {
				break;
			}
			if (numero%DOS==CERO) {
				System.out.printf("\nEste número (%d) es par\n", numero);
			}
			else {
				System.out.printf("\nEste número (%d) es impar\n\n", numero);
			}
			
			
		} while (numero!=CERO);
		
		//DESPEDIDA
		System.out.println("Muchas gracias por usar este programa!");

	} 

}
