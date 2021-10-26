package ej_10;

public class Principal {

	public static void main(String[] args) {
		//DECLARAMOS LAS VARIABLES
		int precio=5, cantidad=4
				, DIV=100;
		double preciofinal=0, pfdescont=0, descuento=20, porcent=0;
		System.out.printf("*Este programa es capaz de calcular un descuento al precio de un conjunto de productos una vez sobrepasado el limite que pide la tienda para activar el descuento.* \n\n ");
		//OPERAMOS
		porcent=(DIV-descuento)/DIV;
		preciofinal=precio*cantidad;
		//ESTABLECEMOS LA CONDICIÓN PARA APLICAR EL DESCUENTO SOLO SI COMPRAMOS 4 O MÁS ARTICULOS)
		if(cantidad>=4) {
			pfdescont=preciofinal*porcent;
			System.out.printf("El precio total es %.2f€, se le ha aplicado un descuento del %.2f%%. Muchas gracias",pfdescont, descuento);
		}
		else {
			System.out.printf("El precio total es %.2f€. Muchas gracias", preciofinal);
		}
		
		
		
		

	}

}
