package es.iesclaradelrey.dm1e2223.extras.aceptaelreto.prenavidad;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio660Champollion {

	private static final String VOCALES = "aeiouAEIOU";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numCasos = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < numCasos; i++) {
			// En el enunciado no lo indican, pero viendo el primer caso de uso, se deduce
			// que no se deben distinguir mayúsculas de minúsculas.
			procesarCaso(scanner.nextLine().toLowerCase());
		}

		scanner.close();
	}

	private static void procesarCaso(String frase) {
		// Dividimos la frase en palabras para procesar una a una.
		String[] palabras = frase.split(" ");
		// Usar un conjunto (Set) nos permite añadir sílabas con la garantía de que no
		// se repetirán.
		Set<String> silabas = new HashSet<>();
		// Procesamos palabra a palabra.
		for (String palabra : palabras) {
			procesarPalabra(palabra, silabas);
		}
		// El conjunto tendrá todas las sílabas de todas las palabras, sin repetirse.
		System.out.println(silabas.size());

	}

	/**
	 * Método recursivo que va extrayendo sílabas del final de la palabra, hasta que
	 * no queda nada.
	 * 
	 * @param palabra palabra que queremos dividir en sílabas
	 * @param silabas conjunto al que añadiremos las de la palabra
	 */
	private static void procesarPalabra(String palabra, Set<String> silabas) {
		// Condición de seguridad. Split puede generar alguna cadena vacía en según que
		// versiones de Java.
		if (palabra == null || palabra.length() == 0)
			return;

		// Calculamos longitud de la palabra
		int longitudPalabra = palabra.length();

		// Si sólo quedan una o dos letras, ya no hay más que procesar, lo que queda es
		// una sílaba.
		if (longitudPalabra == 1 || longitudPalabra == 2) {
			silabas.add(palabra);
			return;
		}

		// Vamos a mirar el último caracter de la palabra (vamos de derecha a izquierda)
		char ultimoCaracter = palabra.charAt(longitudPalabra - 1);

		// Si la última es una vocal, la sílaba tiene que tener 2 caracteres. Si es
		// consonante 3.
		int longitudSilaba;
		if (esVocal(ultimoCaracter)) {
			longitudSilaba = 2;
		} else {
			longitudSilaba = 3;
		}
		// Añadimos las 2 o tres últimas letras al conjunto, y volvemos a procesar el
		// resto de la palabra tras eliminar la sílaba.
		silabas.add(palabra.substring(longitudPalabra - longitudSilaba));
		procesarPalabra(palabra.substring(0, longitudPalabra - longitudSilaba), silabas);
	}

	private static boolean esVocal(char c) {
		return VOCALES.indexOf(c) > -1;
	}

}
