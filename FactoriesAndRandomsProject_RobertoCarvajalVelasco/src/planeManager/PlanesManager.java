 package planeManager;

import java.util.ArrayList;
import java.util.List;
import planes.Airliner;
import planes.GeneralAviation;
import planes.Military;
import planes.PlanesFactory;

public class PlanesManager {
	Database db = new Database();
	planes.PlanesFactory pf = new PlanesFactory();
	SeatManager sm = new SeatManager();
	planes.Plane p; 
	int removeOffsetArray = 1;
	private List<planes.Airliner> AirlinerList = new ArrayList<planes.Airliner>();
	private List<planes.GeneralAviation> GeneralAvList = new ArrayList<planes.GeneralAviation>();
	private List<planes.Military> militaryList = new ArrayList<planes.Military>();
	private List<String> registrationsUsed = new ArrayList<String>();
	
	
	public List<planes.Airliner> getAirlinerList() {
		return AirlinerList;
	}

	public void setAirlinerList(List<planes.Airliner> airlinerList) {
		AirlinerList = airlinerList;
	}

	public void addPlane(String type, String registration, String owner, boolean extraA, boolean extraB) {
		planes.Plane p = pf.planeFactory(type, registration, owner);
		p.setExtras(extraA, extraB);
		if (p instanceof planes.Airliner) {
			((Airliner) p).setupSeats();
			this.AirlinerList = db.getAirlinerList();
			this.AirlinerList.add((Airliner) p);
			db.setAirlinerList(AirlinerList);
		}
		if (p instanceof planes.GeneralAviation) {
			this.GeneralAvList = db.getGeneralAvList();
			this.GeneralAvList.add((GeneralAviation) p);
			db.setGeneralAvList(GeneralAvList);
		}
		if (p instanceof planes.Military) {
			this.militaryList = db.getMilitaryList();
			this.militaryList.add((Military) p);
			db.setMilitaryList(militaryList);
		}
		
	}
	
	public void printGeneralAviation() {
		int removeOffset = 1;
		this.GeneralAvList = db.getGeneralAvList();
		System.out.println("General Aviation Aircrafts");
		System.out.println("------------------");
		for(planes.Plane p : this.GeneralAvList) {
			System.out.println(GeneralAvList.indexOf(p)+removeOffset+". "+p.toString());
		}
	}
	public void printAirliners() {
		int removeOffset = 1;
		this.AirlinerList = db.getAirlinerList();
		System.out.println("Airliners");
		System.out.println("------------------");
		for(planes.Plane p : this.AirlinerList) {
			System.out.println(AirlinerList.indexOf(p)+removeOffset+". "+p.toString());
		}
	}
	public void printMilitary() {
		int removeOffset = 1;
		this.militaryList = db.getMilitaryList();
		System.out.println("Military Aircrafts");
		System.out.println("------------------");
		for(planes.Plane p : this.militaryList) {
			System.out.println(militaryList.indexOf(p)+removeOffset+". "+p.toString());
		}
	}
	public void printAllAircraft() {
		printGeneralAviation();
		printAirliners();
		printMilitary();
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
		this.registrationsUsed = db.getRegistrationsUsed();
		this.registrationsUsed.add(registration);
		db.setRegistrationsUsed(this.registrationsUsed);
		
	}

	public void selectPlane(int index) {
		this.AirlinerList = db.getAirlinerList();
		sm.selectPlane(index, this.AirlinerList);
		
	}
	
	public void sellSeat(Boolean window) {
		this.AirlinerList = sm.sellSeat(window);
		db.setAirlinerList(AirlinerList);
	}
}
