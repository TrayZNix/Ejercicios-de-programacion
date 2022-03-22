package ex4;

public class Main {

	public static void main(String[] args) {
		Phonelist p = new Phonelist();
		p.addContact("R", "J", "2223322");
		p.addContact("34", "54J", "2223322");
		p.addContact("R7", "J9", "222f22");
		p.addContact("R8", "J7", "22h22");
		p.addContact("R5", "J9", "222f21");
		p.addContact("R9", "J7", "22h23");
		p.printList();
		Contact c = new Contact("R8", "J7");
		System.out.println("-..-.-.-.-.-..-..-.-.-.-..--.-..-.--");
		p.removeContact(c);
		p.printList();
		System.out.println("-..-.-.-.-.-..-..-.-.-.-..--.-..-.--");
		Contact c2 = new Contact("R7", "J9");
		p.updateContact(c2);
		p.printSorted();
	}

}
