package ejercicio09;

import lectura.leer;
/**
 * Clase en la que encontramos el <strong>menú</strong>, donde el usuario elije que hacer y se hacen llamadas a la clase máquina
 * 
 * @version 1.3, 11/02/2022
 * @author rober
 *
 */

public class Principal {
	
	public static void main(String[] args) {
		
		int selector, cantidad, enPosesion = 0, contraseña;
		double precio, insertado, cambio, precioActualizado, ganado;
		boolean loop = true, comprado = false, reDo = false, desbloqueado;
		
		Maquina m = new Maquina();
		
		do {
		System.out.printf("\n\n\n");
		System.out.println("-----------------------------");
		System.out.println("¿Qué desea hacer?");
		System.out.println("-----------------------------");
		System.out.println("1. Comprar billetes");
		System.out.println("2. Imprimir billetes");
		System.out.println("3. Opciones de operario");
		System.out.println(".............................");
		System.out.println("Sus billetes para imprimir: "+enPosesion);
		selector=leer.datoInt();
		switch(selector) {
			case 1:
				if(enPosesion>0) {
					System.out.println("Actualmente tiene "+enPosesion+" billetes comprados");
				}
				precio=m.getprecioActual();
				System.out.printf("\n\n");
				System.out.println("El billete cuesta "+precio+"€ por persona. ¿Cuantos desea comprar?");
				cantidad=leer.datoInt();
				m.setCantidad(cantidad);
				System.out.println("Introduzca el dinero");
				do {
					
				insertado = leer.datoDouble();
				cambio = insertado - precio * cantidad;
				if(cambio<0) {
					System.out.println("Debe introducir una mayor cantidad");
					reDo = true;
				}
				else {
					reDo = false;
					}
				}while(reDo);
				enPosesion=enPosesion + cantidad;
				ganado = precio*cantidad;
				m.sumaSaldo(ganado);
				System.out.printf("\n\n");
				System.out.println("Ha comprado "+cantidad+" billetes por "+precio+"€.");
				System.out.println("Su cambio es "+cambio+"€. Muchas gracias por su compra.");
				comprado = true;
				break;
			case 2:
				comprado = m.imprimirBillete(comprado, enPosesion);
				enPosesion = 0;
				break;
			case 3:
				System.out.println("Introduzca la contraseña de operador");
				contraseña = leer.datoInt();
				desbloqueado = m.desbloquear(contraseña);
				if (desbloqueado) {
					System.out.printf("\n\n1. Cambiar precio de los billetes");
					System.out.printf("\n\n2. Ver recaudación");
					selector = leer.datoInt();
					switch (selector) {
					case 1:
						System.out.println("¿A que precio desea cambiar los billetes?");
						precioActualizado = leer.datoDouble();
						m.setPrecioBilletes(precioActualizado);
						break;
					case 2:
						m.verSaldo();
						break;
					}
				}
				break;
			default:
				System.out.println("Error al leer");
				break;
		}
		}while(loop);
		
	}
	
}
