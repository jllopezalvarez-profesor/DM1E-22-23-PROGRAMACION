package es.iesclaradelrey.dm1e2223.ut04.ejercicios02iterativaspseint;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Cuántos números vas a introducir");
		int cuantosNumeros = Integer.parseInt(scanner.nextLine());

		int mayores = 0;
		int menores = 0;
		int iguales = 0;

		for (int i = 0; i < cuantosNumeros; i++) {
			System.out.println("Introduce un número");
			int numero = Integer.parseInt(scanner.nextLine());
			if (numero > 0)
				mayores++;
			else if (numero < 0)
				menores++;
			else
				iguales++;
		}

		System.out.printf("Había %d mayores que cero, %d menores y %d iguales a cero", mayores, menores, iguales);

		scanner.close();

	}

}
