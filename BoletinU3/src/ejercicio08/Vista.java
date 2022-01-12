package ejercicio08;

public class Vista {
	
	private String opcionMenuPrincipalA = "Comprar boleto";
	private String opcionMenuPrincipalB = "Comprobar premios";
	private String opcionMenuSecundarioA1 = "Comprar un número determinado";
	private String opcionMenuSecundarioA2 = "Comprar un número aleatorio";
	private String opcionMenuSecundarioB1 = "Comprobado automático";
	private String opcionMenuSecundarioB2 = "Comprobado manual";
	
	public Vista() {
		
	}
	
	public void Bienvenida() {
		System.out.println("Bienvenido. Desde este programa podrá comprar y comprobar boletos de lotería");
		System.out.println("----------------------------------------------------------------------------");
		System.out.printf("\n\n");
	}
	
	public void MenuPrincipal(){
		System.out.printf("\n╔═══════════════════════════════════════╗");
		System.out.printf("\n║ ¿Qué desea hacer? \t\t\t║");
		System.out.printf("\n║.......................................║");
		System.out.printf("\n║ 0.Salir\t\t\t\t║");
		System.out.printf("\n║ 1.%s\t\t\t║", opcionMenuPrincipalA);
		System.out.printf("\n║ 2.%s\t\t\t║", opcionMenuPrincipalB);
		System.out.printf("\n╚═══════════════════════════════════════╝");
	}
	
	public void MenuSecundarioA() {
		System.out.printf("\n╔═══════════════════════════════════════╗");
		System.out.printf("\n║ Elija qué desea hacer \t\t║");
		System.out.printf("\n║.......................................║");
		System.out.printf("\n║ 0.Salir\t\t\t\t║");
		System.out.printf("\n║ 1.%s\t║", opcionMenuSecundarioA1);
		System.out.printf("\n║ 2.%s\t\t║", opcionMenuSecundarioA2);
		System.out.printf("\n╚═══════════════════════════════════════╝");
	}
	public void MenuSecundarioB() {
		System.out.printf("\n╔═══════════════════════════════════════╗");
		System.out.printf("\n║ Elija como desea comprobar su boleto  ║");
		System.out.printf("\n║.......................................║");
		System.out.printf("\n║ 0.Salir\t\t\t\t║");
		System.out.printf("\n║ 1.%s\t\t║", opcionMenuSecundarioB1);
		System.out.printf("\n║ 2.%s\t\t\t║", opcionMenuSecundarioB2);
		System.out.printf("\n╚═══════════════════════════════════════╝");
	}
	
	public void menuPreguntaNumero() {
		System.out.printf("\n╔═══════════════════════════════════════╗");
		System.out.printf("\n║Introduzca el número que desea adquirir║");
		System.out.printf("\n║o escriba 0 para salir \t\t║");
		System.out.printf("\n╚═══════════════════════════════════════╝");
	}
	
	public void errorSeleccionNumero() {
		System.out.printf("\n╔═══════════════════════════════════════╗");
		System.out.printf("\n║Recuerde, el numero debe ser mayor a 0 ║");
		System.out.printf("\n║y menor que 99999\t\t\t║");
		System.out.printf("\n╚═══════════════════════════════════════╝");
	}
	
	public void precio() {
		System.out.printf("\n╔═══════════════════════════════════════╗");
		System.out.printf("\n║ ¿Con cuanto desea jugar?\t\t║");
		System.out.printf("\n╚═══════════════════════════════════════╝");
	}
	
	public void errorSeleccionPrecio() {
		System.out.printf("\n╔═══════════════════════════════════════╗");
		System.out.printf("\n║ Introduzca un precio positivo\t\t║");
		System.out.printf("\n╚═══════════════════════════════════════╝");
	}
	public void errorSeleccionGeneral() {
		System.out.printf("\n╔═══════════════════════════════════════╗");
		System.out.printf("\n║ Error al leer, volviendo al inicio\t║");
		System.out.printf("\n╚═══════════════════════════════════════╝");
	}
	public void confirmacion(double precio, int numero) {
		System.out.printf("\n╔════════════════════════════════════════");
		System.out.printf("\n║ Ha apostado %.2f€ por el número %d\t\t\t", precio, numero);
		System.out.printf("\n╚════════════════════════════════════════");
	}
	
	public void advertenciaYaHecho() {
		System.out.printf("\n╔═══════════════════════════════════════╗");
		System.out.printf("\n║ Para prevenir la ludopatía solo se le ║");
		System.out.printf("\n║ permite tener un boleto, pero parece  ║");
		System.out.printf("\n║ que ya tiene un boleto comprado.\t║");
		System.out.printf("\n║ ¿Quiere cambiarlo por otro?\t\t║");
		System.out.printf("\n║ *1 = Sí | Otro número = No*\t\t║");
		System.out.printf("\n╚═══════════════════════════════════════╝");
	}
	public void generado(int num) {
		System.out.printf("\n╔═══════════════════════════════════════╗");
		System.out.printf("\n║ El número generado para su boleto es  ║");
		System.out.printf("\n║ el número %d\t\t\t║", num);
		System.out.printf("\n║ Escriba 0 para salir\t\t\t║", num);
		System.out.printf("\n║ Escriba 1 para comprarlo\t\t║", num);
		System.out.printf("\n║ Escriba 2 para generar uno nuevo\t║", num);
		System.out.printf("\n╚═══════════════════════════════════════╝");
		
	}
	public void ganado(double ganado) {
		if(ganado == 0) {
			System.out.printf("\n╔═══════════════════════════════════════╗");
			System.out.printf("\n║ Lo sentimos, su boleto no estaba\t║");
			System.out.printf("\n║ premiado\t\t\t\t║");
			System.out.printf("\n╚═══════════════════════════════════════╝");	
		}
		else {
			System.out.printf("\n╔═══════════════════════════════════════╗");
			System.out.printf("\n║ ¡Felicidades! ¡Ha ganado %.2f€! ║", ganado);
			System.out.printf("\n╚═══════════════════════════════════════╝");			
		}
	}
	
	public void despedida() {
		System.out.printf("\n╔═══════════════════════════════════════╗");
		System.out.printf("\n║ Gracias por haber usado este programa ║");
		System.out.printf("\n╚═══════════════════════════════════════╝");
	}

}
