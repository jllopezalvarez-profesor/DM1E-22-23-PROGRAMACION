package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e01condicionalespseint;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Programa que lea una cadena por teclado y compruebe si es una letra
 *         mayúscula. Es decir, si su longitud es 1 y si es mayúscula (se deben
 *         cumplir ambas condiciones)
 */
public class Ejercicio06 {

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
			// Comprobamos si la cadena es igual que sí misma al pasarla a mayúsculas
			// Defecto de esta solución: para los números, caracteres especiales, símbolos,
			// nos va a decir que está en mayúsculas.
			if (cadena.equals(cadena.toUpperCase())) {
				// Recordad que cadena.toUpperCase no cambia la variable cadena, devuelve una
				// nueva cadena con el mismo contenido, pero en mayúsculas.
				System.out.println("La letra es una mayúscula");
			} else {
				System.out.println("La letra no es una mayúscula");
			}
		}

		// Cerramos el scanner
		scanner.close();
	}

}
