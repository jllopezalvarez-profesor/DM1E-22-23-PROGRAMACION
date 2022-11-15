package es.iesclaradelrey.dm1e2223.ut05.ejemplos.strings;

public class PruebaConcat {

	public static void main(String[] args) {
//		String c1 = "Hola";
//
//		String c2 = " y adiós";
//
//		c1.concat(c2);
//
//		System.out.println(c1);
//
//		c1 = c1.concat(c2);
//
//		System.out.println(c1);
//
//		String s = "Esto es una cadena de caracteres";
//
//		int posicionPrimera = s.indexOf('e');
//		System.out.println(s.indexOf('e', posicionPrimera + 1));
//
//		System.out.println(s.indexOf('z'));
//
//		System.out.println(s.indexOf("cadena"));

		String s2 = "Hay que dividir esto,      con comas, en palabras";
		String[] palabras = s2.split("[\\s,.]+");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}

	}

}
