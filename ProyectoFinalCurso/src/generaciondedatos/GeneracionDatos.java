package generaciondedatos;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.DoubleStream;

public class GeneracionDatos {
	Random r = new Random(System.nanoTime());
	
	
	public double generarElectricidadTurbina() {
		DoubleStream streamValores = r.doubles(7500, 9000);	
		OptionalDouble optionalValorFinal = streamValores.findAny();
		Double valorFinal = optionalValorFinal.getAsDouble();
		return valorFinal;
	}
	
	public double calcularMediaElectricidadGenerada(ArrayList<Double> ValoresTirada) {
		double media = 0;
		for(Double d : ValoresTirada) {
			media = media + d;
		}
		media = media/ValoresTirada.size();
		return media;
		
	}
}
