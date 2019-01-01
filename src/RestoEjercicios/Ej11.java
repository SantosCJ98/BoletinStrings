package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej11 {

	// Pedir una cadena y un caracter.
	// Recorrer la cadena, caracter a caracter, desde el principio hasta el final.
	// Si el caracter actual es igual al caracter introducido, escribir asterisco
	// Si no, imprimirlo normalmente.

	public static void main(String[] args) {

		// Pedir una cadena

		System.out.println("Introduce una cadena");

		String s = readString();

		// Pedir un caracter

		System.out.println("¿Que caracter quieres sustituir?");

		char c = readChar();

		// Mostrar resultado

		System.out.println("La cadena resultante es " + sustituirasteriscos(s, c));

	}

	// Función que cambia los caracteres de una cadena por asteriscos.

	public static String sustituirasteriscos(String s1, char c) {

		String s2 = "";

		String aux = "";

		for (int i = 0; i < s1.length(); i++) {

			char charactual = s1.charAt(i);

			if (charactual != c) {

				aux = String.valueOf(charactual);

			}

			else if (charactual == c) {

				aux = String.valueOf('*');

			}

			s2 = s2.concat(aux);

		}

		return s2;

	}

}
