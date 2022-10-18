package es.iesclaradelrey.dm1e2223.ut04.ejercicios01condicionalespseint;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Programa que lea una cadena por teclado y compruebe si es una letra
 *         mayúscula. Es decir, si su longitud es 1 y si es mayúscula (se deben
 *         cumplir ambas condiciones)
 */
public class Ejercicio06B {

	public static void main(String[] args) {
		// Creamos el scanner para leer datos
		Scanner scanner = new Scanner(System.in);

		// Pedimos la cadena
		System.out.println("Por favor, introduce una letra.");
		String cadena = scanner.nextLine();

		// Comprobamos primero si la cadena tiene la longitud adecuada
		if (cadena.length() != 1) {
			// Es de menor longitud (cadena vacía) o mayor (más de un caracter)
			System.out.println("Tienes que introducir una sóla letra");
		} else {
			// Es exáctamente de longitud 1
			// Comprobamos si el primer (y único) caracter de la cadena está en mayúsculas.
			// Para extraer el caracter usamos el método charAt de String, que obtiene el
			// caracter en una posición de la cadena, comenzando a contar en 0 (el primer
			// caracter está en la posicón 0). Para comprobar si es mayúscula usamos un
			// método estático de la clase Character, que recibe el caracter extraído y nos
			// dice si está en mayúsculas
			if (Character.isUpperCase(cadena.charAt(0))) {
				System.out.println("La letra es una mayúscula");
			} else {
				System.out.println("La letra no es una mayúscula");
			}
		}

		// Cerramos el scanner
		scanner.close();
	}

}
