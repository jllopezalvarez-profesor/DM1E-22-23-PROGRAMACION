package es.iesclaradelrey.dm1e2223.ut06.ejercicios.ejercicio05;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
//		Rectangulo r1 = new Rectangulo(3, 7);
//		System.out.println(r1.getPerimetro());
//		Rectangulo r2 = new Rectangulo(5, 4);
//		System.out.println(r2.getArea());
//		System.out.println(r1.esMasAlto(r2));
//		Rectangulo r3 = null;
//		System.out.println(r1.esMasAlto(r3));
//		

		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce la base del primer rectángulo: ");
		int baseR1 = Integer.parseInt(scanner.nextLine());
		System.out.print("Introduce la altura del primer rectángulo: ");
		int alturaR1 = Integer.parseInt(scanner.nextLine());
		System.out.print("Introduce la base del segundo rectángulo: ");
		int baseR2 = Integer.parseInt(scanner.nextLine());
		System.out.print("Introduce la altura del segundo rectángulo: ");
		int alturaR2 = Integer.parseInt(scanner.nextLine());

		Rectangulo r1 = new Rectangulo(baseR1, alturaR1);
		Rectangulo r2 = new Rectangulo(baseR2, alturaR2);

		System.out.printf("El perímetro del primer rectángulo es %d y su área es %d.\n", r1.getPerimetro(),
				r1.getArea());
		System.out.printf("El perímetro del segundo rectángulo es %d y su área es %d.\n", r2.getPerimetro(),
				r2.getArea());

		if (r1.esMasAncho(r2)) {
			System.out.println("El primer rectángulo es más ancho que el segundo.");
		} else {
			System.out.println("El primer rectángulo no es más ancho que el segundo.");
		}

		if (r1.esMasAlto(r2)) {
			System.out.println("El primer rectángulo es más alto que el segundo.");
		} else {
			System.out.println("El primer rectángulo no es más alto que el segundo.");
		}
		
		switch (r1.compararArea(r2)) {
		case -1:
				System.out.println("El segundo rectángulo tiene más superficie que el primero.");
			break;
		case 1:
			System.out.println("El primer rectángulo tiene más superficie que el segundo.");
			break;
		default:
			System.out.println("Los dos recángulos tienen el mismo área.");
			break;
		}
		
		

		/*
		 * ◦ Área y perímetro del primer rectángulo. ◦ Área y perímetro del segundo
		 * rectángulo. ◦ Una frase indicando cuál de los dos es más alto. ◦ Una frase
		 * indicando cuál de los dos es más ancho. ◦ Una frase indicando cuál de los dos
		 * tiene más área.
		 */
		scanner.close();
	}
}
