package pruebasResto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static RestoEjercicios.Ej8.ultimoscaracteres;

class Ej8_test {

	@Test
	void test() {
		
		assertEquals("tal", ultimoscaracteres("Hola que tal", 3));
		
	}

}
