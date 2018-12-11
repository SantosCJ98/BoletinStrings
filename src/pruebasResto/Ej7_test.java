package pruebasResto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static RestoEjercicios.Ej7.primeroscaracteres;

class Ej7_test {

	@Test
	void test() {
		
		assertEquals("Hola", primeroscaracteres("Hola que tal", 4));
		
		
	}

}
