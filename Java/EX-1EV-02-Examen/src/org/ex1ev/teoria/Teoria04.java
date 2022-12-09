package org.ex1ev.teoria;

public class Teoria04 {

	public static void main(String[] args) {
		
		
		int[] numeros = { 1, 2, 3, 1, 2, 3, 1, 2, 3 };
		for (int numero : numeros) {
			numero = numero + 10;
		}
		for (int numero : numeros) {
			System.out.printf("%d ", numero);
		}

		
	}

}
