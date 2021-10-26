package ej_11;

public class Principal {

	public static void main(String[] args) {
		int lssalida=8, htotal=24, stotal=0, lcap=0, HAS=3600; //HAS=3600 -> Una hora son 3600 segundos.
		double LAM3=0.001, m3cap=0;
		System.out.printf("Este programa se usará para calcular la cantidad de agua en metros cúbicos que se extrae de un pozo, de un caudal determinado \n\n");
		//OPERAMOS
		stotal=htotal*HAS;//CALCULAMOS LOS SEGUNDOS TOTALES EN 24H
		lcap=lssalida*stotal;//CALCULAMOS LOS LITROS EXTRAIDOS EN 24H
		m3cap=lcap*LAM3;//CALCULAMOS LOS M3 DE AGUA EXTRAIDOS EN 24H
		//IMPRIMIMOS LOS RESULTADOS
		System.out.printf("Este pozo de caudal de agua de %d l/s, en %d horas, extrae %.2fm^3 de agua", lssalida, htotal, m3cap);
		

	}

}
