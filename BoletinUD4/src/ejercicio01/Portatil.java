package ejercicio01;
public class Portatil extends Ordenador{
	private int porcentajeDescuento;
	private String color;
	private boolean qwerty;
	
	public Portatil(String marca, String nombre, double frecuenciaCPU, double precioBase, int capacidadAlmacenamiento,
			int porcentajeDescuento, String color, boolean qwerty) {
		super(marca, nombre, frecuenciaCPU, precioBase, capacidadAlmacenamiento);
		this.porcentajeDescuento = porcentajeDescuento;
		this.color = color;
		this.qwerty = qwerty;
	}

	
	
}

