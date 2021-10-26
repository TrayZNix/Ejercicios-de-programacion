package ejemploaleatorios;

import java.util.Random;

import ejemplolectura.leer;

public class Principal {

	public static void main(String[] args) {
		int aleatorio=0;
		int hasta=10, desde=0;
		Random num= new Random (System.nanoTime());
				
		System.out.println("Diga el mayor");
		hasta=leer.datoInt();
				System.out.println("Diga el menor");
		desde=leer.datoInt();
		aleatorio=num.nextInt(hasta-desde+1);
		System.out.println(aleatorio);
			
		

	}

}
