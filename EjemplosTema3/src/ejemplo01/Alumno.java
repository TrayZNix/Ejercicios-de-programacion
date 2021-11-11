package ejemplo01;

public class Alumno {
	//Atributos
	
	private int edad;
	private String nombre;
	private String apellidos;
	private double notaMedia;
	
	//Constructor
	public Alumno (int edad, String nombre, String apellidos, double notaMedia) {
		this.edad=edad;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.notaMedia=notaMedia;
	}
		
		//getters and setters
		
		public int getEdad () {
			return edad;
			
		}
		public void setEdad (int edad) {
			this.edad=edad;
		}
		public String getnombre () {
			return nombre;
			
		}
		
		public void setnombre () {
			this.nombre=nombre;
		}
		
		public String getapellidos (){
			return apellidos;
		}
		public void setapellidos () {
			this.apellidos=apellidos;
		}
		public Double getnotamedia() {
			return notaMedia;
		}
		public void setnotamedia (double notaMedia) {
			this.notaMedia=notaMedia;
		}
		public double sumarPuntos (double puntos) {
			notaMedia=notaMedia+puntos;
			return puntos;
			
		}
		
		
	}

