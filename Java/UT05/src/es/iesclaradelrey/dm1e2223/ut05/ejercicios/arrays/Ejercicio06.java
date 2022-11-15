package es.iesclaradelrey.dm1e2223.ut05.ejercicios.arrays;

import java.util.Scanner;

/**
 * 
 * Escribe un programa que pida 10 números por teclado, los almacene en un array
 * y que luego muestre el máximo valor, el mínimo y las posiciones que ocupan
 * estos dos números en el array.
 *
 */
public class Ejercicio06 {

	private static final int CANTIDAD_NUMEROS = 5;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[CANTIDAD_NUMEROS];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número ");
			numeros[i] = Integer.parseInt(scanner.nextLine());
		}
		
		int posMaximo = buscaMaximo(numeros);
		int posMinimo = buscaMinimo(numeros);

		
		System.out.printf("El máximo es %d y está en la posición %d.\n", numeros[posMaximo], posMaximo);
		System.out.printf("El mínimo es %d y está en la posición %d.\n", numeros[posMinimo], posMinimo);

		scanner.close();
	}
	
	public static int buscaMaximo(int[] numeros) {
		int maximo = numeros[0];
		int posMaximo = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maximo) {
				maximo = numeros[i];
				posMaximo = i;
			}
		}
		return posMaximo;
	}
	public static int buscaMinimo(int[] numeros) {
		int minimo = numeros[0];
		int posMinimo = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < minimo) {
				minimo = numeros[i];
				posMinimo = i;
			}
		}
		return posMinimo;
	}

}
