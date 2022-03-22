package ex4;

import java.util.Comparator;

public class CompareName implements Comparator<Contact> {

	@Override
	public int compare(Contact o1, Contact o2) {
		return -(o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase()));
	}

}
