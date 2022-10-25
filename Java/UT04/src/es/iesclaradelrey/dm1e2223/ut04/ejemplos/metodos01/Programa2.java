package es.iesclaradelrey.dm1e2223.ut04.ejemplos.metodos01;

import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {

		ObjetoConMetodos2 objeto = new ObjetoConMetodos2();

		for (int num = 0; num <= 10; num++) {
			System.out.printf("El factorial de %d es %d.\n", num, objeto.factorial(num));
			System.out.println("A por el siguiente...");
		}
	}

}
