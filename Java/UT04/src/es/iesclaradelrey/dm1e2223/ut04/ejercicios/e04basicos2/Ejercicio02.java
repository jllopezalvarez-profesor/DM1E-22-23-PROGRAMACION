package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e04basicos2;

import java.util.Scanner;

public class Ejercicio02 {

	private static final double INTERES = 0.05;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce el capital inicial");
		double capitalInicial = scanner.nextDouble();
		double capitalFinal = capitalInicial;
		int numMeses = 0;
		while (capitalFinal < capitalInicial * 2) {
			numMeses++;
			capitalFinal = capitalInicial * (Math.pow(1 + INTERES, numMeses));
			System.out.println(capitalFinal);
		}
		System.out.printf("El capital final es %.2f y se ha duplicado en %d meses.", capitalFinal, numMeses);

		scanner.close();
	}

}
