package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e01condicionalespseint;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Algoritmo que pida tres números y los muestre ordenados (de mayor a
 *         menor). Esta versión cambia el orden de los números para ordenarlos.
 */
public class Ejercicio08 {

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

		// Variable para poder intercambiar valores
		int aux;

		// Intercambiamos primero con el segundo, sólo si el segundo es más grande.
		if (segundoNumero > primerNumero) {
			aux = primerNumero;
			primerNumero = segundoNumero;
			segundoNumero = aux;
		}

		// Intercambiamos segundo con el tercero, sólo si el tercero es más grande.
		if (tercerNumero > segundoNumero) {
			aux = segundoNumero;
			segundoNumero = tercerNumero;
			tercerNumero = aux;
		}

		// Intercambiamos de nuevo el primero con el segundo, sólo si el segundo es más grande.
		if (segundoNumero > primerNumero) {
			aux = primerNumero;
			primerNumero = segundoNumero;
			segundoNumero = aux;
		}

		// Mostramos los números ordenados.
		System.out.printf("Los números ordenados son %d, %d, %d\n", primerNumero, segundoNumero, tercerNumero);

		// Cerramos el scanner
		scanner.close();
	}

}
