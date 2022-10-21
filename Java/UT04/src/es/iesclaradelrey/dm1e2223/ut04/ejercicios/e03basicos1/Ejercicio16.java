package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e03basicos1;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		int n; // Número de términos a generar
		int a; // primer término
		int r; // razón

		int terminoActual;
		int suma = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce el número de términos: ");
		n = scanner.nextInt();
		System.out.println("Introduce el primer término: ");
		a = scanner.nextInt();
		System.out.println("Introduce la razón geométrica: ");
		r = scanner.nextInt();

		terminoActual = a;

		for (int i = 0; i < n; i++) {
			System.out.println(terminoActual);
			suma = suma + terminoActual;
			terminoActual = terminoActual * r;
		}

		System.out.printf("La suma de los términos es %d", suma);
		scanner.close();
	}

}
