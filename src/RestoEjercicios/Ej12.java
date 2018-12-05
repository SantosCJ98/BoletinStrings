package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej12 {
	
	//Pedir 2 cadenas: la segunda para buscar coincidencias en la primera. Contar las coincidencias.

	public static void main(String[] args) {
		
		int resultados = 0;
		
		System.out.println("Introduce una cadena:");
		
		String s1 = readString();
		
		System.out.println("¿Que cadena vas a buscar?");
		
		String buscar = readString();

		
		for (int i = 0; i <= s1.length() - buscar.length(); i++) {
			
		  for (int j = 0; j < buscar.length(); j++)
		  {
		    if (s1.charAt(i + j) == buscar.charAt(j)) {
		  
		      if (j == buscar.length()-1) {
		     
		        resultados++;
		      
		        break;
		        
		      } 
		      
		    } 
		    
		    else {
		    
		      break;
		    }
		  }
		} 
		
		System.out.println("Se han dado " + resultados + " coincidencias");
		
	}
	
}