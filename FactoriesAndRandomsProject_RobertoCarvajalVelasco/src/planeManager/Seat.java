package planeManager;

import java.util.Objects;

public class Seat implements Comparable<Seat>{
	//Attributes 
	private double price;
	private boolean windowPlaced;
	private boolean extras;
	private String seatNumber;
	private boolean used;
	//Constructor
	public Seat(double price, boolean windowPlaced, boolean extras, String seatNumber) {
		super();
		this.price = price;
		this.windowPlaced = windowPlaced;
		this.extras = extras;
		this.seatNumber = seatNumber;
		this.used = false;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isWindowPlaced() {
		return windowPlaced;
	}
	public void setWindowPlaced(boolean windowPlaced) {
		this.windowPlaced = windowPlaced;
	}
	public boolean isExtras() {
		return extras;
	}
	public void setExtras(boolean extras) {
		this.extras = extras;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public boolean isUsed() {
		return used;
	}
	public void setUsed(boolean used) {
		this.used = used;
	}
	@Override
	public String toString() {
		String info = "";
		if (this.windowPlaced && this.extras) {
			info = "Seat \""+this.seatNumber+"\". In window, with extras";
		}
		else if (this.windowPlaced && !this.extras) {
			info = "Seat \""+this.seatNumber+"\". In window, without extras";
		}
		else if (!this.windowPlaced && this.extras) {
			info = "Seat \""+this.seatNumber+"\". Not in window, with extras";
		}
		else if (!this.windowPlaced && !this.extras) {
			info = "Seat \""+this.seatNumber+"\". Not in window, without extras";
		}
		return info;
	}
	@Override
	public int hashCode() {
		return Objects.hash(extras, price, seatNumber, used, windowPlaced);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seat other = (Seat) obj;
		return extras == other.extras && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(seatNumber, other.seatNumber) && used == other.used
				&& windowPlaced == other.windowPlaced;
	}
	@Override
	public int compareTo(Seat o) {
		return (this.seatNumber.compareToIgnoreCase(o.seatNumber));
	}
	
	
	

}
