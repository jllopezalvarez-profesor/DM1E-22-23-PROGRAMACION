package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e03basicos1;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Hacer un programa que lea N números (se piden al usuario), calcule la
 *         suma de los pares y el producto de los impares y escriba ambos
 *         resultados.
 */
public class Ejercicio13 {
	public static void main(String[] args) {
		// Abrir Scanner
		Scanner scanner = new Scanner(System.in);

		// Pedir al usuario cuántos números
		System.out.println("¿Cuántos números quieres procesar?");
		int cantidadNumeros = Integer.parseInt(scanner.nextLine());

		int suma = 0;
		int multipicacion = 1;

		// Repetir para el número que nos ha dicho
		for (int i = 1; i <= cantidadNumeros; i++) {
			// Pedir un número
			System.out.println("Introduce un número para la iteración " + i);
			int numero = Integer.parseInt(scanner.nextLine());
			
			// Según sea par o no sumarlo o multiplicarlo
			if (numero % 2 == 0) {
				// Es par
				suma = suma + numero; // suma += numero;
			} else {
				// Es impar
				multipicacion = multipicacion * numero; // multiplicacion *= numero;
			}
		}

		// Mostrar el resultado
		System.out.printf("La suma es %d y el producto es %d", suma, multipicacion);

		// Cerramos el Scanner
		scanner.close();
	}
}
