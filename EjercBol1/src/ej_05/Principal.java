package ej_05;

public class Principal {

	public static void main(String[] args) {
		//DECLARAMOS LAS VARIABLES
		double euros=5, CAMBIOEAD=0.86, CAMBIODAE=1.16 , dolares=5 , eurosres=0 , dolaresres=0;
		//CAMBIO DE EUROS A DOLARES
		dolaresres=euros/CAMBIODAE;
		System.out.printf("%.2f€ son %.2f$ Americanos\n", euros, dolaresres);
		
		System.out.println("---------------------------");
		//CAMBIO DE DOLARES A EUROS
		eurosres=dolares/CAMBIOEAD;
		System.out.printf("%.2f$ Americanos son %.2f€", dolares, eurosres);
		

	}

}
