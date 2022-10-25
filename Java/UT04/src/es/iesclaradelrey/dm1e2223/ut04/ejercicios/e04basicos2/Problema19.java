package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e04basicos2;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Haz un programa que imprima el triángulo de Floyd hasta un valor
 *         dado. El triángulo contiene los números naturales correlativos, uno
 *         en la primera línea, dos en la segunda, etc.; es decir, en la fila
 *         n-ésima aparecen n valores. Ejemplo: 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5
 * 
 */
public class Problema19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce el número de filas que quieres que mida el triángulo: ");
		int numFilas = Integer.parseInt(scanner.nextLine());

		for (int fila = 1; fila <= numFilas; fila++) {
			int numeroColumnas = fila;
			for (int columna = 1; columna <= numeroColumnas; columna++) {
				System.out.print(columna);
			}
			System.out.println();
		}

		scanner.close();

	}

}
