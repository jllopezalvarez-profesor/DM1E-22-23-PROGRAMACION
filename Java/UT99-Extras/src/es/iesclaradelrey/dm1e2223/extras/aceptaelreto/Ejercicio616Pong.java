package es.iesclaradelrey.dm1e2223.extras.aceptaelreto;

import java.util.Scanner;

public class Ejercicio616Pong {

	private enum Sentido {
		DERECHA, IZQUIERDA
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numSonidos = scanner.nextInt();

		while (numSonidos != 0) {
			procesarCaso(numSonidos, scanner);
			numSonidos = scanner.nextInt();
		}

		scanner.close();
	}

	private static void procesarCaso(int numSonidos, Scanner scanner) {
		int puntosIzquierda = 0;
		int puntosDerecha = 0;

		Sentido sentido = Sentido.DERECHA;

		while (numSonidos > 0) {

			String sonido = scanner.next();

			switch (sonido) {
			case "PIC":
				// Cambio de sentido
				sentido = (sentido == Sentido.DERECHA) ? Sentido.IZQUIERDA : Sentido.DERECHA;
				break;
			case "PONG!":
				// Punto para el contrario, no se cambia sentido
				if (sentido == Sentido.DERECHA) {
					puntosIzquierda++;
				} else {
					puntosDerecha++;
				}
				break;
			}
			numSonidos--;
		}

		System.out.printf("%d %d\n", puntosIzquierda, puntosDerecha);

		scanner.nextLine(); // Leer el \n del último nextInt()
	}
}
