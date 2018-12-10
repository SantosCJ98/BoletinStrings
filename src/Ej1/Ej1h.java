package Ej1;

import static teclado.Teclado.readString;

public class Ej1h {
	
	//Pedir una cadena por teclado y comprobar que es un DNI (8 numeros y una mayuscula).
	//Si eso ocurre, devolver true. En caso contrario devolver false
	public static void main(String[] args) {

		System.out.println("Introduce una cadena:");
		
		String s = readString();
		
		if (DNI(s)) {
			
			System.out.println("La cadena es valida");	
		}
		
		else {
			
			System.out.println("La cadena no es valida");
			
		}
		

	}
	
	public static boolean DNI (String s) {
		
		if (s.matches("[0-9]{8}+[A-Z]")) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
		
	}

}
