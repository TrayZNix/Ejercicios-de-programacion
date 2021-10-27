package ejerc15;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int horasTrabajadas=0, horasObligatorias=40, horasExtra=0, perm=1;
		double salarioNormal=16, salarioExtra=20, salarioFinal=0;
		
		System.out.println("Bienvenido. Este programa la ayudar� a calcular su salario seg�n el n�mero de horas trabajadas.");
		do{
		System.out.println("\nIntroduzca el n�mero de horas trabajadas, o 0 para salir del programa");
		horasTrabajadas=Leer.datoInt();
		perm=horasTrabajadas;
		switch (perm) {
		default:
		if(horasTrabajadas<=horasObligatorias) {
			salarioFinal=horasTrabajadas*salarioNormal;
			System.out.printf("Habiendo trabajado %d horas, sabiendo que sus horas se cotizan a %.2f� cada una,"
					+ " su salario total es %.2f�", horasTrabajadas, salarioNormal, salarioFinal);
		}
		if(horasTrabajadas>horasObligatorias) {
			horasExtra=horasTrabajadas-horasObligatorias;
			salarioFinal=horasObligatorias*salarioNormal+horasExtra*salarioExtra;
			System.out.printf("Ha realizado un total de %d horas extras. Sumado al precio total de sus horas %d obligatorias "
					+ "su salario total es %.2f�.\n", horasExtra, horasObligatorias, salarioFinal);
			}
		break;
		case 0:
			break;
		}
		}while(perm>0);
	System.out.println("\nGracias por usar este programa!");
	
	}	
}
