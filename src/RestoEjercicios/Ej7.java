package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej7 {
	
	//Pedir una cadena y un numero entero.
	//Recorrer la cadena desde el principio hasta el indice del caracter indicado por el numero.
	//Reconstruir la cadena.
	//Si el numero es mayor que la longitud de la cadena, lanzar excepcion.
	public static void main(String[] args) {
		
		System.out.println("Introduce una cadena:");
		
		String s1 = readString();
		
		String s2 = "";
		
		String aux = "";
		
		System.out.println("Introduce el número de caracteres a copiar");
		
		int n = readInt();
		
		if (n > s1.length()) {
			
			throw new IllegalArgumentException("Has introducido más caracteres que en la cadena");
			
		}
		
		for (int i = 0; i < n; i++) {
			
			aux = String.valueOf(s1.charAt(i));
			
			s2 = s2.concat(aux);
		}
		
		System.out.println(s2);
		
	}

}
