package Ej1;

import static teclado.Teclado.readString;

public class Ej1e {
	
	//Pedir una cadena por teclado y comprobar que no tenga la b.
	//Si eso ocurre, devolver true. En caso contrario devolver false
	public static void main(String[] args) {

		System.out.println("Introduce una cadena:");
		
		String s = readString();
		
		if (sinb(s)) {
			
			System.out.println("La cadena es valida");	
		}
		
		else {
			
			System.out.println("La cadena no es valida");
			
		}
		

	}
	
	public static boolean sinb (String s) {
		
		if (s.matches("[^bB]+")) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
	}

}
