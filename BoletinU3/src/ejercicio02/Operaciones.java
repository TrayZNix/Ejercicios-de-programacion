package ejercicio02;

public class Operaciones {
	public String generarPositivoNegativo (int num) {
		String result;
		if (num>=0) {
			result="Positivo";
		}
		else {
			result="Negativo";
		}
		return result;
	}

	public String paridad (int num) {
		String result;
		num=num%2;
		if (num==0) {
			result="Par";
		}
		else {
			result="Impar";
		}
		return  result;
	}
	
		
}