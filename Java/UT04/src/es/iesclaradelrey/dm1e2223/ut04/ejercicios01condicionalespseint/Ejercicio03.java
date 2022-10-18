package es.iesclaradelrey.dm1e2223.ut04.ejercicios01condicionalespseint;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Escribe un programa que lea un número e indique si es par o impar.
 */
public class Ejercicio03 {

	public static void main(String[] args) {

		// Creamos el scanner para leer datos
		Scanner scanner = new Scanner(System.in);

		// Pedimos el número
		System.out.println("Por favor, introduce un número entero.");
		int numero = Integer.parseInt(scanner.nextLine());

		// Calculamos el resto de la división entera (%) entre 2.
		// Los números pares, al dividir por 2, dan de resto 0.
		int resto = numero % 2;
		// La variable resto valdrá 0 para los números pares y 1 para los impares

		// Comprobamos el resto con if
		if (resto == 0) {
			// Es par
			System.out.println("Es par");
		} else {
			// Es impar
			System.out.println("Es impar");
		}

		// Cerramos el scanner
		scanner.close();
	}

}
