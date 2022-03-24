package ejercicio;

import java.util.Comparator;

public class CompareBySenderName implements Comparator<Message> {

	@Override
	public int compare(Message m1, Message m2) {
		return -(m1.getSenderName().compareToIgnoreCase(m2.getSenderName()));
	}

	

}
