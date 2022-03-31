package ejercicio02;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;

public class GestionReservas {

	// Atributos
	private Map<Reserva, Cliente> lista = new HashMap<Reserva, Cliente>();

	// Constructor
	public GestionReservas(Map<Reserva, Cliente> lista) {
		super();
		this.lista = lista;
	}

	// Getters&Setters
	public Map<Reserva, Cliente> getLista() {
		return lista;
	}

	public void setLista(Map<Reserva, Cliente> lista) {
		this.lista = lista;
	}

	// toString
	@Override
	public String toString() {
		return "GestionReservas [lista=" + lista + "]";
	}

	// HashCode&Equals
	@Override
	public int hashCode() {
		return Objects.hash(lista);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GestionReservas other = (GestionReservas) obj;
		return Objects.equals(lista, other.lista);
	}

	// Métodos

	/*
	 * El siguiente método se utiliza para mostrar aquellas reservas cuyo atributo
	 * Reserva = false, es decir, aquellas que aún no hayan sido reservadas
	 */
	public void mostrarDisponible() {
		// Creamos un SortedMap para ordenar por fecha
		SortedMap<Reserva, Cliente> listaOrd = new TreeMap<Reserva, Cliente>(lista);
		Iterator<Reserva> it = listaOrd.keySet().iterator();
		Reserva r = null;

		while (it.hasNext()) {
			r = it.next();
			if (!r.isReserva()) {
				System.out.println("Fecha: " + r.getFecha() + ".");
				System.out.println("No reservado.");
				System.out.printf("Precio: %.2f€.\n", r.getPrecio());
				System.out.println("\n===================\n");
			}
		}
	}

	/*
	 * El siguiente método nos mostrará aquellas reservas que se hayan efectuado, y
	 * los datos de los clientes que la han realizado. Para conseguir los datos,
	 * usaremos el método de la colección Map: lista.get(r), que nos devuelve el
	 * Cliente asociado a la Reserva que le pasemos, en cada caso, el valor del
	 * iterador por el que vaya el recorrido
	 */
	public void mostrarReserva(double descuento) {
		// Creamos un SortedMap para ordenar por fecha
		SortedMap<Reserva, Cliente> listaOrd = new TreeMap<Reserva, Cliente>(lista);
		Iterator<Reserva> it = listaOrd.keySet().iterator();
		Reserva r = null;

		while (it.hasNext()) {
			r = it.next();
			if (r.isReserva()) {
				System.out.println("Datos de la reserva:");
				System.out.println("Fecha: " + r.getFecha() + ".");
				System.out.printf("Precio: %.2f€.\n", r.getPrecio());

				/*
				 * Este condicional es el que comprueba si la fecha de nacimiento (cumpleaños)
				 * coincide con la fecha de la reserva. En caso afirmativo, se aplicará el
				 * descuento y se mostrará
				 */

				if (lista.get(r).getFechaNac().getDayOfMonth() == r.getFecha().getDayOfMonth()
						&& lista.get(r).getFechaNac().getMonthValue() == r.getFecha().getMonthValue()) {
					System.out.printf("¡¡Descuento del %.2f%% por reservar para tu cumpleaños!!\n", descuento);
				}
				System.out.printf("Precio reserva: %.2f€.\n", calcularPrecio(r, lista.get(r), descuento));
				System.out.println("------------------------------------------------");

				System.out.println("Datos del cliente:");
				System.out.println("DNI: " + lista.get(r).getDni() + ".");
				System.out.println("Nombre: " + lista.get(r).getNombre() + ".");
				System.out.println("Fecha de nacimiento: " + lista.get(r).getFechaNac() + ".");
				System.out.println("Teléfono: " + lista.get(r).getTlf() + ".");
				System.out.println("Email: " + lista.get(r).getEmail() + ".");
				System.out.println("\n===============================================\n");
			}
		}
	}

	/*
	 * El siguiente método nos devolverá la reserva del día que hayamos
	 * seleccionado, para después poder asociarle los datos del cliente que va a
	 * efectuar dicha reserva
	 */
	public Reserva buscarReserva(int anio, int mes, int dia) {
		// Creamos un SortedMap para ordenar por fecha
		SortedMap<Reserva, Cliente> listaOrd = new TreeMap<Reserva, Cliente>(lista);
		Iterator<Reserva> it = listaOrd.keySet().iterator();
		Reserva r = null;
		LocalDate fecha = LocalDate.of(anio, mes, dia);
		boolean salir = false;

		while (it.hasNext() && !salir) {
			r = it.next();

			/*
			 * Devolverá la reserva si la fecha que indiquemos coincide con alguna de las
			 * que tengamos guardadas en las reservas. Si no, devolverá un nulo
			 */

			if (r.getFecha().isEqual(fecha)) {
				salir = true;
			}
		}
		if (!salir) {
			r = null;
		}
		return r;
	}

	/*
	 * El siguiente método setea el valor del atributo Reserva de una reserva dada a
	 * true para que deje de estar disponible
	 */
	public boolean realizarReserva(Reserva r) {
		if (r != null) {
			r.setReserva(true);
			return true;
		} else {
			return false;
		}
	}

	/*
	 * El siguiente método solo sirve como comprobación de que la reserva se ha
	 * realizado con éxito porque hayamos pasado los valores de las fechas de forma
	 * correcta
	 */
	public void comprobarReserva(boolean b) {
		if (b) {
			System.out.println("Reserva realizada con éxito.");
		} else {
			System.out.println("Error, pruebe de nuevo.");
		}
	}

	/*
	 * El siguiente método es el que comprueba si el cliente que realiza la reserva
	 * es o no mayor de edad. Para ello, compara su fecha de nacimiento con la fecha
	 * a día de hoy con el método compareTo de la clase LocalDate, que devuelve un
	 * entero que representa los años de diferencia entre ambas fechas, es decir, la
	 * edad
	 */
	public boolean comprobarMayorEdad(LocalDate hoy, int mayorEdad, int anioNac, int mesNac, int diaNac) {
		if (hoy.compareTo(LocalDate.of(anioNac, mesNac, diaNac)) < mayorEdad) {
			return false;
		} else {
			return true;
		}
	}

	// El siguiente método es el que permite asociar una reserva a un cliente dado
	public void reservarCliente(Reserva r, Cliente c) {
		lista.put(r, c);
	}

	/*
	 * El siguiente método es el que se encarga de calcular el precio de una
	 * reserva, dada dicha reserva y el cliente que la realiza. Dentro, se hará la
	 * comprobación, primero, de si alguno de los dos valores es nulo, en cuyo caso
	 * no se haría nada, y segundo, de que si la fecha de nacimiento coincide en mes
	 * y día con la fecha de reserva. Si sucede, se le aplicará el descuento
	 * indicado
	 */
	public double calcularPrecio(Reserva r, Cliente c, double descuento) {
		double div = 100;

		if (c != null && r != null) {
			if (c.getFechaNac().getDayOfMonth() == r.getFecha().getDayOfMonth()
					&& c.getFechaNac().getMonthValue() == r.getFecha().getMonthValue()) {
				return r.getPrecio() - (r.getPrecio() * descuento / div);
			} else {
				return r.getPrecio();
			}
		} else {
			return 0.0;
		}
	}
}