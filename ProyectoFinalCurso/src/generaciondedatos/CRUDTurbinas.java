package generaciondedatos;

import java.util.ArrayList;

public class CRUDTurbinas {
	ArrayList<Turbina> listaTurbinas;
	Turbina t;
	
	public CRUDTurbinas() {
		listaTurbinas = new ArrayList<Turbina>();
	}
	
	public void crearTurbina() {
		t = new Turbina();
		listaTurbinas.add(t);
	}
}
