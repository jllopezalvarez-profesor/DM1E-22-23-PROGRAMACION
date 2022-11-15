package es.iesclaradelrey.dm1e2223.ut05.ejercicios.strings;

/**
 * 
 * <pre>
 * 	Crea un método insertarGuionesCadena que:
    • Recibe una cadena como parámetro
    • Devuelve una nueva cadena con los mismos caracteres de la cadena uno a uno, pero separándolos con un guión.
    • Para hacerlo, utiliza el método charAt de la clase String.
    • Si la cadena es null, devuelve null.
	Ejemplo:
		insertarGuionesCadena(“101 Dálmatas”) devolvería “1-0-1- -D-á-l-m-a-t-a-s”
 * </pre>
 *
 */
public class Ejercicio02_03 {
	public static void main(String[] args) {
		System.out.println("Con insertarGuionesCadena:");
		System.out.println(insertarGuionesCadena("101 Dálmatas"));
		System.out.println(insertarGuionesCadena(null));
		System.out.println("Con insertarGuionesCadena2:");
		System.out.println(insertarGuionesCadena2("101 Dálmatas"));
		System.out.println(insertarGuionesCadena2(null));
	}

	private static String insertarGuionesCadena(String cadenaOriginal) {
		if (cadenaOriginal == null) {
			return null;
		}
		String cadenaResultado = "";
		for (int i = 0; i < cadenaOriginal.length(); i++) {
			if (i > 0) {
				cadenaResultado += '-';
			}
			cadenaResultado += cadenaOriginal.charAt(i);
		}
		return cadenaResultado;

	}

	private static String insertarGuionesCadena2(String cadenaOriginal) {
		if (cadenaOriginal == null) {
			return null;
		}

		char[] caracteresOriginal = cadenaOriginal.toCharArray();
		char[] caracteresResultado = new char[(caracteresOriginal.length * 2) - 1];
		// Copiar caracteres de caracteresOriginal a caracteresResultado insertando
		// guiones
		for (int posOrigen = 0; posOrigen < caracteresOriginal.length; posOrigen++) {
			int posDestino = posOrigen * 2;
			// System.out.printf ("Copio de posición %d a %d\n", posOrigen, posDestino);
			caracteresResultado[posDestino] = caracteresOriginal[posOrigen];
			if (posDestino > 0) {
				caracteresResultado[posDestino - 1] = '-';
			}
		}

		return String.valueOf(caracteresResultado);
		// return new String(caracteresResultado);
	}

}
