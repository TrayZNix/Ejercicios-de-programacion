package ejercicio05;
import java.util.Random;

public class Juegos { //quiniela, par o impar, chinos, primitiva 
	//Atributos
	private String salida;
	private int salidaInt;
	private Random num = new Random (System.nanoTime());
	private int aleat, redo = 1;
	private int parImp = 0;
	private int desde=1, hasta = 2, checker;
	
	//Constructores
	
	public Juegos ( int parImp ) {
		this.parImp = parImp;
	}
	public Juegos() {
		// TODO Auto-generated constructor stub
	}
	
	//Métodos
	

	public String quiniela () {
		do {
			redo = 1;
			//HE USADO DE 100 A 1 Y COMPARADO POR PAR E IMPAR PARA AUMENTAR E IGUALAR PROBABILIDADES
		aleat = num.nextInt(100-1+1);
		checker = aleat % 2;
		if (checker == 0) {
			do {
			aleat = num.nextInt(100-1+1);
			checker = aleat % 2;
				if (checker == 0) {
					salida = "EMPATE";
					redo = 0;
				}
				if (checker == 1){
					salida = "2x1. Victoria para el lado izquierdo";
					redo = 0;
				}
			}while (redo == 1);
		}
		if (checker == 1) {
			do {
				aleat = num.nextInt(100-1+1);
				checker = aleat % 2;
				if (checker == 0) {
					salida = "1x2. Victoria para el lado derecho";
					redo = 0;
				}
				if (checker == 1) {
					salida = "EMPATE";
					redo = 0;
				}
			} while(redo == 1);
		}
		}while (redo == 1);
		return salida;
	}
	public int paresnones () {
		redo = 1;
		aleat = num.nextInt (10-0+1);
		parImp= parImp + aleat;
		parImp= parImp % 2;
		if (parImp == 0 ) {
			salidaInt = 2;
		}
		else {
			salidaInt = 1;
		}		
		return salidaInt;
	}
}
