package ejercicio;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {

		//Variables
		boolean loop = true, loopQuest = false;
		int selector = 1;
		double radio, altura, beneficio;
		Plataforma p = new Plataforma();
		
		//Menu
		System.out.println("Bienvenido al sistema gestor de depósitos!");
		do {
			System.out.printf("\n\n\n");
			System.out.println("¿Qué desea hacer?");
			System.out.println("..........................................");
			System.out.println("0. Salir");
			System.out.println("1. Agregar un nuevo depósito");
			System.out.println("2. Calcular el precio de venta de un depósito");
			System.out.println("3. Capacidad total en conjunto actual");
			System.out.println("4. Calcular beneficios de Repsol");
			System.out.printf("\n\n\n");
			selector = leer.datoInt();
			switch (selector) {
				default: 
					System.out.println("Error al leer!");
					break;
				case 0:
				loop = false;
				break;
				case 1:
					System.out.println("¿De que radio desea el depósito?");
					do {
						radio = leer.datoDouble();
						if (radio <= 0) {
							System.out.println("Por favor, introduce un valor positivo mayor a 0");
						}
					}while(radio <= 0);
					do {
						System.out.println("y, ¿De qué altura?");
						altura = leer.datoDouble();
						if (altura <= 0) {
							System.out.println("Por favor, introduce un valor positivo mayor a 0");
						}
					}while(altura <= 0);
					p.agregarDeposito(radio, altura);
					break;
				case 2:
					System.out.println("Sobre qué depósito desea calcular su precio de venta?");
					p.imprimirDepositos();
					selector = leer.datoInt();
					System.out.println("¿Qué beneficio desea conseguir?");
					beneficio = leer.datoDouble();
					System.out.println("Para conseguir un "+beneficio+"% de beneficio es necesario vender el depósito a "
					+p.calcularPrecioVenta(beneficio, selector)+"€");
					break;
				case 3:
					System.out.println("La capacidad total de todos los depósitos juntos es de "+(Deposito.capacidadTotal*1000)+" litros"); //La operacion es el cambio de m³ a litros.
					break;
				case 4:
					System.out.println("¿Sobre qué desea calcular el beneficio?");
					System.out.println("---------------------------------------------------");
					System.out.println("0. Volver atras");
					System.out.println("1. De un deposito concreto completo");
					System.out.println("2. De todos los depositos completos");
					System.out.printf("\n\n\n");
					selector = leer.datoInt();
					switch (selector) {
						default: 
							System.out.println("Error al leer!");
							break;
						case 0:
							break;
						case 1:
							System.out.println("Sobre qué depósito desea calcular su precio de venta?");
							do {
							p.imprimirDepositos();
							selector = leer.datoInt();
								if (selector < 1) {
									loopQuest = true;
									System.out.println("Deposito no valido, escriba correctamente el ID del depósito");
								}
								if (p.depositoExiste(selector)) {
									loopQuest = true;
									System.out.println("Deposito no valido, escriba correctamente el ID del depósito");
									
								}
								else {
									loopQuest = false;
								}
							}while (loopQuest);
							System.out.println("El vendedor recibe con la venta de este depósito completo un total de "+p.calcularBeneficioUno(selector)+"€"); 
							break;
						case 2:
							System.out.println("El vendedor recibe con la venta de todos los depositos completos un total de "+p.calcularBeneficioTodos()+"€"); 
							break;
					}
					break;
				
			}
			
		}while(loop);
		System.out.println("Gracias por usar este programa!");
	}

}
