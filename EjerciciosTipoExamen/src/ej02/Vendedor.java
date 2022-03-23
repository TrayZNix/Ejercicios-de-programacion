package ej02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Vendedor {
	private Map<Producto, Double> listaProductos = new HashMap<Producto, Double>();
	
	
	public void addProduct(Producto p, double si) {
		this.listaProductos.put(p, si);
	}
	
	public void printList() {
		Iterator <Producto> itr = listaProductos.keySet().iterator();
		while(itr.hasNext()) {
			Producto p = itr.next();
			System.out.println(p+" = "+listaProductos.get(p));
		}
	}
	
	public void sortList() {
		Map<Producto, Double> map = new TreeMap<Producto, Double>(new CompareByName());
		map.putAll(listaProductos);
		Iterator <Producto> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Producto p = itr.next();
			System.out.println(p+" = "+ listaProductos.get(p));
		}
	}
	
}
