package Ej01;

import lectura.leer;

public class Main {

	public static void main(String[] args) {
		int selector, discount = 11, roomNumber;
		double roomSurface, roomBasePrice = 100, roomServicePrice = 25;
		boolean loop = true;
		Gestor g = new Gestor();
		g.addSuiteRoom(roomBasePrice, true, "Roberto Carvajal", 2, 2, 50, discount);
		g.addDefaultRoom(roomBasePrice, true, "Joselito pelucas", 2, 3);
		do {
			System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
			System.out.println("1. Create room");
			System.out.println("2. Print rooms");
			System.out.println("3. ");
			selector = leer.datoInt();
			switch (selector) {
				default:
					System.out.println("Reading error. Please, try again");
					break;
				
				case 1:
					System.out.println("Select type of room");
					System.out.println("--------------------------------");
					System.out.println("1. Default room");
					System.out.println("2. Suite");
					System.out.println("3. Apartment");
					System.out.println("0. Go back");
					selector = leer.datoInt();
					switch (selector) {
						default:
							System.out.println("Reading error");
							break;
						case 1:
							g.addDefaultRoom(roomBasePrice);
							System.out.println("Default room created");
							break;
						case 2:
							System.out.println("Enter roomSurface");
							roomSurface = leer.datoDouble();
							g.addSuiteRoom(roomBasePrice, roomSurface, discount);
							System.out.println("Suite room create");
							break;
						case 3:
							g.addApartmentRoom(roomBasePrice, roomServicePrice);
							System.out.println("Apartment room created");
							break;
						case 0:
							break;
					}
					break;
				case 2:
					g.printRooms();
					break;
				case 4:
					g.printRooms();
					System.out.println("Select the ROOM NUMBER");
					roomNumber = leer.datoInt();
					System.out.println(g.searchRoom(roomNumber).calculateRoomPrice());
					break;
				case 5:
					System.out.println(g.calculatePriceOccupiedRooms());
					break;
				case 6:
					g.printEmptyRooms();
				case 7:
					roomNumber = leer.datoInt();
					g.calculateTicket(roomNumber);
			}
		}while(loop);
		
	}
	

}
