package pruebasEj1;

import static Ej1.Ej1k.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej1k_test {

	@Test
	void True() {
		assertTrue(email("santos.castillo.jimenez@correo.com"));
		
		assertTrue(email("emailinventado@correo.es"));
		
		assertFalse(email("Hola"));
		
		
		
		
		
		
	}
	
	

}
