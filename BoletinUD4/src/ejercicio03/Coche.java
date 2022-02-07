package ejercicio03;

public class Coche extends Vehiculo {
	private double impuesto;
	private int idTipo;
	
	public Coche(double caballos, double cilindrada, String tipoCombustible, int porcentajeImpuestoSegunPotencia, int baseImpuestos, boolean transportaMercancias) {
		super(caballos, cilindrada, tipoCombustible, baseImpuestos, transportaMercancias);
		this.idTipo = 1;
		this.impuesto = super.calcularImpuesto(porcentajeImpuestoSegunPotencia, idTipo);

	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return "Coche [impuesto=" + impuesto + ", idTipo=" + idTipo + "]";
	}
	

}
