package pruebasResto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static RestoEjercicios.Ej12.*;

import static teclado.Teclado.*;

class Ej2_test {

	@Test
	void test() {
		
		System.out.println("Inserta una cadena");
		
		String s1 = readString();
		
		String s2 = s1.replace(' ', '\uffff');
		
		assertEquals(s2, s1.replace(' ', '\uffff'));
		
		System.out.println(s2);
	}

}
