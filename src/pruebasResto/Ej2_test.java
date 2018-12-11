package pruebasResto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static RestoEjercicios.Ej2.sinespacios;

class Ej2_test {

	@Test
	void test() {
		
		
		assertEquals("Holaquetal", sinespacios("Hola que tal"));
		
		assertEquals("Holaquetal", sinespacios("Hola        que       tal"));
		
		assertEquals("", sinespacios(" "));
		
	}

}
