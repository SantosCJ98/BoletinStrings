package RestoEjercicios;

import static teclado.Teclado.*;

import teclado.Teclado.Rangos;

public class Ej8 {

	// Pedir una cadena y un numero entero.
	// Recorrer la cadena desde un punto inicial (longitud - numero) hasta el final.
	// Si el numero es mayor que la longitud de la cadena, lanzar excepcion.
	// Reconstruir la cadena.

	public static void main(String[] args) {

		// Pedir cadena al usuario

		System.out.println("Introduce una cadena");

		String s = readString();

		// Preguntar al usuario cuantos caracteres quiere sacar.

		System.out.println("¿Cuantos caracteres vas a sacar?");

		int n = readRange(0, s.length(), Rangos.MINEXMAXIN);// Min 1, Max toda la cadena.

		// Mostrar resultado

		System.out.println("La cadena resultante es " + ultimoscaracteres(s, n));

	}

	// Funcion que saca los n ultimos caracteres de una cadena.

	public static String ultimoscaracteres(String s, int n) {

		String s2 = "";

		int puntoinicial = s.length() - n;

		for (int i = puntoinicial; i < s.length(); i++) {

			s2 = s2.concat(String.valueOf(s.charAt(i)));
		}

		return s2;

	}

}
