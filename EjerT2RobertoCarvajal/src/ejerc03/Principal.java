package ejerc03;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		double saldo=5000, extrae=0;
		char respuesta=0;
		System.out.println("Bienvenido, este programa funciona igual que el programa del cajero de un banco");
		System.out.printf("Su saldo es %.2f€ ¿Cuanto dinero desea extraer?\n",saldo);
		extrae= Leer.datoDouble();
		if (saldo<extrae){
			do {
			System.out.printf("No posee el dinero suficiente para extraer %.2f\n", extrae);
			System.out.println("¿Desea extraer una cantidad menor? (S/N)");
			respuesta=Leer.datoChar();	
				if (respuesta==83||respuesta==115) {
					System.out.println("Introduzca la nueva cantidad");
					extrae=Leer.datoDouble();
				}
			}while(saldo<extrae);
		}
		
		saldo=saldo-extrae;
		System.out.printf("Ud. Ha retirado %.2f. Su saldo restante es %.2f\n", extrae, saldo);
		System.out.println("Muchas gracias por usar este programa!");
		

}
}
