package Ej1;

import static teclado.Teclado.readString;

public class Ej1a {
	
	//Pedir una cadena por teclado y comprobar si su valor es "True";

	public static void main(String[] args) {

		System.out.println("Introduce una cadena:");
		
		String s = readString();
		
		if (esTrue(s)) {
			
			System.out.println("La cadena vale \"True\"");	
		}
		
		else {
			
			System.out.println("La cadena no vale \"True\"");
			
		}
		

	}
	
	public static boolean esTrue (String s) {
		
		if (s.matches("True")) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
	}

}
