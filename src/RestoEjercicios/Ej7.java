package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej7 {
	
	//Pedir una cadena y copiar los n primeros caracteres de esa cadena a otra.

	public static void main(String[] args) {
		
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
		
		System.out.println(s2);
		
	}

}
