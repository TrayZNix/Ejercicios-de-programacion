package ejerc15;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int horasTrabajadas=0, horasObligatorias=40, horasExtra=0;
		double salarioNormal=16, salarioExtra=20, salarioFinal=0;
		
		System.out.println("Bienvendio. Este programa la ayudará a calcular su salario según el número de horas trabajadas.");
		System.out.println("Introduzcla el número de horas trabajadas");
		horasTrabajadas=Leer.datoInt();
		if(horasTrabajadas<=horasObligatorias) {
			salarioFinal=horasTrabajadas*salarioNormal;
			System.out.printf("Habiendo trabajado %d horas, sabiendo que sus horas se cotizan a %.2f€ cada una,"
					+ " su salario total es %.2f€", horasTrabajadas, salarioNormal, salarioFinal);
		}
		if(horasTrabajadas>horasObligatorias) {
			horasExtra=horasTrabajadas-horasObligatorias;
			salarioFinal=horasObligatorias*salarioNormal+horasExtra*salarioExtra;
			System.out.printf("Ha realizado un total de %d horas extras. Sumado al precio total de sus horas %d obligatorias "
					+ "su salario total es %.2f€.\n", horasExtra, horasTrabajadas, salarioFinal);
			System.out.println("Muchas gracias por usar el programa!");
		}
			
			
	}

}
