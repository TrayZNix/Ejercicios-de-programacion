package ejercicio09;

public class Maquina {
	private double precio;
	private double saldo;
	private int contraseña;
	private int cantidad;
	private boolean desbloqueado;

	Ticket t = new Ticket();
	
	public Maquina() {
		this.contraseña=383873;
		this.desbloqueado=false;
	}
	public double getprecioActual() {
		this.precio=t.getprecioBillete();
		return precio;
	}
	public void setPrecioBilletes(double precioNuevo) {
		if (this.desbloqueado) {
			t.setprecioBillete(precioNuevo);
			System.out.println("Precio actualizado!");
		}
	}
	public void verSaldo() {
		if (this.desbloqueado) {
			System.out.println("Recaudado: "+this.saldo);
		}
	}
	public void setCantidad(int cantidad) {
		t.setCantidad(cantidad);
	}
	public void sumaSaldo(double ganado) {
		this.saldo = this.saldo + ganado;
	}
	public boolean imprimirBillete(boolean comprado, int enPosesion) {
		if(comprado) {
		System.out.println("Comenzando impresión...");
		System.out.printf("\n");
		System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
		System.out.println("Billete de metro");
		System.out.println("Precio: "+t.getprecioBillete()+"€");
		System.out.println("Valido para "+enPosesion+" personas");
		System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
		}
		comprado = false;
		return comprado;
	}
	
	public boolean desbloquear(int contraseñaRecibida) {
		if (this.contraseña == contraseñaRecibida) {
			this.desbloqueado = true;
			System.out.println("Desbloqueado!");
		}
		else {
			System.out.println("Contraseña erronea");
		}
		return this.desbloqueado;
	}
}
