package ej02;

import java.util.Objects;

public class Movil extends Producto {
	private String manufacturer;

	public Movil(double precioBase, int cantidad, String nombreProducto, String manufacturer) {
		super(precioBase, cantidad, nombreProducto);
		this.manufacturer = manufacturer;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Movil [manufacturer=" + manufacturer + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(manufacturer);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movil other = (Movil) obj;
		return Objects.equals(manufacturer, other.manufacturer);
	}
	
}
