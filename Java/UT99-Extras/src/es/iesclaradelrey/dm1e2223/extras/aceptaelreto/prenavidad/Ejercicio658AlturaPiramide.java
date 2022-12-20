package es.iesclaradelrey.dm1e2223.extras.aceptaelreto.prenavidad;

import java.util.Scanner;

public class Ejercicio658AlturaPiramide {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		while (n != 0) {
			procesarCaso(n);
			n = Integer.parseInt(scanner.nextLine());
		}
		scanner.close();
	}

	private static void procesarCaso(int numBloquesDisponibles) {
		// Empezamos con un piso
		int numPisos = 1;
		// Para un piso se necesita un bloque
		long numBloquesUsados = 1;
		// Y la longitud del lado es 1
		int longitudLado = 1;
		// Seguimos hasta que el cálculo de bloques usados rebase el de disponibles.
		// Como puede haber huecos, aunque rebasemos, puede construirse la pirámide. Si
		// nos hubieran pedido sin huecos nos tendríamos que quedar con la iteración
		// anterior a rebasar el número de bloques.
		while (numBloquesUsados < numBloquesDisponibles) {
			// En cada iteración aumentamos en 1 el número de pisos.
			numPisos++;
			// Y cada nuevo piso tiene una base cuadrada que mide dos bloques más de lado.
			longitudLado += 2;
			// Acumulamos los bloques del nuevo piso en la cantidad de usuados.
			numBloquesUsados += longitudLado * longitudLado;
		}
		// Al salir del bucle, el número de pisos será el mínimo número de pisos que
		// podremos hacer usando todos los bloques disponibles, aunque haya algún hueco.
		System.out.println(numPisos);
	}
}
