package planeManager;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private List<planes.Plane> airlinerList = new ArrayList<planes.Plane>();
	private List<planes.Plane> militaryList = new ArrayList<planes.Plane>();
	private List<planes.Plane> genAviationList = new ArrayList<planes.Plane>();
	private List<String> registrationsUsed = new ArrayList<String>();
	
	//Getters and setters
	public List<planes.Plane> getAirlinerList() {
		return airlinerList;
	}
	public void setAirlinerList(List<planes.Plane> airlinerList) {
		this.airlinerList = airlinerList;
	}
	public List<planes.Plane> getMilitaryList() {
		return militaryList;
	}
	public void setMilitaryList(List<planes.Plane> militaryList) {
		this.militaryList = militaryList;
	}
	public List<planes.Plane> getGenAviationList() {
		return genAviationList;
	}
	public void setGenAviationList(List<planes.Plane> genAviationList) {
		this.genAviationList = genAviationList;
	}
	public List<String> getRegistrationsUsed() {
		return registrationsUsed;
	}
	public void setRegistrationsUsed(List<String> registrationsUsed) {
		this.registrationsUsed = registrationsUsed;
	}
	

	
	
}
