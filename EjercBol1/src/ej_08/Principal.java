package ej_08;

public class Principal {

	public static void main(String[] args) {
		//DECLARO LAS VARIABLES
		int radio1=3, CONST1=2;
		double area=0, circunf1=0, radio2=5.2, pi=3.14159265;
		System.out.printf("Este programa tiene la finalidad de calcular el perimetro de una circunferencia de medidas concretas, y el area de un circulo tambi�n de valores concretos.\n\n ");
		//OPERO PARA EL PRIMER CASO
		circunf1=CONST1*pi*radio1;
		//OPERO PARA EL SEGUNDO CASO
		area=pi*radio2*radio2;
		//IMPRIMIMOS LOS RESULTADOS
		System.out.printf("El perimetro de la primera circunferencia es %.2fm. El area del segundo c�rculo es %.2fm�", circunf1, area);

	}

}
