package ejemploarrays;

import ejemplolectura.leer;

public class Principal {

	public static void main(String[] args) {
		int tam=4;
		
		int [] edades=new int [tam];
			for (int i=0;i<edades.length;i++) {
			System.out.println("Diga un n�mero");
			edades[i]=leer.datoInt();
			}
		for (int i=0; i<edades.length;i++) {
			System.out.println("El n�mero es: " + edades[i]);
		}
	}

}
