package Ej1;

import static teclado.Teclado.readString;

public class Ej1d {
	
	//Pedir una cadena por teclado y comprobar que no empieza por un número.
	//Si eso ocurre, devolver true. En caso contrario devolver false
	public static void main(String[] args) {

		System.out.println("Introduce una cadena:");
		
		String s = readString();
		
		if (numerono(s)) {
			
			System.out.println("La cadena es valida");	
		}
		
		else {
			
			System.out.println("La cadena no es valida");
			
		}
		

	}
	
	public static boolean numerono (String s) {
		
		if (s.matches("\\D(.)+")) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
	}

}
