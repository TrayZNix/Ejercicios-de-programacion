package planeManager;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

import planes.Airliner;
import utility.Printer;

public class SeatManager {
	private List<planes.Airliner> airlinerList = new ArrayList<planes.Airliner>();
	private Seat[][] seats;
	Database db;	
	PlanesManager pm;
	private planes.Airliner pl;
	private int planeIndex;
	
	public void selectPlane(int index, List<Airliner> airlinerList) {
		this.airlinerList = airlinerList;
		int removeNegOffset = -1;
		this.airlinerList = airlinerList;
		try {
			this.pl = airlinerList.get(index+removeNegOffset);
			this.planeIndex = index;
		}
		catch (Exception e) {
			System.out.println("Wrong index, please try again");
		}
	}
	
	public List<Airliner> sellSeat(Boolean window) {
		utility.Printer printer = new Printer();
		Seat s;
		int removeNegOffset = -1, strSize = 3;
		int i = 0, j = 0;
		boolean loop = false;
		seats = this.pl.getSeats();
		do {
			IntStream rowInt = new Random().ints(strSize, 1, seats.length).limit(1);
			OptionalInt optIntRow = rowInt.findAny();
			i = optIntRow.getAsInt();
			IntStream colInt = new Random().ints(strSize, 1, seats[i].length).limit(2);
			OptionalInt optIntCol = colInt.findAny();
			j = optIntCol.getAsInt();
			s = seats[i][j];
			if (s.isUsed() || s.isWindowPlaced()!=window) {
				loop = true;
			}
			else {
				loop = false;
			}
		}while(loop);
		s.setUsed(true);
		seats[i][j] = s;
		printer.printSeat(s);
		pl.setSeats(seats);
		airlinerList.remove(this.planeIndex+removeNegOffset);
		airlinerList.add(pl);
		return airlinerList;
	}
	
	
}
