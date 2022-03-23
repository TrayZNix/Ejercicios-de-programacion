package ej02;

import java.util.Comparator;

public class CompareByName implements Comparator<Producto> {

	@Override
	public int compare(Producto o1, Producto o2) {
		return -(o1.getNombreProducto().compareToIgnoreCase(o2.getNombreProducto()));
	}

}
