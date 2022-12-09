package org.ex1ev.teoria;

public class Teoría03 {

	public static void main(String[] args) {

		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = 10 - i;
		}
		for (int numero : numeros) {
			System.out.printf("%d ", numero);
		}
	}

}
