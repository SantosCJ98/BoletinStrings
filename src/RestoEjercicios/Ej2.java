package RestoEjercicios;

import static teclado.Teclado.*;

//Pedir por teclado una cadena. Recorrer la cadena caracter por caracter.
//Si un caracter no es distinto a espacio, almacenar caracter en otra cadena.
//Mostrar cadena resultante.
public class Ej2 {

	public static void main(String args[]) {

		// Pedir la cadena

		System.out.println("Introduce una cadena:");

		String s1 = readString();

		// Devolver la cadena sin espacios.

		System.out.println("La cadena resultante es " + sinespacios(s1));

	}

	// Funcion que devuelve una cadena sin espacios.

	public static String sinespacios(String s1) {

		String s2 = "";

		for (int i = 0; i < s1.length(); i++) {

			if (!String.valueOf(s1.charAt(i)).equals(" ")) {

				s2 = s2.concat(String.valueOf(s1.charAt(i)));

			}

		}

		return s2;

	}

}
