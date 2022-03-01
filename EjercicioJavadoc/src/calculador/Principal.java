package calculador;

import lectura.leer;

/**
 * Esta clase contiene el menú donde se llamara a la clase cálculos
 * @version 1.0, 12/02/2022
 * @author Roberto
 *
 */
public class Principal {

	public static void main(String[] args) {
		/**
		 * La variable selector nos sirve para seleccionar la operación que desea realizar el usuario
		 */
		int selector = 0;
		/**
		 * La variable i y la variable j sirven para almacenar los valores que desea operar el usuario
		 */
		double i = 0, j = 0;
		/**
		 * La variable loop sirve para hacer que el menú se repita hasta que el usuario lo desee
		 */
		boolean loop = true;
		/**
		 * Llamada a la clase "calculos"
		 */
		Calculos c = new Calculos();
		do {
			System.out.printf("\n\n\n");
			System.out.println("Elija que desea hacer");
			System.out.println("------------------------------------");
			System.out.println("0. Salir");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Calcular minimo común múltiplo");
			System.out.println("6. Calcular máximo común divisor");
			selector = leer.datoInt();
			switch (selector) {
				default:
					System.out.println("Error al leer, intentelo de nuevo");
					break;
				case 0:
					loop = false;
					break;
				case 1:
					System.out.println("¿Qué número desea sumar?");
					i = leer.datoDouble();
					System.out.println("¿Con qué otro número lo desea sumar?");
					j = leer.datoDouble();
					System.out.println("El resultado de la suma es "+c.sumar(i, j));
					break;
				case 2:
					System.out.println("¿Qué número desea restar?");
					i = leer.datoDouble();
					System.out.println("¿Cuánto desea restarle a "+i+"?");
					j = leer.datoDouble();
					System.out.println("El resultado de la resta es "+ c.restar(i, j));
					break;
				case 3:
					System.out.println("¿Qué número desea mutliplicar?");
					i = leer.datoDouble();
					System.out.println("¿Con qué otro número lo desea multiplicar?");
					j = leer.datoDouble();
					System.out.println("El resultado de la multiplicación es "+c.multiplicar(i, j));
					break;
				case 4:
					System.out.println("¿Qué número desea dividir?");
					i = leer.datoDouble();
					System.out.println("¿Entre cuanto desea dividirlo?");
					j = leer.datoDouble();
					System.out.println("El resultado de la división es "+ c.dividir(i, j));
					break;
				case 5:
					System.out.println("Introduzca el primer número");
					i = leer.datoDouble();
					System.out.println("Introduzca el segundo número");
					j = leer.datoDouble();
					System.out.println("El mínimo común múltiplo es "+c.calcularMCM(i, j));;
					break;
				case 6:
					System.out.println("Introduzca el primer número");
					i = leer.datoDouble();
					System.out.println("Introduzca el segundo número");
					j = leer.datoDouble();
					System.out.println("El máximo común divisor es "+c.calcularMCD(i, j));;
					break;
			}
		}while(loop);
		System.out.println("Gracias por usar esta calculadora!");
	}

}
