package ejercicio;

import lectura.leer;

public class Main {

	public static void main(String[] args) {
		Whatsapp w = new Whatsapp();
		int selector = 0;
		double pricePerMessage = 0.35;
		boolean loop = true;
		String name, text;
		
		//Message collection
		w.addMessage("Ángel Naranjo", "Test Message of new Whatsapp's APP. ");
		w.addMessage("Ángel Naranjo", "Today 23rd March, we have Java Collections exam. ");
		w.addMessage("Miguel Campos", "Please, do not forget to bring the money you are going "
				+ "to donate for Ucraine today.");
		w.addMessage("Miguel Campos", "I just wanted to remember everyone that, if you still live with"
				+ "your parents, they still must come to the meeting the 29th March");
		w.addMessage("Rafa Villar", "The next Friday 25th March, you will get evaluated in a Bootstrap exam.");
		
		do {
			System.out.println("Choose an option");
			System.out.println("------------------------");
			System.out.println("0. Exit");
			System.out.println("1. Create message");
			System.out.println("2. Print all messages");
			System.out.println("3. Search a message / messages by sender name");
			System.out.println("4. Modify a message");
			System.out.println("5. Delete a message");
			System.out.println("6. Sort message list");
			System.out.println("7. Calculate benefit");
			selector = leer.datoInt();
			switch (selector) {
			default:
				System.out.println("Reading error, please try again");
				break;
			case 0:
				loop = false;
				break;
			case 1:
				System.out.println("Please, write your name");
				name = leer.dato();
				System.out.println("Enter your message");
				text = leer.dato();
				w.addMessage(name, text);
				break;
			case 2:
				w.printList();
				break;
			case 3:
				System.out.println("Choose condition of search");
				System.out.println("............................");
				System.out.println("0. Go back");
				System.out.println("1. Search one message name ");
				System.out.println("2. Search by ID");
				selector = leer.datoInt();
				switch (selector) {
					default:
						System.out.println("Reading error");
						break;
					case 1:
						w.searchOneMSGByName("Ángel Naranjo");
						break;
					case 2:
						w.searchAllMSGByName("Miguel Campos");
						break;
				}
			}
		}while(loop);
		
		
		System.out.println("Search by sender");
		System.out.println("_________________________________");;	
		w.searchAllMSGByName("Miguel Campos");
		w.removeSender(3);
		System.out.println("Search after delete");
		System.out.println("_________________________________");
		w.searchAllMSGByName("Miguel Campos");
		System.out.println("Update text message");
		System.out.println("_________________________________");
		w.updateSentText(4,	"I just wanted to remember everyone that, if you still live with\"\r\n"
				+ "your parents, they still must come to the meeting the 26th May");
		w.searchAllMSGByName("Miguel Campos");
		System.out.println(w.calculateMoneyBenefit(pricePerMessage));;
		
		System.out.println("Sort and print list name");
		System.out.println("_________________________________");
		w.sortMessageListByName();
		w.printList();
		System.out.println("Sort and print list by ID");
		System.out.println("_________________________________");
		w.sortMessageListByID();
		w.printList();
		
	}

}
