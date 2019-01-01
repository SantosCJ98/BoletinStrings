package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej5 {

	// Pedir una cadena.
	// Pedir un caracter.
	// Recorrer la cadena, caracter a caracter, hasta la ultima aparicion del
	// caracter pedido.
	// Cuando aparezca el caracter que has pedido por primera vez, empezar a contar
	// los caracteres.

	public static void main(String[] args) {

		// Pedir la cadena al usuario

		System.out.println("Introduce una cadena");

		String s = readString();

		// Pedir un caracter al usuario

		System.out.println("¿Qué caracter vas a usar como rango?");

		char c = readChar();

		// Contar los caracteres que hay desde la primera aparicion del caracter hasta
		// la última

		System.out.println("Hay " + contarrango(s, c) + " caracteres en el rango establecido");

	}

	// Funcion que cuenta os caracteres que hay desde la primera aparicion del
	// caracter hasta
	// la última aparicion del mismo.

	public static int contarrango(String s, char c) {

		int apariciones = 0;

		boolean inicio = false;

		for (int i = 0; i <= s.lastIndexOf(c); i++) { // Hasta la última aparacion del caracter.

			if (s.charAt(i) == c) {

				inicio = true;

			}

			if (inicio) {

				apariciones++; // Si el caracter aparece se empieza a contar.

			}

		}

		return apariciones;

	}

}
