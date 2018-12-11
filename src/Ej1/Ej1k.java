package Ej1;

import static teclado.Teclado.readString;

public class Ej1k {
	
	//Pedir una cadena por teclado y comprobar que tiene el formato de un email.
	//Si eso ocurre, devolver true. En caso contrario devolver false
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
		
		if (s.matches("([a-z]||[0-9]||[.])+[@]+([a-z])+[.]{1}+(([e]+[s])||([c]+[o]+[m]))")) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
	}

}
