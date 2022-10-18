package es.iesclaradelrey.dm1e2223.ut04.ejercicios02iterativaspseint;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el número del que quieres calcular el factorial: ");
		int n = Integer.parseInt(scanner.nextLine());

		long factorial = 1;

		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}

		System.out.println(factorial);
		
		scanner.close();
	}

}
