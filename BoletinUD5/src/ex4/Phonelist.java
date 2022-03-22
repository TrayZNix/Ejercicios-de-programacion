package ex4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

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
	
	public void printSorted() {
		SortedMap<Contact, String> sortedContacts = new TreeMap<Contact, String>();
		sortedContacts.putAll(contacts);
		
		
		System.out.println();
		Iterator<Contact> itr = sortedContacts.keySet().iterator();
		while(itr.hasNext()) {
			Contact key = itr.next();
			System.out.println(key + " = "+sortedContacts.get(key)                                  );
			
		}
	}
}
