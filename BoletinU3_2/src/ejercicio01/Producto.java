package ejercicio01;

public class Producto {
	//Atributos
		private double precioFabrica;
		private boolean fragil;
		private int peso;
		private String material;
		private static int numeroSerial;
		
		
		//Constructor
		public Producto(double precioFabrica, boolean fragil, int peso, String material) {
			this.numeroSerial = numeroSerial++;
			this.fragil = fragil;
			this.precioFabrica = precioFabrica;
			this.peso = peso;
			this.material = material;
		}


		public String getMaterial() {
			return material;
		}


		public void setMaterial(String material) {
			this.material = material;
		}


		//Getters y setters
		public double getPrecioFabrica() {
			return precioFabrica;
		}

		public void setPrecioFabrica(double precioFabrica) {
			this.precioFabrica = precioFabrica;
		}

		public boolean isFragil() {
			return fragil;
		}

		public void setFragil(boolean fragil) {
			this.fragil = fragil;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}

		
		
		//Metodos
		public boolean checkFragilidad() {
			boolean fragilidad = true;
			
			return fragilidad;
		}
}
