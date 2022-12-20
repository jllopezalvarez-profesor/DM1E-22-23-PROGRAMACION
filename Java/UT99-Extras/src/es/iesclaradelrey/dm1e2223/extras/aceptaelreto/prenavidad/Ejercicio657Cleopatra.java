package es.iesclaradelrey.dm1e2223.extras.aceptaelreto.prenavidad;

import java.util.Scanner;

public class Ejercicio657Cleopatra {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numCasos = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < numCasos; i++) {
			// Leemos los tres años.
			// No nos preocupamos del orden, porque garantizan que a < b < c
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			scanner.nextLine();

			// Calculamos la distancia entre a y b
			int restaAB = restar(b, a);
			// Calculamos la distancia entre b y c
			int restaBC = restar(c, b);

			// Según el que esté más cerca, mostramos la salida
			if (restaAB > restaBC) {
				// A está más lejos de B que C. Mostramos C.
				System.out.println(c);
			} else if (restaAB < restaBC) {
				// A está más cerca de B que C. Mostramos A.
				System.out.println(a);
			} else {
				// Están iguales.
				System.out.println("EMPATE");
			}

		}

		scanner.close();
	}

	/**
	 * Resta el número menor del mayor. Si el producto del mayor por el menor es
	 * negativo esto quiere decir que el cero está entre ambos. Como en años el cero
	 * no existe, en este caso se resta 1 del valor de la resta calculada.
	 * 
	 * @param mayor el mayor de los dos números
	 * @param menor el menor de los dos números
	 * @return la distancia entre los dos, teniendo en cuenta que el 0 no existe.
	 */
	private static int restar(int mayor, int menor) {
		int resta = mayor - menor;
		if ((mayor * menor) < 0)
			resta--;
		return resta;
	}

}
