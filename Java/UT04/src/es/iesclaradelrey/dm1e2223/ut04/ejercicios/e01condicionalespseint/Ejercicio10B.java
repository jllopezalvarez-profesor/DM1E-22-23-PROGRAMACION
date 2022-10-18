package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e01condicionalespseint;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Escribe un programa que pida una fecha (día, mes y año) y diga si es
 *         correcta.
 */
public class Ejercicio10B {

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

		// Comprobamos primero el mes. Tiene que ser entre 1 y 12, ambos incluidos
		if (mes >= 1 && mes <= 12) {
			// Variable para calcular el número de días del mes, para usarlo después en una
			// comparación.
			int numDiasMes;
			// En función del mes damos valor a la variable con el número de días del mes
			switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12:
				// Meses con 31 días
				numDiasMes = 31;
				break;
			case 4, 6, 9, 11:
				// Meses con 30 días
				numDiasMes = 30;
				break;
			default:
				// Febrero. Como sabemos que el mes está entre 1 y 12 ambos incluidos, el único
				// caso que falta es febrero (2). Pueden ser 28 días (normales) o 29 días
				// (bisiestos).
				// Nos apoyamos en lo que hicimos en el ejercicio 9, versión B, para saber
				// cuántos días tenemos.
				if ((anio % 4 != 0) || ((anio % 4 == 0) && (anio % 100 == 0) && (anio % 400 != 0))) {
					// No bisiesto
					numDiasMes = 28;
				} else {
					// Bisiesto
					numDiasMes = 29;
				}
				break; // Este break se puede quitar...
			}

			// Al salir, comparamos el día.
			if (dia >= 1 && dia <= numDiasMes) {
				System.out.println("Fecha correcta");
			} else {
				System.out.println("El día introducido no es correcto");
			}

		} else {
			System.out.println("El mes introducido no es correcto");
		}

		// Cerramos el scanner
		scanner.close();
	}
}
