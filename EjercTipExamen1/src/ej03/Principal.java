package ej03;

public class Principal {

	public static void main(String[] args) {
		//DECLARAMOS LAS VARIABLES
		String empleado="Roberto";
		String fecha= "5/10/2021";
		String patMed= "Patatas medianas";
		String bebMed= "Bebida mediana";
		String hambMCR= "Hamburguesa McRoyale";
		double precPatMed= 2, precBebMed= 1.5, precHambMCR=4, total=0, entregado=10, cambio=0, totPatMed=0, totBebMed=0, totHambMCR=0;
		int cantPatMed=1, cantBebMed=1, cantHambMCR=1;
		
		totPatMed=cantPatMed*precPatMed;
		totBebMed=cantBebMed*precBebMed;
		totHambMCR=cantHambMCR*precHambMCR;
		total=totPatMed+totBebMed+totHambMCR;
		cambio=entregado-total;		
		System.out.println("|-------------------------------------------------------------------------------------------------------|");
		System.out.printf("|\t\t\t\tMcDonald's Sevilla\t\t\t\t\t\t\t|\n");
		System.out.println("|-------------------------------------------------------------------------------------------------------|");
		System.out.printf("|\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
		System.out.printf("|Le atendió: %s\t El día %s \t\t\t\t\t\t\t\t|\n", empleado, fecha);
		System.out.printf("|\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
		System.out.println("|-------------------------------------------------------------------------------------------------------|");
		System.out.printf("|Artículo:\t\tPrecio unitario:\tCantidad:\t\tValor total:\t\t\t|\n");
		System.out.printf("|\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");               
		System.out.printf("|%s\t\t%.2f€\t\t\t%d\t\t\t%.2f€\t\t\t|\n", patMed, precPatMed, cantPatMed, totPatMed);
		System.out.printf("|\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
		System.out.printf("|%s\t\t\t%.2f€\t\t\t%d\t\t\t%.2f€\t\t\t|\n", bebMed, precBebMed, cantBebMed, totBebMed);
		System.out.printf("|\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
		System.out.printf("|%s\t\t%.2f€\t\t\t%d\t\t\t%.2f€\t\t\t|\n", hambMCR, precHambMCR, cantHambMCR, totHambMCR);
		System.out.printf("|\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
		System.out.printf("|\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
		System.out.println("|-------------------------------------------------------------------------------------------------------|");
		System.out.printf("|\t\t\t\t\t\t\t\t\t\tTotal:%.2f€\t\t|\n",total);
		System.out.printf("|\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
		System.out.printf("|\t\t\t\t\t\t\t\t\t\tEntregado:%.2f€\t|\n",entregado);
		System.out.printf("|\t\t\t\t\t\t\t\t\t\t\t\t\t|\n"); 
		System.out.printf("|\t\t\t\t\t\t\t\t\t\tCambio::%.2f€\t\t|\n",cambio);
		System.out.printf("|\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
		System.out.printf("|\t\t\t\t\t\t\t\t\t\t\t\t\t|\n");
		System.out.printf("|\t\t\t\t\t\t\t\t\t\tGracias por su compra!\t|\n");
		System.out.println("|-------------------------------------------------------------------------------------------------------|");
		
		
	}

}
