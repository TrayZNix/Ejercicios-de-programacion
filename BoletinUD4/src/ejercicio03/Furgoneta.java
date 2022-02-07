package ejercicio03;

public class Furgoneta extends Vehiculo {
	private double impuesto;
	private int idTipo;

	public Furgoneta(double caballos, double cilindrada, String tipoCombustible, int porcentajeImpuestoSegunPotencia, int baseImpuestos, boolean transportaMercancias) {
		super(caballos, cilindrada, tipoCombustible, baseImpuestos, transportaMercancias);
		this.impuesto = super.calcularImpuesto(porcentajeImpuestoSegunPotencia, idTipo);
		this.idTipo = 2;
	
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return "Furgoneta [impuesto=" + impuesto + ", idTipo=" + idTipo + ", r=" + r + ", getImpuesto()="
				+ getImpuesto() + ", getCaballos()=" + getCaballos() + ", getCilindrada()=" + getCilindrada()
				+ ", getTipoCombustible()=" + getTipoCombustible() + ", getBaseImpuestos()=" + getBaseImpuestos()
				+ ", toString()=" + super.toString() + ", generarCaballosRandom()=" + generarCaballosRandom()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
