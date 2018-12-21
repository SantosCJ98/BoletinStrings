package Ej1;

import static teclado.Teclado.readString;

public class Ej1f {

	// Pedir una cadena por teclado y comprobar que sea un número entre 0 y 299.
	// Si eso ocurre, devolver true. En caso contrario devolver false
	public static void main(String[] args) {

		System.out.println("Introduce una cadena:");

		String s = readString();

		if (numero(s)) {

			System.out.println("La cadena es valida");
		}

		else {

			System.out.println("La cadena no es valida");

		}

	}

	public static boolean numero(String s) {

		if (s.matches("[0-2]?+[0-9]?+[0-9]?")) {

			return true;

		}

		else {

			return false;
		}

	}

}
