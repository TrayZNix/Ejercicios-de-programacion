package ejercicio04;

public class Gimnasio {
	Cliente c;
	private int clienteNumero;
	Cliente[] listaClientes = new Cliente[10];
	
	
	public Gimnasio() {
		Cliente c1 = new Cliente("Z9728067S", "Eulogio", "Manzanares", 67, 182, 34 );
		Cliente c2 = new Cliente("Y7601128X", "Agustin", "Pavon", 86, 179, 17 );
		Cliente c3 = new Cliente("Y6904041F", "Jenifer", "Puertas", 47, 168, 21 );
		Cliente c4 = new Cliente("X2906267X", "Sofia", "Garca", 79, 175, 32);
		Cliente c5 = new Cliente("Z7369136X", "Catalina", "Alba", 64, 170, 42 );
		clienteNumero = c.getClienteNumero();
		Cliente[] listaClientes = {c1, c2, c3, c4, c5};
		this.listaClientes = listaClientes;
	}
	
	//Getters setters
	public Cliente[] getListaClientes() {
		return listaClientes;
	}
	
	public void setListaClientes(Cliente[] listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	//METODOS
	
	public double calcularIMCCliente(int selector) {
		Cliente c;
		double IMC;
		selector = selector - 1;
		IMC = listaClientes[selector].calcularIMC();
		return IMC;
	}
	
	public void darBaja(int i) {
	i = i - 1;
	listaClientes[i].setActivo(false);
	
	}

}
