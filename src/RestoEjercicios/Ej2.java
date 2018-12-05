package RestoEjercicios;

import static teclado.Teclado.*;

//Pedir por teclado una cadena y reemplazar los espacios por caracter vacio.
public class Ej2 {
	
	public static void main (String args[]) {
		
		System.out.println("Introduce una cadena:");
		
		String s1 = readString();
		
		String s2 = s1.replace(' ', '\uffff');
		
		System.out.println("La nueva cadena es " + s2);
		
	}
	
	
		
		
}
