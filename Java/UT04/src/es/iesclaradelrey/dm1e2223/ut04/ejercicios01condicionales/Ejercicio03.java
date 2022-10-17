package es.iesclaradelrey.dm1e2223.ut04.ejercicios01condicionales;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		int numero = Integer.parseInt(sc.nextLine());

		if (numero % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");

		}

		sc.close();

	}

}
