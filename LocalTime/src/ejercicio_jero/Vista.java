package ejercicio_jero;

import java.util.Map;

public class Vista {

	public static void mostrarTitulo() {

		System.out.println("       _               _      _ _                 \r\n"
				+ "      | |        /\\   (_)    | (_)                \r\n"
				+ "      | |______ /  \\   _ _ __| |_ _ __   ___  ___ \r\n"
				+ "  _   | |______/ /\\ \\ | | '__| | | '_ \\ / _ \\/ __|\r\n"
				+ " | |__| |     / ____ \\| | |  | | | | | |  __/\\__ \\\r\n"
				+ "  \\____/     /_/    \\_\\_|_|  |_|_|_| |_|\\___||___/\r\n"
				+ "                                                  \r\n"
				+ "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
	}

	public static void mostrarMenu() {

		System.out.println("\n\t\t\tMENU");
		System.out.println("\t────────────────────────────────────\n");
		System.out.println("\tAviones ✈️\n");
		System.out.println("\t1 ➤ 📋 Mostrar aviones en la flota ✈️");
		System.out.println("\t2 ➤ 🆕 Añadir un avion a la flota ✈️");
		System.out.println("\t3 ➤ 🛠️ Modificar un avión ✈️\n");
		System.out.println("\tVuelos 🧳\n");
		System.out.println("\t4 ➤ 📋 Mostrar vuelos planificados 🧳");
		System.out.println("\t5 ➤ 🆕 Planificar un nuevo vuelo 🧳");
		System.out.println("\t6 ➤ 🛠️ Modificar un vuelo 🧳\n");
		System.out.println("\tDatos y Operaciones ⚙️\n");
		System.out.println("\t7 ➤ Calcular distancia recorrida en un vuelo ⚙️");
		System.out.println("\t8 ➤ Calcular combustible consumido en un vuelo ⚙️");
		System.out.println("\t9 ➤ Comparar dos vuelos para ver cual sale antes ⚙️\n");
		System.out.println("\n\t0 ⌦ Salir ");
		System.out.print("\n\tElección ▶ ");

	}

	public static void mostrarAviones(CrudAvion crud) {

		crud.ordenarID();

		System.out.println("\n\t\t\t   AVIONES EN LA FLOTA");
		System.out.println("\t┌────┬───────────────┬─────────────┬─────────────────┬───────┐");
		System.out.println("\t│ ID │     MODEL     │   AVG-SPD   │   FUEL-CONSUM   │  CAP  │");
		for (Avion avion : crud.getFlota()) {
			System.out.println("\t├────┼───────────────┼─────────────┼─────────────────┼───────┤");
			System.out.printf("\t│ %-2d │ %-13s │ %6.2f km/h │ %7.2f l/100km │  %-5d│\n", avion.getAvionID(),
					avion.getModelo(), avion.getVelocidadMedia(), avion.getConsumo100km(),
					avion.getCapacidadPasajeros());
		}
		System.out.println("\t└────┴───────────────┴─────────────┴─────────────────┴───────┘");

	}

	public static void mostrarVuelos(CrudVuelo crud) {
		
		crud.ordenarSalida();

		System.out.println("\n\t\t\t\t     ITINERARIO DE VUELOS");
		System.out.println("\t┌────┬──────────────┬──────────┬───────────────┬───────────┬───────────┬──────────┐");
		System.out.println("\t│ ID │    ORIGEN    │ H SALIDA │    DESTINO    │ H LLEGADA │ OCUPACION │ AVION ID │");
		for (Map.Entry<Vuelo, Avion> entry : crud.getItinerarios().entrySet()) {
			System.out.println("\t├────┼──────────────┼──────────┼───────────────┼───────────┼───────────┼──────────┤");
			System.out.printf("\t│ %-2d │ %-12s │  %-5s   │ %-13s │   %-5s   │  %3d/%-3d  │    %-2d    │\n",
					entry.getKey().getVueloID(), entry.getKey().getOrigen(), entry.getKey().getSalida(),
					entry.getKey().getDestino(), entry.getKey().getLlegada(), entry.getKey().getNumPasajeros(),
					entry.getKey().getAvion().getCapacidadPasajeros(), entry.getValue().getAvionID());
		}
		System.out.println("\t└────┴──────────────┴──────────┴───────────────┴───────────┴───────────┴──────────┘");

	}

}
