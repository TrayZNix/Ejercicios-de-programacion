package ejerc14;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		//DECLARAMOS LAS VARIABLES
		int sueldoFijo=1000, porcentComision=20;
		double dineroVentas=2300, sueldoFinal=0, porcentMult=0, CIEN=100;
		System.out.println("Bienvenido. Este programa le ayudará a calcular un sueldo final establenciendo un sueldo"
				+ "base y un porcentaje de comisión por ventas");
		System.out.printf("\nSu sueldo base es %d€.\n", sueldoFijo);
		//PREGUNTAMOS LOS VALORES AL USUARIO
		System.out.printf("Introduzca el porcentaje de comisión que recibe:\n");
		porcentComision=Leer.datoInt();
		System.out.printf("Introduzca cuanto dinero (€) ha conseguido:\n");
		dineroVentas=Leer.datoDouble();
		//OPERAMOS
		porcentMult=porcentComision/CIEN;
		sueldoFinal=sueldoFijo+dineroVentas*porcentMult;
		//IMPRIMIMOS LOS RESULTADOS
		System.out.printf("-----------------------------------------------------------------------------------------\n");
		System.out.printf("\nSumandole al sueldo base (%d€), el %d%% de comisión conseguido por sus %.2f€ vendidos,"
				+ " su sueldo total asciende a %.2f€", sueldoFijo, porcentComision, dineroVentas, sueldoFinal);
		
		
		
		
		

	}

}
