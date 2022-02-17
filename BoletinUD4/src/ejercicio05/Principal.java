package ejercicio05;

import lectura.leer;

public class Principal {

	public static void main(String[] args) {
		
		//Atributos
		int cantidadEmpleados = 0, selector = 0, selectorArray = 0, porcentajeImpuestos = 0, porcentajeIncentivo = 0, UNO = 1, CERO = 0;
		boolean loop = true, loopQuest = false;
		Empleado[] empleados;
		String nombre = null;
		double sueldoBase = 0, dineroRecaudadoVentas = 0, gastoTotalEmpresa;
		
		System.out.println("Antes de usar este programa debe crear su oficina.");
		System.out.println("¿Cuántos empleados puede tener como máximo esta oficina?");
		do {
			cantidadEmpleados = leer.datoInt();
			if (cantidadEmpleados <= 0) System.out.println("Cantidad no coherente, introduzca de nuevo la cantidad de empleados");
		}while (cantidadEmpleados <= 0);
		Oficina of = new Oficina(cantidadEmpleados);
		System.out.println("Oficina creada!");
		do {
			System.out.printf("\n\n\n");
			System.out.println("¿Qué desea hacer?");
			System.out.println("--------------------------------");
			System.out.println("0. Salir");
			System.out.println("1. Añadir empleados a la oficina");
			System.out.println("2. Ver sueldo final de un empleado");
			System.out.println("3. Ver el total de gasto de la oficina en sueldos");
			selector = leer.datoInt();
			switch (selector)  {
			default:
				 System.out.println("Error de lectura., intentelo de nuevo!");
				 break;
			case 0:
				loop = false;
				break;
			case 1:
					System.out.println("¿Qué tipo de empleado desea añadir?");
					System.out.println("1. Fijo.          2. A comisión");
					selector = leer.datoInt();
					switch (selector) {
					case 1:
						System.out.println("Introduzca su nombre: ");
						nombre = leer.dato();
						System.out.println("Introduzca su sueldo base: ");
						sueldoBase = leer.datoDouble();
						System.out.println("Introduzca cuánto ha recaudado en ventas hasta ahora: ");
						dineroRecaudadoVentas = leer.datoDouble();
						System.out.println("Introduzca el porcentaje de impuestos que debe pagar este empleado: ");
						porcentajeImpuestos = leer.datoInt();
						of.anyadirEmpleadoFijo(nombre, sueldoBase, dineroRecaudadoVentas, porcentajeImpuestos);
						System.out.printf("\n\n\n");
						System.out.println("Empleado fijo creado!");
						break;
					case 2:
						System.out.println("Introduzca su nombre: ");
						nombre = leer.dato();
						System.out.println("Introduzca su sueldo base: ");
						sueldoBase = leer.datoDouble();
						System.out.println("Introduzca cuánto ha recaudado en ventas hasta ahora: ");
						dineroRecaudadoVentas = leer.datoDouble();
						System.out.println("Introduzca el porcentaje de beneficio que recibe este empleado: ");
						porcentajeIncentivo = leer.datoInt();
						of.anyadirEmpleadoComision(nombre, sueldoBase, dineroRecaudadoVentas, porcentajeIncentivo);
						System.out.printf("\n\n\n");
						System.out.println("Empleado a comisión creado!");
						break;						
					default:
						System.out.println("Error de lectura");
						break;
					}
					break;
			case 2:
				empleados = of.getEmpleados();
				System.out.printf("\n\n\n");
				System.out.println("Seleccione el número de empleado del cual desea calcular su sueldo, o escriba 0 para salir");
				do {
					
					for (int i = 0; i < Empleado.empleadosGenerados; i++) {
						System.out.println(empleados[i].toString());
					}
					selector = leer.datoInt();
					selectorArray = selector - 1;
					if (selector <= 0) {
						System.out.println("Fallo al seleccionar");
						loopQuest = true;
					}
					else if (selector > Empleado.empleadosGenerados) {
						System.out.println("Fallo al seleccionar");
						loopQuest = true;
					}
					else {
						System.out.println("seleccionado Bien");
						loopQuest = false;
					}
				}while(loopQuest);
				empleados[selectorArray].calcularSueldoFinal();
				System.out.println("El sueldo final del empleado nº "+selector+ " es: "+empleados[selectorArray].getSueldoFinal()+"€");
				break;
			case 3:
				gastoTotalEmpresa = CERO;
				empleados = of.getEmpleados();
				for (int i = 0; i < Empleado.empleadosGenerados; i++) {
					empleados[i].calcularSueldoFinal();
				}
				for (int i = 0; i < Empleado.empleadosGenerados; i++) {
					gastoTotalEmpresa = gastoTotalEmpresa + empleados[i].getSueldoFinal();
				}
				System.out.printf("\n\n\n");
				System.out.println("El gasto total de la empresa en sueldos es de "+gastoTotalEmpresa+"€");
				break;
			}
			
		}while(loop);
		System.out.println("Gracias por usar este programa!");
	}
	
}
