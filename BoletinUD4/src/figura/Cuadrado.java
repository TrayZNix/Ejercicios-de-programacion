package figura;

public class Cuadrado extends Figura {
	private int lado;
	private String color;
	
	public Cuadrado(String nombre, int lado, String color) {
		super(nombre);
		this.lado = lado;
		this.color = color;
	}
}
