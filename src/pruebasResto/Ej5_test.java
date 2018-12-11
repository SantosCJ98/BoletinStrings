package pruebasResto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static RestoEjercicios.Ej5.contarrango;;


class Ej5_test {

	@Test
	void test() {
		
		assertEquals(0, contarrango("Pan", 'o'));
		
		assertEquals(1, contarrango("Pan", 'a'));
		
		assertEquals(6, contarrango("Panacea", 'a'));
	}

}
