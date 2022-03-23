package ej02;

import java.util.Objects;

public abstract class Producto implements Comparable {
	private double precioBase;
	private int cantidad;
	private String nombreProducto;
	public Producto(double precioBase, int cantidad, String nombreProducto) {
		super();
		this.precioBase = precioBase;
		this.cantidad = cantidad;
		this.nombreProducto = nombreProducto;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	@Override
	public String toString() {
		return "Producto [precioBase=" + precioBase + ", cantidad=" + cantidad + ", nombreProducto=" + nombreProducto
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cantidad, nombreProducto, precioBase);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return cantidad == other.cantidad && Objects.equals(nombreProducto, other.nombreProducto)
				&& Double.doubleToLongBits(precioBase) == Double.doubleToLongBits(other.precioBase);
	}
	
	public abstract double calculatePVP();
	
	public int compareTo(Producto p) {
		// TODO Auto-generated method stub
		return -(this.nombreProducto.compareToIgnoreCase(p.getNombreProducto()));
	}
}
