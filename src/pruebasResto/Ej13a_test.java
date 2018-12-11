package pruebasResto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static RestoEjercicios.Ej13a.contarpalabras;

class Ej13a_test {

	@Test
	void test() {
		
		assertEquals(1, contarpalabras("Hola"));
		
		assertEquals(3, contarpalabras("Hola que tal"));

		Assertions.assertThrows(IllegalArgumentException.class, () -> contarpalabras("Hola           que tal"));
		
		
		
		
		
	
	
		
	}
	
}	


