package ej_07;

public class Principal {

	public static void main(String[] args) {
		double km=100, ltotal=0, euros=0, eulitro=1.295;
		float consumo=6; //EL CONSUMO ES DE 6L POR CADA 100KM. 
		int CCV=100; //CCV ES LA CONSTANTE DE CONVERSION. 
		System.out.printf("Este programa es capaz de calcularle el precio de la gasolina que consume un coche de un determinado consumo en los km que dese.\n\n");
		
		//OPERAMOS
		ltotal=consumo/CCV*km;
		euros=eulitro*ltotal;
		//IMPRIMIMOS LOS RESULTADOS
		System.out.printf("En este caso, el precio total de la gasolina en %.2f km, a un precio de gasolina de %.3f€ por litro, y un consumo de %.1f l/100km, es de %.1f €", km, eulitro, consumo, euros);
		
		

	}

}
