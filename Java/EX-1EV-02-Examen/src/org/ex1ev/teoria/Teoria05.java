package org.ex1ev.teoria;

public class Teoria05 {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
		}
		for (int i = 0; i < numeros.length; i--) {
			System.out.printf("%d ", numeros[i]);
		}
		

	}

}
