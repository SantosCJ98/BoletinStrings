package Ej1;

import static teclado.Teclado.readString;

public class Ej1j {

	// Pedir una cadena por teclado y comprobar que empieza por vocal (puede tener
	// mas letras)
	// Si eso ocurre, devolver true. En caso contrario devolver false
	public static void main(String[] args) {

		System.out.println("Introduce una cadena:");

		String s = readString();

		if (funcion(s)) {

			System.out.println("La cadena es valida");
		}

		else {

			System.out.println("La cadena no es valida");

		}

	}

	public static boolean funcion(String s) {

		if (s.matches("([aeiouAEIOU])+[a-z]*+")) {

			return true;

		}

		else {

			return false;
		}

	}

}
