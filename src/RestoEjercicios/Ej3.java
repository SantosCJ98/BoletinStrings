package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej3 {
	
	//Pedir una cadena y contar las vocales

	public static void main(String[] args) {
		
		int numvocales = 0;
		
		System.out.println("Introduce una cadena");
		
		String s1 = readString();
		
		for (int i = 0; i < s1.length(); i++) {
			
			char c = s1.charAt(i);
			
			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') {
				
				numvocales++;
				
			}
			
		}
		
		System.out.println("Hay " + numvocales + " vocales");

		

	}

}
