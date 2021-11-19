package ejercicio04;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		Copiado copia;
		String text;
		int veces = 0;
		
		System.out.println("Bienvenido, este programa le copiara el texto que desee, las veces que quiera");
		do {
			System.out.println("¿Qué texto deseas repetir?");
			text=leer.dato();
			System.out.println("¿Cuantas veces quieres que se repita? Escribe 0 para salir");
			veces=leer.datoInt();
			copia = new Copiado(text, veces);
			copia.copiaText(text, veces);
							
			}while (veces != 0);
		System.out.println("Muchas gracias por usar este programa");
		
	}

}
