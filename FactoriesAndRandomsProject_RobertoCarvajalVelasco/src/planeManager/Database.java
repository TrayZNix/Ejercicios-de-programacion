package planeManager;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private List<planes.Airliner> AirlinerList = new ArrayList<planes.Airliner>();
	private List<planes.GeneralAviation> GeneralAvList = new ArrayList<planes.GeneralAviation>();
	private List<planes.Military> militaryList = new ArrayList<planes.Military>();
	private List<String> registrationsUsed = new ArrayList<String>();
	
	//Getters and setters
	
	public List<String> getRegistrationsUsed() {
		return registrationsUsed;
	}
	public void setRegistrationsUsed(List<String> registrationsUsed) {
		this.registrationsUsed = registrationsUsed;
	}
	public List<planes.Airliner> getAirlinerList() {
		return AirlinerList;
	}
	public void setAirlinerList(List<planes.Airliner> airlinerList) {
		AirlinerList = airlinerList;
	}
	public List<planes.GeneralAviation> getGeneralAvList() {
		return GeneralAvList;
	}
	public void setGeneralAvList(List<planes.GeneralAviation> generalAvList) {
		GeneralAvList = generalAvList;
	}
	public List<planes.Military> getMilitaryList() {
		return militaryList;
	}
	public void setMilitaryList(List<planes.Military> militaryList) {
		this.militaryList = militaryList;
	}
	

	
	
}
