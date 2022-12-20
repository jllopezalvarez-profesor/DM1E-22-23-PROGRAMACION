package es.iesclaradelrey.dm1e2223.extras.aceptaelreto.prenavidad;

import java.util.Scanner;

public class Ejercicio662Crecidas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int numColumnas = scanner.nextInt();
			int numFilas = scanner.nextInt();

			int[][] terreno = new int[numFilas][];
			for (int i = 0; i < numFilas; i++) {
				terreno[i] = leerFilaTerreno(scanner, numColumnas);
			}

			procesarCaso(terreno, numFilas, numColumnas);

		}

	}

	private static void procesarCaso(int[][] terreno, int numFilas, int numColumnas) {
		int fila = numFilas / 2;
		int columna = 0;
		boolean[][] inundados = new boolean[numFilas][numColumnas];
		boolean[][] procesados = new boolean[numFilas][numColumnas];

		int numInundados = calculaInundados(inundados);
		int numCeldas = numFilas * numColumnas;
		int mitadCeldas = numCeldas / 2;

		int nivelAgua = -1;

		if (numCeldas == 1) {
			nivelAgua = 0;
			numInundados = 1;
		} else {
			while (numInundados <= mitadCeldas) {
				inundados = new boolean[numFilas][numColumnas];
				procesados = new boolean[numFilas][numColumnas];
				nivelAgua++;
				procesarCaso2(terreno, inundados, procesados, nivelAgua, fila, columna);
//			mostrarArrayEnteros(terreno);
				// mostrarArrayBooleanos(inundados);
//			mostrarArrayBooleanos(procesados);

				numInundados = calculaInundados(inundados);
			}
		}
		System.out.println(nivelAgua + " " + numInundados);
	}

	@SuppressWarnings("unused")
	private static void mostrarArrayEnteros(int[][] terreno) {
		for (int[] fila : terreno) {
			for (int nivel : fila) {
				System.out.printf("%2s", nivel);
			}
			System.out.println();
		}

	}

	@SuppressWarnings("unused")
	private static void mostrarArrayBooleanos(boolean[][] array) {
		for (boolean[] fila : array) {
			for (boolean valor : fila) {
				System.out.printf("%2s", valor ? "S" : "N");
			}
			System.out.println();
		}

	}

	private static void procesarCaso2(int[][] terreno, boolean[][] inundados, boolean[][] procesados,int nivelAgua, int fila, int columna) {
		if (fila < 0 || columna < 0 || fila >= terreno.length || columna >= terreno[0].length)
			return;
		if (!procesados[fila][columna]) {
			procesados[fila][columna] = true;
			if (terreno[fila][columna] <= nivelAgua) {
				inundados[fila][columna] = true;
				procesarCaso2(terreno, inundados, procesados, nivelAgua, fila, columna + 1 );
				procesarCaso2(terreno, inundados, procesados, nivelAgua, fila, columna - 1);
				procesarCaso2(terreno, inundados, procesados, nivelAgua, fila - 1, columna);
				procesarCaso2(terreno, inundados, procesados, nivelAgua, fila + 1, columna);
			}
		}

	}

	private static int calculaInundados(boolean[][] inundados) {
		int numInundados = 0;
		for (boolean[] fila : inundados) {
			for (boolean celda : fila) {
				if (celda)
					numInundados++;
			}
		}
		return numInundados;
	}

	private static int[] leerFilaTerreno(Scanner scanner, int numColumnas) {
		int[] fila = new int[numColumnas];
		for (int i = 0; i < numColumnas; i++) {
			fila[i] = scanner.nextInt();
		}
		scanner.nextLine();
		return fila;
	}

}
