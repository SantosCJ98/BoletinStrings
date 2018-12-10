package pruebas;

import static Ej1.Ej1a.esTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej1a_test {

	@Test
	void True() {
		assertTrue(esTrue("True"));
	}
	
	void False() {
		assertFalse(esTrue("False"));
		
		assertFalse(esTrue("hola"));
	}

}
