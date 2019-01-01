package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej7 {

	// Pedir una cadena y un numero entero.
	// Recorrer la cadena desde el principio hasta el indice del caracter indicado
	// por el numero.
	// Reconstruir la cadena.
	public static void main(String[] args) {

		// Pedir cadena al usuario

		System.out.println("Introduce una cadena");

		String s = readString();

		// Preguntar al usuario cuantos caracteres quiere sacar.

		System.out.println("¿Cuantos caracteres vas a sacar?");

		int n = readRange(0, s.length(), Rangos.MINEXMAXIN); // Min 1, Max toda la cadena.

		// Mostrar resultado

		System.out.println("La cadena resultante es " + primeroscaracteres(s, n));

	}

	// Función que saca los n primeros caracteres de una cadena

	public static String primeroscaracteres(String s1, int n) {

		String s2 = "";

		for (int i = 0; i < n; i++) {

			s2 = s2.concat(String.valueOf(s1.charAt(i)));
		}

		return s2;

	}

}
