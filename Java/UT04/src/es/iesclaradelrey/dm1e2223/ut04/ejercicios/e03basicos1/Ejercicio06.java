package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e03basicos1;

import java.util.Scanner;

public class Ejercicio06 {

	// 3 -5 1
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b, c;

		double discriminante, x1, x2;

		System.out.println("Introducir el valor del termino a");
		a = scanner.nextDouble();

		System.out.println("Introducir el valor del termino b");
		b = scanner.nextDouble();

		System.out.println("Introducir el valor del termino c");
		c = scanner.nextDouble();

		discriminante = b * b - 4 * a * c;

		if (discriminante < 0)
			System.out.println("Raiz negativa, soluciones complejas");
		else if (discriminante == 0) {
			x1 = -b / (2 * a);
			System.out.println("El sistema solo tiene una solucion x= " + x1);
		} else {
			x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
			System.out.println("El sistema tiene dos soluciones x1= " + x1 + " y x2= " + x2);
		}

		scanner.close();
	}

}
