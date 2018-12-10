package pruebas;

import static Ej1.Ej1g.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej1g_test {

	@Test
	void True() {
		assertTrue(telefono("123456789"));
		
		assertFalse(telefono("1234"));
		
		assertFalse(telefono("Hola"));
		
		
		
	}
	
	

}
