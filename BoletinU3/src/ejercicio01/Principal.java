package ejercicio01;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		Circulo c;
		double radio, resultado;
		System.out.printf("Ingrese el radio del circulo\n");
		radio=leer.datoDouble();
		c= new Circulo (radio);
		resultado=c.calcularAreaCirculo();
		System.out.println(resultado);

	}

}
