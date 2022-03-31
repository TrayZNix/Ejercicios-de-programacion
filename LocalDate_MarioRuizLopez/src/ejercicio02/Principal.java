package ejercicio02;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Realizar un programa para gestionar las reservas de una sala. Para ello,
		 * guardaremos el DNI, nombre, teléfono, email y fecha de nacimiento de los
		 * Clientes que reserven; y la fecha de disponibilidad, si está reservada o no y
		 * el precio de la Reserva. Además, deberá tenerse en cuenta que no podrá
		 * reservar una persona menor de edad, y que si el cliente que reserva, lo hace
		 * para el día de su cumpleaños, se le hará un descuento al precio de la
		 * reserva. Realizar una clase principal en la que probar los métodos, de manera
		 * que podamos ver los días que está disponible para reservar, los días que ya
		 * hay reservados y los datos del cliente que lo ha reservado junto con el
		 * precio y el descuento si se le aplicara, y poder realizar nuevas reservas.
		 * Pista: Crear una colección tipo Map con la Reserva como clave y el Cliente
		 * como valor.
		 */

		int opcion, opcionValor, cont = 1, anio = 2022, mes, dia, anioNac, mesNac, diaNac, mayorEdad = 18;
		String dni, nombre, tlf, email;
		double descuento = 30;

		Cliente c = new Cliente();
		// Creamos un LocalDate instanciado para el día de hoy
		LocalDate hoy = LocalDate.now();

		Map<Reserva, Cliente> lista = new HashMap<Reserva, Cliente>();
		/*
		 * Instanciamos la lista cuya fecha de reserva va a ser el día de hoy +1 cada
		 * nueva reserva, para hacer una previsión de reservas de 1 semana (7 días), y
		 * el cliente como null, ya que no tendremos aún ninguna reserva hecha
		 */
		lista.put(new Reserva(hoy, false, 180), null);
		lista.put(new Reserva(LocalDate.of(hoy.getYear(), hoy.getMonthValue(), hoy.getDayOfMonth() + cont++), false, 250), null);
		lista.put(new Reserva(LocalDate.of(hoy.getYear(), hoy.getMonthValue(), hoy.getDayOfMonth() + cont++), false, 350), null);
		lista.put(new Reserva(LocalDate.of(hoy.getYear(), hoy.getMonthValue(), hoy.getDayOfMonth() + cont++), false, 135), null);
		lista.put(new Reserva(LocalDate.of(hoy.getYear(), hoy.getMonthValue(), hoy.getDayOfMonth() + cont++), false, 300), null);
		lista.put(new Reserva(LocalDate.of(hoy.getYear(), hoy.getMonthValue(), hoy.getDayOfMonth() + cont++), false, 200), null);
		lista.put(new Reserva(LocalDate.of(hoy.getYear(), hoy.getMonthValue(), hoy.getDayOfMonth() + cont++), false, 210), null);

		GestionReservas gestion = new GestionReservas(lista);

		System.out.println("Bienvenidos, en este prorgama vamos a gestionar las reservas de un local.");

		do {
			imprimirMenu();
			opcion = Leer.datoInt();
			switch (opcion) {
				case 0:
					System.out.println("Saliendo...");
					break;
				case 1:
					gestion.mostrarDisponible();
					break;
				case 2:
					mes = 0;
					dia = 0;
					anioNac = 0;
					mesNac = 0;
					diaNac = 0;
	
					gestion.mostrarDisponible();
					
					while (mes <= 0 || mes > 12) {
						System.out.println("Seleccione el mes:");
						mes = Leer.datoInt();
					}
	
					while (dia <= 0 || dia > 31) {
						System.out.println("Seleccione el día:");
						dia = Leer.datoInt();
					}
	
					// Antes de continuar, comprobaremos que la fecha que se introduce existe en la lista
					
					if (gestion.buscarReserva(anio, mes, dia) == null) {
						System.out.println("No existe la fecha seleccionada.");
					} else {
						System.out.println("Indique su DNI:");
						dni = Leer.dato();
						System.out.println("Indique su nombre y apellidos:");
						nombre = Leer.dato();
						System.out.println("Indique tu teléfono:");
						tlf = Leer.dato();
						System.out.println("Indique su email:");
						email = Leer.dato();
	
						while (anioNac <= 1900) {
							System.out.println("Indique su año de nacimiento:");
							anioNac = Leer.datoInt();
						}
	
						while (mesNac <= 0 || mesNac > 12) {
							System.out.println("Indique su mes de nacimiento:");
							mesNac = Leer.datoInt();
						}
	
						while (diaNac <= 0 || diaNac > 31) {
							System.out.println("Indique su día de nacimiento:");
							diaNac = Leer.datoInt();
						}
	
						// Para comprobar si el cliente que reserva es mayor de edad antes de crear la reserva
						
						if (gestion.comprobarMayorEdad(hoy, mayorEdad, anioNac, mesNac, diaNac)) {
							c = new Cliente(dni, nombre, tlf, email, LocalDate.of(anioNac, mesNac, diaNac));
	
							gestion.reservarCliente(gestion.buscarReserva(anio, mes, dia), c);
							gestion.comprobarReserva(gestion.realizarReserva(gestion.buscarReserva(anio, mes, dia)));
						} else {
							System.out.println("Es necesario ser mayor de edad para reservar.");
						}
					}
					break;
				case 3:
					gestion.mostrarReserva(descuento);
					break;
				case 4:
					do {
						imprimirValor();
						opcionValor = Leer.datoInt();
						switch (opcionValor) {
							case 0:
								break;
							case 1:
								descuento = 0;
								while (descuento <= 0) {
									System.out.println("Indique el descuento por cumpleaños:");
									descuento = Leer.datoDouble();
								}
								break;
							case 2:
								anio = 0;
								while (anio <= 0) {
									System.out.println("Indique el año actual:");
									anio = Leer.datoInt();
								}
								break;
							default:
								System.out.println("Opción incorrecta.");
						}
					} while (opcionValor != 0);
					break;
				default:
					System.out.println("Opción incorrecta.");
			}
		} while (opcion != 0);

		System.out.println("Muchas gracias por utilizar este programa, un saludo.");
	}

	public static void imprimirMenu() {
		System.out.println("\n[1] Comprobar fechas disponibles.");
		System.out.println("[2] Realizar una reserva.");
		System.out.println("[3] Consultar reservas.");
		System.out.println("[4] Gestionar valores.");
		System.out.println("[0] Salir.");
	}

	public static void imprimirValor() {
		System.out.println("[1] Gestionar descuento por cumpleaños.");
		System.out.println("[2] Gestionar año de reserva.");
		System.out.println("[0] Salir.");
	}
}