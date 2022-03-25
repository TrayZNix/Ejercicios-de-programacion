package planeManager;

import java.util.ArrayList;
import java.util.List;

import planes.Airliner;

public class SeatManager {
	private List<planes.Airliner> airlinerList = new ArrayList<planes.Airliner>();
	Database db;
	
	public List<planes.Airliner> getAirlinerList() {
		return airlinerList;
	}
	public void setAirlinerList(List<planes.Airliner> airlinerList) {
		this.airlinerList = airlinerList;
	}
	public Database getDb() {
		return db;
	}
	public void setDb(Database db) {
		this.db = db;
	}
	
	
}
