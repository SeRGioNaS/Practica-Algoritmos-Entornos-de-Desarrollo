package app;

import util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
		// Prueba 1
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
		// Prueba 2
		int[] resultadoFibonacci = new int[5];
		for (int i = 0; i < array.length; i++) {
			resultadoFibonacci[i] = Algoritmos.fibonacci(array[i]);
		}
		// Prueba 3
		int[] resultadoFactorial = new int[5];
		for (int i = 0; i < array.length; i++) {
			resultadoFactorial[i] = Algoritmos.factorial(array[i]);
		}
		//Prueba 4
		boolean[] resultadoPrimos = new boolean[5];
		for(int i = 0; i < array.length; i++) {
			resultadoPrimos[i] = Algoritmos.numprimo(array[i]);
		}
	}

}
