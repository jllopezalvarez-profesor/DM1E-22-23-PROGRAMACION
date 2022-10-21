package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e03basicos1;

import java.util.Scanner;

public class Ejercicio02Printf {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double l, g;
		System.out.println("Introducir el numero de galones ");
		g = teclado.nextDouble();
		l = 3.7854 * g;

		// Usamos printf para mostrar sólo dos decimales de cada número
		System.out.printf(" %.2f galones equivalen a %n %.2f litros ", g, l);

		teclado.close();
	}
}