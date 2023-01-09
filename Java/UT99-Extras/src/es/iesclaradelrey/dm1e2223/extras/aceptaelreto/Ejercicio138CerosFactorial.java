package es.iesclaradelrey.dm1e2223.extras.aceptaelreto;

import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio138CerosFactorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		todosFactoriales(135);

		
//		int numCasos = Integer.parseInt(scanner.nextLine());
//		for (int i = 0; i < numCasos; i++) {
//			int numero = Integer.parseInt(scanner.nextLine());
//			System.out.println(calcularNumeroCeros(numero));
//		}

		scanner.close();

	}

	private static int calcularNumeroCeros(int numero) {
		int numCeros = 0;
		int base = 5;
		long divisor = 5;

		while (divisor <= numero) {
			numCeros += numero / divisor;
			divisor *= base;
		}
		return numCeros;
	}

	@SuppressWarnings("unused")
	private static int todosFactoriales(int limite) {
		BigInteger factorial = BigInteger.ONE;
		for (int i = 1; i <= limite; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
			int numCeros = calcularNumeroCeros(i);
			System.out.printf("F(%2s) = %35s - %d - %d\n", i, factorial, numeroCeros(factorial), numCeros);

		}
		return 0;
	}

	private static int numeroCeros(BigInteger numero) {
		if (numero.equals(BigInteger.ZERO))
			return 0;
		String num = String.valueOf(numero);
		int numCeros = 0;
		int posUltimoCero = num.length() - 1;
		while (num.charAt(posUltimoCero) == '0') {
			numCeros++;
			posUltimoCero--;
		}
		return numCeros;
	}

}
