package ejercicio_jero;

import java.time.LocalTime;
import java.util.Objects;

public class Vuelo implements Comparable <Vuelo>{
	
	//ATRIBUTOS
	
	private int vueloID;
	private Avion avion;
	private String origen;
	private LocalTime salida;
	private String destino;
	private LocalTime llegada;
	private int numPasajeros;
	
	//CONSTRUCTORES
	
	public Vuelo(int vueloID, Avion avion, String origen, LocalTime salida, String destino, LocalTime llegada,
			int numPasajeros) {
		super();
		this.vueloID = vueloID;
		this.avion = avion;
		this.origen = origen;
		this.salida = salida;
		this.destino = destino;
		this.llegada = llegada;
		this.numPasajeros = numPasajeros;
	}

	//GETTERS & SETTERS
	
	public int getVueloID() {
		return vueloID;
	}
	
	public void setVueloID(int vueloID) {
		this.vueloID = vueloID;
	}
	
	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public LocalTime getSalida() {
		return salida;
	}

	public void setSalida(LocalTime salida) {
		this.salida = salida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalTime getLlegada() {
		return llegada;
	}

	public void setLlegada(LocalTime llegada) {
		this.llegada = llegada;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	//TO STRING
	
	@Override
	public String toString() {
		return "Vuelo [vueloID=" + vueloID + "avion=" + avion + ", origen=" + origen + ", salida=" + salida
				+ ", destino=" + destino + ", llegada=" + llegada + ", numPasajeros=" + numPasajeros + "]";
	}

	//HASHCODE & EQUALS
	
	@Override
	public int hashCode() {
		return Objects.hash(avion, destino, llegada, numPasajeros, origen, salida, vueloID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		return Objects.equals(avion, other.avion) && Objects.equals(destino, other.destino)
				&& Objects.equals(llegada, other.llegada) && numPasajeros == other.numPasajeros
				&& Objects.equals(origen, other.origen) && Objects.equals(salida, other.salida)
				&& vueloID == other.vueloID;
	}
	
	//COMPARE TO
	
	@Override
	public int compareTo(Vuelo vuelo) {
		if(this.vueloID<vuelo.getVueloID())
			return -1;
		if(this.vueloID>vuelo.getVueloID())
			return 1;
		return 0;
	}

	
	
	
	
	
}
