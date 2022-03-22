package ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Phonelist {
	
	HashMap <Contact, String > contacts = new HashMap<>();
	TreeMap<Contact, String> contactsTree;
	
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
	
	public void sortMap() {
		this.contactsTree = new TreeMap<>(contacts);
		this.contactsTree.putAll(contacts);
		for (Contact key: this.contactsTree.keySet()) {
					
					System.out.println(key+ " = "+this.contacts.get(key));
					
				}
	}
	
}
