package ejercicio;

import java.util.Random;

public class Plataforma {
	Deposito[] depositos = new Deposito[7];
	Random r = new Random(System.nanoTime());
	
	public Plataforma() {
		
		if(Deposito.numDeposito == 0) {
			Deposito d1 = new Deposito(generarAleatorio(20, 1), generarAleatorio(15, 1), generarAleatorio(800, 100));
			depositos[0] = d1;
		}
		if(Deposito.numDeposito == 1) {
			Deposito d2 = new Deposito(generarAleatorio(20, 1), generarAleatorio(15, 1),  generarAleatorio(800, 100));
			depositos[1] = d2;
		}
		if(Deposito.numDeposito == 2) {
			Deposito d3 = new Deposito(generarAleatorio(20, 1), generarAleatorio(15, 1),  generarAleatorio(800, 100));
			depositos[2] = d3;
		}
		if(Deposito.numDeposito == 3) {
			Deposito d4 = new Deposito(generarAleatorio(20, 1), generarAleatorio(15, 1),  generarAleatorio(800, 100));
			depositos[3] = d4;
		}
		
		
	}
	
	//Getters y setters
	
	//Métodos
	public void agregarDeposito(double radio, double altura) {
		if (Deposito.numDeposito == 6) {
			Deposito d7 = new Deposito(radio, altura,  generarAleatorio(800, 100));
			depositos[6] = d7;
			System.out.println("Su depósito se ha agregado correctamente!");
		}
		if (Deposito.numDeposito == 5) {
			Deposito d6 = new Deposito(radio, altura,  generarAleatorio(800, 100));
			depositos[5] = d6;
			System.out.println("Su depósito se ha agregado correctamente!");
			}
		if (Deposito.numDeposito == 4) {
			Deposito d5 = new Deposito(radio, altura,  generarAleatorio(800, 100));
			depositos[4] = d5;
			System.out.println("Su depósito se ha agregado correctamente!");
		}
		
		else {
			System.out.println("No queda más espaciom, lo sentimos");
		}
	}
	
	public double generarAleatorio(int maximo, int minimo) {
		return r.nextInt(maximo - minimo) + minimo;
	}
	
	public void imprimirDepositos() {
		int puntero = 1;
		for(int i = 0; i < depositos.length; i++) {
			if(depositos[i] != null) {
				System.out.println("Deposito "+puntero+". Radio: "+depositos[i].getRadio()+"metros. Altura: "+depositos[i].getAltura()
						+"metros. Volumen: "+depositos[i].getVolumen()+"m³. Precio de fabricacion: "+depositos[i].getPrecioCoste()+"€");
			}
			puntero++;
		}
	}
	
	public double calcularPrecioVenta(double beneficio, int selector) {
		double precio;
		selector = selector - 1;
		beneficio = (100 + beneficio)/100;
		precio = depositos[selector].getPrecioCoste() * beneficio;
		return precio;
	}
	
	public double calcularBeneficioUno(int selector) {
		//UNA VENTA DE DEPOSITO COMPLETO, VOLUMEN X, A 0.7€ EL LITRO
		selector = selector - 1;
		return ( depositos[selector].getVolumen() * 1000 * 0.7); //* 1000 cambio de unidades, *0.7 precio por litro
		
		
	}
	
	public	boolean depositoExiste(int selector) {
		selector = selector - 1;
		if (depositos[selector] == null ) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public double calcularBeneficioTodos() {
		return Deposito.capacidadTotal * 0.7;
	}
}
