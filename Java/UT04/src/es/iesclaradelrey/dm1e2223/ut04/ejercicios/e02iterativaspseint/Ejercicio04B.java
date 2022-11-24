package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e02iterativaspseint;

import java.util.Scanner;

/**
 * 
 * Ejercicio 4 Realizar un algoritmo que pida números (se pedirá antes de nada
 * la cantidad de números a introducir). El programa debe informar de cuantos
 * números introducidos son mayores que 0, menores que 0 e iguales a 0.
 *
 */
public class Ejercicio04B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		solucionFor(scanner);

		 solucionWhile(scanner);

		scanner.close();
	}

	private static void solucionFor(Scanner scanner) {
		System.out.print("¿Cuántos números vas a interoducir? ");
		int cantidadNumeros = scanner.nextInt();

		int contadorMenores = 0;
		int contadorMayores = 0;

		for (int i = 0; i < cantidadNumeros; i++) {
			System.out.print("Introduce un número: ");
			int numero = scanner.nextInt();
			if (numero > 0)
				contadorMayores++;
			if (numero < 0)
				contadorMenores++;
		}

		System.out.printf("Mayores que cero: %d\n", contadorMayores);
		System.out.printf("Menores que cero: %d\n", contadorMenores);
		System.out.printf("Cero: %d\n", cantidadNumeros - (contadorMayores + contadorMenores));

	}

	private static void solucionWhile(Scanner scanner) {
		System.out.print("¿Cuántos números vas a interoducir? ");
		int cantidadNumeros = scanner.nextInt();

		int contadorMenores = 0;
		int contadorMayores = 0;

		int cuantosLlevoProcesados = 0;
		while (cuantosLlevoProcesados < cantidadNumeros) {
			System.out.print("Introduce un número: ");
			int numero = scanner.nextInt();
			if (numero > 0)
				contadorMayores++;
			if (numero < 0)
				contadorMenores++;
			cuantosLlevoProcesados++;
		}

		System.out.printf("Mayores que cero: %d\n", contadorMayores);
		System.out.printf("Menores que cero: %d\n", contadorMenores);
		System.out.printf("Cero: %d\n", cantidadNumeros - (contadorMayores + contadorMenores));

	}
}
