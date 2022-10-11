package es.iesclaradelrey.dm1e2223.ut02.ejemplos;

public class Ejemplo13PruebasMetodos {

	public static void main(String[] args) {
		String cadena = "   Esto es una cadena larga que ha escrito José Luis.   ";
		int longitud = cadena.length();
		System.out.println("El resultado de length es: " + longitud);
		
		String cadenaEnMinusculas = cadena.toLowerCase();
		System.out.println("El resultado de toLowerCase es: " + cadenaEnMinusculas);
		
		String cadenaSinEspacios = cadena.trim();
		System.out.println("El resultado de trim es: " + cadenaSinEspacios);
		
		int longitudSinEspacios = cadenaSinEspacios.length();
		System.out.println("El resultado de length sin espacios es: " + longitudSinEspacios);
		



	}

}
