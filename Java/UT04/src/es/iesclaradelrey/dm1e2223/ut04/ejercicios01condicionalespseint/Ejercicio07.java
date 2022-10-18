package es.iesclaradelrey.dm1e2223.ut04.ejercicios01condicionalespseint;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y
 *         muestre el mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la
 *         edad es mayor o igual a dieciocho y el sexo es ‘F’. En caso de que se
 *         cumpla lo mismo, pero el sexo sea ‘M’, debe imprimir ‘POSIBLE’. Si no
 *         se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.
 */
public class Ejercicio07 {

	public static void main(String[] args) {
		// Creamos el scanner para leer datos
		Scanner scanner = new Scanner(System.in);

		// Pedimos la nota
		System.out.println("Por favor, introduce la nota.");
		double nota = Integer.parseInt(scanner.nextLine());

		// Pedimos la edad
		System.out.println("Por favor, introduce la edad.");
		int edad = Integer.parseInt(scanner.nextLine());

		// Pedimos el sexo
		System.out.println("Por favor, introduce el sexo (F/M).");
		String sexo = scanner.nextLine();

		// Primero comprobamos nota y edad. Si no se cumplen estos dos requisitos ya no
		// hace falta mirar sexo
		if ((nota >= 5) && (edad >= 18)) {
			// Comprobamos el sexo. Usamos equalsIgnoreCase para que sirva tanto F como f
			if (sexo.equalsIgnoreCase("F")) {
				// Es F o f
				System.out.println("ACEPTADA");
			} else if (sexo.equalsIgnoreCase("M")) {
				// Es M o m
				System.out.println("POSIBLE");
			} else {
				// No es F ni M
				System.out.println("NO ACEPTADA. Error en SEXO.");
			}
		} else {
			// No se cumplen nota o edad
			System.out.println("NO ACEPTADA. No se cumplen nota o edad");
		}

		// Cerramos el scanner
		scanner.close();
	}

}
