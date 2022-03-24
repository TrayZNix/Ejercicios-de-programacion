package planes;

public class Boeing777 extends Airliner {
	//Attributes 
	private planeManager.Seat[][] seats = new planeManager.Seat[29][7];
	
	//Constructor
	public Boeing777(String registration, String owner) {
		super(registration, "777", "Boeing", owner, 117348, 14, 2);
		
	}

	public planeManager.Seat[][] getSeats() {
		return seats;
	}

	public void setSeats(planeManager.Seat[][] seats) {
		this.seats = seats;
	}
	
	
}
