package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej13a {

	// Pedir una cadena.
	// Recorrer la cadena, caracter a caracter, desde el principio hasta el final.

	// Si un caracter es una letra, y es el ultimo caracter, se incrementa el
	// contador de palabras.

	// Si un caracter es un espacio, y NO es el ultimo caracter, se incrementa el
	// contador de palabras.

	// Los espacios incrementan el contador de espacios.

	// Las letras ponen el contador de espacios a 0.

	// Si hay mas de un espacio en la cadena, lanzar excepcion.

	public static void main(String[] args) {

		// Pedir la cadena

		System.out.println("Introduce una cadena");

		String s = readString();

		// Mostrar cuantas palabras tiene

		System.out.println("La cadena tiene " + contarpalabras(s) + " palabra(s)");

	}

	// Funcion que devuelve el número de palabras separadas por un espacio.

	public static int contarpalabras(String s1) {

		int resultados = 0;

		int numespacios = 0;

		for (int i = 0; i < s1.length(); i++) {

			if (!String.valueOf(s1.charAt(i)).equals(" ") && i == s1.length() - 1) {

				resultados++;

			}

			else if (String.valueOf(s1.charAt(i)).equals(" ") && i != 0) {

				resultados++;

			}

			if (!String.valueOf(s1.charAt(i)).equals(" ")) {

				numespacios = 0;

			}

			else if (String.valueOf(s1.charAt(i)).equals(" ")) {

				numespacios++;

			}

			if (numespacios > 1) {

				throw new IllegalArgumentException("Error: las palabras deben ir separadas por UN SOLO espacio");

			}

		}

		return resultados;

	}

}