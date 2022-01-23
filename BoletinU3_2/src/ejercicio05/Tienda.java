package ejercicio05;

public class Tienda {
	//Atributos
	private Electrodomestico[] electrodomesticos = new Electrodomestico[5];
	//Constructor
	public Tienda() {
		//Instanciado de objetos
		Electrodomestico e1 = new Electrodomestico();
		Electrodomestico e2 = new Electrodomestico();
		Electrodomestico e3 = new Electrodomestico();
		Electrodomestico e4 = new Electrodomestico();
		Electrodomestico e5 = new Electrodomestico();
		//Introduccion de objetos en el array
		for(int i = 0; i < electrodomesticos.length; i++) {
			if (i == 0) {
				this.electrodomesticos[i] = e1;
			}
			if (i == 1) {
				this.electrodomesticos[i] = e2;
			}
			if (i == 2) {
				this.electrodomesticos[i] = e3;
			}
			if (i == 3) {
				this.electrodomesticos[i] = e4;
			}
			if (i == 4) {
				this.electrodomesticos[i] = e5;
			}
			
		}
		
	}
	
	public double calcularPrecioTodosJuntos() {
		double precio = 0;
			for(int i = 0; i < electrodomesticos.length; i++) {
				precio = precio + electrodomesticos[i].getPrecioFinal();
			}
		return precio;
	}
	
	public double calcularMediaPrecioProductos() {
		double precioMedio = 0;
		for(int i = 0; i < electrodomesticos.length; i++) {
			precioMedio = precioMedio + electrodomesticos[i].getPrecioFinal();
		}
			precioMedio = precioMedio / 5;
		return precioMedio;
		
	}
}
