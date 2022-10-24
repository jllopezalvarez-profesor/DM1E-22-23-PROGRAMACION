package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e03basicos1;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Hacer un programa en el que se pida por teclado un número mayor que 2
 *         (el programa controlará que cumpla esto), y lo imprima de todas las
 *         formas posibles como producto de dos factores (no se tiene en cuenta
 *         la multiplicación por 1). Ej: Con el número 36, tendría que
 *         visualizarse: 18*2, 12*3, 9*4, 6*6, 3*12, 4*9, 2*18
 */
public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el número. ");
		int numero = scanner.nextInt();
		
		while (numero <= 2) {
			System.out.println("El número introducido es menor que 2. Introduce el número. ");
			numero = scanner.nextInt();
		}
		
		for(int divisor = 2; divisor < numero; divisor++) {
			if (numero % divisor == 0) {
				int cociente = numero / divisor;
				System.out.printf("%d = (%d * %d)\n", numero, divisor, cociente);
			}
		}

		scanner.close();
	}

}
