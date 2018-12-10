package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej13b {
	
	//Pedir una cadena y contar las palabras separadas por espacios.

	public static void main(String[] args) {
		
		
		int resultados = 0;
		
		boolean palabra = false;
	    
	    System.out.println("Introduce una cadena:");
	    
	    String s1 = readString();
	    
	    for (int i = 0; i < s1.length(); i++) {
	    	
	    if (Character.isLetter(s1.charAt(i)) && i != s1.length()-1) {
	    	
	    	palabra = true;
	    	
	    }
	    
	    else if (Character.isWhitespace(s1.charAt(i)) && palabra == true) {
	    	
	    	resultados++;
	    	
	    	palabra = false;
	    	
	    }
	    
	    else if (Character.isLetter(s1.charAt(i)) && i == s1.length()-1) {
	    	
	    	resultados++;
	    }
	    	
	  	}

	    System.out.println("Hay " + resultados + " palabras");
	    
	}
	
}