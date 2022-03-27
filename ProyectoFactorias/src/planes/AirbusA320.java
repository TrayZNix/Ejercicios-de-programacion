package planes;


public class AirbusA320 extends Airliner {
	//Constructor
	public AirbusA320(String registration, String owner) {
		super(registration, "A320", "Airbus", owner, 27200, 6, 2, new planeManager.Seat[26][6]);
		
	}	

}
