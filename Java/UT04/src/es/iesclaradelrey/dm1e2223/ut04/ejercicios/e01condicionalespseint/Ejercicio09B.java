package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e01condicionalespseint;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Escribir un programa que lea un año e indicar si es bisiesto. Un año
 *         es bisiesto si es un número divisible por 4, pero no si es divisible
 *         por 100, excepto que también sea divisible por 400. Esta versión
 *         usmenos if, porque usa condiciones múltiples
 */
public class Ejercicio09B {

	public static void main(String[] args) {
		// Creamos el scanner para leer datos
		Scanner scanner = new Scanner(System.in);

		// Pedimos el número
		System.out.print("Introduce un número: ");
		int numero = Integer.parseInt(scanner.nextLine());

		// Coprobamos si NO es bisiesto. Es más fácil comprobar esto. Son dos
		// condiciones, si se cumple cualquiera de ellas no es bisiesto:
		// - Condición 1 (simple): no es divisible por 4
		// - Condición 2 (compuesta): siendo divisible por 4, lo es también por 100, pero no por 400
		if ((numero % 4 != 0) || ((numero % 4 == 0) && (numero % 100 == 0) && (numero % 400 != 0))) {
			System.out.println("No es bisiesto");
		}else {
			System.out.println("Es bisiesto");
		}

		// Cerramos el escanner
		scanner.close();
	}

}
