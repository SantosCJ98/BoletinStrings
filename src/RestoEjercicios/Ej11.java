package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej11 {
	
	//Pedir una cadena y un caracter.
	//Recorrer la cadena, caracter a caracter, desde el principio hasta el final.
	//Si el caracter actual es igual al caracter introducido, escribir asterisco
	//Si no, imprimirlo normalmente.

	public static void main(String[] args) {
		
		System.out.println("Introduce una cadena:");
		
		String s1 = readString();
		
		System.out.println("Introduce el caracter a reemplazar:");
		
		char c = readChar();
		
		String s2="";
		
		String aux = "";
		
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
			
	


