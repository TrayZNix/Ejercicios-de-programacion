package ejercicio_jero;

import java.util.Objects;

public class Avion implements Comparable <Avion>{
	
	//ATRIBUTOS
	
	private int avionID;
	private String modelo;
	private double velocidadMedia;
	private double consumo100km;
	private int capacidadPasajeros;
	
	//CONSTRUCTORES
	
	public Avion(int avionID, String modelo, double velocidadMedia, double consumo100km, int capacidadPasajeros) {
		super();
		this.avionID = avionID;
		this.modelo = modelo;
		this.velocidadMedia = velocidadMedia;
		this.consumo100km = consumo100km;
		this.capacidadPasajeros = capacidadPasajeros;
	}

	//GETTERS & SETTERS

	public int getAvionID() {
		return avionID;
	}

	public void setAvionID(int avionID) {
		this.avionID = avionID;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidadMedia() {
		return velocidadMedia;
	}

	public void setVelocidadMedia(double velocidadMedia) {
		this.velocidadMedia = velocidadMedia;
	}

	public double getConsumo100km() {
		return consumo100km;
	}

	public void setConsumo100km(double consumo100km) {
		this.consumo100km = consumo100km;
	}

	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}

	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}

	//TO STRING
	
	@Override
	public String toString() {
		return "Avion [avionID=" + avionID + ", modelo=" + modelo + ", velocidadMedia=" + velocidadMedia
				+ ", consumo100km=" + consumo100km + ", capacidadPasajeros=" + capacidadPasajeros + "]";
	}

	//HASHCODE & EQUALS 

	@Override
	public int hashCode() {
		return Objects.hash(avionID, capacidadPasajeros, consumo100km, modelo, velocidadMedia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avion other = (Avion) obj;
		return avionID == other.avionID && capacidadPasajeros == other.capacidadPasajeros
				&& Double.doubleToLongBits(consumo100km) == Double.doubleToLongBits(other.consumo100km)
				&& Objects.equals(modelo, other.modelo)
				&& Double.doubleToLongBits(velocidadMedia) == Double.doubleToLongBits(other.velocidadMedia);
	}

	//COMPARE TO
	
	@Override
	public int compareTo(Avion avion) {
		if(this.avionID>avion.getAvionID())
			return 1;
		if(this.avionID<avion.getAvionID())
			return -1;
		return 0;
	}
	
	
}
