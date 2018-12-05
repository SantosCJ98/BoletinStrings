package pruebasEj1;

import static Ej1.Ej1b.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej1b_test {

	@Test
	void True() {
		assertTrue(tresletras("aaa"));
		
		assertTrue(tresletras("JqP"));
	}
	
	void False() {
		assertFalse(tresletras("1sp"));
		
		assertFalse(tresletras("4f"));
	
	}

}
