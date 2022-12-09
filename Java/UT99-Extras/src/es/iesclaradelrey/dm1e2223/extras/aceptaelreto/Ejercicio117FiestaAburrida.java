package es.iesclaradelrey.dm1e2223.extras.aceptaelreto;

import java.util.Scanner;

public class Ejercicio117FiestaAburrida {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numCasos = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < numCasos; i++) {
			String cadenaSoy = scanner.nextLine();
			String nombre = cadenaSoy.substring(4);
			System.out.println("Hola, " + nombre + ".");
		}
		
		
		scanner.close();
	}

}
