package ejerc10;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		int num=0, numinit=0, factor=1, UNO=1;
		System.out.printf("Este programa consigue calcular el factorial del n�mero que usted decida\n\n");
		System.out.printf("Introduzca el n�mero del cual quiere calcular el factorial:");
		numinit=Leer.datoInt();
		num=numinit;
			while (num>UNO) {
				factor=factor*num;
				num=num-UNO;
			}
		System.out.println("---------------------------");
		System.out.printf("%d!=%d", numinit, factor);

	}

}
