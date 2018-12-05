package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej8 {
	
	//Pedir una cadena y copiar los ultimos n caracteres de esa cadena a otra.

	public static void main(String[] args) {
		
		System.out.println("Introduce una cadena:");
		
		String s1 = readString();
		
		String s2 ="";
		
		System.out.println("Introduce el número de caracteres a copiar");
		
		int n = readInt();
		
		if (n > s1.length()) {
			
			throw new IllegalArgumentException("Has introducido más caracteres que en la cadena");
			
		}
		
		int puntoinicial = s1.length() - n;
		
		for (int i = puntoinicial; i <= s1.length()-1; i++) {
			
			char c = s1.charAt(i);
			
			String aux = String.valueOf(c);
			
			s2 = s2.concat(aux);
			
		}
		
		System.out.println(s2);
			
		}
		
	
	}


