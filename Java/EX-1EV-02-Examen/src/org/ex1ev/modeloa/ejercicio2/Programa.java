package org.ex1ev.modeloa.ejercicio2;

public class Programa {

	public static void main(String[] args) {
		System.out.printf("Resultado de quitar dígitos a una cadena nula: '%s'\n", eliminarDigitos(null));
		System.out.printf("Resultado de quitar dígitos a una cadena vacía: '%s'\n", eliminarDigitos(""));
		String s;
		s = "Los números pares son 0, 2, 4, 6, y 8, y los impares son 1, 3, 5, 7, y 9";
		System.out.printf("Resultado de quitar dígitos a '%s':\n'%s'\n", s, eliminarDigitos(s));
		s = "El año 2023 tendrá 52 semanas y 365 días";
		System.out.printf("Resultado de quitar dígitos a '%s':\n'%s'\n", s, eliminarDigitos(s));
		s = "Lanzamiento 3 listo. Cuenta atrás… 5 4 3 2 1 0";
		System.out.printf("Resultado de quitar dígitos a '%s':\n'%s'\n", s, eliminarDigitos(s));

	}

	public static String eliminarDigitos(String cadenaOriginal) {
		if (cadenaOriginal == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder(cadenaOriginal);

		for (int i = sb.length() - 1; i >= 0; i--) {
			char caracter = sb.charAt(i);
			if (caracter >= '0' && caracter <= '9') {
				sb.deleteCharAt(i);
			}
//			if ("0123456789".indexOf(caracter) >= 0) {
//				sb.deleteCharAt(i);
//			}
//			
//			if (caracter == '1' || caracter == '2')
		}

		String resultado = sb.toString().trim(); // Eliminamos espacios delante y detrás.
		while (resultado.indexOf("  ") > 0) {
			resultado = resultado.replace("  ", " ");
		}

		return resultado;
	}

}
