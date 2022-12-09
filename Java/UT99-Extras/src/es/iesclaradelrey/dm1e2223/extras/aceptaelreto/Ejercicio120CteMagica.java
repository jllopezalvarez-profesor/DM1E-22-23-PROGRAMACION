package es.iesclaradelrey.dm1e2223.extras.aceptaelreto;

import java.util.Scanner;

public class Ejercicio120CteMagica {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();

		while (n != 0) {
			System.out.println(calculaCteMagica(n, k));
			n = scanner.nextInt();
			k = scanner.nextInt();
		}

		scanner.close();
	}

	private static int calculaCteMagica(int n, int k) {
		if (n == 1)
			return k;

		int[][] matriz = new int[n][n];

		inicializarMatriz(matriz);

		int fila = 0;
		int columna = n / 2;
		boolean fin = false;
		while (!fin) {
			matriz[fila][columna] = k;
			k++;

			//imprimirMatriz(matriz);

			int nuevaFila = fila - 1;
			if (nuevaFila < 0)
				nuevaFila = n - 1;
			int nuevaColumna = (columna + 1) % n;
			if (matriz[nuevaFila][nuevaColumna] >= 0) {
				nuevaColumna = columna;
				nuevaFila = (fila + 1) % n;
			}
			if (matriz[nuevaFila][nuevaColumna] >= 0) {
				fin = true;
			} else {
				fila = nuevaFila;
				columna = nuevaColumna;
			}

		}
		return sumarPrimeraFila(matriz);
	}

//	private static void imprimirMatriz(int[][] matriz) {
//		System.out.println("-".repeat(matriz.length));
//		for (int i = 0; i < matriz.length; i++) {
//			for (int j = 0; j < matriz[i].length; j++) {
//				System.out.printf("%4s", (matriz[i][j] == -1) ? "_" : matriz[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println("-".repeat(matriz.length));
//	}

	private static int sumarPrimeraFila(int[][] matriz) {
		int suma = 0;
		for (int num : matriz[0]) {
			suma += num;
		}
		return suma;
	}

	private static void inicializarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = -1;
			}
		}

	}

}
