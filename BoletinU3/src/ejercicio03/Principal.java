package ejercicio03;
import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		double radio, altura, volumen;
		Cilindro cilindro;
		System.out.println("Bienvenido, este programa le calculará el volumen de un cilindro según el radio y la altura que le introduzcas");
		System.out.println("Por favor, introduzca el radio en cm");
		radio=leer.datoDouble();
		System.out.println("Por favor, introduzca ahora la altura en cm");
		altura=leer.datoDouble();
		cilindro= new Cilindro (radio, altura);
		volumen=cilindro.calcularVolumenCilindroCM();
		System.out.printf("Un cilindro de esas dimensiones tiene un volumen de %f cm²", volumen);
		

	}

}
