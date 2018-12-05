package Ej1;

import static teclado.Teclado.readString;

public class Ej1i {
	
	//Pedir una cadena por teclado y comprobar que es un nombre (Empieza por mayusculas y sin espacios).
	public static void main(String[] args) {

		System.out.println("Introduce una cadena:");
		
		String s = readString();
		
		if (nombre(s)) {
			
			System.out.println("La cadena es valida");	
		}
		
		else {
			
			System.out.println("La cadena no es valida");
			
		}
		

	}
	
	public static boolean nombre (String s) {
		
		if (s.matches("[A-Z]+[a-z]+")) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
	}

}
