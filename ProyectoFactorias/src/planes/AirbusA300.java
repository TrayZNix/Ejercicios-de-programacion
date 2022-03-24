package planes;

public class AirbusA300 extends Airliner {
	//Attributes 
	private planeManager.Seat[][] seats = new planeManager.Seat[35][8];
	
	//Constructor
	public AirbusA300(String registration, String owner) {
		super(registration, "A300", "Airbus", owner, 68150, 18, 2);
		
	}
	
	public planeManager.Seat[][] getSeats() {
		return seats;
	}
	public void setSeats(planeManager.Seat[][] seats) {
		this.seats = seats;
	}
	
}
