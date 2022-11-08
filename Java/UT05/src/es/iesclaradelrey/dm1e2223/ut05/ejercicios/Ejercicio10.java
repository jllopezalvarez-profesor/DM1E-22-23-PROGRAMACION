package es.iesclaradelrey.dm1e2223.ut05.ejercicios;

/**
 * 
 * <pre>
 * 	Escribe un programa que:
	    • Cree un array con 20 números enteros aleatorios entre 1 y 20, ambos incluidos.
	    • Muestre el array en la consola, con los valores separados por comas.
	    • Procese el array, poniendo un cero en las posiciones que contengan un número primo.
	    • Muestre de nuevo el array en la consola.
	Para ello, usar:
	    • Un método para generar un número aleatorio entre dos valores dados. Recibe los dos valores (límite superior e inferior) y devuelve el número aleatorio.
	    • Un método para generar un array de números aleatorios de un tamaño dado. Recibe el tamaño del array y devuelve un array de números de la longitud indicada, lleno de números aleatorios. Para generar los números aleatorios, este método utilizará el método mencionado anteriormente.
	    • Un método para calcular si un número es primo o no. Recibe un número y devuelve un boolean indicando si el número es primo o no.
	    • Un método para mostrar el contenido de un array de enteros. Recibe el array y muestra por pantalla (consola) todos los valores del array, separados por coma. No tiene que haber coma al final, tras el último número.
 * </pre>
 *
 */
public class Ejercicio10 {

	public static void main(String[] args) {

		for (int i = 0; i < 30; i++)
			System.out.println(generarNumeroAleatorio(5, 10));

	}

	/**
	 * Genera un numero aleatorio entre un mínimo y máximo
	 * 
	 * @param minimo el valor mínimo (incluido) a generar
	 * @param maximo el valor máximo (incluido) a generar
	 * @return un aleatorio entre minimo y maximo incluidos
	 */
	public static int generarNumeroAleatorio(int minimo, int maximo) {

		return (int) (Math.random() * (maximo - minimo+ 1)) + minimo;

	}

}
