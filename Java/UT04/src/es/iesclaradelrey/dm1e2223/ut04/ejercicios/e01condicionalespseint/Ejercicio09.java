package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e01condicionalespseint;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Escribir un programa que lea un año e indicar si es bisiesto. Un año
 *         es bisiesto si es un número divisible por 4, pero no si es divisible
 *         por 100, excepto que también sea divisible por 400. Esta versión usa
 *         múltiples if / else
 */
public class Ejercicio09 {

	public static void main(String[] args) {
		// Creamos el scanner para leer datos
		Scanner scanner = new Scanner(System.in);

		// Pedimos el número
		System.out.print("Introduce un número: ");
		int numero = Integer.parseInt(scanner.nextLine());

		// Comprobamos si es divisible por 4. Es decir, el resto de la división del
		// número por 4 es cero.
		if (numero % 4 == 0) {
			// Es bisiesto, salvo que sea múltiplo de 100. Otra vez, usamos el resto de la
			// división del número por 100
			if (numero % 100 == 0) {
				// No es bisisesto, salvo que sea múltiplo de 400. Otra vez, resto de división
				// por 400
				if (numero % 400 == 0) {
					System.out.println("Es bisiesto");
				} else {
					System.out.println("No es bisiesto");
				}
			} else {
				System.out.println("Es bisiesto");
			}
		} else {
			// No es bisiesto
			System.out.println("No es bisiesto");
		}

		// Cerramos el escanner
		scanner.close();
	}

}
