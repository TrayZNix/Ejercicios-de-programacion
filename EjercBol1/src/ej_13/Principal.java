package ej_13;

public class Principal {

	public static void main(String[] args) {
		System.out.printf("Este programa es capaz de generar un ticket de compra segun los artículos comprados, mostrando el articulo, la cantidad de articulos comprados, y sus respectivos precios: \n\n ");
		//DECLARAMOS LAS VARIABLES
		int cantcc=2, cantppas=1, cantgarra=1; //CANTIDADES DE PRODUCTOS
		double cc=0.7, ppas=0.4, garra=150, total=0, totcc=0, totpp=0, totgarra=0; //PRECIOS (OBJETOS SOLOS Y TOTAL SEGUN CANTIDADES)
		String scc="Coca-cola";
		String sppas="Pipas";			//NOMBRES DE PRODUCTOS
		String sgarra="Espada Garra";
		
		//OPERACIONES DE CÁLCULOS DE PRECIOS
		totcc=cantcc*cc;
		totpp=cantppas*ppas;
		totgarra=cantgarra*garra;
		total=totcc+totpp+totgarra;
		
		//IMPRESIÑON DE DATOS EN TICKET
		
		System.out.printf(" -----------------------------------------------\n");
		System.out.printf(" | Recibo de compra:                            |\n");
		System.out.printf(" |----------------------------------------------|\n");
		System.out.printf(" |                                              |\n");
		System.out.printf(" |  Artículos:       Precio:  Cant.:  Total:    |\n");
		System.out.printf(" |                                              |\n");
		System.out.printf(" | -%s        %.2f€      %d      %.2f€    |\n", scc, cc, cantcc, totcc);
		System.out.printf(" |                                              |\n");
		System.out.printf(" | -%s            %.2f€      %d      %.2f€    |\n", sppas, ppas, cantppas, totpp);
		System.out.printf(" |                                              |\n");
		System.out.printf(" | -%s     %.2f€    %d      %.2f€  |\n", sgarra, garra, cantgarra, totgarra);
		System.out.printf(" |                                              |\n");
		System.out.printf(" |                       Total= %.2f€         |\n", total);
		System.out.printf(" |                                              |\n");
		System.out.printf(" |                     Gracias por su compra!   |\n");
		System.out.printf(" -----------------------------------------------\n");
	}

}
