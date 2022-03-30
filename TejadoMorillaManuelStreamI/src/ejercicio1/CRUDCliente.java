package ejercicio1;

import java.util.List;
import java.util.Objects;

public class CRUDCliente {

	private List<Cliente> listaClientes;

	public CRUDCliente(List<Cliente> listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}

	public CRUDCliente() {
		super();
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

	@Override
	public String toString() {
		return "CRUDCliente [listaClientes=" + listaClientes + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CRUDCliente other = (CRUDCliente) obj;
		return Objects.equals(listaClientes, other.listaClientes);
	}

	public void aniadirUnCliente(Cliente c) {
		this.listaClientes.add(c);
	}
	
	/*Primer método Stream forEach 
	Vamos a pasar la lista de clientes por un flujo o tubería y por cada uno de los elementos de la lista mostramos a cada objeto
	(llamada por referencia, los dos puntos. Llamar por referencia es como llamar al método de forma estática a través de la clase, pero su
	sintaxis es con dos puntos)*/
	public void mostrarClientes() {
		this.listaClientes.stream().forEach(System.out::println);
	}
	
	//Solo podemos borrar un cliente si está dado de baja 
	public boolean borrarUnCliente(String dni) {
		Cliente c = buscarClienteInactivo(dni);
		if(!Objects.isNull(c)) {
			this.listaClientes.remove(c);
			return true;
		}else {
			return false;
		}
	}
	
	public void mostrarBorrado(boolean b) {
		if(b) {
			System.out.println("Cliente borrado con éxito");
		}else {
			System.out.println("El cliente no existe o no está dado de baja");
		}
	}
	
	public boolean darDeBaja(String dni) {
		Cliente c = buscarUnCliente(dni);
		if(!Objects.isNull(c)) {
			c.setActivo(false);
			return true;
		}else {
			return false;
		}	
	}
	
	public void mostrarDarDeBaja(boolean b) {
		if(b) {
			System.out.println("Cliente dado de baja con éxito");
		}else {
			System.out.println("Cliente inexistente");
		}
	}
	
	public boolean modificarUnCliente(String dni, String nombre, String apellidos) {
		Cliente c = buscarUnCliente(dni);
		if(!Objects.isNull(c)) {
			c.setNombre(nombre);
			c.setApellidos(apellidos);
			return true;
		}else {
			return false;
		}	
	}
	
	public void mostrarModificarCliente(boolean b) {
		if(b) {
			System.out.println("Cliente modificado con éxito");
		}else {
			System.out.println("Cliente inexistente");
		}
	}
	
	/*Segundo método Stream, filter
	Este método devuelve un objeto de tipo cliente (porque está dentro de la listaClientes) que reúne los requisitos del filtro.
	Vamos a pasar la lista de clientes por una tubería (que funciona como colador) con requisitos a cumplir. Un objeto cliente
	recorre la tubería y es comparado con los objetos cliente que hay dentro. El filtro en este caso es por DNI.*/
	public Cliente buscarUnCliente(String dni) {
		return listaClientes.stream()
				.filter(cliente -> dni.equalsIgnoreCase(cliente.getDni()))
				.findAny()
				.orElse(null);
	}
	
	public Cliente buscarClienteInactivo(String dni) {
		return listaClientes.stream()
				.filter(cliente -> dni.equalsIgnoreCase(cliente.getDni()))
				.filter(cliente -> !cliente.isActivo())
				.findAny()
				.orElse(null);
	}
	
}
