package org.ex1ev.modelob.ejercicio1;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int cantidadNumeros = pedirNumero(scanner);
		
		int[] numeros = generarAleatorios(cantidadNumeros);
		
		mostrarTodosNumeros(numeros);
		
		mostrarNumerosPares(numeros);
		
		mostrarNumerosDosCifras(numeros);

		System.out.print("Introduce un número para contar sus múltiplos (entre 2 y 9 ambos incluidos): ");
		int divisor = Integer.parseInt(scanner.nextLine());
		
		System.out.printf("En los números generados hay %d números que son múltiplos de %d.\n", cuentaDivisibles(numeros, divisor), divisor);
		
		scanner.close();
	}

	public static int pedirNumero(Scanner scanner) {
		System.out.print("Introduce con cuantos números quieres trabajar (entre 10 y 20 ambos incluidos): ");
		int numero = Integer.parseInt(scanner.nextLine());
		while (numero < 10 || numero > 20) {
			System.out.println("El número introducido no es correcto.");
			System.out.print("Introduce un número entre 10 y 20 ambos incluidos: ");
			numero = Integer.parseInt(scanner.nextLine());
		}
		return numero;
	}

	public static int[] generarAleatorios(int cantidadNumeros) {
		int[] numeros = new int[cantidadNumeros];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 200);
		}
		return numeros;
	}

	public static void mostrarTodosNumeros(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(numeros[i]);
		}
		System.out.println();
	}

	public static void mostrarNumerosPares(int[] numeros) {
		boolean primero = true;
		for (int numero : numeros) {
			if (numero % 2 == 0) {
				if (!primero) {
					System.out.print(",");
				}
				System.out.print(numero);
				primero = false;
			}
		}
		System.out.println();
	}

	public static void mostrarNumerosDosCifras(int[] numeros) {
		boolean primero = true;
		for (int numero : numeros) {
			if (numero > 9 && numero < 100) {
				if (!primero) {
					System.out.print(",");
				}
				System.out.print(numero);
				primero = false;
			}
		}
		System.out.println();
	}

	public static int cuentaDivisibles(int[] numeros, int divisor) {
		int cuenta = 0;
		for (int numero : numeros) {
			if (numero % divisor == 0) {
				cuenta++;
			}
		}
		return cuenta;
	}
}
