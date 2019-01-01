package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej3 {

	// Pedir una cadena y contar las vocales

	public static void main(String[] args) {

		// Pedir una cadena al usuario

		System.out.println("Introduce una cadena");

		String s1 = readString();

		// Devolver el número de vocales que contiene

		System.out.println("Hay " + contarvocales(s1) + " vocales");

	}

	// Función que cuenta las vocales que contiene una cadena (mayúsculas o
	// minúsculas)

	public static int contarvocales(String s1) {

		int numvocales = 0;

		for (int i = 0; i < s1.length(); i++) {

			if (String.valueOf(s1.charAt(i)).matches("[AEIOU]||[aeiou]")) {

				numvocales++;

			}

		}

		return numvocales;

	}

}
