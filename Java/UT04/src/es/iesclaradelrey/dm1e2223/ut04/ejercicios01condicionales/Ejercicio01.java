package es.iesclaradelrey.dm1e2223.ut04.ejercicios01condicionales;

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

		System.out.println("Por favor, introduce el primer número entero.");
		int primerNumero = Integer.parseInt(scanner.nextLine());

		System.out.println("Por favor, introduce el segundo número entero.");
		int segundoNumero = Integer.parseInt(scanner.nextLine());

		if (primerNumero > segundoNumero) {
			System.out.println("El primer número es mayor que el segundo");
		} else {
			System.out.println("El primer número NO es mayor que el segundo");
		}

		// Cerramos el scanner
		scanner.close();
	}

}
