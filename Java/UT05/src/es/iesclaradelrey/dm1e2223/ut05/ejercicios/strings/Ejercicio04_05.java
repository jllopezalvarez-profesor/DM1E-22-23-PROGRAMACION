package es.iesclaradelrey.dm1e2223.ut05.ejercicios.strings;

/**
 * 
 * <pre>
 * Crea un método invertirCadena que:
    • Recibe una cadena como parámetro
    • Devuelve una cadena que es igual que la recibida, pero escrita a la inversa.
    • Para hacerlo, no uses arrays, hazlo sólo con tipos primitivos y Strings.
    • Si la cadena es null, devuelve null.
	Ejemplo:
	invertirCadena(“murciélago”) devolvería “ogaléicrum”.
 * </pre>
 *
 */
public class Ejercicio04_05 {
	public static void main(String[] args) {
		// Pruebas con invertirCadena
		System.out.println("Pruebas de invertirCadena:");
		System.out.printf("La cadena 'murciélago' invertida con invertirCadena es %s.\n", invertirCadena("murciélago"));
		System.out.printf("El resultado de invertir null con invertirCadena es %s.\n", invertirCadena(null));

		// Pruebas con invertirCadena2
		System.out.println("Pruebas de invertirCadena2:");
		System.out.printf("La cadena 'murciélago' invertida con invertirCadena2 es %s.\n",
				invertirCadena2("murciélago"));
		System.out.printf("El resultado de invertir null con invertirCadena2 es %s.\n", invertirCadena2(null));

		// Pruebas de rendimiento: repetir muchas veces una inversión con uno y otro
		// método
		int numRepeticiones = 100_000;
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < numRepeticiones; i++) {
			String resultado = invertirCadena("loren ipsum dolor sit amet");
		}
		System.out.printf("Tiempo en hacer %d inversiones con invertirCadena: %d ms\n", numRepeticiones,
				System.currentTimeMillis() - inicio);
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numRepeticiones; i++) {
			String resultado = invertirCadena2("loren ipsum dolor sit amet");
		}
		System.out.printf("Tiempo en hacer %d inversiones con invertirCadena2: %d ms\n", numRepeticiones,
				System.currentTimeMillis() - inicio);

	}

	public static String invertirCadena(String cadenaOriginal) {
		if (cadenaOriginal == null) {
			return null;
		}
		String cadenaResultado = "";
		for (int i = cadenaOriginal.length() - 1; i >= 0; i--) {
			cadenaResultado += cadenaOriginal.charAt(i);
		}
		return cadenaResultado;
	}

	public static String invertirCadena2(String cadenaOriginal) {
		if (cadenaOriginal == null)
			return null;

		char[] caracteres = cadenaOriginal.toCharArray();
		int posInicio = 0;
		int posFin = caracteres.length - 1;

		while (posInicio < posFin) {
			// System.out.printf("Cambiando posición %d por %d\n", posInicio, posFin);
			char aux = caracteres[posInicio];
			caracteres[posInicio] = caracteres[posFin];
			caracteres[posFin] = aux;
			posInicio++;
			posFin--;
		}
		return String.valueOf(caracteres);
	}

}
