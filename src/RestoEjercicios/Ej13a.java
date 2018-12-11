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
		
		System.out.println("Introduce una cadena");
		
		String s = readString();
		
		System.out.println("La cadena tiene " + contarpalabras(s) + " palabra(s)");
			
		}
		
	


public static int contarpalabras (String s1) {
	
	int resultados = 0;
    
    int numespacios = 0;

    for (int i = 0; i < s1.length(); i++) {
    		
    		if (!Character.isWhitespace(s1.charAt(i)) && i == s1.length()-1) {
    			
    			resultados++;
    		
    	}
    		
    		else if (Character.isWhitespace(s1.charAt(i)) && i != 0) {
    			
    			resultados++;
    			
    	}
    		
    		if (!Character.isWhitespace(s1.charAt(i))) {
    			
    			numespacios = 0;
    			
    		}
    		
    		else if (Character.isWhitespace(s1.charAt(i))) {
    			
    			numespacios++;
    			
    		}
    		
    		if (numespacios > 1) {
    			
    			throw new IllegalArgumentException("Error: las palabras deben ir separadas por UN SOLO espacio");
    			
    			
    			
    		}
       
    }
   
    
    return resultados;
 
    
}
	
}