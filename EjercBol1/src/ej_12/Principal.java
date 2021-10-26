package ej_12;

public class Principal {

	public static void main(String[] args) {
		//DECLARAMOS LAS VARIABLES
		int K=10, V=250;
		double I=0, KR=20, R=0;
		System.out.printf("Este programa es capaz de calcular la intensidad de corriente de un circuito sabiendo su voltaje y su resistencia. ");
		R=KR*K*K*K; //CONVERTIMOS DE KILOMHS A OHMS
		I=V/R; //OPERAMOS SEGUN LA LEY DE OHM
		//IMPRIMIMOS EL RESULTADO
		System.out.printf("Con %d voltios, y %.2f kilohms de resistencia (%.3f Ohms), la intensidad es %.4f", V, KR, R, I);
		
	}

}
