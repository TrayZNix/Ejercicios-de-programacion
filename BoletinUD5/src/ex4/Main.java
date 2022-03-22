package ex4;

public class Main {

	public static void main(String[] args) {
		Phonelist p = new Phonelist();
		p.addContact("R", "J", "2223322");
		p.addContact("34", "54J", "2223322");
		p.addContact("R7", "J9", "222f22");
		p.addContact("R8", "J7", "22h22");
		p.printList();
		Contact c = new Contact("R8", "J7");
		Contact c2 = new Contact("R7", "J9");
		System.out.println("-..-.-.-.-.-..-..-.-.-.-..--.-..-.--");
		p.removeContact(c);
		p.sortMap();
		System.out.println("-..-.-.-.-.-..-..-.-.-.-..--.-..-.--");
		p.updateContact(c2);
		p.printList();
	}

}
