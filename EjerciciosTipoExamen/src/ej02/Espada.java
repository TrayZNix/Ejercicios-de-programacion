package ej02;

import java.util.Objects;

public class Espada extends Producto {
	private String type;

	public Espada(double precioBase, int cantidad, String nombreProducto, String type) {
		super(precioBase, cantidad, nombreProducto);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Espada [type=" + type + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(type);
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
		Espada other = (Espada) obj;
		return Objects.equals(type, other.type);
	}
	
	public double calculatePVP(int benefitPercentage) {
		double pvp;
		
		return pvp;
	}

}
