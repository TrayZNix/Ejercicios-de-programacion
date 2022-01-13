package ejercicio09;

public class Ticket {
	//atributos
	private double precioBillete;
	private int cantidad;
	
	Ticket(){
		this.precioBillete = 1.75;
	}

	public double getprecioBillete() {
		return precioBillete;
	}

	public void setprecioBillete(double precioBillete) {
		this.precioBillete = precioBillete;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
