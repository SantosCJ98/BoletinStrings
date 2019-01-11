package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej12 {

	// Pedir 2 cadenas.
	// Recorrer la primera cadena en busca de coincidencias para la segunda.
	// Si los caracteres son iguales (dentro del recorrido de la segunda cadena), se
	// incrementa en uno
	// el contador.
	// Mostrar el resultado.

	public static void main(String[] args) {

		System.out.println("Introduce una cadena");

		String s = readString();

		System.out.println("¿Qué cadena quieres buscar?");

		String buscar = readString();

		System.out.println("Resultados: " + coincidencias(s, buscar) + " coincidencias");

	}

	public static int coincidencias(String s, String buscar) {

		boolean encontrado = false;

		char caractersobrante = buscar.charAt(buscar.length() - 1);

		int resultados = 0;

		for (int i = 0; i < s.length(); i++) {

			for (int j = 0; j < buscar.length(); j++) {

				if (s.charAt(i) == buscar.charAt(j) && j == buscar.length() - 1
						&& caractersobrante != buscar.charAt(j)) {
					resultados++;

				}

				else if (s.charAt(i) == buscar.charAt(j) && buscar.length() == 1) {

					resultados++;

				}

				else if (s.charAt(i) == buscar.charAt(j) && j != buscar.length() - 1) {

					encontrado = true;

				}

				else if (s.charAt(i) == buscar.charAt(j) && encontrado == true) {

					encontrado = false;

					resultados++;

				}

			}

		}

		return resultados;

	}

}
