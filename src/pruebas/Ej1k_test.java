package pruebas;

import static Ej1.Ej1k.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej1k_test {

	@Test
	void True() {
		assertTrue(email("santoscastillo@mail.com"));
		
		assertTrue(email("santoscastillo@mail.es"));
		
		assertFalse(email("santoscastillo@mailes"));
		
		
		
		
		
		
	}
	
	

}
