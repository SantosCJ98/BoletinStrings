package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej13a {
	
	//Pedir una cadena y contar las palabras separadas por espacios.

	public static void main(String[] args) {
		
		
		int resultados = 0;
	    
	    System.out.println("Introduce una cadena:");
	    
	    String s1 = readString();
	    
	    for (int i = 0; i < s1.length(); i++) {
	    	
	    if ((Character.isWhitespace(s1.charAt(i)))) {
	  
	    	
	    }
	    	
	    if (!(Character.isWhitespace(s1.charAt(i)) && i == 0)) {
	    	
	    	if (Character.isWhitespace(s1.charAt(i))) {
	    		
	    		resultados++;
	    		
	    	}
	    	
	    	else if (Character.isLetter(s1.charAt(i)) && i == s1.length()-1) {
	    		
	    		resultados++;
	    		
	    	}
	    	
	    }
	    	
	  	}

	    System.out.println("Hay " + resultados + " palabras");
	    
	}
	
}