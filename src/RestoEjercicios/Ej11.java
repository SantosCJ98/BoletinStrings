package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej11 {
	
	//Pedir una cadena y un caracter y sustituir el caracter de la cadena por un asterisco.

	public static void main(String[] args) {
		
		String s2="";
		
		String aux = "";
		
		System.out.println("Introduce una cadena:");
		
		String s1 = readString();
		
		System.out.println("Introduce el caracter a reemplazar:");
		
		char c = readChar();
		
		for (int i = 0; i <= s1.length()-1; i++) {
			
			char charactual = s1.charAt(i);
				
			if (charactual != c) {
				
				aux = String.valueOf(charactual);
				
				
			}
			
			else if (charactual == c) {
				
				aux = String.valueOf('*');
				
			}
			
			
			s2 = s2.concat(aux);
		
		
			
		}
		
		System.out.println(s2);
	
	}
	
}
			
	


