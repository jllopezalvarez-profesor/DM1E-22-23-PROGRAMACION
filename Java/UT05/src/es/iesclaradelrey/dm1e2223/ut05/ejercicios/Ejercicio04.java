package es.iesclaradelrey.dm1e2223.ut05.ejercicios;

/**
 * 
 * Escribe un programa que genere 100 números aleatorios menores que 100 (de 0 a
 * 99), y los almacene en un array. Luego debe calcular la suma y la media de de
 * ellos.
 *
 */
public class Ejercicio04 {

	private static final int CANTIDAD_NUMEROS = 2;
	private static final int MAXIMO_NUMERO = 100;

	public static void main(String[] args) {
		int[] numeros = new int[CANTIDAD_NUMEROS];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * MAXIMO_NUMERO);
		}

		// Este bucle no estaba en el enunciado. Lo hemos puesto para comprobar la suma.
		for (int numero : numeros) {
			System.out.printf("%d ", numero);
		}
		System.out.println();

		int suma = 0;
		for (int numero : numeros) {
			suma += numero;
		}

		System.out.printf("La suma es %d y la media es %.5f.\n", suma, (double) suma / numeros.length);

	}

}
