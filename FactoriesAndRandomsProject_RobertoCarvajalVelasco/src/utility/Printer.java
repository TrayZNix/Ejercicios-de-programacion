package utility;

import planeManager.Seat;

public class Printer {
	public void printLogo() {
		System.out.printf(" \n"
				+ "___________________________________________________________________________________________\r\n"
				+ "                                              \r\n"
				+ "                                  ___\r\n"
				+ "                                 /L|0\\\r\n"
				+ "                                /  |  \\\r\n"
				+ "                               /       \\\r\n"
				+ "                              /    |    \\\r\n"
				+ "                             /           \\\r\n"
				+ "                            /  __  | __   \\\r\n"
				+ "                           /  __/    \\__   \\\r\n"
				+ "                          /  /__   |  __\\   \\\r\n"
				+ "                         /___________________\\\r\n"
				+ "                         /         ¡         \\\r\n"
				+ "                              /   _|_   \\\r\n"
				+ "                       /     ____/___\\____     \\\r\n"
				+ "                      ___________[o0o]___________\r\n"
				+ "                               O   O    O\n\n ");
		System.out.println("          _                       _     __  __                                   \r\n"
				+ "     /\\   (_)                     | |   |  \\/  |                                  \r\n"
				+ "    /  \\   _ _ __ _ __   ___  _ __| |_  | \\  / | __ _ _ __   __ _  __ _  ___ _ __ \r\n"
				+ "   / /\\ \\ | | '__| '_ \\ / _ \\| '__| __| | |\\/| |/ _` | '_ \\ / _` |/ _` |/ _ \\ '__|\r\n"
				+ "  / ____ \\| | |  | |_) | (_) | |  | |_  | |  | | (_| | | | | (_| | (_| |  __/ |   \r\n"
				+ " /_/    \\_\\_|_|  | .__/ \\___/|_|   \\__| |_|  |_|\\__,_|_| |_|\\__,_|\\__, |\\___|_|   \r\n"
				+ "                 | |                                               __/ |          \r\n"
				+ "                 |_|                                              |___/         ");
	}
	
	public void printMenu() {
		System.out.println();
		System.out.println("Choose an option:");
		System.out.println("---------------------------------");
		System.out.println("0. Exit");
		System.out.println("1. Add plane");
		System.out.println("2. See planes");
		System.out.println("3. Manage planes");
		System.out.println();
		System.out.println();
	}
	public void printAddPlaneMenu() {
		System.out.println();
		System.out.println("What type of plane do you want to add?");
		System.out.println("........................................");
		System.out.println("0. Exit");
		System.out.println("1. General aviation plane");
		System.out.println("2. Airliner");
		System.out.println("3. Military plane");
		System.out.println();
		System.out.println();
	}
	public void printGeneralAvPlanesMenu() {
		System.out.println();
		System.out.println("Select the plane you want");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("0. Exit");
		System.out.println("1. Cessna 172");
		System.out.println("2. Tecnam P2002");
		System.out.println();
		System.out.println();
	}
	public void printAirlinersMenu() {
		System.out.println();
		System.out.println("Select the plane you want");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("0. Exit");
		System.out.println("1. Airbus A300");
		System.out.println("2. Airbus A320");
		System.out.println("3. Boeing 737");
		System.out.println("4. Boeing 777");
		System.out.println();
		System.out.println();
	}
	public void printMilitaryMenu() {
		System.out.println();
		System.out.println("Select the plane you want");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("0. Exit");
		System.out.println("1. Airbus A400M");
		System.out.println("2. Lockheed Martin F16");
		System.out.println("3. Boeing KC46A");
		System.out.println();
		System.out.println();
	}
	public void printPrinterMenu() {
		System.out.println();
		System.out.println("Choose what you want to see");
		System.out.println("--------------------------------------------");
		System.out.println("0. Exit");
		System.out.println("1. All aircraft");
		System.out.println("2. General Aviation Aircrafts");
		System.out.println("3. Airliners");
		System.out.println("4. Military aircraft");
		System.out.println();
		System.out.println();
	}
	
	public void printManagerMenu() {
		System.out.println();
		System.out.println("Choose what you want to manage:");
		System.out.println("------------------------------");
		System.out.println("0. Exit menu");
		System.out.println("1. Manage seats");
		System.out.println("2. See total money colection of a plane");
		System.out.println();
		System.out.println();

	}
	public void printSeat(Seat s) {
		System.out.println("Your seat is "+s.toString());
	}
}
