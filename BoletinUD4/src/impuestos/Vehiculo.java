package impuestos;

import java.util.Random;

public class Vehiculo {
	private double caballos;
	private double cilindrada;
	private String tipoCombustible;
	private int baseImpuestos;
	private boolean vehiculoTransporteMercancias;
	Random r = new Random(System.nanoTime());
	
	//CONSTRUCTOR
	
	public Vehiculo(double caballos, double cilindrada, String tipoCombustible, int baseImpuestos, boolean transportaMercancias) {
		super();
		this.caballos = caballos;
		this.cilindrada = cilindrada;
		this.tipoCombustible = tipoCombustible;
		this.baseImpuestos = baseImpuestos;
		this.vehiculoTransporteMercancias = transportaMercancias;
	}
	
	//GETTERS Y SETTERS
	
	public double getCaballos() {
		return caballos;
	}

	public void setCaballos(double caballos) {
		this.caballos = caballos;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public int getBaseImpuestos() {
		return baseImpuestos;
	}

	public void setBaseImpuestos(int baseImpuestos) {
		this.baseImpuestos = baseImpuestos;
	}
	
	
	//MÉTODOS 
	
	
	@Override
	public String toString() {
		return "Vehiculo [caballos=" + caballos + ", cilindrada=" + cilindrada + ", tipoCombustible=" + tipoCombustible
				+ ", baseImpuestos=" + baseImpuestos + ", vehiculoTransporteMercancias=" + vehiculoTransporteMercancias
				+ ", r=" + r + "]";
	}

	public int generarCaballosRandom(){
		int aleatorio;
		aleatorio = r.nextInt(150-45)+45;
		return aleatorio;
	}


	public double calcularImpuesto(int porcentaje, int idTipo) {
		if (idTipo == 1) {
			return this.baseImpuestos + cilindrada * (porcentaje / 100) ;
		}
		if (idTipo == 3) {
			return this.baseImpuestos + caballos * (porcentaje / 100) ;
		}
		if (vehiculoTransporteMercancias) {
			return this.baseImpuestos + caballos * (porcentaje / 100) ;
		}
		else {
			return 0;
		}
	}
}
