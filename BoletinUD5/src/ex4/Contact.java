package ex4;

import java.util.Objects;

public class Contact implements Comparable<Contact> {
	private String name;
	private String surname;
	
	
	public Contact(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", surname=" + surname + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}

	@Override
	public int compareTo(Contact o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
