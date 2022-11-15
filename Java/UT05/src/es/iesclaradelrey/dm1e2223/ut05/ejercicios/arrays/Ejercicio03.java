package es.iesclaradelrey.dm1e2223.ut05.ejercicios.arrays;

import java.util.Scanner;

/**
 * 
 * Escribe un programa que: • Pregunte cuantos números vamos a procesar. • Cree
 * un array del tamaño especificado. • Pida al usuario que introduzca los
 * números uno a uno, y los vaya almacenando en el array. • Tome los números que
 * el usuario ha introducido y los muestre en la consola. Primero desde el
 * primero al último (el mismo orden en que los introdujo el usuario) y luego
 * desde el último al primero.
 *
 */
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Cuántos nombres vas a procesar?");
		int cantidadNumeros = Integer.parseInt(scanner.nextLine());
		// Si se usa nextInt, para que no falle (lea cadena vacía) la lectura de la
		// primera cadena, tendríamos que hacer:
		// - int cantidadNumeros = scanner.nextInt();
		// - scanner.nextLine() // Esto elimina el salto de línea que nextInt no consume

		String[] nombres = new String[cantidadNumeros];

		for (int i = 0; i < nombres.length; i++) {
			System.out.printf("Dime el nombre para la posición %d: ", i);
			nombres[i] = scanner.nextLine();
		}

		for (String nombre : nombres) {
			System.out.printf("%s, ", nombre);
		}
		System.out.println("\n");

		System.out.println();
		for (int i = nombres.length - 1; i >= 0; i--) {
			String nombre = nombres[i];
			System.out.printf("%s, ", nombre);
		}
		System.out.println("\n");

		scanner.close();
	}

}
