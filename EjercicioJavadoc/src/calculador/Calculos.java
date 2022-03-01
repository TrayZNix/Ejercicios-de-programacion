package calculador;
/**
 * Esta clase sera usada para realizar los calculos deseados por el usuario
 * @version 1.0, 2/02/2022
 * @author Roberto
 *
 */
public class Calculos {
	
	/**
	 * Este método <strong>suma</strong> los párametros i, e j, y devuelve el resultado de la suma
	 * 
	 * @param i Es una variable double elegida por el usuario
	 * @param j Es una variable double elegida por el usuario
	 * @return Devuelve la suma de los parametros i, e j, en una variable tipo double.
	 */
	public double sumar(double i, double j) {
		return i+j;
	}	
	/**
	 * Este método <strong>resta</strong> el valor del párametro j al valor del párametro i, y devuelve el resultado de la resta
	 * 
	 * @param i Variable tipo double elegida por el usuario
	 * @param j Variable tipo double elegida por el usuario
	 * @return Se devuelve la resta del parametro i menos el parametro j, en una variable double
	 */
	public double restar(double i, double j) {
		return i-j;
	}	
	/**
	 * Este método <strong>multiplica</strong> el valor de los parámetros , y devuelve el resultado de la multiplicación
	 * 
	 * @param i Variable tipo double elegida por el usuario
	 * @param j Variable tipo double elegida por el usuario
	 * @return Se devuelve la multiplicación de los parametros i , e j, en una variable double
	 */
	public double multiplicar(double i, double j) {
		return i*j;
	}
	/**
	 * Este método <strong>divide</strong> el parámetro i entre el parametro j, y devuelve el resultado de la división.
	 * 
	 * @param i Variable tipo double elegida por el usuario
	 * @param j Variable tipo double elegida por el usuario
	 * @return  Se devuelve la division del parametro i entre el parametro js en una variable double
	 */
	public double dividir(double i, double j) {
		return i/j;
	}
	/**
	 * Este método calcula el mínimo común múltiplo de los parametros i e j.
	 * <em>Hace uso del método calcularMCD</em>
	 * 
	 * @see calculador.Calculos#calcularMCD(double, double)
	 * @param i Variable tipo double elegida por el usuario
	 * @param j Variable tipo double elegida por el usuario
	 * @return Devuelve el mínimo común múltiplo de los parametros i e j en una variable tipo int.
	 */
	public double calcularMCM(double i, double j) {
		int solucion = 0;
		int a = (int) Math.max(i, j);
        int b = (int) Math.min(i, j);
 
        solucion = (int) ((a / calcularMCD(i, j)) * b);
         
        return solucion;
	}
	/**
	 * Esta clase calcula el máximo común divisor 
	 * 
	 * @param i Variable tipo double elegida por el usuario
	 * @param j Variable tipo double elegida por el usuario
	 * @return Devuelve el mínimo común múltiplo de los parametros i e j en una variable tipo int.
	 */
	public double calcularMCD(double i, double j) {
		int solucion = 0;
		int a =(int) Math.max(i, j);
	    int b =(int) Math.min(i, j);
	    do {
	        solucion = b;
	        b = a % b;
	        a = solucion;
	    } while (b != 0);
		return solucion;
	}
}
