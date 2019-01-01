package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej9 {

	// Pedir una cadena. Recorrer la cadena, caracter a caracter, desde el final
	// hasta el inicio
	// Reconstruir la cadena al reves.

	public static void main(String[] args) {

		// Pedir la cadena

		System.out.println("Introduce una cadena:");

		String s1 = readString();

		// Devolver la cadena invertida.

		System.out.println("La cadena resultante es " + cadenainversa(s1));

	}

	// Función que devuelve una cadena invertida.

	public static String cadenainversa(String s1) {

		String s2 = "";

		for (int i = s1.length() - 1; i >= 0; i--) {

			s2 = s2.concat(String.valueOf(s1.charAt(i)));
		}

		return s2;

	}

}
