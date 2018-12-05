package pruebasEj1;

import static Ej1.Ej1c.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ej1c_test {

	@Test
	void True() {
		assertTrue(c("abcde"));
		
		assertTrue(c("abc1234"));
	}
	
	void False() {
		assertFalse(c("1ab"));
		
		assertFalse(c("abcdx"));
		
		assertFalse(c("12345ñ"));
		
		assertFalse(c("zxcvbnm"));
	
	}

}
