package pruebasResto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static RestoEjercicios.Ej4.contarcaracter;


class Ej4_test {

	@Test
	void test() {
		
		assertEquals(1, contarcaracter("Pan", 'a'));
		
		assertEquals(2, contarcaracter("Hipopotamo", 'p'));
		
		assertEquals(0, contarcaracter("becerro", 'v'));
		
	}

}
