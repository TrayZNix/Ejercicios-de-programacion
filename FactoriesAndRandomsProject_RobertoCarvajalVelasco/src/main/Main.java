package main;
import planeManager.PlanesManager;
import utility.Printer;
import utility.leer;

public class Main {

	public static void main(String[] args) {		
		boolean loop = true, check=true, extraA = false, extraB = false, window = false;
		int selector, ONE = 1;
		Printer pr = new Printer();
		PlanesManager pm = new PlanesManager();
		String registration, owner;
		String planeGA1 = "C172", planeGA2 = "TP2002", planeA1 = "A300", planeA2 = "A320", planeA3 = "737", planeA4 = "777", planeM1 = "A400M", planeM2 = "F16", planeM3 = "KC46A";
		
		pr.printLogo();
		
		do {
			pr.printMenu();
			selector = leer.datoInt();
			switch(selector) {
				default: 
					System.out.println("Reading error. Please, try again");
					break;
				case 1:
					//Start of adding plane process
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
									System.out.println("Will this plane be a shared plane?");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraA = true;
									System.out.println("Will this plane be used as a longrange plane?");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraB = true;
									pm.addPlane(planeGA1, registration, owner, extraA, extraB);
									pm.addRegistration(registration);
									System.out.println("Plane added successfully");
									break;
								case 2:
									System.out.println("Will this plane be a shared plane?");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraA = true;
									System.out.println("Will this plane be used as a longrange plane?");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraB = true;
									pm.addPlane(planeGA2, registration, owner, extraA, extraB);
									pm.addRegistration(registration);
									System.out.println("Plane added successfully");
									break;
							}
							break;
						case 2:
							do {
								System.out.println("Enter your new plane's registration: ");
								registration = leer.dato();
								check = pm.checkRegistrationUsed(registration);
								if(check) System.out.println("Registration plate already in use, try other.");
							}while(check);
							System.out.println("Write the company's name: ");
							owner = leer.dato();
							pr.printAirlinersMenu();
							selector = leer.datoInt();
							switch(selector ) {
								default:
									System.out.println("Reading error");
									break;
								case 0:
									break;
								case 1:
									System.out.println("Will this plane serve food during cruise?");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraA = true;
									System.out.println("Is yout airline a low-cost airline?");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraB = true;
									pm.addPlane(planeA1, registration, owner, extraA, extraB);
									break;
								case 2:
									System.out.println("Will this plane serve food during cruise?");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraA = true;
									System.out.println("Is yout airline a low-cost airline?");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraB = true;
									pm.addPlane(planeA2, registration, owner, extraA, extraB);
									break;
								case 3:
									System.out.println("Will this plane serve food during cruise?");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraA = true;
									System.out.println("Is yout airline a low-cost airline?");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraB = true;
									pm.addPlane(planeA3, registration, owner, extraA, extraB);
									break;
								case 4:
									System.out.println("Will this plane serve food during cruise?");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraA = true;
									System.out.println("Is yout airline a low-cost airline?");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraB = true;
									pm.addPlane(planeA4, registration, owner, extraA, extraB);
									break;
							}
							break;
						case 3:
							do {
								System.out.println("Enter your new plane's registration: ");
								registration = leer.dato();
								check = pm.checkRegistrationUsed(registration);
								if(check) System.out.println("Registration plate already in use, try other.");
							}while(check);
							System.out.println("Write the owner's name: ");
							owner = leer.dato();
							pr.printMilitaryMenu();
							selector = leer.datoInt();
							switch(selector ) {
								default:
									System.out.println("Reading error");
									break;
								case 0:
									break;
								case 1:
									System.out.println("Do you want to atach guns to this plane?");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraA = true;
									System.out.println("Do you want to add flares to this plane??");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraB = true;
									pm.addPlane(planeM1, registration, owner, extraA, extraB);
									break;
								case 2:
									System.out.println("Do you want to atach guns to this plane?");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraA = true;
									System.out.println("Do you want to add flares to this plane??");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraB = true;
									pm.addPlane(planeM2, registration, owner, extraA, extraB);
									break;
								case 3:
									System.out.println("Do you want to atach guns to this plane?");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraA = true;
									System.out.println("Do you want to add flares to this plane??");
									System.out.println("1.Yes        2.No");
									selector = leer.datoInt();
									if(selector == ONE) extraB = true;
									pm.addPlane(planeM3, registration, owner, extraA, extraB);
									break;
							}
							break;
					
					}
					break;
					//End of adding plane process
				case 2:
					pr.printPrinterMenu();
					selector = leer.datoInt();
					switch (selector) {
						default:
							System.out.println("Reading error");
							break;
						case 0:
							break;
						case 1:
							pm.printAllAircraft();
							break;
						case 2:
							pm.printGeneralAviation();
							break;
						case 3:
							pm.printAirliners();
							break;
						case 4:
							pm.printMilitary();
							break;
					}
					break;
				case 3:
					pr.printManagerMenu();
					selector = leer.datoInt();
					switch (selector) {
					default:
						System.out.println("Reading error. Please try again");
					case 0:
						break;
					case 1:
						pm.printAirliners();
						selector = leer.datoInt();
						pm.selectPlane(selector);
						System.out.println("Do you have preference to get a window seat?");
						System.out.println("1. Yes           2. No");
						selector = leer.datoInt();
						if (selector == 1) window = true;
						else if (selector == 2) window = false;
						pm.sellSeat(window);
						
						break;
					}
					break;
			}
			
		}while(loop);
		
	}

}
