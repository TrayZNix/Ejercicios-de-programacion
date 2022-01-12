package ejercicio08;

import java.util.Random;

public class Sorteo {
	
	int [] premios = new int [5];
	int [] numsPremiados = new int [5];
	Random aleatorio = new Random(System.nanoTime());
	private int boletoAleatorio, numeroComprobar;
	private double jugadoComprobar;
	private boolean generados;
	Decimo d;
	//PREMIOS
	private double PPremio = 20000, SegPremio = 6250, TerPremio = 2500, CuartoPremio = 1000, quintoPremio = 300, PremioParaJugador;
	
	public Sorteo() {
		
	}
	
	public int[] generarNumerosGanadores() {
		boolean repetido;
			for(int i=0; i < numsPremiados.length; i++) {
				do {
					repetido=false;
					boletoAleatorio=aleatorio.nextInt(99999-1)+1;
					for(int g=0; g < numsPremiados.length; g++) {
						if(numsPremiados[g]==boletoAleatorio) {
							repetido = true;
						}
					}
				}while(repetido&i!=5);
				numsPremiados[i]=boletoAleatorio;
			}
		this.generados = true;
		return numsPremiados;
	}
	
	public double comprobar(double jugadoComprobar, int numeroComprobar) {
		if(this.generados==false) {
			generarNumerosGanadores();
		}
		if(this.generados) {
			/*PRIMER PREMIO: 20000 POR €
			  SEGUNDO PREMIO: 6250
			  TERCER PREMIO 2500
			  CUARTO 1000
			  QUIENTO 300
			  REINTEGRO 1 POR €
			  DDOS ULTIMAS CUALQUIER PREMIO 5 POR €
			 */
			/*0-> Primer Premio, 1-> Segundo,... 4-> quinto, 5-> reintegro*/
			boolean premiado[] = new boolean [6];
			for(int g=0; g < numsPremiados.length; g++) {
				if(numsPremiados[g]==numeroComprobar) {
					//premio
					premiado[g] = true;
					}
				else if (numsPremiados[0]%10==numeroComprobar%10) {
					premiado[5] = true;
					}
				}
			
			PremioParaJugador = ganado(premiado, numeroComprobar);
		}
		
		
		return PremioParaJugador;
	}
	
	public double ganado(boolean[] premiado, int precioJugado) {
		double ganado = 0;
		for(int i = 0; i <= premiado.length ; i++) {
			if(premiado[0]) {
				ganado=PPremio*precioJugado;
				i = 5;				
			}
			if(premiado[1]) {
				ganado=SegPremio*precioJugado;
				i = 5;				
			}
			if(premiado[2]) {
				ganado=TerPremio*precioJugado;
				i = 5;				
			}
			if(premiado[3]) {
				ganado=CuartoPremio*precioJugado;
				i = 5;				
			}
			if(premiado[4]) {
				ganado=quintoPremio*precioJugado;
				i = 5;				
			}
			if(premiado[5]) {
				ganado=precioJugado;
				i = 5;				
			}
			
		}
		return ganado;
	}
	
}
