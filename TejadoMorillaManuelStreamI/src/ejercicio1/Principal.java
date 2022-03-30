package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lectura.Leer;

public class Principal {
	
	/*Te encargan elaborar la aplicación que gestiona los clientes de un gimnasio en Triana. Los clientes
	 * están caracterizados por su dni, nombre, apellidos, edad, peso, altura, sexo y si está activo en
	 * el gimnasio o no. En la clase CRUDCliente hay una lista de clientes y los siguientes métodos: 
	 * .Mostrar todos los clientes del gimnasio
	 * .Dar de baja a un cliente
	 * .Borrar un cliente solo si está dado de baja
	 * .Buscar un cliente por su dni
	 * .Modificar el nombre y apellidos de un cliente buscándolo previamente a través de su dni
	 * Crear una clase Gimnasio con los atributos: nombre, dirección y un objeto crudCliente para acceder
	 * a la lista de clientes. En esta clase gimnasio tenemos los siguientes métodos:
	 * .Mostrar los clientes ordenador por edad de manera descendente.
	 * .Simular el peso de los clientes a la vuelta de navidad sumándole 5 kilos a su peso inicial.
	 * .Mostrar el último cliente dado de alta usando skip
	 * .Obtener un cliente aleatorio para darle un premio. Investigar el método shuffle de la clase
	 * Collections y usar limit.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0, cero=0, edad=0;
		String dni="", nombre="", apellidos="", sexo="";
		double peso=0, altura=0;
		Gimnasio g = new Gimnasio("Sport Gym Triana", "Triana");
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		CRUDCliente crudCliente = new CRUDCliente(listaClientes);
		g.setClientes(crudCliente);
		
		System.out.println("Bienvenido al gimnasio de Triana");
		listaClientes.add(new Cliente("25596654s", "Manolo", "Tejado Morilla", 30, 80, 1.73, "Hombre", false));
		listaClientes.add(new Cliente("25599654s", "Manuel", "Teja Mori", 15, 50, 1.90, "Hombre", true));
		listaClientes.add(new Cliente("25596654f", "María", "Anatolia García", 20, 63, 1.59, "Mujer", true));
		listaClientes.add(new Cliente("25599654d", "Manuela", "Blanca Paloma", 55, 82, 2.0, "Mujer", false));
		
		do {
			
			System.out.println("¿Qué desea hacer?");
			System.out.println("0. Salir");
			System.out.println("1. Añadir un cliente");
			System.out.println("2. Mostrar lista de clientes");
			System.out.println("3. Dar de baja");
			System.out.println("4. Borrar cliente");
			System.out.println("5. Buscar un cliente");
			System.out.println("6. Modificar datos de un cliente");
			System.out.println("7. Mostrar los clientes ordenados por edad de manera descendente");
			System.out.println("8. Simular peso de los clientes a la vuelta de navidad");
			System.out.println("9. Mostrar a la persona con más edad del gimnasio");
			System.out.println("10. Mostrar a la persona más baja del gimnasio");
			System.out.println("11. Mostrar el último cliente dado de alta");
			System.out.println("12. Obtener un cliente aleatorio para darle un premio");
			
			opcion=Leer.datoInt();
			
			switch(opcion) {
			
				case 0:
					break;
					
				case 1:
					System.out.println("Introduzca el dni");
					dni=Leer.dato();
					System.out.println("Introduzca el nombre");
					nombre=Leer.dato();
					System.out.println("Introduzca los apellidos");
					apellidos=Leer.dato();
					System.out.println("Introduzca la edad");
					edad=Leer.datoInt();
					System.out.println("Introduzca el peso");
					peso=Leer.datoDouble();
					System.out.println("Introduzca la altura");
					altura=Leer.datoDouble();
					System.out.println("Introduzca el sexo");
					sexo=Leer.dato();
					Cliente c = new Cliente(dni,nombre,apellidos,edad,peso,altura,sexo,true);
					crudCliente.aniadirUnCliente(c);
					break;
					
				case 2:
					crudCliente.mostrarClientes();
					break;
					
				case 3:
					System.out.println("Diga el dni del cliente al que quiera dar de baja");
					dni=Leer.dato();
					crudCliente.mostrarDarDeBaja(crudCliente.darDeBaja(dni));
					break;
					
				case 4:
					System.out.println("Diga el dni del cliente que desea borrar");
					dni=Leer.dato();
					crudCliente.mostrarBorrado(crudCliente.borrarUnCliente(dni));
					break;
					
				case 5:
					System.out.println("Diga el dni del cliente que quiere buscar");
					dni=Leer.dato();
					System.out.println(crudCliente.buscarUnCliente(dni));
					break;
					
				case 6:
					System.out.println("Diga el dni del cliente que quiere modificar su nombre y apellidos");
					dni=Leer.dato();
					if(!Objects.isNull(crudCliente.buscarUnCliente(dni))) {
					System.out.println(crudCliente.buscarUnCliente(dni));
					System.out.println("Ahora diga el nuevo nombre");
					nombre=Leer.dato();
					System.out.println("Diga los apellidos");
					apellidos=Leer.dato();
					crudCliente.mostrarModificarCliente(crudCliente.modificarUnCliente(dni, nombre, apellidos));
					}else {
						System.out.println("Cliente inexistente");
					}
					break;
					
				case 7:
					g.mostrarClientesPorEdad();
					break;
					
				case 8:
					g.simularNavidad();
					break;
					
				case 9:
					System.out.println(g.mostrarMasViejo());
					break;
					
				case 10:
					System.out.println(g.mostrarMasBajo());
					break;
				
				case 11:
					g.mostrarUltimoCliente();
					break;
					
				case 12:
					g.mostrarPremiado();
					break;
				
			}
			
		}while(opcion!=cero);
		System.out.println("Gracias por usar la aplicación. Vuelva pronto");
	}

}
