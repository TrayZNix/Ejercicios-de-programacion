package ejerc06;
import lectura.Leer;


public class Principal {

	public static void main(String[] args) {
		float merc=0.38f, ven=0.91f, tierra=1f, marte=0.38f, jup=2.53f, sat=1.06f, uran=0.92f, nept=1.2f, peso=0f,  pesofin=0f;
		int selector=0;
		char cond=83;
		System.out.println("Bienvendio/a. Este programa le mostrará su peso en otros planetas. Para comenzar, introduzca su peso:");
		peso=Leer.datoFloat();
		System.out.printf("Registrado!\n");
		System.out.println("Consulta tu peso en el planeta que desees escribiendo en la consola su número");
		while (cond==83||cond==115) {
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
					System.out.printf("¡Su peso en Mercurio es %.1fKg!\n", pesofin);
					System.out.printf("¿Quiere comprobar su peso en otro planeta? (S/N)\n");
					cond=Leer.datoChar();
					break;
				case 2:
					pesofin=peso*ven;
					System.out.printf("¡Su peso en Venus es %.1fKg!\n", pesofin);
					System.out.printf("¿Quiere comprobar su peso en otro planeta? (S/N)\n");
					cond=Leer.datoChar();
					break;
				case 3:
					pesofin=peso*tierra;
					System.out.printf("¡Su peso en la tierra no varía, es %.1fKg!\n", pesofin);
					System.out.printf("¿Quiere comprobar su peso en otro planeta? (S/N)\n");
					cond=Leer.datoChar();
				break;
				case 4:
					pesofin=peso*marte;
					System.out.printf("¡Su peso en Marte es %.1fKg!\n", pesofin);
					System.out.printf("¿Quiere comprobar su peso en otro planeta? (S/N)\n");
					cond=Leer.datoChar();
					break;
				case 5:
					pesofin=peso*jup;
					System.out.printf("¡Su peso en Júpiter es %.1fKg!\n", pesofin);
					System.out.printf("¿Quiere comprobar su peso en otro planeta? (S/N)\n");
					cond=Leer.datoChar();
					break;
				case 6:
					pesofin=peso*sat;
					System.out.printf("¡Su peso en Saturno es %.1fKg!\n", pesofin);
					System.out.printf("¿Quiere comprobar su peso en otro planeta? (S/N)\n");
					cond=Leer.datoChar();
					break;
				case 7:
					pesofin=peso*uran;
					System.out.printf("¡Su peso en Urano es %.1fKg!\n", pesofin);
					System.out.printf("¿Quiere comprobar su peso en otro planeta? (S/N)\n");
					cond=Leer.datoChar();
					break;
				case 8:
					pesofin=peso*nept;
					System.out.printf("¡Su peso en Neptuno es %.1fKg!\n", pesofin);
					System.out.printf("¿Quiere comprobar su peso en otro planeta? (S/N)\n");
					cond=Leer.datoChar();
					break;
				default:
					System.out.println("\nEntrada desconocida, vuelva a intentarlo por favor:");
			}
		}
		System.out.println("¡Muchas gracias por haber usado este programa!");
		

	}

}
