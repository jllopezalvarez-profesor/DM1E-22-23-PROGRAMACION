package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e07metodos.ej01;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("¿Cuańtas veces quieres mostrar la frase? ");
		int numeroDeVeces = Integer.parseInt(scanner.nextLine());

		Metodos metodos = new Metodos();

		metodos.repetirModulo(numeroDeVeces);

		System.out.print("Dime el primer número real ");
		double numero1 = Double.parseDouble(scanner.nextLine());
		System.out.print("Dime el segundo número real ");
		double numero2 = Double.parseDouble(scanner.nextLine());

		double resultado = metodos.suma(numero1, numero2);
		System.out.printf("La suma de %f y %f es %f.\n", numero1, numero2, resultado);
		
	}

}
