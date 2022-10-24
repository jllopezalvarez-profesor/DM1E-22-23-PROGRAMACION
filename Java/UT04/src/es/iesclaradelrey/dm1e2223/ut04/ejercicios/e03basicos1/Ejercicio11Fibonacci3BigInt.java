package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e03basicos1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         La sucesión de Fibonacci se define de la siguiente forma: a1=1 a2=1 …
 *         an=an-1+an-2 para n>2,
 * 
 *         Es decir, los dos primeros son 1 y el resto cada uno es la suma de
 *         los dos anteriores, los primeros son: 1, 1, 2, 3, 5, 8, 13, 21,...
 *         Haz un programa que calcule e imprima N términos de la sucesión, N se
 *         pedirá por teclado.
 */
public class Ejercicio11Fibonacci3BigInt {
	public static void main(String[] args) {
		BigInteger terminoMenor = BigInteger.ONE;
		BigInteger terminoMayor = BigInteger.ONE;
		BigInteger nuevoTermino = BigInteger.ZERO;

		
		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Cuántos términos de la sucesión de Fibonacci quieres calcular?");
		int numTerminos = Integer.parseInt(scanner.nextLine());

		System.out.print("1,1");

		for (int n = 2; n < numTerminos; n++) {
			nuevoTermino = terminoMenor.add(terminoMayor);
			System.out.printf(",%d", nuevoTermino);
			terminoMenor = terminoMayor;
			terminoMayor = nuevoTermino;

			// Cada 10 términos escribo un salto de línea para que se lea más fácil la
			// salida.
			if (n % 5 == 0)
				System.out.println();
		}

		scanner.close();
	}
}
