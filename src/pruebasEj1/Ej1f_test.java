package pruebasEj1;

import static Ej1.Ej1f.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej1f_test {

	@Test
	void True() {
		assertTrue(numero("0"));
		
		assertTrue(numero("299"));
		
		assertTrue(numero("150"));
		
		assertTrue(numero("20"));
		
		assertTrue(numero("19"));
		
		assertTrue(numero("80"));
		
		assertFalse(numero("Hola"));
		
		assertFalse(numero("300"));
		
		assertFalse(numero("420"));
		
	}
	
	

}
