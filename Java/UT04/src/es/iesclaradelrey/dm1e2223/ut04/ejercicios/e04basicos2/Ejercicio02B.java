

package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e04basicos2;

import java.util.Scanner;

public class Ejercicio02B {

	private static final double INTERES = 0.05;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numMeses = 0;
		double coeficiente = 1;
		while (coeficiente < 2) {
			numMeses++;
			coeficiente = (Math.pow(1 + INTERES, numMeses));
		}
		System.out.printf("Cualquier capital se duplica en %d meses.", numMeses);

		scanner.close();
	}

}
