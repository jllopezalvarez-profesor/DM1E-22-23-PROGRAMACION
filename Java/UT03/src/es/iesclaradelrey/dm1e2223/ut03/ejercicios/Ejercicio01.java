package es.iesclaradelrey.dm1e2223.ut03.ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el radio de la circunferencia: ");
		double radio = sc.nextDouble();
		sc.nextLine();

		System.out.print("¿Cómo te llamas? ");
		String nombre = sc.nextLine();

		System.out.print("Introduce el lado del cuadrado: ");
		double lado = sc.nextDouble();

		System.out.printf("Hola, %s, el área del cuadrado es %f y la circunferencia mide %f\n", nombre,
				Math.pow(lado, 2), 2 * Math.PI * radio);

		// Integer
		// Double

		sc.close();
	}

}
