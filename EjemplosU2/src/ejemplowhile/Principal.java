package ejemplowhile;

import ejemplolectura.leer;

public class Principal {

	public static void main(String[] args) {
	int cont=0, max=10;
	System.out.println("Introduzca hasta qu� n�mero desea contar");
	max=leer.datoInt();
		while (cont<max) {
		cont++;
		System.out.printf("%d\n", cont);
	}
	}

}
