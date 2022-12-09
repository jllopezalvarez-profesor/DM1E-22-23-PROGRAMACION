package org.ex1ev.modelob.ejercicio2;

public class Programa {

	public static void main(String[] args) {
		String a, b;

		a = null;
		b = null;
		System.out.printf("A: '%s' - B: '%s' - Resultado: %b.\n", a, b, contieneTodos(a, b));
		b = "hola";
		System.out.printf("A: '%s' - B: '%s' - Resultado: %b.\n", a, b, contieneTodos(a, b));
		a = "Hoy es viernes";
		b = "ene";
		System.out.printf("A: '%s' - B: '%s' - Resultado: %b.\n", a, b, contieneTodos(a, b));
		b = "hoy";
		System.out.printf("A: '%s' - B: '%s' - Resultado: %b.\n", a, b, contieneTodos(a, b));
		a = "Hoy es miércoles";
		b = "eco";
		System.out.printf("A: '%s' - B: '%s' - Resultado: %b.\n", a, b, contieneTodos(a, b));
		a = "Hoy es viernes";
		b = "verde";
		System.out.printf("A: '%s' - B: '%s' - Resultado: %b.\n", a, b, contieneTodos(a, b));
		a = "camión";
		b = "no";
		System.out.printf("A: '%s' - B: '%s' - Resultado: %b.\n", a, b, contieneTodos(a, b));
		a = "Ambigüedad";
		b = "duda";
		System.out.printf("A: '%s' - B: '%s' - Resultado: %b.\n", a, b, contieneTodos(a, b));

	}

	public static boolean contieneTodos(String cadena, String buscados) {
		if (cadena == null || buscados == null) {
			return false;
		}

		String cadenaMayusculas = reemplazarTildes(cadena.toUpperCase());

		for (char caracter : buscados.toUpperCase().toCharArray()) {
			if (cadenaMayusculas.indexOf(caracter) == -1) {
				return false;
			}
		}

		return true;
	}

	private static String reemplazarTildes(String cadena) {
		cadena = cadena.replace('Á', 'A');
		cadena = cadena.replace('É', 'E');
		cadena = cadena.replace('Í', 'I');
		cadena = cadena.replace('Ó', 'O');
		cadena = cadena.replace('Ú', 'U');
		return cadena;
	}

}
