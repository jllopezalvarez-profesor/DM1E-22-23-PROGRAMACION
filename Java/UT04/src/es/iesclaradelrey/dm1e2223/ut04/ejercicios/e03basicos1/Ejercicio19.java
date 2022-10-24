package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e03basicos1;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         19. Hacer un programa que lea por teclado un numero N e imprima un
 *         triángulo rectángulo, de N filas. EJ: N=5, se pintará lo siguiente:
 * 
 *         · ·· ··· ···· ·····
 * 
 */
public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce el número de filas que quieres que mida el triángulo: ");
		int numFilas = Integer.parseInt(scanner.nextLine());

		for (int fila = 1; fila <= numFilas; fila++) {
			int numeroEstrellas = fila;
			for (int columna = 0; columna < numeroEstrellas; columna++) {
				System.out.print("*");
			}
//			System.out.print("*".repeat(fila));
			System.out.println();
		}

		scanner.close();

	}

}
