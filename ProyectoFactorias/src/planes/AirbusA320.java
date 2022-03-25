package planes;

public class AirbusA320 extends Airliner {
	//Attributes 
	private planeManager.Seat[][] seats = new planeManager.Seat[26][6]; //Seatmap
	
	//Constructor
	public AirbusA320(String registration, String owner) {
		super(registration, "A320", "Airbus", owner, 27200, 6, 2);
		
	}
	
	public planeManager.Seat[][] getSeats() {
		return seats;
	}
	public void setSeats(planeManager.Seat[][] seats) {
		this.seats = seats;
	}
	
	
	

}
