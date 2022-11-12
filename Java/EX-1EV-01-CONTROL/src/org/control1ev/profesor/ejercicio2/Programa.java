package org.control1ev.profesor.ejercicio2;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el número menor");
		int menor = scanner.nextInt();
		System.out.println("Introduce el número mayor");
		int mayor = scanner.nextInt();
		
		while (menor >= mayor) {
			System.out.println("Números incorrectos. El menor tiene que ser realmente menor que el mayor");
			System.out.println("Introduce el número menor");
			menor = scanner.nextInt();
			System.out.println("Introduce el número mayor");
			mayor = scanner.nextInt();
		}
		
		int suma = 0;
		int cuenta = 0;
		for (int i=menor+1; i<=mayor;i++) {
			if (i%2 == 0) {
				suma+=i;
				cuenta++;
			}
		}
		
		double media = (double)suma/(double)cuenta;
		
		System.out.printf("La suma de los números pares entre %d (no incluido) y %d (incluido) es %d\n", menor, mayor, suma);
		System.out.printf("Su media es %.2f\n", media);
		
		scanner.close();
	}

}
