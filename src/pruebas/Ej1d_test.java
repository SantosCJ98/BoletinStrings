package pruebas;

import static Ej1.Ej1d.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej1d_test {

	@Test
	void True() {
		assertTrue(numerono("a12356"));
		
		assertFalse(numerono("1abcde"));
	}
	
	

}
