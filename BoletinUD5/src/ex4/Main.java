package ex4;

public class Main {

	public static void main(String[] args) {
		Phonelist p = new Phonelist();
		p.addContact("Bicho", "Ronaldo", "955713562");
		p.addContact("Bicho", "Fernández", "695750080");
		p.addContact("Marcos", "Alberca", "685958612");
		p.addContact("Susana", "Alves", "997725512");
		p.addContact("Leo", "Messi", "954564186");
		p.addContact("Paco", "Nieto", "695778459");
		p.printList();
		Contact c = new Contact("Susana", "Alves");
		System.out.println("-..-.-.-.-.-..-..-.-.-.-..--.-..-.--");
		p.removeContact(c);
		p.sortMap();
		System.out.println("-..-.-.-.-.-..-..-.-.-.-..--.-..-.--");
		Contact c2 = new Contact("Leo", "Messi");
		p.updateContact(c2);
		p.printSorted();
	}

}
