package ejercicio06;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		
		boolean loop = true, loopQuest = false;
		int selector, contraseña, fila, butaca;
		double precio;
		String pelicula;
		Sala s = new Sala();
		
		do {
		System.out.printf("\n\n\n");
		System.out.println("Elija que hacer");
		System.out.println("------------------------------");
		System.out.println("0. Salir");
		System.out.println("1. Ver la cartelera");
		System.out.println("2. Comprar una entrada");
		System.out.println("3. Ver butacas libres");
		System.out.println("4. Opciones de administrador");
		System.out.printf("\n\n\n");
		selector = leer.datoInt();
		switch (selector ) {
			case 0:
				loop = false;
				break;
				
			case 1:
				System.out.println("La pelicula de hoy es "+s.getPeliculaMostrada());
				break;
				
			case 2:
				do {
					System.out.println("¿Quieres ver las butacas libres?");
					System.out.println("1: Sí        2: No");
					selector = leer.datoInt();
					switch (selector) {
						case 1:
							s.verButacasLibres();
							loopQuest = false;
							break;
						case 2:
							loopQuest = false;
							break;
						default:
							System.out.println("Error al leer. Por favor, escriba de nuevo");
							loopQuest = true;
							break;
					}
				}while(loopQuest);
				loopQuest = false;
				do {
					System.out.println("¿En que fila se quiere sentar?");
					do {
						fila = leer.datoInt();
						if (fila >= 1 && fila <= 2) loopQuest = false;
						else {
							System.out.println("Elija fila 1 o 2, por favor");
							loopQuest = true;
						}
					}while(loopQuest);
					do {
						System.out.println("¿En que butaca desea sentarse?");
						butaca = leer.datoInt();
						if (butaca >= 1 && butaca <= 5) loopQuest = false;
						else {
							System.out.println("Elija una butaca de 1 a 5, por favor");
							loopQuest = true;
						}
					}while(loopQuest);
					s.venderEntrada(fila, butaca);
				}while(loopQuest);
				break;
			
			case 3:
				s.verButacasLibres();
				break;
			case 4:
				System.out.println("Introduzca la contraseña de administrador: ");
				contraseña = leer.datoInt();
				if(contraseña == s.getContraseña()) {
					do {
						System.out.printf("\n\n\n");
						System.out.println("Por favor, elija que desea hacer");
						System.out.println(".......................................................");
						System.out.println("0. Volver atras");
						System.out.println("1. Ver las ganancias de hoy");
						System.out.println("2. Modificar el precio de la entrada");
						System.out.println("3. Cambiar la película a mostrar");
						System.out.printf("\n\n\n");
						selector = leer.datoInt();
						switch (selector) {
							case 0:
								loop = false;
								break;
							case 1:
								System.out.println("Hasta ahora se han recaudado "+Sala.getRecaudado()+"€");
								break;
							case 2:
								System.out.println("¿A qué precio quiere poner la entrada?");
								do {
									precio = leer.datoDouble();
									if (precio < 0) System.out.println("Debes poner un precio mayor o igual a 0");
								}while (precio < 0);
								Entrada.setPrecio(precio);
								System.out.println("Precio de entradas actualizado a "+Entrada.getPrecio()+"!");
								break;
							case 3:
								System.out.println("Introduzca el nombre de la nueva película");
								pelicula = leer.dato();
								s.setPeliculaMostrada(pelicula);
								System.out.println("Nombre actualizado con exito!");
								break;
							default:
								System.out.println("Error al leer");
								break;
						}
					}while(loop);
					loop = true;
					
				}
				else {
					System.out.println("Contraseña incorrecta");
				}
				
				break;
				
			
		}
		}while(loop);
		System.out.println("Gracias por usar este programa!");
	}
	

}
