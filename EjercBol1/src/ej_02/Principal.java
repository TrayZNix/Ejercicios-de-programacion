package ej_02;

public class Principal {

	public static void main(String[] args) {
		//TAMBIEN PODEMOS DECLARAR LOS MISMOS TIPOS DE VARIABLES EN UNA MISMA LINEA
		//EJ: int largo=50; int ancho=21; int area=0; 
		int largo=50;
		int ancho=21;
		int area=0;
		int mult=1000;
		double profundidad=2.5;
		double volumen=0;
		double litros=0;
		double precioagual=0.0018;
		double preciofinal=0;
		
		//PRIMERO CALCULAMOS EL AREA, LUEGO, EL VOLUMEN	
		area=largo*ancho;
		System.out.printf("Para calcular el área multiplicamos el largo por el ancho. En este ejemplo, de 50m de largo y 21m de ancho, el area total es: %d m² \n\n", area );
		volumen=area*profundidad;
		litros=volumen*mult;
		System.out.printf("A continuación, calculamos el volumen total multiplicando el área por la profundidad. El resultado es %.2f m³, es decir, la piscina tiene %.2f litros de agua \n", volumen, litros);
		
		//FINALMENTE, CALCULAMOS EL PRECIO DEL AGUA TOTAL		
		System.out.printf("Finalmente calculamos el precio del agua total, multiplicando los litros de agua por el precio de un litro de agua. (0.018€/l)\n");
		preciofinal= litros*precioagual;
		System.out.printf("El precio final es: %.2f€", preciofinal);
		
		
		
		
		
		
		
	}

}
