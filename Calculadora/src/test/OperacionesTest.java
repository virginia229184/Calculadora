package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import operaciones.Operaciones;

class OperacionesTest {

	@Test
	void testSumar() {
		Operaciones operaciones = new Operaciones();
		int numero1 = 5, numero2 = 3;		
		int resultado = operaciones.sumar(numero1, numero2);
		assertEquals(8, resultado);
	}

	@Test
	void testRestar() {
		Operaciones operaciones = new Operaciones();
		int numero1 = 5, numero2 = 3;		
		int resultado = operaciones.restar(numero1, numero2);
		assertEquals(2, resultado);
	}

	@Test
	void testMultiplicar() {
		Operaciones operaciones = new Operaciones();
		int numero1 = 5, numero2 = 3;		
		int resultado = operaciones.multiplicar(numero1, numero2);
		assertEquals(15, resultado);
	}

	@Test
	void testDividir() {
		Operaciones operaciones = new Operaciones();
		int numero1 = 5, numero2 = 3;		
		int resultado = operaciones.dividir(numero1, numero2);
		assertEquals(1, resultado);
	}

	@Test
	void testResto() {
		Operaciones operaciones = new Operaciones();
		int numero1 = 5, numero2 = 3;		
		int resultado = operaciones.resto(numero1, numero2);
		assertEquals(2, resultado);
	}

}
