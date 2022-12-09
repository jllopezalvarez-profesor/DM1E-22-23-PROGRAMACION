package es.iesclaradelrey.dm1e2223.extras.aceptaelreto;

import java.util.Scanner;

public class Ejercicio148Nochevieja {

	private static final int MINUTOS_DIA = 24 * 60;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String horaCompleta = scanner.nextLine();

		while (!horaCompleta.equals("00:00")) {
			int horas = Integer.parseInt(horaCompleta.substring(0, 2));
			int minutos = Integer.parseInt(horaCompleta.substring(3));
			int falta = MINUTOS_DIA - ((horas * 60) + (minutos));
			System.out.println(falta);
			horaCompleta = scanner.nextLine();
		}

		scanner.close();
	}

}
