package es.iesclaradelrey.dm1e2223.ut04.ejercicios01condicionales;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Algoritmo que pida tres números y los muestre ordenados (de mayor a
 *         menor).
 */
public class Ejercicio08C {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int primerNumero = Integer.parseInt(scanner.nextLine());

		System.out.print("Introduce el segundo número: ");
		int segundoNumero = Integer.parseInt(scanner.nextLine());

		System.out.print("Introduce el tercer número: ");
		int tercerNumero = Integer.parseInt(scanner.nextLine());

		// Si el primero es el mayor de todos...
		if (primerNumero >= segundoNumero && primerNumero >= tercerNumero) {
			// Comparamos el segundo y tercero
			if (segundoNumero >= tercerNumero) {
				System.out.printf("Los números ordenados son %d, %d, %d\n", primerNumero, segundoNumero, tercerNumero);
			} else {
				System.out.printf("Los números ordenados son %d, %d, %d\n", primerNumero, tercerNumero, segundoNumero);
			}
		}

		// Si el segundo es el mayor de todos...
		if (segundoNumero >= primerNumero && segundoNumero >= tercerNumero) {
			// Comparamos el primero y el tercero
			if (primerNumero >= tercerNumero) {
				System.out.printf("Los números ordenados son %d, %d, %d\n", segundoNumero, primerNumero, tercerNumero);
			} else {
				System.out.printf("Los números ordenados son %d, %d, %d\n", segundoNumero, tercerNumero, primerNumero);
			}
		}

		// Si el tercer es el mayor de todos...
		if (tercerNumero >= primerNumero && tercerNumero >= segundoNumero) {
			// Comparamos el primero y el segundo
			if (primerNumero >= segundoNumero) {
				System.out.printf("Los números ordenados son %d, %d, %d\n", tercerNumero, primerNumero, segundoNumero);
			} else {
				System.out.printf("Los números ordenados son %d, %d, %d\n", tercerNumero, segundoNumero, primerNumero);
			}
		}
		
		scanner.close();
	}

}
