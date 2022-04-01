package ejercicio_jero;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CrudAvion {
	
	//ATRIBUTOS
	
	private Set <Avion> flota;

	//CONSTRUCTORES
	
	public CrudAvion(Set<Avion> flota) {
		super();
		this.flota = flota;
	}

	//GETTERS & SETTERS
	
	public Set<Avion> getFlota() {
		return flota;
	}

	public void setFlota(Set<Avion> flota) {
		this.flota = flota;
	}
	
	//TO STRING
	
	@Override
	public String toString() {
		return "CrudAvion [flota=" + flota + "]";
	}
	
	//HASHCODE & EQUALS

	@Override
	public int hashCode() {
		return Objects.hash(flota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CrudAvion other = (CrudAvion) obj;
		return Objects.equals(flota, other.flota);
	}
	
	//METODOS
	
	public void agregarAvion(Avion avion) {
		
		flota.add(avion);
		
	}

	public Set<Avion> buscarAvionesPorNombre(String modelo) {

		Iterator <Avion> it = flota.iterator();
		Set <Avion> aux = new HashSet <Avion>();
		Avion avion;

		while(it.hasNext()) {
			
			avion=it.next();
			if(avion.getModelo().toLowerCase().contains(modelo.toLowerCase()))
				aux.add(avion);
			
		}

		return aux;
	}
	
	public Avion buscarAvion(Set <Avion> listaAviones, int avionID) {
		
		Iterator <Avion> it = listaAviones.iterator();
		Avion avion=null;
		boolean salir = false;
		
		while(it.hasNext() && !salir) {
			avion=it.next();
			if(avion.getAvionID()==avionID) {
				salir=true;
			}else
				avion=null;
		}
		
		return avion;
	}
	
	public void eliminarAvion (Set <Avion> listaAviones, int avionID) {
		
		comprobarCambios(flota.remove(buscarAvion(listaAviones, avionID)));
		
	}
	
	public void modificarAvion(Set <Avion> listaAviones, int avionID, Avion avion,boolean posible) {
		
		if(posible) {
			buscarAvion(listaAviones,avionID).setCapacidadPasajeros(avion.getCapacidadPasajeros());
			buscarAvion(listaAviones,avionID).setConsumo100km(avion.getConsumo100km());
			buscarAvion(listaAviones,avionID).setModelo(avion.getModelo());
			buscarAvion(listaAviones,avionID).setVelocidadMedia(avion.getVelocidadMedia());
		}
			comprobarCambios(posible);
	}
	
	public void ordenarID() {
		
		SortedSet <Avion> ordenado = new TreeSet <Avion>(flota);
		setFlota(ordenado);
		
	}
	
	public boolean comprobarPosible(Set <Avion> listaAviones, int avionID) {
		
		boolean confirmar = false;
		
		if(listaAviones.contains(buscarAvion(listaAviones,avionID)))
			confirmar = true;
		
		return confirmar;
	}
	
	public void comprobarCambios(boolean realizado) {
		
		if (realizado)
			System.out.println("\n\t✔️ Cambios realizados con éxito 🛠️");
		if(!realizado)
			System.out.println("\n\t❌ Vaya... Parece que algo ha fallado 🛠️ ");
		
	}
	
	
	
	
	
	
	
	
	
}
