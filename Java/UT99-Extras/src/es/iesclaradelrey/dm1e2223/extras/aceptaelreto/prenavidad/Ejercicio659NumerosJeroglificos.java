package es.iesclaradelrey.dm1e2223.extras.aceptaelreto.prenavidad;

import java.util.Scanner;

public class Ejercicio659NumerosJeroglificos {

	// Array de caracteres para almacenar los jeroglíficos de cada cifra.
	// En la 0 está la de menor peso (el 1) y en la 6 la de mayor.
	private static final char[] SIMBOLOS = "TGCFDRH".toCharArray();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		while (n != 0) {
			procesarCaso(n);
			n = Integer.parseInt(scanner.nextLine());
		}

		scanner.close();
	}

	private static void procesarCaso(int numero) {
		// Usamos un Stringbuilder para ir añadiendo los jeroglíficos, es más eficiente
		// que un String.
		StringBuilder sb = new StringBuilder();
		int exponente = 1; // Empezamos con los de menor peso (resto de dicision entera por 10¹
		do {
			// Calculamos el dígito menos significativo (más a la derecha). Ejemplo: de 356
			// dará un 6.
			int resto = numero % 10;
			// Escribimos en el StringBuilder tantos caracteres como indique el dígito menos
			// significativo. Usamos el array de símbolos, que tenemos que indexar usando
			// -1, porque para 10¹ está en la posición 0, para 10² está en la 1, y así
			// sucesivamente.
			while (resto > 0) {
				// Lo insertamos al principio del String Builder.
				// Alternativamente, podría haberse escrito al final y luego invertir el
				// StringBuilder con el método reverse()
				sb.insert(0, SIMBOLOS[exponente - 1]);
				resto--;
			}
			// Nos quedamos con todo el número menos los dígitos menos significativos. Ejemplo: de 356 nos quedamos con 35.
			numero = numero / 10;
			// Aumentamos el exponente, para que en la siguiente iteración usemos el siguiente caracter del array de símbolos.
			exponente++;
		} while (numero > 0);
		// Mostramos el número en jerogíficos
		System.out.println(sb.toString());
	}

}
