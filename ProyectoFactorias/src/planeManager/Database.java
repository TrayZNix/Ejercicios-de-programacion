package planeManager;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private List<planes.Plane> planeList = new ArrayList<planes.Plane>();
	private List<String> registrationsUsed = new ArrayList<String>();
	
	//Getters and setters
	
	public List<String> getRegistrationsUsed() {
		return registrationsUsed;
	}
	public List<planes.Plane> getPlaneList() {
		return planeList;
	}
	public void setPlaneList(List<planes.Plane> planeList) {
		this.planeList = planeList;
	}
	public void setRegistrationsUsed(List<String> registrationsUsed) {
		this.registrationsUsed = registrationsUsed;
	}
	

	
	
}
