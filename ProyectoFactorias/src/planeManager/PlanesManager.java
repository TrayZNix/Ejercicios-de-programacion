package planeManager;

import java.util.ArrayList;
import java.util.List;

import planes.PlanesFactory;

public class PlanesManager {
	Database db = new Database();
	planes.PlanesFactory pf = new PlanesFactory();
	planes.Plane p;
	private List<planes.Plane> airlinerList = new ArrayList<planes.Plane>();
	private List<planes.Plane> militaryList = new ArrayList<planes.Plane>();
	private List<planes.Plane> genAviationList = new ArrayList<planes.Plane>();
	
	public void addPlane(String type, String registration, String owner) {
		this.airlinerList.add(pf.planeFactory(type, registration, owner));
	}
	
	public void printAllPlaneList() {
		for(planes.Plane p : this.airlinerList) {
			System.out.println(p.toString());
		}
	}
	
	public boolean checkRegistrationUsed(String registration) {
		for(String r : db.getRegistrationsUsed()) {
			if(r.equalsIgnoreCase(registration)) {
				return true;
			}
		}
		return false;
	}
	
	public void addRegistration(String registration){
		List<String> registrationsUsed = new ArrayList<String>();
		registrationsUsed = db.getRegistrationsUsed();
		registrationsUsed.add(registration);
		db.setRegistrationsUsed(registrationsUsed);
		
	}
	
}
