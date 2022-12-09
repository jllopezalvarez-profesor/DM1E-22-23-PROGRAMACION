package es.iesclaradelrey.dm1e2223.extras.aceptaelreto;

import java.util.Scanner;

public class Ejercicio456TartaSacher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numCasos = scanner.nextInt();

		while (numCasos > 0) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			int necesito = scanner.nextInt();
			scanner.nextLine(); // Para que la siguiente lectura de int no falle.

			int cuadradosTableta = x * y;
			int numTabletas = necesito / cuadradosTableta;
			if (necesito % cuadradosTableta > 0)
				numTabletas++;
			System.out.println(numTabletas);
		}

		scanner.close();

	}

}
