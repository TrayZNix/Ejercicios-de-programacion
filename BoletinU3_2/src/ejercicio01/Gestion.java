package ejercicio01;

import java.util.Random;

public class Gestion {
	int peso;
	boolean fragil;
	double precioFabrica;
	String[] materiales = {"Madera", "Plástico", "Bambú", "Metal"};
	
	public Gestion() {
		
	}
	
	Random r = new Random(System.nanoTime());
	public Producto[] generarProductos() {
		precioFabrica = generarAleatorio(10, 80);
		peso = generarAleatorio(1, 25);
		if (peso > 15) {
			fragil = true;
			}
		else {
			fragil = false;
			}
		Producto p1 = new Producto(precioFabrica, fragil, peso, materiales[generarAleatorio(0, 3)]);
		peso = generarAleatorio(1, 25);
		if (peso > 15) {
			fragil = true;
			}
		else {
			fragil = false;
			}

		Producto p2 = new Producto(precioFabrica, fragil, peso, materiales[generarAleatorio(0, 3)]);
		peso = generarAleatorio(1, 25);
		if (peso > 15) {
			fragil = true;
			}
		else {
			fragil = false;
			}
		
		Producto p3 = new Producto(precioFabrica, fragil, peso, materiales[generarAleatorio(0, 3)]);
		peso = generarAleatorio(1, 25);
		if (peso > 15) {
			fragil = true;
			}
		else {
			fragil = false;
			}
		
		Producto p4 = new Producto(precioFabrica, fragil, peso, materiales[generarAleatorio(0, 3)]);
		peso = generarAleatorio(1, 25);
		if (peso > 15) {
			fragil = true;
			}
		else {
			fragil = false;
			}
		
		Producto p5 = new Producto(precioFabrica, fragil, peso, materiales[generarAleatorio(0, 3)]);
		Producto[] productos = {p1, p2, p3, p4, p5};
		return productos;
		
	}
	
	public int generarAleatorio(int minimo, int maximo) {
		int aleatorio;
		aleatorio = r.nextInt(maximo-minimo)+minimo;		
		return aleatorio;
	}
	
	public void imprimirProductos(Producto[] productos) {
		for( int i = 0; i < 5; i++) {
		System.out.println("El producto numero "+(i+1)+" pesa "+productos[i].getPeso()+"Kg, cuesta "+productos[i].getPrecioFabrica()+
					"€, y está fabricado con "+productos[i].getMaterial()+". Tratar con delicadeza: "+productos[i].isFragil());
		}
	}
	
	
}
