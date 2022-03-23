package Ej01;

import java.util.Objects;

public class Apartamento extends Habitacion {
	private boolean roomService;
	private double roomServicePrice;
	
	
	
	public Apartamento(double basePrice, double roomServicePrice) {
		super(basePrice);
		this.roomServicePrice = roomServicePrice;
	}

	public Apartamento(double basePrice, boolean occupied, String clientName, int daysStaying,
			int numberOfPeopleStaying, boolean roomService, double roomServicePrice) {
		super(basePrice, occupied, clientName, daysStaying, numberOfPeopleStaying);
		this.roomService = roomService;
		this.roomServicePrice = roomServicePrice;
	}

	public boolean isRoomService() {
		return roomService;
	}

	public void setRoomService(boolean roomService) {
		this.roomService = roomService;
	}

	public double getRoomServicePrice() {
		return roomServicePrice;
	}

	public void setRoomServicePrice(double roomServicePrice) {
		this.roomServicePrice = roomServicePrice;
	}

	

	@Override
	public String toString() {
		return "Apartamento [roomService=" + roomService + ", roomServicePrice=" + roomServicePrice + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(roomService, roomServicePrice);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apartamento other = (Apartamento) obj;
		return roomService == other.roomService
				&& Double.doubleToLongBits(roomServicePrice) == Double.doubleToLongBits(other.roomServicePrice);
	}
	
	public double calculateRoomPrice() {
		double finalPrice;
		finalPrice = this.getBasePrice()*this.getDaysStaying() + this.roomServicePrice; //With room service applied, Without discount applied
		return finalPrice;
		
	}
	

}
