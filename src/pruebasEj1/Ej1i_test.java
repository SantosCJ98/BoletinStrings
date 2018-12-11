package pruebasEj1;

import static Ej1.Ej1i.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej1i_test {

	@Test
	void True() {
		assertTrue(nombre("Santos"));
		
		assertFalse(nombre("San tos"));
		
		assertFalse(nombre("santos"));
		
		
		
	}
	
	

}
