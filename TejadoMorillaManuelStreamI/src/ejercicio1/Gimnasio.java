package ejercicio1;

import java.util.Collections;
import java.util.Comparator;

public class Gimnasio {

	private String nombre;
	private String direccion;
	private CRUDCliente clientes;
	
	public Gimnasio(String nombre, String direccion, CRUDCliente clientes) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.clientes = clientes;
	}

	public Gimnasio() {
		super();
	}
	
	public Gimnasio(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public CRUDCliente getClientes() {
		return clientes;
	}

	public void setClientes(CRUDCliente clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Gimnasio [nombre=" + nombre + ", direccion=" + direccion + ", clientes=" + clientes + "]";
	}
	
	/*Método tres de Stream Sorted(Comparator)
	 A través del objeto crudCliente(clientes) llamo a la lista de clientes y la pasa por un flujo. A continuación la ordeno usando el método sorted con un criterio
	propio que es el orden natural de los int, en esta caso por la edad de manera descente (reversed). Usamos la clase Comparator y su método comparar por enteros
	Llamamos por referencia a la edad de los clientes de la lista y los objetos serán comparados por este atributo. Luego llamamos por referencia
	a println para que se pinten los clientes*/
	public void mostrarClientesPorEdad() {
		this.clientes.getListaClientes()
		.stream()
		.sorted(Comparator.comparingInt(Cliente::getEdad).reversed())
		.forEach(System.out::println);
	}
	
	/*Método 4 de Stream map
	 Llamamos a la lista de clientes, la pasamos por un flujo. En la primera parte del flujo tenemos personas y extraemos el atributo peso de cada una de ellas
	 y en el siguiente map lo que tenemos son solo sus pesos, a los cuales les sumamos 5 kilos
	 */
	public void simularNavidad() {
		this.clientes.getListaClientes()
		.stream()
		.map(persona -> persona.getPeso())
		.map(peso -> peso+5)
		.forEach(System.out::println);
	}
	
	/*Método 5 de Stream max (ESTO ES TERMINAL)
	 Llamamos a la lista de clientes, la pasamos por un flujo y obtenemos al máximo del atributo edad. Usando la clase comparator, comparando internamente 
	 la edad de los clientes.
	 */
	public Cliente mostrarMasViejo() {
		return this.clientes.getListaClientes()
		.stream()
		.max(Comparator.comparingInt(Cliente::getEdad))
		.get();
	}
	
	/*Método 6 de Stream min (ESTO ES TERMINAL)
	 Llamamos a la lista de clientes, la pasamos por un flujo y obtenemos al mínimo del atributo altura. Usando la clase comparator, comparando internamente 
	 la altura de los clientes.
	 */
	public Cliente mostrarMasBajo() {
		return this.clientes.getListaClientes()
		.stream()
		.min(Comparator.comparingDouble(Cliente::getAltura))
		.get();
	}
	
	/*Método 7 de Stream skip (saltarse elementos de la lista)
	 Llamamos a la lista de clientes, la pasamos por un flujo y nos saltamos el tamaño de la lista menos el último elemento. 
	 Por cada elemento del flujo lo muestra con el forEach y la llamada por referencia del println
	 */
	public void mostrarUltimoCliente() {
		this.clientes.getListaClientes()
		.stream()
		.skip(clientes.getListaClientes().size()-1)
		.forEach(System.out::println);
	}
	
	/*Método 8 de Stream limit (devuelve la cantidad de elementos del flujo que yo quiera)
	 Con la clase padre Collections llamo al método shuffle que ordena de forma aleatoria la colección (CUIDADO: La colección 
	 se queda desordenada). Paso la colección por
	 un flujo y limito a 1 los elementos que pinto con el println
	 */
	public void mostrarPremiado() {
		Collections.shuffle(this.clientes.getListaClientes());
		this.clientes.getListaClientes()
		.stream()
		.limit(1)
		.forEach(System.out::println);
	}
}
