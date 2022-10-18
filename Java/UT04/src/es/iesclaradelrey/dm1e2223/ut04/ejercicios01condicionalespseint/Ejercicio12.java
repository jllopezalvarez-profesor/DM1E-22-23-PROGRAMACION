package es.iesclaradelrey.dm1e2223.ut04.ejercicios01condicionalespseint;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Escribe un programa que pida un número entero entre uno y doce e
 *         imprima el número de días que tiene el mes correspondiente.
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		// Creamos el scanner para leer datos
		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor, introduce el número del mes (de 1 a 12).");
		int numeroMes = Integer.parseInt(scanner.nextLine());
		
		switch (numeroMes) {
		case 1,3,5,7,8,10,12: 
			System.out.printf("El mes con número %s tiene 31 días\n", numeroMes);
			break;
		case 4,6,9,11:
			System.out.printf("El mes con número %s tiene 30 días\n", numeroMes);
			break;
		case 2:
			System.out.printf("El mes con número %s tiene 28 días, salvo en años bisiestos, que tiene 29\n", numeroMes);
			break;
		default:
			System.out.println("El número introducido es incorrecto.");
		}

		// Cerramos el scanner
		scanner.close();

	}

}
