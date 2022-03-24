package main;

import java.util.ArrayList;
import java.util.List;

import planeManager.Database;
import planeManager.PlanesManager;
import planes.PlanesFactory;

public class Main {

	public static void main(String[] args) {
		

		List<planes.Plane> airlinerList = new ArrayList<planes.Plane>();
		Database db = new Database();
		PlanesManager pm = new PlanesManager();
		PlanesFactory pf= new PlanesFactory();
		
		pm.addAirliner();
		pm.printAllPlaneList();
	}

}
