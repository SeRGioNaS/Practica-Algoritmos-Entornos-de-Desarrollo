package util;

public abstract class Algoritmos {
	
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
	public static int factorial(int numero) {
		int num1 = numero;
		for (int i = 1; i < numero; i++) {
			num1 = num1 * i;
		}
		return num1;
	}
	public static boolean numprimo(int numero) {

		return true;
	}
}
