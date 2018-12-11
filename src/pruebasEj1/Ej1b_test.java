package pruebasEj1;

import static Ej1.Ej1b.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej1b_test {

	@Test
	void True() {
		assertTrue(tresletras("aaa"));
		
		assertTrue(tresletras("BBB"));
		
		assertTrue(tresletras("JqP"));
		
		assertTrue(tresletras("ABc"));
		
		assertTrue(tresletras("paL"));
		
		assertTrue(tresletras("sCJ"));
	}
	
	void False() {
		assertFalse(tresletras("1sp"));
		
		assertFalse(tresletras("4f"));
	
	}

}
