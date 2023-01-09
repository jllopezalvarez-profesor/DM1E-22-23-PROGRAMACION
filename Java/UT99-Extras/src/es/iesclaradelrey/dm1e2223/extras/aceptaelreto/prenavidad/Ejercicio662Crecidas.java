package es.iesclaradelrey.dm1e2223.extras.aceptaelreto.prenavidad;

import java.util.Scanner;

public class Ejercicio662Crecidas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int numColumnas = scanner.nextInt();
			int numFilas = scanner.nextInt();

			int[][] terreno = new int[numFilas][numColumnas];
			int maximaElevacion = 0;
			for (int i = 0; i < numFilas; i++) {
				for (int j = 0; j < numColumnas; j++) {
					int elevacion = scanner.nextInt();
					if (elevacion > maximaElevacion) {
						maximaElevacion = elevacion;
					}
					terreno[i][j] = elevacion;
				}
				scanner.nextLine();
			}

			procesarCaso(terreno, numFilas, numColumnas, maximaElevacion);

		}

		scanner.close();
	}

	private static void procesarCaso(int[][] terreno, int numFilas, int numColumnas, int maximaElevacion) {

		int numCeldas = numFilas * numColumnas;

		// Si sólo hay una celda, el resultado es fijo.
		if (numCeldas == 1) {
			System.out.println("0 1");
			return;
		}

		// Calculamos la cantidad de celdas a inundar
		int objetivo = (numCeldas / 2) + 1;

		// Calculamos celda de inicio
		int filaCeldaInicio = numFilas / 2;
		int columnaCeldaInicio = 0;

		// Vamos a usar búsqueda binaria, entre 0 y la máxima elevación.
		int elevacionMenor = 0;
		int elevacionMayor = maximaElevacion;

		int nivelAgua = 0;
		int numInundadas = 0;
		while (elevacionMenor < elevacionMayor - 1) {
			nivelAgua = (elevacionMayor - elevacionMenor) / 2;
			System.out.printf("Probando nivel de agua %d\n\n", nivelAgua);
			boolean[][] inundadadas = new boolean[numFilas][numColumnas];
			boolean[][] procesadas = new boolean[numFilas][numColumnas];
			procesarCaso2(terreno, inundadadas, procesadas, nivelAgua, filaCeldaInicio, columnaCeldaInicio);
			numInundadas = calcularInundadas(inundadadas);
			if (numInundadas < objetivo) {
				elevacionMenor = nivelAgua;
			} else {
				elevacionMayor = nivelAgua;
			}
		}
		System.out.println(nivelAgua + " " + numInundadas);

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

	private static void procesarCaso2(int[][] terreno, boolean[][] inundados, boolean[][] procesados, int nivelAgua,
			int fila, int columna) {
		if (fila < 0 || columna < 0 || fila >= terreno.length || columna >= terreno[0].length)
			return;
		if (!procesados[fila][columna]) {
			procesados[fila][columna] = true;
			if (terreno[fila][columna] <= nivelAgua) {
				inundados[fila][columna] = true;
				procesarCaso2(terreno, inundados, procesados, nivelAgua, fila, columna + 1);
				procesarCaso2(terreno, inundados, procesados, nivelAgua, fila, columna - 1);
				procesarCaso2(terreno, inundados, procesados, nivelAgua, fila - 1, columna);
				procesarCaso2(terreno, inundados, procesados, nivelAgua, fila + 1, columna);
			}
		}

	}

	private static void vaciarMatrizBooleana(boolean[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = false;
			}
		}
	}

	private static int calcularInundadas(boolean[][] inundados) {
		int numInundados = 0;
		for (boolean[] fila : inundados) {
			for (boolean celda : fila) {
				if (celda)
					numInundados++;
			}
		}
		return numInundados;
	}

}
