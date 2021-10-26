package ej_04;

public class Principal {

	public static void main(String[] args) {
		//DECLARAMOS LAS VARIABLES
		
		double saldo=5 , reintegro=-5;
		
		//SI EL REINTEGRO ES MAYOR O IGUAL QUE 0, SE CONSIDERA QUE LA OPERACION ES UN EXTRACTO DE DINERO DE LA CUELTA
		if(reintegro>=0) {
			//SI QUIERES SACAR MÁS DINERO DEL QUE TIENES, SE TE NOTIFICA QUE NO ES POSIBLE.			
			if(saldo>=reintegro) {
				System.out.printf("Tiene %.2f€. "+"Está sacando %.2f€. ", saldo , reintegro);
				saldo=saldo-reintegro;
				System.out.printf("Saldo restante: %.2f€\nMuchas gracias.", saldo);
			}
			saldo=saldo-reintegro;
			
			if(saldo<0) {
				System.out.println("Saldo insuficiente para realizar la operación");
				}

		//SI EL REINTEGRO ES MENOR QUE 0, SE CONSIDERA QUE LA OPERACIÓN ES UN INGRESO
		}
		if(reintegro<0) {
			System.out.printf("Tiene %.2f€. "+"Está ingresando %.2f€. ", saldo , reintegro);
			saldo=saldo-reintegro;
			System.out.printf("Saldo restante: %.2f€\nMuchas gracias.", saldo);
		}
	}
}