package agencia;

public class Piso {
	//Atributos
	private int idPiso;
	private String direccion;
	private int superficie;
	private boolean paraReformar;
	private int precioDeseadoVenta; //Podria ponerlo double pero como el array generado de precio lo pide en int, este precio también lo pondré en int
	
	public Piso() {
		this.idPiso=1;
		this.direccion="C/ Evangelistas. Bloque 1, Planta 3 Puerta B, Sevilla"; 
		this.precioDeseadoVenta=35000; //Precio aleatorio para calcular precio del metro cuadrado
		this.superficie=140; //Superficie aleatoria para calcular precio del metro cuadrado
		this.paraReformar=true;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isParaReformar() {
		return paraReformar;
	}

	public void setParaReformar(boolean paraReformar) {
		this.paraReformar = paraReformar;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getPrecioDeseadoVenta() {
		return precioDeseadoVenta;
	}

	public void setPrecioDeseadoVenta(int precioDeseadoVenta) {
		this.precioDeseadoVenta = precioDeseadoVenta;
	}
	
	//Getters y setters
	
	
	
}
