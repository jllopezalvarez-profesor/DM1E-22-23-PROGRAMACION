package es.iesclaradelrey.dm1e2223.extras.aceptaelreto;

import java.util.Scanner;

public class Ejercicio617SpaceInvaders {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numCasos = Integer.parseInt(scanner.nextLine());

		while (numCasos > 0) {
			procesarCaso(scanner);
			numCasos--;
		}

		scanner.close();
	}

	private static void procesarCaso(Scanner scanner) {
		int numFilas = Integer.parseInt(scanner.nextLine());
		char[][] letras = new char[numFilas][];

		for (int i = 0; i < letras.length; i++) {
			letras[i] = scanner.nextLine().toCharArray();
		}

		StringBuilder sb = new StringBuilder();
		for (int columna = 0; columna < 3; columna++) {
			for (int fila = 0; fila < numFilas; fila++) {
				sb.append(letras[fila][columna]);
			}
		}
		System.out.println(sb.toString());
	}
}
