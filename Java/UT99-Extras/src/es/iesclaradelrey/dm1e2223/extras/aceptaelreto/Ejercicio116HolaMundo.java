package es.iesclaradelrey.dm1e2223.extras.aceptaelreto;

import java.util.Scanner;

public class Ejercicio116HolaMundo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numMensajes = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < numMensajes; i++) {
			System.out.println("Hola mundo.");
		}
	}

}
