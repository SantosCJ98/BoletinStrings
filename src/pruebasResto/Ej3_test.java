package pruebasResto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static RestoEjercicios.Ej3.contarvocales;

class Ej3_test {

	@Test
	void test() {
		
		assertEquals(1, contarvocales("Pan"));
		
		assertEquals(1, contarvocales("SOL"));
		
		assertEquals(2, contarvocales("Hola"));
		
		assertEquals(2, contarvocales("SOLAR"));
		
		assertEquals(3, contarvocales("AGUA"));
		
		assertEquals(3, contarvocales("perrito"));
		
		assertEquals(4, contarvocales("apuntado"));
		
		assertEquals(4, contarvocales("ALFOMBRILLA"));
		
		assertEquals(5, contarvocales("murcielago"));
		
		assertEquals(5, contarvocales("OPERATIVO"));
		
		assertEquals(0, contarvocales("zxcvbnm"));
		
		
	}

}
