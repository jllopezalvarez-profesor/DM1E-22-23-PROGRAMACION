package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e03basicos1;

import java.util.*;

public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1, n2, r;
		System.out.println("Introducir numero 1");
		n1 = teclado.nextInt();
		System.out.println("Introducir numero 2");
		n2 = teclado.nextInt();
		r = n1 + n2;
		System.out.println("La suma de " + n1 + " y " + n2 + " es " + r);
		teclado.close();
	}
}
