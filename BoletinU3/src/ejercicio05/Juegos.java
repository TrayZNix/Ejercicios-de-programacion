package ejercicio05;
import java.util.Random;

public class Juegos { //quiniela, par o impar, chinos, primitiva 
	//Atributos
	private String salida;
	private Random num = new Random (System.nanoTime());
	private int aleat, redo = 1;
	private int parImp = 0;
	private int desde=1, hasta = 2;
	
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
		aleat = num.nextInt(2-0+1);
		if (aleat == 2) {
			aleat = num.nextInt(2-1);
				if (aleat == 2) {
					salida = "2x2";
					redo = 0;
				}
				else {
					salida = "2x1";
					redo = 0;
				}
		}
		if (aleat == 1) {
			aleat = num.nextInt(2-0+1);
			if (aleat == 1) {
				salida = "1x2";
				redo = 0;
			}
			else {
				salida = "1x1";
				redo = 0;
			}
		}
		}while (redo == 1);
		return salida;
	}
	public String paresnones () {
		do {
			redo = 1;
			aleat = num.nextInt (2-0+1);
			
		} while (redo == 1);
	
		
		return salida;
	}
}
