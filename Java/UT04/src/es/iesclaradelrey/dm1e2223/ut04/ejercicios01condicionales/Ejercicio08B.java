package es.iesclaradelrey.dm1e2223.ut04.ejercicios01condicionales;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Algoritmo que pida tres números y los muestre ordenados (de mayor a
 *         menor).
 */
public class Ejercicio08B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		int primerNumero = Integer.parseInt(scanner.nextLine());

		System.out.print("Introduce el segundo número: ");
		int segundoNumero = Integer.parseInt(scanner.nextLine());

		System.out.print("Introduce el tercer número: ");
		int tercerNumero = Integer.parseInt(scanner.nextLine());

		int aux1;
		int aux2;

		aux1 = Math.max(primerNumero, segundoNumero);
		aux2 = Math.min(primerNumero, segundoNumero);
		primerNumero = aux1;
		segundoNumero = aux2;

		aux1 = Math.max(segundoNumero, tercerNumero);
		aux2 = Math.min(segundoNumero, tercerNumero);
		segundoNumero = aux1;
		tercerNumero = aux2;

		aux1 = Math.max(primerNumero, segundoNumero);
		aux2 = Math.min(primerNumero, segundoNumero);
		primerNumero = aux1;
		segundoNumero = aux2;

		System.out.printf("Los números ordenados son %d, %d, %d\n", primerNumero, segundoNumero, tercerNumero);

		scanner.close();
	}

}
