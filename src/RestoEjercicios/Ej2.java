package RestoEjercicios;

import static teclado.Teclado.*;

//Pedir por teclado una cadena. Recorrer la cadena caracter por caracter.
//Si un caracter no es distinto a espacio, almacenar caracter en otra cadena.
//Mostrar cadena resultante.
public class Ej2 {
	
	public static void main (String args[]) {
		
		System.out.println("Introduce una cadena:");
		
		String s1 = readString();
		
		String s2 = "";
		
		for (int i = 0; i < s1.length(); i++) {
			
			if (!String.valueOf(s1.charAt(i)).equals(" ")) {
				
				String aux = String.valueOf(s1.charAt(i));
				
				s2 = s2.concat(aux);
				
			}
			
		}
		
		System.out.println("La nueva cadena es " + s2);
		
	}
		
		
}
