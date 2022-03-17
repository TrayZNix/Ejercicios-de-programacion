package testeo;

import java.util.stream.DoubleStream;

public class Principal {

	public static void main(String[] args) {
		FactoryFiguras factoriaFiguras = new FactoryFiguras();

		System.out.println(factoriaFiguras.getFigura("Rectangulo").toString());
		
		
		
		System.out.println();
	}

}
