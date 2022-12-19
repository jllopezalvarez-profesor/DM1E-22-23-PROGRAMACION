package es.iesclaradelrey.dm1e2223.extras.aceptaelreto;

import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio615LaPulga {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// todosFactoriales(135);

		int numCasos = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < numCasos; i++) {
			int numPasosPotencia = scanner.nextInt();
			int factor = scanner.nextInt();
			int tiempo = scanner.nextInt();
			scanner.nextLine(); // Consumir el \n que no consume el último nextInt

			procesarCaso(numPasosPotencia, factor, tiempo);
		}

		scanner.close();

	}

	private static void procesarCaso(int numPasosPotencia, int factor, int tiempo) {
		int pasos = tiempo % (numPasosPotencia+1);
		int potencia = pasos * factor;
		System.out.println(potencia);
	}

}
