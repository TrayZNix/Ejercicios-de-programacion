package ej_06;

public class Principal {

	public static void main(String[] args) {
		//DECLARAMOS LAS VARIABLES. //INTRODUCIR EL % DE DESCUENTO A APLICAR EN ESTA VARIABLE
		double producto1=400, preciofinal=0 , descuento=0;
		float porciento=20, XCENT= 100;
		System.out.printf("En este programa calcularemos el precio de un producto con un descuento sabiendo su precio original.\n");
		//OPERAMOS
		descuento=porciento/XCENT;
		preciofinal=descuento*producto1;
		
		System.out.printf("El precio antes del descuento es de %.2f. Con un descuento del %.2f%%, el precio queda a %.2f", producto1, porciento,  preciofinal);

	}

}
