package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej8 {
	
		//Pedir una cadena y un numero entero.
		//Recorrer la cadena desde un punto inicial (longitud - numero) hasta el final.
		//Si el numero es mayor que la longitud de la cadena, lanzar excepcion.
		//Reconstruir la cadena.

	public static void main(String[] args) {
		
		System.out.println("Introduce una cadena:");
		
		String s1 = readString();
		
		String s2 = "";
		
		String aux = "";
		
		System.out.println("Introduce el número de caracteres a copiar");
		
		int n = readInt();
		
		if (n > s1.length()) {
			
			throw new IllegalArgumentException("Has introducido más caracteres que en la cadena");
			
		}
		
		int puntoinicial = s1.length() - n;
		
		for (int i = puntoinicial; i < s1.length(); i++) {
			
			aux = String.valueOf(s1.charAt(i));
			
			s2 = s2.concat(aux);
		}
		
		System.out.println(s2);
			
		}
		
	
	}


