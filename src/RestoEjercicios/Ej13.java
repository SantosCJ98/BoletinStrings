package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej13 {
	
	//Pedir una cadena y contar las palabras separadas por espacios.

	public static void main(String[] args) {
		
		
		int numpalabras = 0;

	    boolean bolpalabra = false;
	    
	    System.out.println("Introduce una cadena:");
	    
	    String s1 = readString();
	    
	    int finpalabra = s1.length() - 1;

	    for (int i = 0; i < s1.length(); i++) {
	   
	        if (Character.isLetter(s1.charAt(i)) && i != finpalabra) {
	            bolpalabra = true;
	           
	        } else if (!Character.isLetter(s1.charAt(i)) && bolpalabra) {
	            numpalabras++;
	            bolpalabra = false;
	           
	        } else if (Character.isLetter(s1.charAt(i)) && i == finpalabra) {
	            numpalabras++;
	        }
	    }
	    
	    System.out.println("Hay " + numpalabras + " palabras");;
	    
	}
	
}