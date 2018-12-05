package pruebasResto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static RestoEjercicios.Ej12.*;

import static teclado.Teclado.*;

class Ej9_test {

	@Test
	void test() {
		
		System.out.println("Introduce una cadena:");
		
		String s1 = readString();
		
		String s2="";
		

		
		for (int i = s1.length() - 1; i >= 0; i--) {
			
			char c = s1.charAt(i);
			
			String aux = String.valueOf(c);
			
			s2 = s2.concat(aux);
			
			String res = s2;
			
		}
		
		String res = s2;
		
		assertEquals(s2, res);
		
		assertEquals(s2.length(), res.length());
		
		System.out.println(res);
		
	
	
		
	}
	
}	


