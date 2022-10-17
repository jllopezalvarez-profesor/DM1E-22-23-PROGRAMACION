package es.iesclaradelrey.dm1e2223.ut04.ejercicios01condicionales;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         La política de cobro de una compañía telefónica es: cuando se realiza
 *         una llamada, el cobro es por el tiempo que esta dura, de tal forma
 *         que los primeros cinco minutos cuestan 1 euro cada minuto, los
 *         siguientes tres, 80 céntimos, los siguientes dos minutos, 70
 *         céntimos, y a partir del décimo minuto, 50 céntimos. Además, se carga
 *         un impuesto de 3 % cuando es domingo, y si es otro día, en turno de
 *         mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo para
 *         determinar cuánto debe pagar por cada concepto una persona que
 *         realiza una llamada.
 */
public class Ejercicio11 {

	// Precios de cada tramo en céntimos
	private static final int PRECIO_TRAMO_1 = 100;
	private static final int PRECIO_TRAMO_2 = 80;
	private static final int PRECIO_TRAMO_3 = 70;
	private static final int PRECIO_RESTO = 50;

	// Fin de tramos en minutos
	private static final int FIN_TRAMO_1 = 5;
	private static final int FIN_TRAMO_2 = 8;
	private static final int FIN_TRAMO_3 = 10;

	// Impuestos
	private static final int IMPUESTO_DOMINGO = 3;
	private static final int IMPUESTO_DIARIO_MANIANA = 15;
	private static final int IMPUESTO_DIARIO_TARDE = 10;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Duración de la llamada en minutos (completos, sin decimales): ");
		int duracion = Integer.parseInt(scanner.nextLine());

		System.out.print("¿Llamada realizada en domingo (S/N)?");
		String respuesta = scanner.nextLine();
		boolean esDomingo = respuesta.equalsIgnoreCase("S");

		System.out.print("¿Llamada realiza por la tarde (S/N)?");
		respuesta = scanner.nextLine();
		boolean esTarde = respuesta.equalsIgnoreCase("S");

		int costeSinImpuestos = 0;

		if (duracion <= FIN_TRAMO_1) {
			costeSinImpuestos += duracion * PRECIO_TRAMO_1;
		} else {
			costeSinImpuestos += FIN_TRAMO_1 * PRECIO_TRAMO_1;
			if (duracion <= FIN_TRAMO_2) {
				costeSinImpuestos += (duracion - FIN_TRAMO_1) * PRECIO_TRAMO_2;
			} else {
				costeSinImpuestos += (FIN_TRAMO_2 - FIN_TRAMO_1) * PRECIO_TRAMO_2;
				if (duracion <= FIN_TRAMO_3) {
					costeSinImpuestos += (duracion - FIN_TRAMO_3) * PRECIO_TRAMO_3;
				} else {
					costeSinImpuestos += (FIN_TRAMO_3 - FIN_TRAMO_2) * PRECIO_TRAMO_3;
					costeSinImpuestos += (duracion - FIN_TRAMO_3) * PRECIO_RESTO;
				}
			}
		}

		double total;

		if (esDomingo) {
			total = (double) costeSinImpuestos * IMPUESTO_DOMINGO / 100;
		} else if (esTarde) {
			total = (double) costeSinImpuestos * IMPUESTO_DIARIO_TARDE / 100;
		} else {
			total = (double) costeSinImpuestos * IMPUESTO_DIARIO_MANIANA / 100;
		}

		System.out.printf("El total que se cobrará por la llamada es %.2f euros.\n", total / 100);

		scanner.close();
	}

}
