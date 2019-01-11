package Ej1;

import static teclado.Teclado.readString;

public class Ej1c {
	
	//Pedir una cadena por teclado y comprobar si tiene 5 caracteres o mas que no sean ni la ñ, ni la x, ni la z.
	//Si eso ocurre, devolver true. En caso contrario, devolver false.
	public static void main(String[] args) {

		System.out.println("Introduce una cadena:");
		
		String s = readString();
		
		if (c(s)) {
			
			System.out.println("La cadena es valida");	
		}
		
		else {
			
			System.out.println("La cadena no es valida");
			
		}
		

	}
	
	public static boolean c (String s) {
		
		if (s.matches("[^ñxz]{5}+")) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
	}

}
