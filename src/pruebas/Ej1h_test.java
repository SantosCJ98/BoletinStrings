package pruebas;

import static Ej1.Ej1h.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej1h_test {

	@Test
	void True() {
		assertTrue(DNI("12345678A"));
		
		assertFalse(DNI("1234"));
		
		assertFalse(DNI("Hola"));
		
		
		
	}
	
	

}
