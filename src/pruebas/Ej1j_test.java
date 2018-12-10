package pruebas;

import static Ej1.Ej1j.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej1j_test {

	@Test
	void True() {
		assertTrue(funcion("a"));
		
		assertTrue(funcion("e"));
		
		assertTrue(funcion("i"));
		
		assertTrue(funcion("o"));
		
		assertTrue(funcion("u"));
		
		assertTrue(funcion("A"));
		
		assertTrue(funcion("E"));
		
		assertTrue(funcion("I"));
		
		assertTrue(funcion("O"));
		
		assertTrue(funcion("U"));
		
		assertTrue(funcion("abuelo"));
		
		assertTrue(funcion("Uvas"));
		
		assertFalse(funcion("Hola"));
		
		
		
	}
	
	

}
