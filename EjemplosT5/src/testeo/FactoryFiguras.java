package testeo;

public class FactoryFiguras {
	public Figuras getFigura(String formaFigura) {
		if(formaFigura == null) {
			return null;			
		}
		else if (formaFigura.equalsIgnoreCase("Circulo")) {
			return new Circulo();
		}
		else if(formaFigura.equalsIgnoreCase("Cuadrado")) {
				return new Cuadrado();
		}
		else if(formaFigura.equalsIgnoreCase("Rectangulo")) {
			return new Rectangulo();
		}
		else return null;
	}
}
