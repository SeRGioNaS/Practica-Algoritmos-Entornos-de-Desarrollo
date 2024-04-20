package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmos;

class prueba {

	@Test
	void fibonacci() {
		int numeroEsperado1 = 21;
		int numeroEsperado2 = 13;
		int numeroEsperado3 = 8;
		int numeroObtenido1 = Algoritmos.fibonacci(8);
		int numeroObtenido2 = Algoritmos.fibonacci(7);
		int numeroObtenido3 = Algoritmos.fibonacci(6);
		assertEquals(numeroEsperado1, numeroObtenido1);
		assertEquals(numeroEsperado2, numeroObtenido2);
		assertEquals(numeroEsperado3, numeroObtenido3);
	}
	@Test
	void factorial() {
		int numeroEsperado1 = 40320;
		int numeroEsperado2 = 5040;
		int numeroEsperado3 = 720;
		int numeroObtenido1 = Algoritmos.factorial(8);
		int numeroObtenido2 = Algoritmos.factorial(7);
		int numeroObtenido3 = Algoritmos.factorial(6);
		assertEquals(numeroEsperado1, numeroObtenido1);
		assertEquals(numeroEsperado2, numeroObtenido2);
		assertEquals(numeroEsperado3, numeroObtenido3);
	}
	@Test
	void numPrimo() {
		boolean numeroEsperado1 = false;
		boolean numeroEsperado2 = true;
		boolean numeroEsperado3 = false;
		boolean numeroObtenido1 = Algoritmos.numprimo(8);
		boolean numeroObtenido2 = Algoritmos.numprimo(7);
		boolean numeroObtenido3 = Algoritmos.numprimo(6);
		assertEquals(numeroEsperado1, numeroObtenido1);
		assertEquals(numeroEsperado2, numeroObtenido2);
		assertEquals(numeroEsperado3, numeroObtenido3);
	}
}
