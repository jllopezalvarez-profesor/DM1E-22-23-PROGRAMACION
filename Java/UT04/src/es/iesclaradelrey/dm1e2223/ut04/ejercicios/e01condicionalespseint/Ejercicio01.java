package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e01condicionalespseint;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Algoritmo que pida dos números e indique si el primero es mayor que
 *         el segundo o no.
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		// Creamos el scanner para leer datos
		Scanner scanner = new Scanner(System.in);

		// Pedimos el primer número
		System.out.println("Por favor, introduce el primer número entero.");
		int primerNumero = Integer.parseInt(scanner.nextLine());

		// Pedimos el segundo número
		System.out.println("Por favor, introduce el segundo número entero.");
		int segundoNumero = Integer.parseInt(scanner.nextLine());

		// Comparamos los números. 
		if (primerNumero > segundoNumero) {
			// El primero es mayor que el segundo
			System.out.println("El primer número es mayor que el segundo");
		} else {
			// En caso contrario
			System.out.println("El primer número NO es mayor que el segundo");
		}

		// Cerramos el scanner
		scanner.close();
	}

}
