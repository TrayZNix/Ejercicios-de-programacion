package ejercicio05;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bienvenido. En este programa podra jugar a cuatro posibles juegos");
		
		String quin = "La quiniela", parnes = "Pares o nones", chin = "Los chinos", prim = "Primitiva", sal = "Salir", res="";
		int selector = 0, exit = 0, parImp, compa;
		Juegos juegos;
		do {
		System.out.printf("\n------------------------------------------------------\n");
		System.out.printf("¿A qué desea jugar?\n");
		System.out.printf("1.%s\n", quin);
		System.out.printf("2.%s\n", parnes);
		System.out.printf("3.%s\n", chin);
		System.out.printf("4.%s\n", prim);
		System.out.printf("0.%s\n", sal);
		selector = leer.datoInt();
		switch (selector ) {
			case 1:
				juegos = new Juegos ();
				res= juegos.quiniela();
				System.out.printf("El resultado es: %s", res);
				break;
				
			case 2:
				System.out.printf("Elija número par o impar, de 0 a 10");
				parImp=leer.datoInt();
				juegos = new Juegos (parImp);
				//TODO COMPARADOR RESULTADO METODO Y ELECCION JUGADOR
				compa= juegos.paresnones();
				System.out.println(compa);
				
				break;
			case 3:
				break;
			case 4:
				break;
			case 0:
				exit = 1;
				break;
		}
		}while (exit != 1);
		System.out.println("Muchas gracias por haber usado este programa");

	}

}
