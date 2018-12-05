package Ej1;

import static teclado.Teclado.readString;

public class Ej1k {
	
	//Pedir una cadena por teclado y comprobar que tiene el formato de un email.
	public static void main(String[] args) {

		System.out.println("Introduce una cadena:");
		
		String s = readString();
		
		if (email(s)) {
			
			System.out.println("La cadena es valida");	
		}
		
		else {
			
			System.out.println("La cadena no es valida");
			
		}
		

	}
	
	public static boolean email (String s) {
		
		if (s.matches("(\\S)+[@]{1}+([a-z])+[.]{1}+(([e]+[s])||([c]+[o]+[m])){1}")) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
	}

}
