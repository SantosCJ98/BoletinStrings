package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej7 {
	
	//Pedir una cadena y un numero entero.
	//Recorrer la cadena desde el principio hasta el indice del caracter indicado por el numero.
	//Reconstruir la cadena.
	//Si el numero es mayor que la longitud de la cadena, lanzar excepcion.
	public static void main(String[] args) {
		
		System.out.println("Introduce una cadena");
		
		String s = readString();
		
		System.out.println("¿Cuantos caracteres vas a sacar?");
		
		int n = readRange(0, s.length(), Rangos.MINEXMAXIN);
		
		System.out.println("La cadena resultante es " + primeroscaracteres(s, n));
		
	}



public static String primeroscaracteres (String s1, int n) {
	
	String s2 = "";
	
	for (int i = 0; i < n; i++) {
		
		s2 = s2.concat(String.valueOf(s1.charAt(i)));
	}
	
	return s2;
	
	
}

}
