package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej9 {
	
	//Pedir una cadena y copiarla al reves.

	public static void main(String[] args) {
		
		System.out.println("Introduce una cadena:");
		
		String s1 = readString();
		
		String s2="";
		

		
		for (int i = s1.length() - 1; i >= 0; i--) {
			
			char c = s1.charAt(i);
			
			String aux = String.valueOf(c);
			
			s2 = s2.concat(aux);
			
		}
		
		System.out.println(s2);
			
		}
		
	
	}


