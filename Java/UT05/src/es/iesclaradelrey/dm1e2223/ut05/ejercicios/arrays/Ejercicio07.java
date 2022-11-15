package es.iesclaradelrey.dm1e2223.ut05.ejercicios.arrays;

/**
 * 
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 99 y
 * los almacene en un array. Luego mostrará los números primos que hay en el
 * array, junto a la posición que ocupan en el mismo. Utiliza un método
 * estático, que crearás dentro de la clase del programa principal, para
 * determinar si un número es primo o no.
 *
 */
public class Ejercicio07 {

	public static void main(String[] args) {
		// Generar numeros aleatorios (20) entre 0 y 99
		int[] numeros = generaAleatorios(20, 100);

		// Mostrar los que sean primos.
		mostrarPrimos(numeros);

	}

	private static int[] generaAleatorios(int cantidadNumeros, int limite) {
		// Crear un array de tamaño "cantidadNumeros"
		// Llenarlo con numeros aleatorios del 0 a limite-1 ambos incluidos
		// Devolver el array creado
		int[] numeros = new int[cantidadNumeros];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * limite);
		}
		return numeros;
	}

	private static void mostrarPrimos(int[] numeros) {

//		for (int i = 0; i < numeros.length; i++) {
//			if(esPrimo(numeros[i])) {
//				System.out.println(numeros[i]);
//			}
//		}
//
//		for (int i = 0; i < numeros.length; i++) {
//			int numero = numeros[i];
//			if(esPrimo(numero)) {
//				System.out.println(numero);
//			}
//		}
		
		for (int numero : numeros) {
			if(esPrimo(numero)) {
				System.out.println(numero);
			}
		}
		
		
	}

	public static boolean esPrimo(int numero) {
		if (numero < 2)
			return false;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0)
				return false;
		}
		return true;
	}

}
