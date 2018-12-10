package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej13a {
	
	//Pedir una cadena.
	//Recorrer la cadena, caracter a caracter, desde el principio hasta el final.
	
	//Si un caracter es una letra, y es el ultimo caracter, se incrementa el contador de palabras.
	
	//Si un caracter es un espacio, y NO es el ultimo caracter, se incrementa el contador de palabras.
	
	//Los espacios incrementan el contador de espacios.
	
	//Las letras ponen el contador de espacios a 0.
	
	//Si hay mas de un espacio en la cadena, lanzar excepcion.


	public static void main(String[] args) {
		
		
		int resultados = 0;
	    
	    System.out.println("Introduce una cadena:");
	    
	    String s1 = readString();
	    
	    int numespacios = 0;
	    
	    boolean error = false;

	    for (int i = 0; i < s1.length(); i++) {
	    		
	    		if (Character.isLetter(s1.charAt(i)) && i == s1.length()-1) {
	    			
	    			resultados++;
	    		
	    	}
	    		
	    		else if (Character.isWhitespace(s1.charAt(i)) && i != 0) {
	    			
	    			resultados++;
	    			
	    	}
	    		
	    		if (Character.isLetter(s1.charAt(i))) {
	    			
	    			numespacios = 0;
	    			
	    		}
	    		
	    		else if (Character.isWhitespace(s1.charAt(i))) {
	    			
	    			numespacios++;
	    			
	    		}
	    		
	    		if (numespacios > 1) {
	    			
	    			error = true;
	    			
	    			throw new IllegalArgumentException("Error: las palabras deben ir separadas por UN SOLO espacio");
	    			
	    			
	    			
	    		}
	       
	    }
	    
	    if (error == false) {
	    
	    System.out.println("Hay " + resultados + " palabras");
	    
	    }
	    
	}
	
}