package ejercicioarray01;

public class Principal {

	public static void main(String[] args) {
		int maxNombres=5, comienzo=0;
		String [] nombres = new String[maxNombres];
		nombres[0]="Roberto";
		nombres[1]="Eva";
		nombres[2]="Daniel";
		nombres[3]="Julia";
		nombres[4]="Pablo";
		for (int i=comienzo; i<maxNombres; i++) {
			System.out.printf("-%s.\n", nombres[i]);
		}

	}

}
