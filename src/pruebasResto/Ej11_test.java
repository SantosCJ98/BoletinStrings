package pruebasResto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static RestoEjercicios.Ej11.sustituirasteriscos;

class Ej11_test {

	@Test
	void test() {
		
		assertEquals("*lb*h*c*", sustituirasteriscos("albahaca", 'a'));
		
		assertEquals("*sp*cial", sustituirasteriscos("especial", 'e'));
		
		
		
	
	
		
	}
	
}	


