package ej02;

public class Principal {

	public static void main(String[] args) {
		//MRU, 5.5m0 RECORRIDOS, V=3.2M/S   m=m0+v*t
		double mRec=5.5, v=3.2, t=4, m=0;
		m=mRec+v*t;
		System.out.println("Bienvenido. Este programa le ayudará a calcular el espacio en el que se encontrará un objeto en movimiento rectilineo uniforme, en un momento determinado");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("Para un movil a %.2f, que ya ha recorrido %.2fm, en el segundo %.2f , se encontrará a %.2fm de distancia con respecto al lugar de lanzamiento\n\n", v, mRec, t, m);
		System.out.println("Gracias por usar el programa!");
		

	}

}
