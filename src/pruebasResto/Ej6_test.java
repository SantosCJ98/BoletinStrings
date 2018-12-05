package pruebasResto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static RestoEjercicios.Ej12.*;

import static teclado.Teclado.*;

class Ej6_test {

	@Test
	void test() {
		
		System.out.println("Inserta una cadena");
		
		String s1 = readString();
		
		System.out.println("Inserta otra cadena");
		
		String s2 = readString();
		
		String s3 = s1.concat(s2);
		
		assertEquals(s3, s1.concat(s2));
		
		System.out.println(s3);
	}

}
