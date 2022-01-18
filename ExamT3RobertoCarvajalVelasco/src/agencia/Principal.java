package agencia;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		boolean loop = true, preciosGenerados = false, error;
		int selector, precio, mes, ganancia, precioMCuadrado;
		double precioEuroEnLibra, cantidadEuros, libras;
		int [] precios = new int [6];
		Inmobiliaria i = new Inmobiliaria ();
		//menu
		do {
			System.out.println("-------------------------");
			System.out.println("    ¿Qué desea hacer?");
			System.out.println(".........................");
			System.out.println("0. Salir del programa");
			System.out.println("1. Rellenar el array de precios");
			System.out.println("2. Calcular el precio de venta");
			System.out.println("3. Calcular precio del metro cuadrado");
			System.out.println("4. Calcular cambio de Euro a Libras");
			System.out.println("5. Mostrar los datos del piso");
		
		selector = leer.datoInt();
		switch (selector) {
		case 0:
			loop = false;
			break;
			
		case 1:
			if (preciosGenerados) {
				System.out.println("Ya se han generado precios antes... ¿Quiere volver a generar otros precios?!");
				System.out.println("1 = Sí - Otro número = No");
				selector = leer.datoInt();
				switch (selector) {
					case 1:
						preciosGenerados = false;
					break;
					default:
						System.out.println("Abortando operación");
						break;
				}
				
			}
			if (preciosGenerados == false) {
				precios=i.rellenarArray();
				preciosGenerados = true;
			}
				
			break;
		case 2:
			System.out.printf("\n\n");
			if (preciosGenerados) {
				System.out.println("¿Sobre qué mes quiere calcular el precio? (0=Volver atras, 1=Hace un mes, 2=Hace dos meses, etc.");
				do {
					mes = leer.datoInt();
					if (mes > 7 | mes < 0) {
						System.out.println("Error. Como mucho registramos los precios de hace 6 meses");
						System.out.println("Escriba de nuevo por favor");
						error = true;
					}
					else {
						error = false;
					}
				}while (error);
				if (mes != 0 ) {
					System.out.println("¿Qué porcentaje de ganancia desea adquirir?");
					ganancia = leer.datoInt();
					
					precio = i.calcularPrecioVenta(mes, ganancia);
					System.out.println("Venda a "+precio+"€!");
				}
			}
			else {
				System.out.println("Aun no se han generado los precios. ¡Completa antes el paso 1!");
				System.out.printf("\n\n");
				}
			break;
		case 3:
			precioMCuadrado = i.precioMetroCuadrado();
			System.out.printf("\n\n");
			System.out.println("El precio del metro cuadrado de este piso según el precio de compra deseado por el vendedor es de "+precioMCuadrado+"€");
			System.out.printf("\n\n");
			break;
		case 4:
			System.out.printf("\n\n");
			System.out.println("Por favor, introduzca el precio en libras de un euro"); //Un euro: 0.88 libras
			precioEuroEnLibra=leer.datoDouble();
			System.out.println("¿Cuantos euros desea cambiar?");
			cantidadEuros = leer.datoDouble();
			libras = i.cambioEuroALibra(precioEuroEnLibra, cantidadEuros);
			System.out.println(cantidadEuros+"€ son "+libras+" libras Esterlinas");
			System.out.printf("\n\n");
			break;
		case 5:
			i.imprimeDatosPiso();
			
			break;
		}
		}while(loop);
		System.out.println("Gracias por usar este programa!");
	}

}
