package es.iesclaradelrey.dm1e2223.ut04.ejercicios01condicionalespseint;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Algoritmo que pida tres números y los muestre ordenados (de mayor a
 *         menor). Esta versión ordena los números antes de mostrarlos, pero lo
 *         hace con Mat.min y Math.max.
 */
public class Ejercicio08B {

	public static void main(String[] args) {
		// Creamos el scanner para leer datos
		Scanner scanner = new Scanner(System.in);

		// Pedimos el primer número
		System.out.print("Introduce el primer número: ");
		int primerNumero = Integer.parseInt(scanner.nextLine());

		// Pedimos el segundo número
		System.out.print("Introduce el segundo número: ");
		int segundoNumero = Integer.parseInt(scanner.nextLine());

		// Pedimos el tercer número
		System.out.print("Introduce el tercer número: ");
		int tercerNumero = Integer.parseInt(scanner.nextLine());

		// Variables auxiliares para permutar el valor de las variables.
		int aux1;
		int aux2;

		// Nos quedamos en el primer número con el máximo (mayor) de los números primero y segundo
		// Nos quedamos en el segundo número con el mínimo (menor) de los números primero y segundo
		aux1 = Math.max(primerNumero, segundoNumero);
		aux2 = Math.min(primerNumero, segundoNumero);
		primerNumero = aux1;
		segundoNumero = aux2;

		// Nos quedamos en el segundo número con el máximo (mayor) de los números segundo y tercero
		// Nos quedamos en el tercer número con el mínimo (menor) de los números segundo y tercero
		aux1 = Math.max(segundoNumero, tercerNumero);
		aux2 = Math.min(segundoNumero, tercerNumero);
		segundoNumero = aux1;
		tercerNumero = aux2;

		// Repetimos el primer paso:
		// Nos quedamos en el primer número con el máximo (mayor) de los números primero y segundo
		// Nos quedamos en el segundo número con el mínimo (menor) de los números primero y segundo
		aux1 = Math.max(primerNumero, segundoNumero);
		aux2 = Math.min(primerNumero, segundoNumero);
		primerNumero = aux1;
		segundoNumero = aux2;

		// Mostramos números ordenados
		System.out.printf("Los números ordenados son %d, %d, %d\n", primerNumero, segundoNumero, tercerNumero);

		// Cerramos el escanner
		scanner.close();
	}

}
