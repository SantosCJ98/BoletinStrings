package Ej1;

import static teclado.Teclado.readString;

public class Ej1b {
	
	//Pedir una cadena por teclado. Si solo contiene 3 letras (mayusculas o minusculas) devolver true.
	//En caso contrario, devolver false.

	public static void main(String[] args) {

		System.out.println("Introduce una cadena:");
		
		String s = readString();
		
		if (tresletras(s)) {
			
			System.out.println("La cadena es valida");	
		}
		
		else {
			
			System.out.println("La cadena no es valida");
			
		}
		

	}
	
	public static boolean tresletras (String s) {
		
		if (s.matches("([A-Z]||[a-z]){3}")) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
	}

}
