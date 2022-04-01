package ejercicio;

import java.time.LocalTime;
import java.util.HashMap;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		/*La F1 está en quiebra y ha pedido a los alumnos de 1ºDAM de los Salesianos de Triana 
		 * que hagamos un programa que intente "dirigir una carrera". Para ello necesitamos tres clases:
		 * Piloto: que tenga como atributos el número del mismo, el nombre y primer apellido y la escuderia
		 * en la que corre.
		 * Carrera: que tenga como atributos el nombre de la misma (Grand Prix), la distancia que se va a recorrrer
		 * y una colección donde guardemos todos los datos de la clasificación (Map<Piloto, LocalTime>).
		 * Todos los métodos deben poder ser probados mediante un menú en la clase Principal:
		 * Agregar un piloto más a la carrera (si se quiere)
		 * Generar segundos y nanosegundos aleatorios (los minutos siempre serán = 1 y los segundos se comprenderán entre 30 y 32, por ejemplo).
		 * Penalizar a un piloto o ayudarlo en el sentido de que están muy lejos de la cabeza de carrera
		 * Aplicar un formato de vuelta con la clase DateTimeFormatter
		 * Ordenar la lista por los tiempos de los pilotos
		 * Calcular el intervalo de tiempo que existe entre dos pilotos
		 * Modificar una vuelta de cualquier piloto
		 * Buscar el piloto o los pilotos más lentos
		 * Comparar la velocidad de dos pilotos y devolver el que haya sido más rápido.
		 * Mostrar únicamente los nanosegundos de la vuelta del piloto elegido por el usuario.
		 * Mostrar lista de pilotos sin ordenar
		 * Mostrar un piloto
		 * */
		
		int numMenu = 0, numPiloto = 0, numPiloto2 = 0, minutos = 0, segundos = 0, nanosegundos = 0;
		long segundosPenalizacion = 0;
		String nombre = "", apellido = "" , escuderia  ="", nombreCarrera = "Grand Prix Salesianos";
		double distancia = 317.6;
		Piloto p;
		Carrera c = new Carrera(nombreCarrera, distancia, (new HashMap<Piloto, LocalTime>()));
		
		c.agregarPiloto(new Piloto(16, "Charles", "Leclerc", "Ferrari"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(55, "Carlos", "Sainz", "Ferrari"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(1, "Max", "Verstappen", "Red Bull"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(11, "Sergio", "Pérez", "Red Bull"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(44, "Lewis", "Hamilton", "Mercedes"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(63, "George", "Russell", "Mercedes"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(20, "Kevin", "Magnussen", "Haas"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(47, "Mick", "Schumacher", "Haas"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(14, "Fernando", "Alonso", "Alpine"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(31, "Esteban", "Ocon", "Alpine"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(10, "Pierre", "Gasly", "Alpha Tauri"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(22, "Yuki", "Tsunoda", "Alpha Tauri"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(77, "Valtteri", "Bottas", "Alfa Romeo"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(24, "Guanyu", "Zhou", "Alfa Romeo"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(3, "Daniel", "Ricciardo", "Mclaren"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(4, "Lando", "Norris", "Mclaren"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(5, "Sebastian", "Vettel", "Aston Martin"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(18, "Lance", "Stroll", "Aston Martin"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(6, "Nicholas", "Latifi", "Williams"), c.generarTiempoAleatorios());
		c.agregarPiloto(new Piloto(23, "Alexander", "Albon", "Williams"), c.generarTiempoAleatorios());
		
		System.out.println("Bienvenido usuario a este programa en el que tú eres el director de carrera de la F1.");
		
		do {
			
			imprimirMenu();
			numMenu = Leer.datoInt();
			
			switch(numMenu) {
			
				case 0:
					break;
				case 1:
					System.out.print("\nIntroduce el número del piloto: ");
					numPiloto = Leer.datoInt();
					System.out.print("\nIntroduce el nombre del piloto: ");
					nombre = Leer.dato();
					System.out.print("\nIntroduce el apellido del piloto: ");
					apellido = Leer.dato();
					System.out.print("\nIntroduce la escudería del piloto: ");
					escuderia = Leer.dato();
					p = new Piloto(numPiloto, nombre, apellido, escuderia);
					System.out.println("\n¡¡¡AVISO!!! El tiempo se insertará de forma aleatoria.");
					c.agregarPiloto(p, c.generarTiempoAleatorios());
					break;
				case 2:
					System.out.print("\nIntroduzca el número del piloto a penalizar: ");
					numPiloto = Leer.datoInt();
					if(c.buscarPilotoPorNumero(numPiloto) != null) {
						System.out.print("\n¿Cuántos segundos de penalización le quiere aplicar: ");
						segundosPenalizacion = Leer.datoLong();
						c.penalizarPiloto(numPiloto, segundosPenalizacion);
						System.out.println("\nLa penalización se aplicó correctamente.");
					}else {
						System.out.println("\nEl número introducido no concuerda con el de ningún piloto.");
					}
					break;
				case 3:
					System.out.print("\nIntroduzca el número del piloto que quiere ayudar: ");
					numPiloto = Leer.datoInt();
					if(c.buscarPilotoPorNumero(numPiloto) != null) {
						System.out.print("\n¿Cuántos segundos de penalización le quiere aplicar: ");
						segundosPenalizacion = Leer.datoLong();
						c.ayudarPiloto(numPiloto, segundosPenalizacion);
						System.out.println("\nLa ayuda se aplicó correctamente.");
					}else {
						System.out.println("\nEl número introducido no concuerda con el de ningún piloto.");
					}
					break;
				case 4:
					c.ordenarPorTiempo();
					break;
				case 5:
					System.out.print("\nIntroduce el número de piloto del primero: ");
					numPiloto = Leer.datoInt();
					System.out.print("\nA continuación, introduzca el segundo número de piloto: ");
					numPiloto2 = Leer.datoInt();
					if(c.buscarPilotoPorNumero(numPiloto) != null && c.buscarPilotoPorNumero(numPiloto2) != null) {
						System.out.println("\nLa diferencia de tiempo entre los dos es de " + c.calcularIntervaloDeTiempo(numPiloto, numPiloto2) + " décimas.");
					}else {
						System.out.println("\nAlguno de los números introducidos no concuerda con los de ningún piloto.");
					}
					break;
				case 6:
					System.out.print("\nIntroduzca el número del piloto: ");
					numPiloto = Leer.datoInt();
					if(c.buscarPilotoPorNumero(numPiloto) != null) {
						System.out.print("\nIntroduzca los nuevos minutos de la vuelta: ");
						minutos = Leer.datoInt();
						System.out.print("\nIntroduzca los nuevos segundos de la vuelta: ");
						segundos = Leer.datoInt();
						System.out.print("\nIntroduzca los nuevos nanosegundos de la vuelta (9 números max): ");
						nanosegundos = Leer.datoInt();
						c.modificarSegundoVuelta(numPiloto, minutos, segundos, nanosegundos);
						System.out.println("\nLa vuelta se modificó correctamente.");
					}else {
						System.out.println("\nEl número introducido no concuerda con el de ningún piloto.");
					}
					
					break;
				case 7:
					System.out.println("\nLos pilotos más lentos de la carrera son/es: ");
					c.imprimirPilotoMasLento();
					break;
				case 8:
					System.out.print("\nIntroduce el número de piloto del primero: ");
					numPiloto = Leer.datoInt();
					System.out.print("\nA continuación, introduzca el segundo número de piloto: ");
					numPiloto2 = Leer.datoInt();
					if(c.buscarPilotoPorNumero(numPiloto) != null && c.buscarPilotoPorNumero(numPiloto2) != null) {
						System.out.println("\nEl piloto más rápido de los dos introducidos es " + c.compararVelocidadEntreDosPilotos(numPiloto, numPiloto2) +
								" con uan diferencia de " + c.calcularIntervaloDeTiempo(numPiloto, numPiloto2) + " décimas.");
					}else {
						System.out.println("\nAlguno de los números introducidos no concuerda con los de ningún piloto.");
					}
					break;
				case 9:
					System.out.print("\nIntroduzca el número del piloto: ");
					numPiloto = Leer.datoInt();
					if(c.buscarPilotoPorNumero(numPiloto) != null) {
						System.out.printf("\nLos nanosegundos de la vuelta del piloto número %d seleccionado es de %d.\n", numPiloto, c.calcularNanoSegundosDeUnPiloto(numPiloto));
					}else {
						System.out.println("\nEl número introducido no concuerda con el de ningún piloto.");
					}
					break;
				case 10:
					System.out.print("\nIntroduzca el número del piloto: ");
					numPiloto = Leer.datoInt();
					if(c.buscarPilotoPorNumero(numPiloto) != null) {
						System.out.printf("\nEl tiempo del piloto número %d siendo truncado es de %s.\n", numPiloto, c.truncarTiempoDeVuelta(numPiloto));
					}else {
						System.out.println("\nEl número introducido no concuerda con el de ningún piloto.");
					}
					break;
				case 11:
					c.ordenarListaPilotos();
					break;
				case 12:
					System.out.print("\nIntroduzca el número del piloto: ");
					numPiloto = Leer.datoInt();
					c.mostrarUnPiloto(numPiloto);
					break;
				default:
					System.out.println("\nHas seleccionado una opción incrrecta, inténtelo de nuevo.");
					break;
			}
			
		}while(numMenu != 0);
		
		System.out.println("\nMuchas gracias por utilizar este programa, que tenga un buen día.");
		
	}
	
	public static void imprimirMenu() {
		System.out.println("\nPulse 0 para salir.");
		System.out.println("Pulse 1 para añadir un piloto más a la carrera.");
		System.out.println("Pulse 2 para penalizar a un piloto (solo añadirle segundos).");
		System.out.println("Pulse 3 para ayudar a un piloto (solo quitarle segundos).");
		System.out.println("Pulse 4 para ordenar la carrera por tiempo.");
		System.out.println("Pulse 5 para ver el intervalo de tiempo entre dos pilotosque usted quiera.");
		System.out.println("Pulse 6 para modificar la vuelta de un piloto.");
		System.out.println("Pulse 7 para ver quién es el piloto o pilotos más rápidos de la carrera.");
		System.out.println("Pulse 8 comparar entre dos pilotos cuál es el más lento de los dos.");
		System.out.println("Pulse 9 para mostrar los nanosegundos de la vuelta de un piloto.");
		System.out.println("Pulse 10 para truncar la vuelta a segundos de un piloto que usted quiera.");
		System.out.println("Pulse 11 para ver la lista de pilotos (sin ordenar).");
		System.out.println("Pulse 12 para mostrar al piloto que usted indique.");
		System.out.print("\nElección: ");
	}
	
	
}