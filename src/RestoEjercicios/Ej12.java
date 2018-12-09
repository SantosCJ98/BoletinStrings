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
		
		for (int i = 0, j = buscar.length(); j <= s1.length(); i++, j++) {
			
			if (buscar.equals(s1.substring(i, j))) {
				
				resultados++;
				
			}
			
		}
		
		
		System.out.println("Se han dado " + resultados + " coincidencias");
		
	}
	
}