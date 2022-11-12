package org.control1ev.profesor.ejercicio3;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int opcionUsuario;

		do {
			mostrarMenu();
			opcionUsuario = pedirOpcionUsuario(scanner);


			switch (opcionUsuario) {
			case 0: {
				System.out.println("Gracias por usar la calculadora. Hasta la próxima.");
			}
			case 1: {
				System.out.print("Introduce el valor de A: ");
				int valorA = Integer.parseInt(scanner.nextLine());
				System.out.print("Introduce el valor de B: ");
				int valorB = Integer.parseInt(scanner.nextLine());
				System.out.printf("%d + %d = %d\n", valorA, valorB, valorA + valorB);
				break;
			}
			case 2: {
				System.out.print("Introduce el valor de A: ");
				int valorA = Integer.parseInt(scanner.nextLine());
				System.out.print("Introduce el valor de B: ");
				int valorB = Integer.parseInt(scanner.nextLine());
				System.out.printf("%d - %d = %d\n", valorA, valorB, valorA - valorB);
				break;
			}
			case 3: {
				System.out.print("Introduce el valor de A: ");
				int valorA = Integer.parseInt(scanner.nextLine());
				System.out.print("Introduce el valor de B: ");
				int valorB = Integer.parseInt(scanner.nextLine());
				System.out.printf("%d * %d = %d\n", valorA, valorB, valorA * valorB);
				break;
			}
			case 4: {
				System.out.print("Introduce el valor de A: ");
				int valorA = Integer.parseInt(scanner.nextLine());
				System.out.print("Introduce el valor de B: ");
				int valorB = Integer.parseInt(scanner.nextLine());
				if (valorB == 0) {
					System.out.println("No se puede dividir por cero.");
				} else {
					System.out.printf("%d / %d = %.2f\n", valorA, valorB, (double) valorA / (double) valorB);
				}
				break;
			}
			case 5: {
				System.out.print("Introduce el valor de A: ");
				int valorA = Integer.parseInt(scanner.nextLine());
				System.out.print("Introduce el valor de B: ");
				int valorB = Integer.parseInt(scanner.nextLine());
				System.out.printf("%d elevado a %d = %.0f\n", valorA, valorB, Math.pow(valorA, valorB));
				break;
			}
			default: {
				System.out.println("Opcion incorrecta.");

			}

			}

		} while (opcionUsuario != 0);

		scanner.close();
	}

	private static int pedirOpcionUsuario(Scanner scanner) {
		int opcionUsuario;
		System.out.println("¿Qué operación quiere realizar?");
		opcionUsuario = Integer.parseInt(scanner.nextLine());
		return opcionUsuario;
	}

	private static void mostrarMenu() {
		System.out.println("1.- Sumar (A+B)");
		System.out.println("2.- Restar (A-B)");
		System.out.println("3.- Multiplicar (A*B)");
		System.out.println("4.- Dividir (A/B)");
		System.out.println("5.- Potencia (A elevado a B)");
		System.out.println("0.- Salir");
	}

}
