package ej01;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bienvenido. Este programa es capaz de calcular el precio final de un vehiculo, sabiendo su precio de fabricación, sumandole a este las tasas de beneficio del vendedor, e impuestos");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		//DECLARAMOS LAS VARIABLES
		double pFab=29000, gananV=15, porcGan=0 , tasaImp=12.5, multImp=0 , eurGanan=0, imp=0, tot=0;
		int CONST=100;
		
		porcGan=gananV/CONST;
		eurGanan=porcGan*pFab; 
		multImp=tasaImp/CONST;
		imp=multImp*pFab;
		tot=pFab+eurGanan+imp;
		
		System.out.printf("Siendo el precio de fabricación %.2f€, la tasa de ganancia del vendedor %.2f%%, y la tasa de impuestos %.2f%%, el precio total es %.2f€\n\n", pFab, gananV, tasaImp, tot);
		System.out.println("Gracias por usar el programa");
		
		
	}

}
