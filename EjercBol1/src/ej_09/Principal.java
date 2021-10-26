package ej_09;

public class Principal {

	public static void main(String[] args) {
		//DECLARAMOS LAS VARIABLES
		double NAVAS=1500, CNOU=99354, U2=65000, TEATRO=600;
		double nnou=0, nu=0, nuteat=0;
		System.out.printf("Este programa es capaz de calcular la relación del aforo de un lugar con la poblacion de Navas.\n\n ");
		//OPERAMOS
		nnou=CNOU/NAVAS;
		nu=U2/NAVAS;
		
		nuteat=TEATRO/NAVAS;	
		//IMPRIMIMOS LOS RESULTADOS
		System.out.printf("En el Camp Nou, caben %.2f Navas\n", nnou);
		System.out.println("-------------------------------------------------");
		System.out.printf("En el conciento de U2, caben %.2f Navas\n", nu);
		System.out.println("-------------------------------------------------");
		System.out.printf("En el teatro del colegio, caben %f Navas\n", nuteat);

	}

}
