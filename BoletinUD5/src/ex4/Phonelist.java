package ex4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Phonelist {
	
	Map <Contact, String > contacts = new HashMap<>();
	
	public void addContact(String name, String surname, String phoneNumber) {
		Contact c = new Contact(name, surname);
		this.contacts.put(c, phoneNumber);
	}
	
	public void printList() {
		for (Contact key: this.contacts.keySet()) {
			
			System.out.println(key+ " = "+this.contacts.get(key));
			
		}
		
	}
	
	public void removeContact(Contact key) {
		this.contacts.remove(key);
	}
	
	public void updateContact(Contact key) {
		this.contacts.put(key, "si");
	}
}
