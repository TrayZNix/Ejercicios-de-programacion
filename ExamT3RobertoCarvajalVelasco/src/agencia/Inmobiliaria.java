package agencia;

import java.util.Random;

public class Inmobiliaria {
	//Atributos
	private int identificadorOficina;
	private int idPiso;
	private int precioMinimo, precioMaximo;
	private int [] precios = new int [6];
	
	public Inmobiliaria() {
		this.idPiso = 1;
		this.precioMaximo = 35000;
		this.precioMinimo = 10000;
	}
	
	public int[] rellenarArray() {
		int precioAleatorio;
		Random ran = new Random(System.nanoTime());
		for (int i = 0; i < precios.length; i++) {
			precioAleatorio = ran.nextInt(precioMaximo-precioMinimo)+precioMinimo;
			precios[i]=precioAleatorio;
			this.precios[i]=precioAleatorio;
		}
		System.out.println("Precios generados!");
		return precios;
		
	}
	
	public int calcularPrecioVenta(int mes, int porcGanancia) {
		int precio;
		porcGanancia = porcGanancia + 100;
		mes = mes - 1;
		//porcGanancia = porcGanancia/100 + 1;
		precio = (this.precios[mes] * porcGanancia)/100;		
		
		return precio;
	}
	
	public int precioMetroCuadrado() {
		Piso p = new Piso();
		int pvp;
		int superficie;
		int precioMetrocuadrado;
		pvp = p.getPrecioDeseadoVenta();
		superficie = p.getSuperficie();
		precioMetrocuadrado = pvp / superficie;
		
		return precioMetrocuadrado;
	}
	
	public double cambioEuroALibra(double precioEuro, double cantidad) {
		double libras;
		libras = precioEuro * cantidad;
		return libras;
	}
	
	public void imprimeDatosPiso() {
		boolean reforma;
		Piso p = new Piso();
		System.out.printf("\n\n---------------------------------------------------\n");
		System.out.println("La direccion del piso es: "+p.getDireccion());
		System.out.println("La superficie del piso es de: "+p.getSuperficie()+"m²");
		reforma = p.isParaReformar();
		if (reforma) {
			System.out.println("Tiene la posibilidad de ser reformado");
		}
		else {
			System.out.println("No tiene la posibilidad de ser reformado");
		}
		System.out.println("El precio del piso es de "+p.getPrecioDeseadoVenta()+"€");
		System.out.printf("--------------------------------------------------\n\n");
	}
}
