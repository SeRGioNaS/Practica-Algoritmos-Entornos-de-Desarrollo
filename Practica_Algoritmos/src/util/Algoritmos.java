package util;
/**
 * Clase que representa el concepto de algoritmo
 * 
 * @version 1.0
 * 
 * @author Sergio
 */
public abstract class Algoritmos {
/**
 * Devuelve el numero de fibonacci de dicho numero
 * 
 * @param numero 	El numero del que queremos su fibonacci
 * 
 * @return El numero de fibonacci
 */
	public static int fibonacci(int numero) {
		int num1 = 0;
		int num2 = 1;
		int fibonacci;

		for (int i = 2; i < numero; i++) {
			fibonacci = num1 + num2;
			num1 = num2;
			num2 = fibonacci;
		}
		return num2;
	}

	/**
	 * Devuelve el factorial de dicho numero
	 * 
	 * @param numero	El numero del que queremos su factorial
	 * 
	 * @return El factorial
	 */
	public static int factorial(int numero) {
		int num1 = numero;
		for (int i = 1; i < numero; i++) {
			num1 = num1 * i;
		}
		return num1;
	}

	/**
	 * Indica si el numero es primo
	 * 
	 * @param numero	El numero que queremos saber si es primo
	 * 
	 * @return Si o no
	 */
	public static boolean numprimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		for (int i = 2; i <= numero / 2; i++) {
			if (numero% i == 0) {
				return false;
			}
		}
		return true;
	}
}
