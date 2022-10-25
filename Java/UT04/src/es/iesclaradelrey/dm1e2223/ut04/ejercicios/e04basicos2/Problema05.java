package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e04basicos2;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Haz un programa que lea un número entero N y calcule el resultado de
 *         la siguiente serie: 1+1/2+1/3+1/4+1/5+...+1/N.
 */
public class Problema05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el número n: ");
		int numero = scanner.nextInt();
		
		double suma = 0;
		for (int i = 1; i <= numero; i++) {
			suma += (1/(double)i);
			System.out.println(suma);
		}
		System.out.println("La suma de la serie es "+ suma);
		
		scanner.close();

	}

}
