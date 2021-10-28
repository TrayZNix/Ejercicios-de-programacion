package ejerc06;
import lectura.Leer;


public class Principal {

	public static void main(String[] args) {
		float merc=0.38f, ven=0.91f, tierra=1f, marte=0.38f, jup=2.53f, sat=1.06f, uran=0.92f, nept=1.2f, peso=0f,  pesofin=0f;
		int selector=0, CERO=0;
		System.out.println("Bienvenido/a. Este programa le mostrará su peso en otros planetas. Para comenzar, introduzca su peso:");
		peso=Leer.datoFloat();
		System.out.printf("Registrado!\n");
		do{
			System.out.printf("\nConsulta tu peso en el planeta que desees escribiendo en la consola su número o escriba 0 para salir\n");
			System.out.printf("1. Mercurio\n");
			System.out.printf("2. Venus\n");
			System.out.printf("3. Tierra\n");
			System.out.printf("4. Marte\n");
			System.out.printf("5. Júpiter\n");
			System.out.printf("6. Saturno\n");
			System.out.printf("7. Urano\n");
			System.out.printf("8. Neptuno\n");
			selector=Leer.datoInt();
				switch (selector) {
				case 1:
					pesofin=peso*merc;
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.printf("¡Su peso en Mercurio es %.1fKg!\n", pesofin);
					System.out.println("----------------------------------------------------------------------------------------------------------");
					break;
				case 2:
					pesofin=peso*ven;
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.printf("Su peso en Venus es %.1fKg!\n", pesofin);
					System.out.println("----------------------------------------------------------------------------------------------------------");
					break;
				case 3:
					pesofin=peso*tierra;
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.printf("¡Su peso en la tierra no varía, es %.1fKg!\n", pesofin);
					System.out.println("----------------------------------------------------------------------------------------------------------");
				break;
				case 4:
					pesofin=peso*marte;
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.printf("¡Su peso en Marte es %.1fKg!\n", pesofin);
					System.out.println("----------------------------------------------------------------------------------------------------------");
					break;
				case 5:
					pesofin=peso*jup;
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.printf("¡Su peso en Júpiter es %.1fKg!\n", pesofin);
					System.out.println("----------------------------------------------------------------------------------------------------------");
					break;
				case 6:
					pesofin=peso*sat;
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.printf("¡Su peso en Saturno es %.1fKg!\n", pesofin);
					System.out.println("----------------------------------------------------------------------------------------------------------");
					break;
				case 7:
					pesofin=peso*uran;
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.printf("¡Su peso en Urano es %.1fKg!\n", pesofin);
					System.out.println("----------------------------------------------------------------------------------------------------------");
					break;
				case 8:
					pesofin=peso*nept;
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.printf("¡Su peso en Neptuno es %.1fKg!\n", pesofin);
					System.out.println("----------------------------------------------------------------------------------------------------------");
					break;
				case 0:
					break;
			}
		
		}while (selector!=CERO);
		System.out.println("¡Muchas gracias por haber usado este programa!");
		

	}

}
