package ej_01;

public class Principal {


	public static void main(String[] args) {
		
		//DECLARACIÓN DE VARIABLES 
		System.out.printf("Primero, introduzca los posibles valores a calcular. En este ejemplo, usaremos 15, 1, y 6. ");
		int var1=15;
		int var2=1;
		int var3=6;
		int suma=0;
		int resultado=0;
		
				
		//OPERACIONES:
		//SUMA DE LAS TRES PRIMERAS VARIABLES
		System.out.printf("Primero, sumamos los valores:\n");
		suma= var1+var2+var3;
		System.out.printf("El resultado de la suma es %d \n", suma);
		//RESTA DE 1 A LA SUMA ANTERIOR
		System.out.printf("El siguiente paso es restarle 1 al resultado anterior\n");
		resultado= suma-1;
		
		//IMPRESIÓN DEL RESULTADO
		System.out.printf("El resultado de la operación completa es: %d", resultado);
		
	
	}

}
