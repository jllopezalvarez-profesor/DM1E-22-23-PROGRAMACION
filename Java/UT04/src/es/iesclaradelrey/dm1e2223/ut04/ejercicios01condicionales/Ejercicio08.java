package es.iesclaradelrey.dm1e2223.ut04.ejercicios01condicionales;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Algoritmo que pida tres números y los muestre ordenados (de mayor a
 *         menor).
 */
public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int primerNumero = Integer.parseInt(scanner.nextLine());

		System.out.print("Introduce el segundo número: ");
		int segundoNumero = Integer.parseInt(scanner.nextLine());

		System.out.print("Introduce el tercer número: ");
		int tercerNumero = Integer.parseInt(scanner.nextLine());

		int aux;

		if (segundoNumero > primerNumero) {
			aux = primerNumero;
			primerNumero = segundoNumero;
			segundoNumero = aux;
		}

		if (tercerNumero > segundoNumero) {
			aux = segundoNumero;
			segundoNumero = tercerNumero;
			tercerNumero = aux;
		}

		if (segundoNumero > primerNumero) {
			aux = primerNumero;
			primerNumero = segundoNumero;
			segundoNumero = aux;
		}

		System.out.printf("Los números ordenados son %d, %d, %d\n", primerNumero, segundoNumero, tercerNumero);

		scanner.close();
	}

}
