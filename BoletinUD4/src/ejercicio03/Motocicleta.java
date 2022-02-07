package ejercicio03;

public class Motocicleta extends Vehiculo {
	private double impuesto;
	private int idTipo;
	
	public Motocicleta(double caballos, double cilindrada, String tipoCombustible, int porcentajeImpuestoSegunPotencia, int baseImpuestos,  boolean transportaMercancias) {
		super(caballos, cilindrada, tipoCombustible, baseImpuestos, transportaMercancias);
		this.impuesto = super.calcularImpuesto(porcentajeImpuestoSegunPotencia, idTipo);
		this.idTipo = 3;

	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return "Motocicleta [impuesto=" + impuesto + ", idTipo=" + idTipo + "]";
	}
	
}
