package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej13b {
	
	//Pedir una cadena.
	//Recorrer la cadena, caracter a caracter, desde el inicio, hasta el final.
	//Si un caracter es una letra, y es el ultimo caracter, se incrementa en uno el contador de palabras.
	//Si un caracter es una letra, y NO es el ultimo caracter, palabra se convierte true.
	//Si un caracter es un espacio, y palabra es true, palabra se convierte en false y se incrementa en uno el contador de palabras.

	public static void main(String[] args) {
		
		
		int resultados = 0;
	    
	    System.out.println("Introduce una cadena:");
	    
	    String s1 = readString();
	    
	    boolean palabra = false;

	    for (int i = 0; i < s1.length(); i++) {
	    		
	    		if (Character.isLetter(s1.charAt(i)) && i == s1.length()-1) {
	    			
	    			resultados++;
	    		
	    	}
	    		
	    		else if (Character.isLetter(s1.charAt(i)) && i != s1.length()-1) {
	    			
	    			palabra = true;
	    			
	    		}
	    		
	    		else if (Character.isWhitespace(s1.charAt(i)) && palabra == true) {
	    			
	    			palabra = false;
	    			
	    			resultados++;
	    			
	    	}
	    		
	    		
	    		
	       
	    }
	    
	    System.out.println("Hay " + resultados + " palabras");
	    
	    }
	    
}