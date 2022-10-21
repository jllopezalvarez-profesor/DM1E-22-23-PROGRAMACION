package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e03basicos1;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Se dice que un número N es perfecto si la suma de sus divisores,
 *         excluido el propio número es N. Por ejemplo, 28 es perfecto, pues sus
 *         divisores son: 1, 2, 4, 7 y 14 y su suma es 1+2+4+7+14=28. Haz un
 *         programa que dado un número N nos diga si es o no perfecto. Cambia el
 *         programa para que siga pidiendo números mientras el número
 *         introducido sea distinto de cero, que será la señal para parar el
 *         programa.
 */
public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce el número: ");
		int numero = scanner.nextInt();
		while (numero != 0) {

			int suma = 0;

			for (int i = 1; i <= numero / 2; i++) {
				if (numero % i == 0) {
					suma += i;
				}

			}

			if (suma == numero) {
				System.out.printf("%d es un número perfecto.\n", numero);
			} else {
				System.out.printf("%d NO es un número perfecto.\n", numero);

			}
			System.out.println("Introduce el número: ");
			numero = scanner.nextInt();
		}

		scanner.close();
	}

}
