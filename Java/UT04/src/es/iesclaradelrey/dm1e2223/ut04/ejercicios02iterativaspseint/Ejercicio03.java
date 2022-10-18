package es.iesclaradelrey.dm1e2223.ut04.ejercicios02iterativaspseint;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero;
		int cuentaNumeros = 0;
		int suma = 0;

		do {
			System.out.println("Introduce un número. Cero para terminar... ");
			numero = Integer.parseInt(scanner.nextLine());
			if (numero != 0) {
				cuentaNumeros++;
				suma += numero;
			}

		} while (numero != 0);

		System.out.printf("Cuenta: %d, suma: %d\n\n", cuentaNumeros, suma);

		cuentaNumeros = 0;
		suma = 0;
		System.out.println("Introduce un número. Cero para terminar... ");
		numero = Integer.parseInt(scanner.nextLine());
		while (numero != 0) {
			cuentaNumeros++;
			suma += numero;
			System.out.println("Introduce un número. Cero para terminar... ");
			numero = Integer.parseInt(scanner.nextLine());
		}

		System.out.printf("Cuenta: %d, suma: %d\n\n", cuentaNumeros, suma);

	}

}
