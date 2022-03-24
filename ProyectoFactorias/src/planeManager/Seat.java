package planeManager;

public class Seat {
	//Attributes 
	private double price;
	private boolean windowPlaced;
	private boolean extras;
	private String seatNumber;
	//Constructor
	public Seat(double price, boolean windowPlaced, boolean extras, String seatNumber) {
		super();
		this.price = price;
		this.windowPlaced = windowPlaced;
		this.extras = extras;
		this.seatNumber = seatNumber;
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
	
	

}
