package es.iesclaradelrey.dm1e2223.ut05.ejemplos.strings;

public class Ejemplo04StringBuilder {

	public static void main(String[] args) {

		// Crear el StringBuilder
		StringBuilder sb = new StringBuilder();
		
		StringBuffer sb2 = new StringBuffer();

		// Añadir texto al final del la cadena de texto.
		// Múltiples sobrecargas permiten añadir cualquier tipo de datos
		String sabor = "fresa";
		int tamanioEnMl = 750;
		double precioEnEuros = 10.75;
		sb.append("He comprado un batido de ");
		sb.append(sabor);
		sb.append(" de ");
		sb.append(tamanioEnMl);
		sb.append(" ml ");
		sb.append("y me ha costado ");
		sb.append(precioEnEuros);
		sb.append(" €.");

		// Para obtener la cadena de texto completa, se usa el método toString
		String cadenaCompleta = sb.toString();

		System.out.println(cadenaCompleta);
		
		// Otros métodos - delete - indexOf - insert - substring - reverse

		
	}

}
