package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej6 {
	
	//Pedir 2 cadenas. Concatenarlas.

	public static void main(String[] args) {
	
		System.out.println("Introduce una cadena:");
		
		String s1 = readString();
		
		System.out.println("Introduce otra cadena:");
		
		String s2 = readString();
		
		String s3 = s1 + s2;
		
		System.out.println(s3);
		
		

	}

}
