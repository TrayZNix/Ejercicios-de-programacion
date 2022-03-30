package ejemploClase;

import java.util.ArrayList;
import java.util.List;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*  He montado una tienda de videojuegos y quiero tener un listado de todos los videojuegos que entran en la tienda.
		    Para ello tendremos que crear una clase Videojuego que tendrá los atributos principales de estos:
		    Nombre, fecha de lanzamiento, duración (en minutos), calificación de prensa, categoría y la plataforma en la que es jugado. 
		    Además tendremos una clase Tienda para la gestión de esta, la cual tendrá una lista de Videojuegos.

			Queremos poder mostrar la lista de videojuegos con el uso de Stream y ordenarlos por nombre alfabéticamente. 
			Además también se deberían mostrar los juegos que mayor y menor duración tienen, para contentar a aquellos jugadores que quieran un reto, 
			o a los que quieran aprovechar sus pequeños ratos. También uno de sus métodos debería ser para sumar todas las duraciones de los juegos, 
			para poder utilizarlo como publicidad de las horas de diversión que puede brindarte la tienda. 

			Sería de utilidad que la tienda tuviera un método para sacar una lista de categorías de los juegos y otra de plataformas, de cara a la base de datos.

			Y finalmente para que la tienda no tuviera una mala imagen deberíamos tener un método que compruebe que todos nuestros videojuegos superan
			el 5 de calificación de prensa. Y poder asegurar así la calidad de nuestros productos. Además realizar otro método que compruebe 
			si hay alguno que tenga una nota mayor que 9.5.

			Todos estos métodos (excepto el ordenar) deben ser realizados a través del uso de Stream.
		 */
		
		int opcion;
		List <Videojuego> lista = new ArrayList<Videojuego>();
		
		lista.add(new Videojuego("Uncharted 2", "Accion", "13-10-2009", "PS3", 630, 9.6));
		lista.add(new Videojuego("Elden Ring", "Mundo Abierto", "25-02-2022", "PC", 2760, 9.3));
		lista.add(new Videojuego("Horizon Forbidden West", "Mundo Abierto", "18-02-2022", "PS5", 1650, 9.4));
		lista.add(new Videojuego("God of War(2018)", "Aventura", "20-04-2018", "PS4", 1260, 9.5));
		lista.add(new Videojuego("The Witcher 3", "Mundo Abierto", "18-05-2015", "PC", 3060, 9.5));
		
		Tienda op = new Tienda(lista);
		
		System.out.println("Bienvenido a la tienda de videojuegos Pepe.");
		
		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("0. Salir.");
			System.out.println("1. Mostrar videojuegos.");
			System.out.println("2. Ordenar por nombre.");
			System.out.println("3. Buscar el juego de menor duración.");
			System.out.println("4. Buscar el juego de mayor duración.");
			System.out.println("5. Sacar lista de categorías.");
			System.out.println("6. Sacar lista de plataformas.");
			System.out.println("7. Sumar duraciones de los juegos.");
			System.out.println("8. Comprobar si todas las notas son mayor que 5.");
			System.out.println("9. Comprobar si alguna nota es mayor que 9.5.");
			
			opcion = Leer.datoInt();
			
			switch(opcion) {
				case 0:
					break;
				case 1:
					op.mostrarLista();
					break;
				case 2:
					op.ordenarNormal();
					break;
				case 3:
					System.out.println(op.buscarMenorDuracion());
					break;
				case 4:
					System.out.println(op.buscarMayorDuracion());
					break;
				case 5:
					System.out.println(op.sacarCategorias());
					break;
				case 6:
					System.out.println(op.sacarPlataformas());
					break;
				case 7:
					System.out.println("Duración total: "+op.sacarDuracionTotal());
					break;
				case 8:
					if(op.comprobarCalificacion()) {
						System.out.println("Todos los juegos superan el 5 de calificación.");
					}else {
						System.out.println("No todos los juegos superan el 5 de calificación.");
					}
					break;
				case 9:
					if(op.comprobarCalificacionNueve()) {
						System.out.println("Alguno de los juegos tiene una calificación mayor que 9.5");
					}else {
						System.out.println("Ningún juego tiene una calificación mayor que 9.5.");
					}
					break;
				default:
					System.out.println("Por favor seleccione una opción correcta.");
			}
			
		}while(opcion != 0);
		
		System.out.println("Gracias por usar este programa.");
		
	}

}
