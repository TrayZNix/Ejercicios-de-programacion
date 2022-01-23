package ejercicio04;

public class Gimnasio {
	Cliente c;
	private int clienteNumero;
	private Cliente[] listaClientes = new Cliente[10];
	
	
	public Gimnasio() {
		Cliente c1 = new Cliente("Z9728067S", "Eulogio", "Manzanares", 67, 182, 34 );
		Cliente c2 = new Cliente("Y7601128X", "Agustin", "Pavon", 86, 179, 17 );
		Cliente c3 = new Cliente("Y6904041F", "Jenifer", "Puertas", 47, 168, 21 );
		Cliente c4 = new Cliente("X2906267X", "Sofia", "Garca", 79, 175, 32);
		Cliente c5 = new Cliente("Z7369136X", "Catalina", "Alba", 64, 170, 42 );
		clienteNumero = c.getClienteNumero();
		Cliente[] listaClientes = new Cliente[10];
		listaClientes[0] = c1;
		listaClientes[1] = c2;
		listaClientes[2] = c3;
		listaClientes[3] = c4;
		listaClientes[4] = c5;
		
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
	
	System.out.println("Ha sido dado de baja correctamente.");
		
	}
	
	
	
	public Cliente[] darAlta(String dni, String nombre, String apellidos, double peso, double alturaCM, int edad) {
		listaClientes = getListaClientes();
		if (clienteNumero == 5) {
			Cliente c6 = new Cliente(dni, nombre, apellidos, peso, alturaCM, edad);
			listaClientes[clienteNumero] = c6;		
			setListaClientes(listaClientes);
		}
		if (clienteNumero == 6) {
			Cliente c7 = new Cliente(dni, nombre, apellidos, peso, alturaCM, edad);

			this.listaClientes[clienteNumero] = c7;		
		}
		if (clienteNumero == 6) {
			Cliente c8 = new Cliente(dni, nombre, apellidos, peso, alturaCM, edad);

			listaClientes[clienteNumero] = c8;		
			setListaClientes(listaClientes);
		}
		if (clienteNumero == 5) {
			Cliente c9 = new Cliente(dni, nombre, apellidos, peso, alturaCM, edad);

			this.listaClientes[clienteNumero] = c9;			
		}
		if (clienteNumero == 5) {
			Cliente c10 = new Cliente(dni, nombre, apellidos, peso, alturaCM, edad);
			this.listaClientes[clienteNumero] = c10;	
		}
		
		System.out.println("Añadido a la lista de clientes y activado en el sistema!");
		return listaClientes;
	}
	
	public void devolverAlta(int selector) {
		selector = selector - 1;
		listaClientes[selector].setActivo(true);
		System.out.println("Vuelve a estar activo en el gimansio!");
	}
	
	public void calcularMediaIMCClientes() {
		int contador = 0;
		double media = 0;
		for (int i = 0; i < listaClientes.length; i++) {
			if(listaClientes[i] != null) {
				if(listaClientes[i].getActivo()) {
					media = media + calcularIMCCliente(i+1);
					contador = i;
				}
			}
		}
		contador = contador + 1;
		media = media / contador;
		System.out.println("La media de IMC es "+media);
	}
	
	public void calcularMediaAlturaClientes() {
		int contador = 0;
		double media = 0;
		for (int i = 0; i < listaClientes.length; i++) {
			if(listaClientes[i] != null) {
				if(listaClientes[i].getActivo()) {
					media = media + listaClientes[i].getAlturaCM();
					contador = i;
				}
			}
		}
		contador = contador + 1;
		media = media / contador;
		System.out.println("La media de altura es "+media+" Cm");
	}
	
	public void calcularMediaPesoClientes() {
		int contador = 0;
		double media = 0;
		for (int i = 0; i < listaClientes.length; i++) {
			if(listaClientes[i] != null) {
				if(listaClientes[i].getActivo()) {
					media = media + listaClientes[i].getPeso();
					contador = i;
				}
			}
		}
		contador = contador + 1;
		media = media / contador;
		System.out.println("La media de peso es "+media+" Kg");
	}

}
