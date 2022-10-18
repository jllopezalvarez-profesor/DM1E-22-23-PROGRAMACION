package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e01condicionalespseint;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Realiza un programa que pida por teclado el resultado (dato entero)
 *         obtenido al lanzar un dado de seis caras y muestre por pantalla el
 *         número en letras (dato cadena) de la cara opuesta al resultado
 *         obtenido. Nota 1: En las caras opuestas de un dado de seis caras
 *         están los números: 1-6, 2-5 y 3-4. Nota 2: Si el número del dado
 *         introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
 *         “ERROR: número incorrecto.”.
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		// Creamos el scanner para leer datos
		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor, introduce el número del dado (de 1 a 6).");
		int numeroDado = Integer.parseInt(scanner.nextLine());

		switch (numeroDado) {
		case 1:
			System.out.println("En la cara opuesta del dado está el seis");
			break;
		case 2:
			System.out.println("En la cara opuesta del dado está el cinco");
			break;
		case 3:
			System.out.println("En la cara opuesta del dado está el cuatro");
			break;
		case 4:
			System.out.println("En la cara opuesta del dado está el tres");
			break;
		case 5:
			System.out.println("En la cara opuesta del dado está el dos");
			break;
		case 6:
			System.out.println("En la cara opuesta del dado está el uno");
			break;
		default:
			System.out.println("ERROR: El número introducido es incorrecto.");
		}

		// Cerramos el scanner
		scanner.close();

	}

}
