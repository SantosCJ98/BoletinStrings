package pruebasResto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static RestoEjercicios.Ej12.*;

import static teclado.Teclado.*;

class Ej7_test {

	@Test
	void test() {
		
		System.out.println("Introduce una cadena:");
		
		String s1 = readString();
		
		String s2="";
		
		System.out.println("Introduce el número de caracteres a copiar");
		
		int n = readInt();
		
		if (n > s1.length()) {
			
			throw new IllegalArgumentException("Has introducido más caracteres que en la cadena");
			
		}
		
		for (int i = 0; i < n; i++) {
			
			char c = s1.charAt(i);
			
			String aux = String.valueOf(c);
			
			s2 = s2.concat(aux);
		}
		
		String res = s2;
		
		assertEquals(s2.length(), n);
		
		assertEquals(res, s2);
		
		System.out.println(s2);
		
	}

}
