package ejercicio01;

public class Producto {
	//Atributos
	private double precioFabrica;
	private boolean fragil;
	private double peso;
	private String materiales;
	private String codigoLote;
	
	//Constructor
	public Producto() {
		
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

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public String getCodigoLote() {
		return codigoLote;
	}

	public void setCodigoLote(String codigoLote) {
		this.codigoLote = codigoLote;
	}
	
	
	//Metodos
	public boolean checkFragilidad() {
		boolean fragilidad = true;
		
		return fragilidad;
	}

	
}
