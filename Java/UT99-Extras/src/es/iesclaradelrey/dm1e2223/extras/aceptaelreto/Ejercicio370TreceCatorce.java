package es.iesclaradelrey.dm1e2223.extras.aceptaelreto;

import java.util.Scanner;

public class Ejercicio370TreceCatorce {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numCasos = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < numCasos; i++) {
			String llave = scanner.nextLine();
			int posicionGuion = llave.indexOf('-');
			int num1 = Integer.parseInt(llave.substring(0, posicionGuion));
			int num2 = Integer.parseInt(llave.substring(posicionGuion + 1));
			if (num1 > num2) {
				int aux = num1;
				num1 = num2;
				num2 = aux;
			}
			//System.out.printf("%d-%d  ", num1, num2);
			boolean ok = ((num1 % 2 == 0) && (num2 == num1 + 1));
			System.out.printf("%s\n", ok ? "SI" : "NO");
		}

		scanner.close();

	}

}
