package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej10 {
	
	//Pedir una cadena. Recorrer la cadena, caracter a caracter, desde el principio hasta el final.
	//Sumar los caracteres numericos.
	public static void main(String[] args) {
		
		int suma=0;
		
		System.out.println("Introduce una cadena:");
		
		String s1 = readString();
		

		for (int i = 0; i < s1.length()-1; i++) {
			
			char c = s1.charAt(i);
			
			if (Character.isDigit(c)) {
				
				suma+=Character.getNumericValue(c);
				
			}
		}
		
		System.out.println(suma);
		
	}
			
		}
	


