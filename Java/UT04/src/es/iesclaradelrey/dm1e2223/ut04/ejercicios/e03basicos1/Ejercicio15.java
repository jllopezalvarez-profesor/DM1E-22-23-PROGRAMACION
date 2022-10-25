package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e03basicos1;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Hacer un programa para calcular el factorial de N (N!=1·2·3·...·N).
 *         Lo calcula dedos formas:
 *         - multiplicando desde 1 hasta el número
 *         - multiplicando desde el número hasta 1
 */
public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero, factorial = 1;

		System.out.println("Introducir numero ");
		numero = scanner.nextInt();

		// Cálculo del factorial ascendentemente
		for (int i = 1; i <= numero; i++)
			factorial = factorial * i;

		System.out.println("El factorial de " + numero + " calculado ascendentemente es " + factorial);

		// Cálculo del factorial descendentemente
		factorial = 1;
		for (int i = numero; i > 1; i--)
			factorial = factorial * i;

		System.out.println("El factorial de " + numero + " calculado descendentemente es " + factorial);
		
		scanner.close();
	}
}