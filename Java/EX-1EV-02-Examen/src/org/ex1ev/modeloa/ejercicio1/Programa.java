package org.ex1ev.modeloa.ejercicio1;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("¿Cuántos alumnos hay en clase? ");
		int numAlumnos = Integer.parseInt(scanner.nextLine());

		int[] notas = pedirNotasTodosAlumnos(scanner, numAlumnos);

		System.out.printf("Mejor nota: %d\n", notaMasAlta(notas));
		System.out.printf("Peor nota: %d\n", notaMasBaja(notas));
		System.out.printf("Nota media: %.2f\n", notaMedia(notas));
		System.out.printf("Número de sobresalientes: %d\n", numSobresalientes(notas));

		scanner.close();
	}

	public static int pedirNotaAlumno(Scanner scanner) {
		System.out.print("Introduce la nota del alumno (0 - 10): ");
		int nota = Integer.parseInt(scanner.nextLine());
		while (nota < 0 || nota > 10) {
			System.out.print("Nota incorrecta. Vuelve a introducir la nota (0 - 10): ");
			nota = Integer.parseInt(scanner.nextLine());
		}
		return nota;
	}

	public static int[] pedirNotasTodosAlumnos(Scanner scanner, int numAlumnos) {
		int[] notas = new int[numAlumnos];
		for (int i = 0; i < notas.length; i++) {
			notas[i] = pedirNotaAlumno(scanner);
		}
		return notas;
	}

	public static int notaMasAlta(int[] notas) {
		int maximo = notas[0];
		for (int nota : notas) {
			if (nota > maximo) {
				maximo = nota;
			}
		}
		return maximo;
	}

	public static int notaMasBaja(int[] notas) {
		int minimo = notas[0];
		for (int nota : notas) {
			if (nota < minimo) {
				minimo = nota;
			}
		}
		return minimo;
	}

	public static double notaMedia(int[] notas) {
		int suma = 0;
		for (int nota : notas) {
			suma += nota;
		}
		return (double) suma / notas.length;
	}

	public static int numSobresalientes(int[] notas) {
		int cuenta = 0;
		for (int nota : notas) {
			if (nota >= 9) {
				cuenta++;
			}
		}
		return cuenta;
	}
}
