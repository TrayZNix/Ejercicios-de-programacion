package ex6;

import lectura.leer;

public class Main {

	public static void main(String[] args) {
		String s;
		CRUDWorker crdw = new CRUDWorker();
		crdw.addWorker("885A");
		crdw.addWorker("235B");
		crdw.addWorker("5434");
		crdw.addWorker("5");
		crdw.printList();
		s = leer.dato();
		crdw.sortList();
		crdw.printList();

	}

}
