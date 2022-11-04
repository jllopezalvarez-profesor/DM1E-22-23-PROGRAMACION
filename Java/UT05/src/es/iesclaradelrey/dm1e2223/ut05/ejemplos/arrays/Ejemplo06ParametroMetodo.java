package es.iesclaradelrey.dm1e2223.ut05.ejemplos.arrays;

/**
 * 
 * Ejemplo de como inicializar un array con valores conocidos.
 * 
 */
public class Ejemplo06ParametroMetodo {

	public static void main(String[] args) {

		// Creación de un array e inicialización posición a posición
		int[] array1 = new int[3];
		array1[0] = 33;
		array1[1] = 12;
		array1[2] = 59;

		// Creación de un array e inicialización en una sóla línea
		int[] array2 = { 15, 98, 67 };

		// Llamamos a los métodos estáticos para mostrar el array
		muestraContenidoArray(array1);
		muestraContenidoArray(array2);

	}

	/**
	 * Muestra el contenido de un array escribiendo los valores seoparados por
	 * espacio
	 * 
	 * @param array Array de números que queremos mostrar
	 */

	public static void muestraContenidoArray(int[] array) {
		for (int numero : array) {
			System.out.printf("%d ", numero);
		}
		System.out.println();
	}

	public static int[] generaArrayNumerosAleatorios(int cantidadNumeros) {
		int[] numeros = new int[cantidadNumeros];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ((int) (Math.random() * 100)) + 1;
		}
		return numeros;
	}

}
