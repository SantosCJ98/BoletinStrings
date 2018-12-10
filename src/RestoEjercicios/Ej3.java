package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej3 {
	
	//Pedir una cadena y contar las vocales

	public static void main(String[] args) {
		
		int numvocales = 0;
		
		System.out.println("Introduce una cadena");
		
		String s1 = readString();
		
		for (int i = 0; i < s1.length(); i++) {
			
			if (String.valueOf(s1.charAt(i)).matches("[AEIOU]||[aeiou]")) {
					
				numvocales++;
				
			}
			
		}
		
		System.out.println("Hay " + numvocales + " vocales");

		

	}

}
