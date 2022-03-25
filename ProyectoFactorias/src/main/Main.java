package main;


import planeManager.PlanesManager;
import utility.Printer;
import utility.leer;

public class Main {

	public static void main(String[] args) {
		
		boolean loop = true, check=true;
		int selector;
		Printer pr = new Printer();
		PlanesManager pm = new PlanesManager();
		String registration, owner;
		String planeGA1 = "C172", planeGA2 = "TP2002";
		
		pr.printLogo();
		
		do {
			pr.printMenu();
			selector = leer.datoInt();
			switch(selector) {
				default: 
					System.out.println("Reading error. Please, try again");
					break;
				case 1:
					pr.printAddPlaneMenu();
					selector = leer.datoInt();
					switch (selector ) {
						default:
							System.out.println("Reading error");
							break;
						case 1:
							do {
								System.out.println("Enter your new plane's registration: ");
								registration = leer.dato();
								check = pm.checkRegistrationUsed(registration);
								if(check) System.out.println("Registration plate already in use, try other.");
							}while(check);
							System.out.println("Write the owner's name: ");
							owner = leer.dato();
							pr.printGeneralAvPlanesMenu();
							selector = leer.datoInt();
							switch(selector) {
								default:
									System.out.println("Reading error");
									break;
								case 0:
									break;
								case 1:
									pm.addPlane(planeGA1, registration, owner);
									pm.addRegistration(registration);
									System.out.println("Plane added successfully");
									break;
								case 2:
									pm.addPlane(planeGA2, registration, owner);
									pm.addRegistration(registration);
									System.out.println("Plane added successfully");
									break;
							}
							
					}
			}
			
		}while(loop);
		
	}

}
