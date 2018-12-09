package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej13 {
	
	//Pedir una cadena y contar las palabras separadas por espacios.

	public static void main(String[] args) {
		
		
		int resultados = 0;

	    boolean espalabra = false;
	    
	    System.out.println("Introduce una cadena:");
	    
	    String s1 = readString();

	    for (int i = 0; i < s1.length(); i++) {
	   
	        if (Character.isLetter(s1.charAt(i)) && i != s1.length()-1) {
	        	
	            espalabra = true;
	           
	        }
	            
	            else if (Character.isWhitespace(s1.charAt(i)) && espalabra == true) {
	         
	            resultados++;
	            
	            espalabra = false;
	            
	            }
	           
	      else if (Character.isLetter(s1.charAt(i)) && i == s1.length()-1) {
	    	  
	            resultados++;
	            
	        }
	        
	    }
	    
	    System.out.println("Hay " + resultados + " palabras");;
	    
	}
	
}