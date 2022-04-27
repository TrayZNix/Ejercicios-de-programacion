package generaciondedatos;

import java.util.ArrayList;

public class Turbina {
	static int turbinasGeneradas;
	//Atributos
	int idTurbina;
	double electricidadActual;
	double vibracionActual;
	double rpmActual;
	double temperaturaInternaActual;
	ArrayList<Double> valoresElectricosActuales;
	
	
	public Turbina() {
		super();
		turbinasGeneradas++;
		this.valoresElectricosActuales = new ArrayList<Double>();
	}
	
	
	
	
}
