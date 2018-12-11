package RestoEjercicios;

import static teclado.Teclado.*;

public class Ej12 {
	
	//Pedir 2 cadenas.
	//Recorrer la primera cadena, cogiendo el numero de caracteres que tiene la segunda, y asi hasta llegar al final de la primera.
	//Si la porcion de cadena actual es igual a la segunda cadena, incrementar el contador en uno.
	
	public static void main(String[] args) {
		
		System.out.println("Introduce una cadena");
		
		String s = readString();
		
		System.out.println("¿Qué cadena quieres buscar?");
		
		String buscar = readString();
		
		System.out.println("Se han encontrado " + buscarcadena(s, buscar) + " resultados");
		
	}
	
	public static int buscarcadena (String s1, String buscar) {
		
		int resultados = 0;
	
		
		for (int i = 0, j = buscar.length(); j <= s1.length(); i++, j++) {
			
			if (buscar.equals(s1.substring(i, j))) {
				
				resultados++;
				
			}
			
		}
		
		
		return resultados;
		
		
	}
	
}