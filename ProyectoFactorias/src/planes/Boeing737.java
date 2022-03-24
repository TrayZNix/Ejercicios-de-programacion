package planes;

public class Boeing737 extends Airliner {
	//Attributes 
	private planeManager.Seat[][] seats = new planeManager.Seat[24][6];
	
	//Constructor
	public Boeing737(String registration, String owner) {
		super(registration, "737", "Boeing", owner, 26035, 6, 2);
		
	}

	public planeManager.Seat[][] getSeats() {
		return seats;
	}

	public void setSeats(planeManager.Seat[][] seats) {
		this.seats = seats;
	}
	
}
