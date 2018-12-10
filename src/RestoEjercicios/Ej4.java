package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej4 {
	
	//Pedir una cadena.
	//Pedir un caracter
	//Recorrer la cadena, caracter a caracter.
	//Si el caracter de la cadena es igual al caracter introducido, incrementar
	//el contador en uno.

	public static void main(String[] args) {
		
		int apariciones=0;
		
		System.out.println("Introduce una cadena");
		
		String s = readString();
		
		System.out.println("¿Qué caracter vas a buscar?");
		
		char c = readChar();
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == c) {
				
			 apariciones++;
				
			}
			
		}
			
	System.out.println("El caracter especificado aparece " + apariciones + " veces");
		
		
		
		

	}

}
