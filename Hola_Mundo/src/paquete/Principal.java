package paquete;

public class Principal {
	
	public static void main(String[] args) {
		byte dia=22;
		float bitcoin=42543.65F;
		double sueldo= 867.342796;
		double sueldo2= 992.37372;
		int continuo= 1;
		String nombre01= "Angel";
		String apellido01="Naranjo";
		
		System.out.println("Hola de nuevo");
		System.out.println("dia de hoy:" );
		System.out.println(dia);
		System.out.println();
		System.out.println("Precio actual de BTC: " +bitcoin+"$"+"\n");
		System.out.println("ESTE TEXTO CONFIRMA QUE EL ARCHIVO SE HA ACTUALIZADO GRACIAS A GIT");
		System.out.printf("Buenos días señor %s %s.\n", nombre01 , apellido01);
		System.out.printf("Su sueldo es: %.2f€, y su extra por comisiones es %.2f€\n", sueldo2, sueldo);
		if (continuo == 1) {
			   System.out.println("Su saldo continuará estable debido a sus grandes ventas");
		}
	}
}
