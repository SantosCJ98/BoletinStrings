package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej9 {
	
	//Pedir una cadena. Recorrer la cadena, caracter a caracter, desde el final hasta el inicio
	//Reconstruir la cadena.
	//Si el numero es mayor que la longitud de la cadena, lanzar excepcion.

	public static void main(String[] args) {
		
		System.out.println("Introduce una cadena:");
		
		String s1 = readString();
		
		String s2 = "";
		

		
		for (int i = s1.length() - 1; i >= 0; i--) {
			
			s2 = s2.concat(String.valueOf(s1.charAt(i)));
		}
		
		System.out.println("La cadena resultante es " + s2);
		
		}
		
	
	}


