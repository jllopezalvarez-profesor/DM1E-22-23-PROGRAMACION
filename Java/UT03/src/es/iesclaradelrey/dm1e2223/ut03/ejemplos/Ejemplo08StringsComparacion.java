package es.iesclaradelrey.dm1e2223.ut03.ejemplos;

import java.util.Scanner;

public class Ejemplo08StringsComparacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Comparaciones de cadenas definidas con literales...
		String a = "ABCD";
		String b = "ABCD";
		System.out.printf("Resultado de a == b: '%b'.\n", a == b);
		System.out.printf("Resultado de a.equals(b): '%b'.\n", a.equals(b));

		// Comparación de cadenas solicitadas al usuario...
		System.out.print("Introduce una cadena: ");
		String x = sc.nextLine();
		System.out.print("Introduce la misma cadena: ");
		String y = sc.nextLine();
		System.out.printf("Resultado de x == y: '%b'.\n", x == y);
		System.out.printf("Resultado de x.equals(y): '%b'.\n", x.equals(y));

		

		sc.close();
	}

}
