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
}
