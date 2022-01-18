package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		Gestion g = new Gestion();
		Producto[] productos = new Producto[5];
		productos = g.generarProductos();
		g.imprimirProductos(productos);

	}

}
