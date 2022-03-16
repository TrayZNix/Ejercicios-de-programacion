package ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CRUDWorker {
	ArrayList <Worker> workers = new ArrayList<Worker>();
	
	public void addWorker(String dni) {
		Worker w = new Worker(dni);
		this.workers.add(w);
	}
	
	public void printList() {
		for(Worker w : workers) {
			System.out.println(w.toString());
		}
		
	}
	
	public int getWorkedHours(String dni) {
		return 0;
		
	}
	
	public void deleteWorker(String dni) {
		
	}
	
	public void sortList() {
		workers.sort(Comparator.comparing(Worker::getDni));
	}
}
