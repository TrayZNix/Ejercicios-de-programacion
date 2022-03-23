package Ej01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Gestor {
	private int roomCount = 0;
	private Map<Habitacion, Integer> rooms = new TreeMap<Habitacion, Integer>();
	
	public void addDefaultRoom(double basePrice) {
		Habitacion h = new Habitacion(basePrice);
		roomCount++;
		rooms.put(h, roomCount);
	}
	public void addSuiteRoom(double basePrice,double surface, int discount) {
		Habitacion h = new Suite(basePrice,surface, discount);
		roomCount++;
		rooms.put(h, roomCount);
	}
	public void addApartmentRoom(double basePrice,double roomServicePrice) {
		Habitacion h = new Apartamento(basePrice, roomServicePrice);
		roomCount++;
		rooms.put(h, roomCount);
	}
	
	public void printRooms() {
		Iterator itr = rooms.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}			
		
	}
	
	public Habitacion searchRoom(int roomNumber) {
		Iterator<Habitacion> itr = rooms.keySet().iterator();
		while(itr.hasNext()) {
			Habitacion h = itr.next();
			if (h.getNumHabitacion() == roomNumber) {
				return h;				
			}
		}
		return null;
		
	}

	public double calculatePriceOccupiedRooms(){
		double totalMoney = 0;
		Iterator<Habitacion> itr = rooms.keySet().iterator();
		while(itr.hasNext()) {
			Habitacion h = itr.next();
			if(h.isOccupied()) {
				totalMoney = totalMoney + h.calculateRoomPrice();
			}
		}
		return totalMoney;
	}
	
	
	public void addSuiteRoom(double basePrice, boolean occupied, String clientName, int daysStaying, int numberOfPeopleStaying,
			double roomArea, int discount) {
		Habitacion h = new Suite(basePrice, occupied, clientName, daysStaying, numberOfPeopleStaying, roomArea, discount);
		rooms.put(h, roomCount);
	}
	public void addDefaultRoom(double basePrice, boolean occupied, String clientName, int daysStaying, int numberOfPeopleStaying) {
		Habitacion h = new Habitacion(basePrice, occupied, clientName, daysStaying, numberOfPeopleStaying);
		rooms.put(h, roomCount);
	}
	
	public void printEmptyRooms() {
		Iterator <Habitacion> itr = rooms.keySet().iterator();
		while(itr.hasNext()) {
			Habitacion h = itr.next();
			if(!h.isOccupied()) {
				System.out.println(h.toString());
			}
		}
		
	}
	public void calculateTicket(int roomNumber) {
		Habitacion h = searchRoom(roomNumber);
		System.out.println("Hotel invoice");
		System.out.println("-------------------------------");
		System.out.println("Mr/Mrs "+h.getClientName());
		System.out.println("The payment for your "+h.getDaysStaying()+" day/s staying is " + h.calculateRoomPrice()+"€");
		
		System.out.println("");
	}

}
