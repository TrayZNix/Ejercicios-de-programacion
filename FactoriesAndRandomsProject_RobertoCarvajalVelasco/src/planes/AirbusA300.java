package planes;


public class AirbusA300 extends Airliner {
	//Constructor
	public AirbusA300(String registration, String owner) {
		super(registration, "A300", "Airbus", owner, 68150, 18, 2, new planeManager.Seat[35][8]);
		
	}
	
}
