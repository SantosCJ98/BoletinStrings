package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej4 {
	
	//Pedir una cadena y un caracter y contar cuantas veces aparece ese caracter en la cadena

	public static void main(String[] args) {
		
		int apariciones=0;
		
		System.out.println("Introduce una cadena");
		
		String s = readString();
		
		System.out.println("¿Qué caracter vas a buscar?");
		
		char c = readChar();
		
		for (int i = 0; i < s.length(); i++) {
			
			if (Character.toLowerCase(s.charAt(i)) == c) {
				
			 apariciones++;
				
			}
			
		}
			
	System.out.println("El caracter especificado aparece " + apariciones + " veces");
		
		
		
		

	}

}
