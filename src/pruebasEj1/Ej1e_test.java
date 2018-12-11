package pruebasEj1;

import static Ej1.Ej1e.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej1e_test {

	@Test
	void True() {
		assertTrue(sinb("Hola"));
		
		assertFalse(sinb("bola"));
		
		assertFalse(sinb("Bola"));
		
		assertFalse(sinb("Arbol"));
		
		assertFalse(sinb("ARBOL"));
		
		assertFalse(sinb("AAAAB"));
		
		assertFalse(sinb("aaaab"));
		
		assertFalse(sinb("Baaaab"));
		
		assertFalse(sinb("baaaB"));
		
		assertFalse(sinb("BAAAAB"));
	}
	
	

}
