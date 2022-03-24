package ejercicio;

import java.util.Comparator;

public class CompareByID implements Comparator<Message> {

	@Override
	public int compare(Message o1, Message o2) {
		return (o1.getMessageID()-o2.getMessageID());
	}

}
