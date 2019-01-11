package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej6 {
	
	//Pedir 2 cadenas. Concatenarlas.

	public static void main(String[] args) {
	
		
		System.out.println("Inserta una cadena");
		
		String s1 = readString();
		
		System.out.println("Inserta otra cadena");
		
		String s2 = readString();
		
		System.out.println("La cadena resultante es " + concatenar(s1, s2));
		
		
		

	}



public static String concatenar (String s1, String s2) {
	
	String res = "";
	
	for (int i = 0; i < s1.length(); i++) {
			
			res = res.concat(String.valueOf(s1.charAt(i)));
			
		
	}
	
	for (int i = 0; i < s2.length(); i++) {
		
			res = res.concat(String.valueOf(s2.charAt(i)));
		
	
	}
	
	return res;
	
	
}

}
