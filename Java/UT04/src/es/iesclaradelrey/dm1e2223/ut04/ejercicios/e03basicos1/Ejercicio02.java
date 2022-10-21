package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e03basicos1;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		final double GALON_LITROS = 3.7854; // Un galón son 3.7854 litros

		Scanner teclado = new Scanner(System.in);

		double litros, galones;

		System.out.println("Introducir el numero de galones ");
		galones = teclado.nextDouble();

		litros = GALON_LITROS * galones;

		System.out.println(galones + " galones equivalen a " + litros + " litros");

		teclado.close();
	}
}