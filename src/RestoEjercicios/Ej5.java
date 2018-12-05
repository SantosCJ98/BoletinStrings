package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej5 {
	
	//Pedir una cadena y contar los caracteres que hay entre la primera y ultima aparicion de un caracter
	public static void main(String[] args) {
		
		int apariciones=0;
		
		boolean inicio = false;
		
		System.out.println("Introduce una cadena");
		
		String s = readString();
		
		System.out.println("¿Qué caracter vas a usar como rango?");
		
		char c = readChar();
		
		for (int i = 0; i <= Character.toLowerCase(s.lastIndexOf(c)); i++) {
			
			if (Character.toLowerCase(s.charAt(i)) == c) {
				
				inicio = true;
				
			}
			
			if (inicio) {
			
			apariciones++;
			
			}
			
		}
		
		System.out.println("Hay " + apariciones + " caracteres entre el limite especificado");
		

	}

}
