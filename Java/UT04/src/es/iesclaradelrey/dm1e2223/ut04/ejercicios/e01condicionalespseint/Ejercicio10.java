package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e01condicionalespseint;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Escribe un programa que pida una fecha (día, mes y año) y diga si es
 *         correcta.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		// Creamos el scanner para leer datos
		Scanner scanner = new Scanner(System.in);

		// Pedimos el día
		System.out.println("Por favor, introduce el dia.");
		int dia = Integer.parseInt(scanner.nextLine());

		// Pedimos mes
		System.out.println("Por favor, introduce el mes.");
		int mes = Integer.parseInt(scanner.nextLine());

		// Pedimos año
		System.out.println("Por favor, introduce el año.");
		int anio = Integer.parseInt(scanner.nextLine());

		// En función del mes comprobamos el día. Usamos switch para simplificar
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			// Meses con 31 días
			if (dia >= 1 && dia <= 31) {
				System.out.println("Fecha correcta");
			} else {
				System.out.println("Fecha incorrecta");
			}
			break;
		case 4, 6, 9, 11:
			// Meses con 30 días
			if (dia >= 1 && dia <= 30) {
				System.out.println("Fecha correcta");
			} else {
				System.out.println("Fecha incorrecta");
			}
			break;
		case 2:
			// Febrero. Pueden ser 28 (normales) o 29 días (bisiestos). Nos apoyamos en lo
			// que hicimos en el ejercicio 9, versión B, para saber cuántos días tenemos.
			if ((anio % 4 != 0) || ((anio % 4 == 0) && (anio % 100 == 0) && (anio % 400 != 0))) {
				// No bisiesto
				if (dia >= 1 && dia <= 28) {
					System.out.println("Fecha correcta");
				} else {
					System.out.println("Fecha incorrecta");
				}
			} else {
				// Bisiesto
				if (dia >= 1 && dia <= 29) {
					System.out.println("Fecha correcta");
				} else {
					System.out.println("Fecha incorrecta");
				}
			}
			break;
		default:
			System.out.println("El mes introducido no es correcto");
			break;
		}

		// Cerramos el scanner
		scanner.close();
	}

}
