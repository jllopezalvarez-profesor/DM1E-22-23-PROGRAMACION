package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e03basicos1;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Hacer un programa para calcular el factorial de N (N!=1·2·3·...·N).
 * 
 *         Calcula el factorial y muestra las operaciones
 */
public class Ejercicio15bis {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;

		System.out.println("Introducir numero ");
		numero = scanner.nextInt();

		System.out.print(numero + "! = ");
		int factorial = 1;
		for (int i = numero; i > 0; i--) {
			factorial = factorial * i;

			// Ponemos el * de la multiplicación salvo en el último, el 1, que ya no se
			// multiplica por nada más.
			if (i != 1)
				System.out.print(i + "*");
			else
				System.out.print(i);
		}

		System.out.println(" = " + factorial);
		scanner.close();
	}
}
