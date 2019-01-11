package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej10 {
	
	//Pedir una cadena. Recorrer la cadena, caracter a caracter, desde el principio hasta el final.
	//Sumar los caracteres numericos.
	public static void main(String[] args) {
		
		System.out.println("Introduce una cadena");
		
		String s = readString();
		
		System.out.println("La suma de sus caracteres numéricos es " + sumarcharsnumericos(s));
			
		}
	


public static int sumarcharsnumericos (String s1) {
	
	int suma=0;
	
	for (int i = 0; i < s1.length(); i++) {
		
		char c = s1.charAt(i);
		
		if (Character.isDigit(c)) {
			
			suma+=Character.getNumericValue(c);
			
		}
	}
	
	return suma;
	
}
	
}
	


