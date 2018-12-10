package pruebas;

import static Ej1.Ej1f.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej1f_test {

	@Test
	void True() {
		assertTrue(telefono("0"));
		
		assertTrue(telefono("299"));
		
		assertTrue(telefono("150"));
		
		assertTrue(telefono("20"));
		
		assertTrue(telefono("19"));
		
		assertTrue(telefono("80"));
		
		assertFalse(telefono("Hola"));
		
	}
	
	

}
