package ejercicio01;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		Circulo c;
		double radio, resultado;
		System.out.printf("Ingrese el radio del circulo en centímetros\n");
		radio=leer.datoDouble();
		c= new Circulo (radio);
		resultado=c.calcularAreaCirculoCM();
		System.out.println(resultado);

	}

}
