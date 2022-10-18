package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e01condicionalespseint;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Algoritmo que pida un número y diga si es positivo, negativo o 0.
 */
public class Ejercicio02 {

	public static void main(String[] args) {
		// Creamos el scanner para leer datos
		Scanner scanner = new Scanner(System.in);

		// Pedimos el número
		System.out.println("Por favor, introduce un número entero.");
		int numero = Integer.parseInt(scanner.nextLine());

		// Comparamos con cero para saber si es positivo, negativo o cero.
		if (numero > 0) {
			// Mayor que 0. Es positivo
			System.out.println("El número es positivo");
		} else if (numero < 0) {
			// Menor que 0. Es negativo
			System.out.println("El número es negativo");
		} else {
			// Ni positivo ni negativo, es 0
			System.out.println("El número es un cero");
		}

		// Cerramos el scanner
		scanner.close();
	}

}
