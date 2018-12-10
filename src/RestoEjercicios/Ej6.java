package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej6 {
	
	//Pedir 2 cadenas. Concatenarlas.

	public static void main(String[] args) {
	
		System.out.println("Introduce una cadena:");
		
		String s1 = readString();
		
		System.out.println("Introduce otra cadena:");
		
		String s2 = readString();
		
		String res = "";
		
		for (int i = 0; i < s1.length(); i++) {
				
				res = res.concat(String.valueOf(s1.charAt(i)));
				
			
		}
		
		for (int i = 0; i < s2.length(); i++) {
			
				res = res.concat(String.valueOf(s2.charAt(i)));
			
		
		}
		
		System.out.println(res);
		
		
		

	}

}
