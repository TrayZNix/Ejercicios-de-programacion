package ex6;

import lectura.leer;

public class Main {

	public static void main(String[] args) {
		String s;
		CRUDWorker crdw = new CRUDWorker();
		crdw.addWorker("12345A");
		crdw.addWorker("34567C");
		crdw.addWorker("23456C");
		crdw.addWorker("54445A");
		crdw.sortList();
		crdw.printList();

	}

}
