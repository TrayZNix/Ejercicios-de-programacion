package generaciondedatos;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		GeneracionDatos gd = new GeneracionDatos();
		ArrayList<Double> valoresElectricosGeneradosTurbina = new ArrayList<Double>();
		Double valorElectrico;
		
		
			valorElectrico = gd.generarElectricidadTurbina();
			System.out.printf("Valor de electricidad: %.2f KW/h\n", valorElectrico);
			valoresElectricosGeneradosTurbina.add(valorElectrico);
		
		System.out.printf("La media de electricidad generada es: %.2f KW/h\n", gd.calcularMediaElectricidadGenerada(valoresElectricosGeneradosTurbina));

	}

}
