package ej02;

public class Main {

	public static void main(String[] args) {
		Producto p = new Espada(50, 17, "Espadacca", "Doble");
		Producto p2 = new Espada(60, 11, "Espadata", "Triple");
		Producto p3 = new Espada(70, 12, "Espadat", "Cuadruple");
		Producto p4 = new Espada(80, 14, "Espada", "Pentagonal");
		Vendedor v = new Vendedor();
		
		v.addProduct(p4, 5);
		Producto p5 = new Movil(200, 13, "Redmi Note 8 Pro", "Xiaomi ");
		Producto p6 = new Movil(300, 10, "Redmi Note 9", "Xiaomi ");
		Producto p7 = new Movil(600, 5, "Redmi GTO", "Xiaomi ");				
		v.addProduct(p5, 6);
		v.addProduct(p2, 7);
		v.addProduct(p3, 7);
		v.addProduct(p6, 4);
		v.addProduct(p7, 4);
		v.addProduct(p, 34);
		
		v.printList();
		System.out.println("-----------------------");
		v.sortList();
	}

}
