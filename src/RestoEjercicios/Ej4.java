package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej4 {

	// Pedir una cadena.
	// Pedir un caracter
	// Recorrer la cadena, caracter a caracter.
	// Si el caracter de la cadena es igual al caracter introducido, incrementar
	// el contador en uno.

	public static void main(String[] args) {

		// Pedir la cadena al usuario

		System.out.println("Introduce una cadena");

		String s = readString();

		// Pedir el caracter al usuario

		System.out.println("Introduce un caracter");

		char c = readChar();

		// Mostrar cuantas veces aparece ese caracter en la cadena

		System.out.println("El caracter aparece " + contarcaracter(s, c) + " veces");

	}

	// Función que cuenta las apariciones de un caracter en una cadena.

	public static int contarcaracter(String s, char c) {

		int apariciones = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == c) {

				apariciones++;

			}

		}

		return apariciones;

	}

}
