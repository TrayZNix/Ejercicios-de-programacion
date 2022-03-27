package planes;

public class Boeing737 extends Airliner {	
	//Constructor
	public Boeing737(String registration, String owner) {
		super(registration, "737", "Boeing", owner, 26035, 6, 2, new planeManager.Seat[24][6]);
			
	}
}
