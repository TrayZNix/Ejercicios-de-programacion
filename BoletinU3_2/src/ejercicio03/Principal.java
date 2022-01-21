package ejercicio03;

public class Principal {

	public static void main(String[] args) {
		String relacion, dato1, dato2, dato3;
		relacion = "facturas";
		dato1 = "556";
		 dato2 = "334";
		 dato3 = "424";
		System.out.println("INSERT INTO "+relacion+" VALUES ('"+dato1+"', '"+dato2+"', "+dato3+"');");

	}

}
