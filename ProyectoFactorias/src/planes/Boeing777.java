package planes;


public class Boeing777 extends Airliner {
	//Constructor
	public Boeing777(String registration, String owner) {
		super(registration, "777", "Boeing", owner, 117348, 14, 2, new planeManager.Seat[29][7]);
	
	}
		
	
}
