package TestScanner;

import java.io.*;

public class Principal {

	public static void main(String[] args) {
		String nombre;
		InputStreamReader flujo;
		BufferedReader teclado;
		
		flujo = new InputStreamReader(System.in);
		teclado = new BufferedReader(flujo);
		System.out.println("Escribe tu nombre: ");
		try {
			nombre = teclado.readLine();
			System.out.println("Su nombre es "+ nombre);
		}
		catch (Exception e) {
			System.out.println("No ha escrito nada");
		}

	}

}
