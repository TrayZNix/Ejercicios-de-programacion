package planeManager;

import java.util.ArrayList;
import java.util.List;

import planes.PlanesFactory;

public class PlanesManager {
	Database db;
	planes.PlanesFactory pf = new PlanesFactory();
	planes.Plane p;
	private List<planes.Plane> airlinerList = new ArrayList<planes.Plane>();
	private List<planes.Plane> militaryList = new ArrayList<planes.Plane>();
	private List<planes.Plane> genAviationList = new ArrayList<planes.Plane>();
	
	public void addAirliner() {
		this.airlinerList.add(pf.planeFactory("A320", "EC-LUO", "Iberia"));
	}
	
	public void printAllPlaneList() {
		for(planes.Plane p : this.airlinerList) {
			System.out.println(p.toString());
		}
		
	}
	
}
