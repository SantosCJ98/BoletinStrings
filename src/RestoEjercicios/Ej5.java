package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej5 {
	
	//Pedir una cadena.
	//Pedir un caracter.
	//Recorrer la cadena, caracter a caracter, hasta la ultima aparicion del caracter pedido.
	//Cuando aparezca el caracter que has pedido por primera vez, empezar a contar los caracteres.
	
	public static void main(String[] args) {
		
		int apariciones=0;
		
		boolean inicio = false;
		
		System.out.println("Introduce una cadena");
		
		String s = readString();
		
		System.out.println("¿Qué caracter vas a usar como rango?");
		
		char c = readChar();
		
		for (int i = 0; i <= s.lastIndexOf(c); i++) {
			
			if (s.charAt(i) == c) {
				
				inicio = true;
				
			}
			
			if (inicio) {
			
			apariciones++;
			
			}
			
		}
		
		System.out.println("Hay " + apariciones + " caracteres entre el limite especificado");
		

	}

}
