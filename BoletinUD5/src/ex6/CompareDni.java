package ex6;

import java.util.Comparator;

public class CompareDni implements Comparator <Worker>{

	@Override
	public int compare(Worker o1, Worker o2) {
		
		return -(o1.getDni().toLowerCase().compareTo(o2.getDni().toLowerCase()));
	}

}
