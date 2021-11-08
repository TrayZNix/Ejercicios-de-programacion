package ejerc12;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		int nota=0, hasta=10, desde=0, CERO=0, UNO=1, ciclo=6, numAsig=6, suspensas=0;
		double media=0;
		String PRG="Programación", ED="Entornos de desarrollo", FOL="Formación y orientación laboral", BBDD="Bases de datos";
		String LGM="Lenguajes de marca y sistemas de gestión de información", SI="Sistemas informáticos", alum="Roberto Carvajal";
		System.out.printf("|---------------------------------------------------------------|\n");
		System.out.printf("|Alumno:%s\t\t\t\t\t|\n", alum);
		System.out.printf("|---------------------------------------------------------------|\n");
		System.out.printf("|\t\t\t\t\t\t\t\t|\n");
			while (ciclo>=CERO) {
				Random num= new Random (System.nanoTime());
				nota=num.nextInt(hasta-desde+UNO);
				switch (ciclo) {
					case 6:
						System.out.printf("|%s:%d\t\t\t\t\t\t\t|\n", PRG, nota);
						media=media+nota;
						if (nota<5) {
							suspensas=suspensas+UNO;
						}
						break;
					case 5:
						System.out.printf("|%s:%d\t\t\t\t\t|\n", ED, nota);
						media=media+nota;
						if (nota<5) {
							suspensas=suspensas+UNO;
						}
						break;
					case 4:
						System.out.printf("|%s:%d\t\t\t\t\t\t|\n", BBDD, nota);
						media=media+nota;
						if (nota<5) {
							suspensas=suspensas+UNO;
						}
						break;
					case 3:
						System.out.printf("|%s:%d\t\t\t\t\t|\n", SI, nota);
						media=media+nota;
						if (nota<5) {
							suspensas=suspensas+UNO;
						}
						break;
					case 2:
						System.out.printf("|%s:%d\t\t\t\t|\n", FOL, nota);
						media=media+nota;
						if (nota<5) {
							suspensas=suspensas+UNO;
						}
						break;
					case 1:
						System.out.printf("|%s:%d\t|\n", LGM, nota);
						media=media+nota;
						if (nota<5) {
							suspensas=suspensas+UNO;
						}
						break;
					default:
						media=media/numAsig;
						if (nota<5) {
							suspensas=suspensas+UNO;
						}
						break;
				}
			
			ciclo=ciclo-UNO;
					
			}
			System.out.printf("|\t\t\t\t\t\t\t\t|\n");
			System.out.printf("|Nota media:%f\t\t\t\t\t\t|\n", media);
			System.out.printf("|Suspensas:%d\t\t\t\t\t\t\t|\n",suspensas);
			System.out.printf("|\t\t\t\t\t\t\t\t|\n");
			System.out.printf("|---------------------------------------------------------------|\n");
	}

}
