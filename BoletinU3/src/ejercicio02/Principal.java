package ejercicio02;

import lectura.leer;

public class Principal {
	
	public static void main(String[] args) {
		int num = 0;
		Positividad positividad;
		
		System.out.println("Bienvendio. Este programa le ayudará a calcular si un número es positivo o negativo, o si es par o impar");
		System.out.println("Para comenzar, por favor, introduzca un número");
		num=leer.datoInt();
		positividad = new operaciones();
		
		System.out.println(positividad.generarPositivoNegativo(num));

	}

}
