package ejerc13;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int horasTrabajadas=0, horasObligatorias=40, horasExtra=0, perm=1, CERO=0;
		double salarioNormal=16, salarioExtra=20, salarioFinal=0;
		
		System.out.println("Bienvenido. Este programa la ayudará a calcular su salario según el número de horas trabajadas.");
		do{
		System.out.println("\nIntroduzca el número de horas trabajadas, o 0 para salir del programa");
		horasTrabajadas=Leer.datoInt();
		perm=horasTrabajadas;
		switch (perm) {
		default:
		if(horasTrabajadas<=horasObligatorias) {
			salarioFinal=horasTrabajadas*salarioNormal;
			System.out.printf("Habiendo trabajado %d horas, sabiendo que sus horas se cotizan a %.2f€ cada una,"
					+ " su salario total es %.2f€", horasTrabajadas, salarioNormal, salarioFinal);
		}
		if(horasTrabajadas>horasObligatorias) {
			horasExtra=horasTrabajadas-horasObligatorias;
			salarioFinal=horasObligatorias*salarioNormal+horasExtra*salarioExtra;
			System.out.printf("Ha realizado un total de %d horas extras. Sumado al precio total de sus horas %d obligatorias "
					+ "su salario total es %.2f€.\n", horasExtra, horasObligatorias, salarioFinal);
			}
		break;
		case 0:
			break;
		}
		}while(perm>CERO);
	System.out.println("\nGracias por usar este programa!");
	
	}	
}
