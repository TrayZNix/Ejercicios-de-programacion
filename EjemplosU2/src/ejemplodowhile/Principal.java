package ejemplodowhile;

public class Principal {

	public static void main(String[] args) {
		
		int count=0, numerador=0, tope=14;
		
		do{
			count++;
			numerador++;
			System.out.printf("%d. Hola\n", numerador);
		} while (count<tope);
	}

}
