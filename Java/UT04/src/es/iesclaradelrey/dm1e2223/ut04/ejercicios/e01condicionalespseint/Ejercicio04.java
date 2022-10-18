package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e01condicionalespseint;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Crea un programa que pida al usuario dos números y muestre su
 *         división si el segundo no es cero, o un mensaje de aviso en caso
 *         contrario.
 */
public class Ejercicio04 {

	public static void main(String[] args) {
		// Creamos el scanner para leer datos
		Scanner scanner = new Scanner(System.in);

		// Pedimos el primer número
		System.out.println("Por favor, introduce el primer número (dividendo).");
		double dividendo = Integer.parseInt(scanner.nextLine());

		// Pedimos el segundo número
		System.out.println("Por favor, introduce el segundo número (divisor).");
		double divisor = Integer.parseInt(scanner.nextLine());

		// Comprobamos si el divisor es cero
		if (divisor == 0) {
			System.out.println("El divisor es cero. No se puede hacer la división.");
		} else {
			// Usamos printf porque es más cómodo que andar concatenando con +
			// Además nos permite indicar que se redondee a dos decimales al respresentar
			// los números. El \n indica que queremos un salto de línea al final
			System.out.printf("El resultado de dividir %.2f entre %.2f es %.2f\n", dividendo, divisor, dividendo / divisor);
		}

		// Cerramos el scanner
		scanner.close();
	}

}
