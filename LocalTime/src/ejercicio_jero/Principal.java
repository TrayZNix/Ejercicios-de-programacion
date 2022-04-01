package ejercicio_jero;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		// ------------------------------------------------------------------------------------------------------------------------------------//

		// ENUNCIADO

		/*
		 * Este programa gestionará los datos de los vuelos de una aerolinea (J-Airlines
		 * International) a lo largo del día. Será necesario conocer los datos del avión
		 * (Como consumo, velocidad media, capacidad de pasajeros, etc..) asi como los
		 * de un vuelo (avion asignado, destino, origen, hora de salida y llegada
		 * estimada, distancia, duracion, número de pasajero, distancia etc).
		 * 
		 * El programa permitirá:
		 * 
		 * 1 - Mostrar lista de aviones. 
		 * 2 - Añadir un avion a la flota.
		 * 3 - Modificar o eliminar un avión.
		 * 
		 * 4 - Mostrar el itenaririo de vuelos de la flota
		 * 5 - Planificar un nuevo vuelo
		 * 6 - Modificar o eliminar un vuelo
		 * 
		 * 7 - Calcular la distancia recorrida en base al tiempo de vuelo y la velocidad
		 * 8 - Calcular el consumo de combustible realizado 
		 * 9 - Comprobar y mostrar que vuelo sale antes entre dos del itinerario de Vuelo
		 * 
		 * Todos los métodos deben probarse en una clase de pruebas (Principal).
		 * 
		 * 
		 */

		// ------------------------------------------------------------------------------------------------------------------------------------//

		// AUTO-COMMANDS

		String[] commands = {
				
				/* Añadir aviones */

				"2", "Boeing 747", "933", "1074.1", "467", "2", "Boeing 777", "900", "662.4", "368", 
				"2", "Airbus 320", "840", "291.8", "180", "2", "Airbus a330", "880", "232.33", "268", 
				"2", "Jumbo p-32", "760", "187.50","85", "2", "Jumbo s-14", "820", "130", "45",
				
				/* Añadir vuelos*/
				
				"5", "Almería", "12:00", "Londres", "15:15","10", "6",
				"5", "Granada", "9:45", "Berlín", "12:50","123", "3",
				"5", "Sevilla", "18:50", "El Cairo", "23:30", "230", "4",
				"5", "Madrid", "19:00", "Barcelona", "21:00", "431", "1",
				"5", "Bilbao", "17:10", "Huelva", "18:55", "349", "2",
				"5", "Murcia", "6:00", "A Coruña", "8:00", "85", "5"

		};

		Leer.enterAutomode();
		Leer.setCommands(commands);

		// ------------------------------------------------------------------------------------------------------------------------------------//

		// VARIABLES

		CrudVuelo crudVuelo = new CrudVuelo(new HashMap <Vuelo,Avion>());
		CrudAvion crudAvion = new CrudAvion(new HashSet<Avion>());
		Avion avion;
		Vuelo vuelo;
		
		LocalTime salida,llegada;
		String modelo, modelo1, origen, destino;
		int opcion = 0, capacidad = 0, numPasajeros=0, contador = 1, contador1=1, avionID = 0, vueloID = 0, vueloID1 = 0;
		double vMedia = 0, consumo100km = 0;
		boolean salir = false;

		// ------------------------------------------------------------------------------------------------------------------------------------//

		// MAIN-PRUEBAS

		Vista.mostrarTitulo();

		do {
			Vista.mostrarMenu();
			opcion = Leer.datoInt();
			switch (opcion) {
			
			//PARTE-AVIONES
			
				case 1:
					Vista.mostrarAviones(crudAvion);
					break;
				case 2:
					System.out.println("\n\t\t➥ Añadir nuevo avión");
					System.out.println("\t────────────────────────────────────\n");
					System.out.print("\t· Modelo ▶ ");
					modelo = Leer.dato();
					System.out.print("\t· Velocidad Media (Km/h) ▶ ");
					vMedia = Leer.datoDouble();
					System.out.print("\t· Consumo (litros/100 km) ▶ ");
					consumo100km = Leer.datoDouble();
					System.out.print("\t· Capacidad de pasajeros ▶ ");
					capacidad = Leer.datoInt();
					avion=new Avion(contador++, modelo, vMedia, consumo100km, capacidad);
					crudAvion.agregarAvion(avion);
					break;
				case 3:
					System.out.println("\n\t\t➥ Modificar un avión");
					System.out.println("\t────────────────────────────────────\n");
					System.out.print("\t· Introduzca el modelo que busca ▶ ");
					modelo = Leer.dato();
					Vista.mostrarAviones(crudAvion);
					System.out.print("\n\t· Seleccione el ID del avión ▶ ");
					avionID = Leer.datoInt();
					do {
						System.out.println("\n\t1 ➤ Modificar.");
						System.out.println("\t2 ➤ Eliminar.");
						System.out.println("\n\t0 ◀🔙 Volver al menu principal ");
						System.out.print("\n\tElección ▶ ");
						opcion = Leer.datoInt();
						switch (opcion) {
							case 1:
								System.out.println("\n\t\t➥ Modificando avión...");
								System.out.println("\t────────────────────────────────────\n");
								System.out.print("\t· Nuevo modelo ▶ ");
								modelo1 = Leer.dato();
								System.out.print("\t· Nueva velocidad media (Km/h) ▶ ");
								vMedia = Leer.datoDouble();
								System.out.print("\t· Nuevo consumo (litros/100 km) ▶ ");
								consumo100km = Leer.datoDouble();
								System.out.print("\t· Nueva capacidad de pasajeros ▶ ");
								capacidad = Leer.datoInt();
								avion = new Avion(0, modelo1, vMedia, consumo100km, capacidad);
								crudAvion.modificarAvion(crudAvion.buscarAvionesPorNombre(modelo), avionID, avion,
										crudAvion.comprobarPosible(crudAvion.buscarAvionesPorNombre(modelo), avionID));
								salir = true;
								break;
							case 2:
								crudAvion.eliminarAvion(crudAvion.buscarAvionesPorNombre(modelo), avionID);
								salir = true;
								break;
							case 0:
								salir = true;
								break;
							default:
								System.out.println("OPsion no valida");
						}
					} while (!salir);
					salir = false;
					break;
					
					//PARTE-VUELOS
					
				case 4:
					//mostrar vuelos
					Vista.mostrarVuelos(crudVuelo);
					break;
				case 5:
					//añadir vuelos
					System.out.println("\n\t\t➥ Planificar nuevo vuelo");
					System.out.println("\t────────────────────────────────────\n");
					System.out.print("\t· Origen ▶ ");
					origen = Leer.dato();
					System.out.print("\t· Hora de salida (hh:mm) ▶ ");
					salida = LocalTime.parse(Leer.dato(), DateTimeFormatter.ofPattern("H:m"));
					System.out.print("\t· Destino ▶ ");
					destino = Leer.dato();
					System.out.print("\t· Hora de llegada (hh:mm) ▶ ");
					llegada = LocalTime.parse(Leer.dato(), DateTimeFormatter.ofPattern("H:m"));
					System.out.print("\t· Número de pasajeros ▶ ");
					numPasajeros=Leer.datoInt();
					Vista.mostrarAviones(crudAvion);
					System.out.print("\n\t· Asigne un avion por su ID ▶ ");
					avionID=Leer.datoInt();
					avion=crudAvion.buscarAvion(crudAvion.getFlota(), avionID);
					vuelo=new Vuelo(contador1++,avion,origen,salida,destino,llegada,numPasajeros);
					crudVuelo.agregarVuelo(vuelo, avion);
					
					break;
				case 6:
					//modificar vuelo
					System.out.println("\n\t\t➥ Modificar un vuelo");
					System.out.println("\t────────────────────────────────────\n");
					Vista.mostrarVuelos(crudVuelo);
					System.out.print("\n\t· Introduzca el id del vuelo a modificar ▶ ");
					vueloID=Leer.datoInt();
//					
					do {
						System.out.println("\n\t1 ➤ Modificar.");
						System.out.println("\t2 ➤ Eliminar.");
						System.out.println("\n\t0 ◀🔙 Volver al menu principal ");
						System.out.print("\n\tElección ▶ ");
						opcion = Leer.datoInt();
						switch(opcion) {
							case 1:
								System.out.println("\n\t\t➥ Modificando vuelo...");
								System.out.println("\t────────────────────────────────────\n");
								System.out.print("\t· Nuevo origen ▶ ");
								origen = Leer.dato();
								System.out.print("\t· Hora de salida (hh:mm) ▶ ");
								salida = LocalTime.parse(Leer.dato(), DateTimeFormatter.ofPattern("H:m"));
								System.out.print("\t· Destino ▶ ");
								destino = Leer.dato();
								System.out.print("\t· Hora de llegada (hh:mm) ▶ ");
								llegada = LocalTime.parse(Leer.dato(), DateTimeFormatter.ofPattern("H:m"));
								System.out.print("\t· Número de pasajeros ▶ ");
								numPasajeros=Leer.datoInt();
								Vista.mostrarAviones(crudAvion);
								System.out.print("\n\t· Asigne un avion por su ID ▶ ");
								avionID=Leer.datoInt();
								avion=crudAvion.buscarAvion(crudAvion.getFlota(), avionID);
								vuelo=new Vuelo(0,avion,origen,salida,destino,llegada,numPasajeros);
								crudVuelo.modificarVuelo(vueloID, vuelo);
								salir=true;
								break;
							case 2:
								crudVuelo.eliminarVuelo(vueloID);
								salir=true;
							case 0:
								salir=true;
								break;
							default:
								System.out.println("Opsion no valida");
						}
					}while(!salir);
					salir=true;
				case 7:
					System.out.println("\n\t\t➥ Calcular distancia");
					System.out.println("\t────────────────────────────────────\n");
					Vista.mostrarVuelos(crudVuelo);
					System.out.print("\n\t· Introduzca el id del vuelo ▶ ");
					vueloID=Leer.datoInt();
					
					System.out.printf("\n\tLa distancia recorrida es de %.2f km.\n",crudVuelo.calcularDistancia(crudVuelo.buscarVueloID(vueloID)));
					break;
				case 8:
					System.out.println("\n\t\t➥ Calcular consumo");
					System.out.println("\t────────────────────────────────────\n");
					Vista.mostrarVuelos(crudVuelo);
					System.out.print("\n\t· Introduzca el id del vuelo ▶ ");
					vueloID=Leer.datoInt();
					System.out.printf("\n\tEl consumo es de %.2f Litros de Queroseno.\n",crudVuelo.calcularCombustibleConsumido(crudVuelo.buscarVueloID(vueloID)));
					break;
				case 9:
					System.out.println("\n\t\t➥ ¿Cual sale antes?");
					System.out.println("\t────────────────────────────────────\n");
					Vista.mostrarVuelos(crudVuelo);
					System.out.print("\n\t· Introduzca el id del vuelo  1 ▶ ");
					vueloID=Leer.datoInt();
					System.out.print("\n\t· Introduzca el id del vuelo  2 ▶ ");
					vueloID1=Leer.datoInt();
					crudVuelo.compararSalidas(crudVuelo.buscarVueloID(vueloID), crudVuelo.buscarVueloID(vueloID1));
					break;
				case 0:
					salir = false;
					break;
				default:
					System.out.println("Opsion no valida");
			}
		} while (!salir);

	}

}
