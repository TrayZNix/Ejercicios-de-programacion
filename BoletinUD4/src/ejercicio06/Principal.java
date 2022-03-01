package ejercicio06;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		int selector = 0, numeroClienteEnArray = 0, UNO = 1, CERO = 0;
		int maxTiposCuentas = 3; //Número máximo de cuentas por cliente
		double dineroEnMovimiento; 
		int maxClientesTotales = 100; //Numero máximo de clientes por cada oficina
		boolean loop = true, logueado = false, tieneCuenta = false, salir = false;
		Cliente[] clientes;
		String dni, contraseña, apellidos, nombre;
		Oficina o = new Oficina(maxClientesTotales);
		do {
			clientes = o.getClientes();
			System.out.printf("\n\n\n");
			System.out.println("Bienvenido! ¿Qué desea hacer?");
			System.out.println("-------------------------------------------");
			System.out.println("0. Salir del programa");
			System.out.println("1. Identificarme"); //logueo
			System.out.println("2. Darme de alta"); //Crear cliente
			System.out.printf("\n\n\n");
			selector = leer.datoInt();
			switch (selector) {
				default:
					System.out.println("Error al leer, intentelo de nuevo");
					break;
				case 0:
					logueado = true;
					salir = true;
					break;
				case 1:
					System.out.println("Introduzca su DNI.");
					dni = (leer.dato()).toUpperCase(); //Convierte la letra del dni a mayuscula
					System.out.println("Introduzca su contraseña");
					contraseña = leer.dato();
					logueado = o.identificarCliente(dni, contraseña);
					if (logueado) System.out.println("Ha sido logueado correctamente!");
					else System.out.println("No se ha podido identificar correctamente");
					if(logueado) {
						numeroClienteEnArray = o.conseguirNumeroCliente(dni, contraseña);
					}
					break;
				case 2:
					System.out.println("Introduzca sus apellidos");
					apellidos = leer.dato();
					System.out.println("Introduzca su nombre");
					nombre = leer.dato();
					System.out.println("Introduzca su DNI");
					dni = (leer.dato()).toUpperCase();
					System.out.println("Estableza una contraseña para su cuenta");
					contraseña = leer.dato();
					o.darAltaCliente(nombre, apellidos, dni, contraseña, maxTiposCuentas);
					System.out.println("Ha sido dado de alta correctamente! Ya puede identificarse para acceder a su cuenta.");
					break;
			}
		
		}while (logueado == false);
		if(logueado & salir == false) {			
			System.out.println("Bienvenido/a, "+clientes[numeroClienteEnArray].getNombre());
			do {
				tieneCuenta = clientes[numeroClienteEnArray].checkearCuentaCreada();
				System.out.printf("\n\n\n");
				System.out.println("¿Qué desea hacer?");
				System.out.println("--------------------------------");
				System.out.println("0. Salir de esta cuenta");
				System.out.println("1. Abrir cuenta");
				System.out.println("2. Ver saldo de una cuenta");
				System.out.println("3. Ingresar dinero");
				System.out.println("4. Retirar dinero");
				System.out.printf("\n\n\n");
				selector = leer.datoInt();
				switch (selector) {
					default: 
						System.out.println("Error al leer");
						break;
					case 1:
						//CREAR CUENTA
						if (clientes[numeroClienteEnArray].verNumeroCuentasCreadas() < 3) {	
							System.out.println("Actualmente posee "+clientes[numeroClienteEnArray].verNumeroCuentasCreadas()+" cuentas de un máximo de "+maxTiposCuentas+" cuentas por cliente");
							System.out.println("¿Qué tipo de cuenta desea crear?");
							System.out.println("..........................................");
							System.out.println("0. Volver");
							System.out.println("1. Cuenta Joven");
							System.out.println("2. Cuenta Corriente");
							System.out.println("3. Cuenta Empresa");
							do {
							selector = leer.datoInt();
							if(selector > 3 | selector < 0) {
								System.out.printf("\n\n\n");
								System.out.println("Error al leer, escriba de nuevo");
								System.out.printf("\n\n\n");
							}
							else if (selector == 0) {
								break;
							}
							else {
								o.crearCuentaCliente(numeroClienteEnArray, selector);
							}
							}while (selector > 3 | selector < 1);
						}
						else {
							System.out.println("Lo sentimos, cada cliente solo puede tener 3 cuentas, como máximo");
						}
						break;
					case 2:
						if (tieneCuenta) {
						System.out.println("Elija la cuenta de la que ver el saldo, o pulsa 0 para salir");
						o.imprimirCuentasCliente(numeroClienteEnArray);
						do {
							selector = leer.datoInt();
							if(selector > 3 | selector < 0) {
								System.out.printf("\n\n\n");
								System.out.println("Error al leer, escriba de nuevo");
								System.out.printf("\n\n\n");
							}
						}while (selector > 3 | selector < 1);
						if (selector == CERO);
						else {
							o.verSaldo(numeroClienteEnArray, selector--);
						}
						
						}
						else {
							System.out.printf("\n\n\n");
							System.out.println("Debes tener una cuenta!");
							System.out.printf("\n\n\n");
						}
						break;
					case 3:
						System.out.println("¿En qué cuenta quieres ingresar el dinero?");	
						o.imprimirCuentasCliente(numeroClienteEnArray);
						do {
							selector = leer.datoInt();
							if(selector > 3 | selector < 0) {
								System.out.printf("\n\n\n");
								System.out.println("Error al leer, escriba de nuevo");
								System.out.printf("\n\n\n");
							}
						}while (selector > 3 | selector < 1);
						if (selector == CERO);
						else {
							System.out.println("¿Cuánto dinero desea ingresar?");
							dineroEnMovimiento = leer.datoDouble();
							if (dineroEnMovimiento == CERO);
							else {
								o.ingresarDinero(numeroClienteEnArray, selector, dineroEnMovimiento);
								System.out.println("Se ha ingresado su dinero correctamente!");
								
							}
						}
						break;
					case 4:
						System.out.println("¿De qué cuenta desea retirar el dinero?");
						o.imprimirCuentasCliente(numeroClienteEnArray);
						do {
							selector = leer.datoInt();
							if(selector > 3 | selector < 0) {
								System.out.printf("\n\n\n");
								System.out.println("Error al leer, escriba de nuevo");
								System.out.printf("\n\n\n");
							}
						}while (selector > 3 | selector < 1);
						if (selector == CERO);
						else {
							System.out.println("¿Cuánto dinero desea retirar?");
							do {
							dineroEnMovimiento = leer.datoDouble();
								if(o.regresarSaldoCuenta(numeroClienteEnArray, selector) < dineroEnMovimiento) {
									System.out.println("No puede retirar más dinero del que tiene! Introduzca de nuevo la cantidad"
											+ " de dinero que desea retirar. ");
								}
								else {
									o.retirarDinero(numeroClienteEnArray, selector, dineroEnMovimiento);
									System.out.println("Se ha retirado "+dineroEnMovimiento+"€ de su cuenta");
								}
							}while(o.regresarSaldoCuenta(numeroClienteEnArray, selector) < dineroEnMovimiento);
							o.im
						}
						break;
				}
			}while(loop);
		
			}
		System.out.printf("\n\n\n");
		System.out.println("Gracias por usar este programa!0");
		}

}
