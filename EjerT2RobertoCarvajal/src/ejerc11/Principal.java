package ejerc11;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		int ainit=0, binit=0, a=0, b=0, c=1, UNO=1;
		System.out.println("Bienvenido. Este programa calculará por usted una");
		System.out.println("Introduzca la base (a)");
		a=Leer.datoInt();
		ainit=a;
		System.out.println("Introduzca el exponente (b)");
		b=Leer.datoInt();
		binit=b;
			while (b>0) {
				c=c*a;
				b=b-UNO;				
			}
			System.out.printf("---------------------------------------\n");
			System.out.printf("El resultado de la operación %d^%d es: %d",ainit, binit, c);

	}

}
