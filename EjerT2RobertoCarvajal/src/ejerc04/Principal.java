package ejerc04;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		//DECLARAMOS LAS VARIABLES
		int numero=0;
		char cont=0;
		//IMPONEMOS LAS CONDICIONES PARA SABER SI ES PAR O IMPAR, 
		//Y UN BUCLE PARA PODER REPETIR UN ANALISIS SIN REINICIAR EL PROGRAMA
		do {
			System.out.println("Introduce el número a analizar");
			numero=Leer.datoInt();
		
			if (numero%2==0) {
				System.out.printf("Este número (%d) es par", numero);
			}
			else {
				System.out.printf("Este número (%d) es impar\n\n", numero);
			}
			
			System.out.println("¿Quiere continuar comprobando números? (S/N)");
			cont=Leer.datoChar();
		} while (cont==83);
		
		//DESPEDIDA
		System.out.println("Muchas gracias por usar este programa!");

	} 

}
