package pruebas;

import static Ej1.Ej1c.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej1c_test {

	@Test
	void True() {
		assertTrue(c("a2c4d5"));
		
		assertTrue(c("a2c4d5pppp"));
	}
	
	void False() {
		assertFalse(c("a2c4dx"));
		
		assertFalse(c("añc4d"));
		
		assertFalse(c("zñc4d"));
		
		assertFalse(c("zñc4dwwwx"));
	
	}

}
