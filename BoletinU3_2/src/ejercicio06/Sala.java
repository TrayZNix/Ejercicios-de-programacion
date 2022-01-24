package ejercicio06;

public class Sala {
	//Atributos
	static double recaudado;
	private int contraseña;
	private String peliculaMostrada;
	private double costeEntrada;
	private Entrada[] entradasVendidas = new Entrada[10];
	
	//Constructor
	public Sala() {
		this.peliculaMostrada = "Titanic";
		this.contraseña = 9919;
		this.costeEntrada = 3.55;
		Entrada.setPrecio(this.costeEntrada);
	}
	//Getters y setters

	public int getContraseña() {
		return contraseña;
	}

	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}

	public String getPeliculaMostrada() {
		return peliculaMostrada;
	}

	public void setPeliculaMostrada(String peliculaMostrada) {
		this.peliculaMostrada = peliculaMostrada;
	}
	
		
	//Metodos
	
	public static double getRecaudado() {
		return recaudado;
	}

	public static void setRecaudado(double recaudado) {
		Sala.recaudado = recaudado;
	}

	public void venderEntrada(int fila, int butaca) {
		fila = fila - 1;
		butaca = butaca - 1;
		if(Entrada.butacasOcupadas[fila][butaca] != true) {
			if (Entrada.getEntradasCreadas() == 9) {
				Entrada e10 = new Entrada( fila, butaca);
				entradasVendidas[9] = e10;
			}
			if (Entrada.getEntradasCreadas() == 8) {
				Entrada e9 = new Entrada( fila, butaca);
				entradasVendidas[8] = e9;
			}
			if (Entrada.getEntradasCreadas() == 7) {
				Entrada e8 = new Entrada( fila, butaca);
				entradasVendidas[7] = e8;
			}
			if (Entrada.getEntradasCreadas() == 6) {
				Entrada e7 = new Entrada( fila, butaca);
				entradasVendidas[6] = e7;
			}
			if (Entrada.getEntradasCreadas() == 5) {
				Entrada e6 = new Entrada( fila, butaca);
				entradasVendidas[5] = e6;
			}
			if (Entrada.getEntradasCreadas() == 4) {
				Entrada e5 = new Entrada( fila, butaca);
				entradasVendidas[4] = e5;
			}
			if (Entrada.getEntradasCreadas() == 3) {
				Entrada e4 = new Entrada( fila, butaca);
				entradasVendidas[3] = e4;
			}
			if (Entrada.getEntradasCreadas() == 2) {
				Entrada e3 = new Entrada( fila, butaca);
				entradasVendidas[2] = e3;
			}
			if (Entrada.getEntradasCreadas() == 1) {
				Entrada e2 = new Entrada( fila, butaca);
				entradasVendidas[1] = e2;
			}
			if (Entrada.getEntradasCreadas() == 0) {
				Entrada e1 = new Entrada( fila, butaca);
				entradasVendidas[0] = e1;
			}			
			recaudado = recaudado + Entrada.getPrecio();
			System.out.println("Gracias por su compra!");
		}
		else {
			System.out.println("Esta butaca ya está ocupada, lo sentimos");
		}
	}
	
	public void verButacasLibres() {
		int puntero;
		System.out.println("Las butacas libres son: ");
		for(int i = 0; i < Entrada.butacasOcupadas.length; i++) {
			puntero = 1;
			
			if (i == 0) {
				System.out.println("Fila 1: ");
			}
			if (i == 1) {
				System.out.println("Fila 2: ");
			}
			for (int j = 0; j < 5; j++) {
				System.out.printf(puntero+". ");
				if (Entrada.butacasOcupadas[i][j]) {
					System.out.printf("Ocupada\n");
				}
				else {
					System.out.printf("Libre\n");
				}					
				puntero++;					
			}
			
			
		}
	}
	
	
	
}
