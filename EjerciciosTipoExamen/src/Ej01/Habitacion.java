package Ej01;

import java.util.Objects;

public class Habitacion implements Comparable<Habitacion>{
	static int createdRooms;
	private int numHabitacion;
	private double basePrice;
	private boolean occupied;
	private String clientName;
	private int daysStaying; //Number of days the room is going to be occupied by the client
	private int numberOfPeopleStaying;
	
	
	public Habitacion(double basePrice) {
		super();
		createdRooms++;
		this.numHabitacion = createdRooms;
		this.basePrice = basePrice;
		this.occupied = false;
	}
	
	public Habitacion(double basePrice, boolean occupied, String clientName, int daysStaying,
			int numberOfPeopleStaying) {
		super();
		createdRooms++;
		this.numHabitacion = createdRooms;
		this.basePrice = basePrice;
		this.occupied = occupied;
		this.clientName = clientName;
		this.daysStaying = daysStaying;
		this.numberOfPeopleStaying = numberOfPeopleStaying;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public int getDaysStaying() {
		return daysStaying;
	}

	public void setDaysStaying(int daysStaying) {
		this.daysStaying = daysStaying;
	}

	public int getNumberOfPeopleStaying() {
		return numberOfPeopleStaying;
	}

	public void setNumberOfPeopleStaying(int numberOfPeopleStaying) {
		this.numberOfPeopleStaying = numberOfPeopleStaying;
	}
	public int getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	@Override
	public String toString() {
		return "Habitacion [ROOMNUMBER=" + numHabitacion + ", basePrice=" + basePrice + ", occupied=" + occupied
				+ ", clientName=" + clientName + ", daysStaying=" + daysStaying + ", numberOfPeopleStaying="
				+ numberOfPeopleStaying + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(basePrice, clientName, daysStaying, numberOfPeopleStaying, occupied);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Habitacion other = (Habitacion) obj;
		return Double.doubleToLongBits(basePrice) == Double.doubleToLongBits(other.basePrice)
				&& Objects.equals(clientName, other.clientName) && daysStaying == other.daysStaying
				&& numberOfPeopleStaying == other.numberOfPeopleStaying && occupied == other.occupied;
	}
	
	//METHODS
	
	public double calculateRoomPrice() {
		return this.basePrice*this.daysStaying;
	}

	@Override
	public int compareTo(Habitacion o) {
		if (this.clientName != null && o.clientName != null) {
			return -(this.clientName.compareToIgnoreCase(o.getClientName()));
		}
		else return 1;
	}
	
	
	
}
